package com.neusoft.components.fastdfs;

import com.neusoft.components.fastdfs.exception.FastDFSException;
import com.neusoft.components.fastdfs.pool.ConnectionPoolFactory;
import com.neusoft.pojo.Fastdfsfile;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ProtoCommon;
import org.csource.fastdfs.StorageClient;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class FastDFSTemplate {
    private ConnectionPoolFactory connPoolFactory;
    private FastDFSTemplateFactory factory;

    public FastDFSTemplate(FastDFSTemplateFactory factory) {
        this.connPoolFactory = new ConnectionPoolFactory(factory);
        this.factory = factory;
    }


    /**
     * @param data
     * @param ext      后缀，如：jpg、bmp（注意不带.）
     * @param fileName 文件名
     * @return
     * @throws FastDFSException
     * @Description: 上传文件
     * @date: 2017年7月12日 下午7:01:32
     */
    public Fastdfsfile upload(byte[] data, String ext, String fileName) throws FastDFSException {
        return this.upload(data, ext, null, fileName);
    }


    /**
     * @param data
     * @param ext      后缀，如：jpg、bmp（注意不带.）
     * @param values
     * @param fileName 文件名
     * @return
     * @throws FastDFSException
     * @Description: 上传文件
     * @author: Aaron
     * @date: 2017年7月12日 下午7:01:55
     */
    public Fastdfsfile upload(byte[] data, String ext, Map<String, String> values, String fileName) throws FastDFSException {
        NameValuePair[] valuePairs = null;
        if (values != null && !values.isEmpty()) {
            valuePairs = new NameValuePair[values.size()];
            int index = 0;
            for (Map.Entry<String, String> entry : values.entrySet()) {
                valuePairs[index] = new NameValuePair(entry.getKey(), entry.getValue());
                index++;
            }
        }
        StorageClient client = getClient();

        try {
            String[] uploadResults = client.upload_file(data, ext, valuePairs);
            String groupName = uploadResults[0];
            String remoteFileName = uploadResults[1];
            Fastdfsfile fastDfsInfo = new Fastdfsfile(groupName, remoteFileName, fileName);
            if (factory != null) {
                this.setFileAbsolutePath(fastDfsInfo);
            }
            return fastDfsInfo;
        } catch (Exception e) {
            throw new FastDFSException(e.getMessage(), e, 0);
        } finally {
            releaseClient(client);
        }
    }


    /**
     * @param dfs
     * @return
     * @throws FastDFSException
     * @Description: 下载文件
     * @author: Aaron
     * @date: 2017年7月12日 下午7:02:27
     */
    public byte[] loadFile(Fastdfsfile dfs) throws FastDFSException {
        return this.loadFile(dfs.getGroupName(), dfs.getFilePath());
    }


    /**
     * @param groupName
     * @param remoteFileName
     * @return
     * @throws FastDFSException
     * @Description: 下载文件
     * @author: Aaron
     * @date: 2017年7月12日 下午7:02:46
     */
    public byte[] loadFile(String groupName, String remoteFileName) throws FastDFSException {
        StorageClient client = getClient();
        try {
            return client.download_file(groupName, remoteFileName);
        } catch (Exception e) {
            throw new FastDFSException(e.getMessage(), e, 0);
        } finally {
            releaseClient(client);
        }
    }


    /**
     * @param dfs
     * @throws FastDFSException
     * @Description: 删除文件
     * @author: Aaron
     * @date: 2017年7月12日 下午7:02:59
     */
    public void deleteFile(Fastdfsfile dfs) throws FastDFSException {
        this.deleteFile(dfs.getGroupName(), dfs.getFilePath());
    }

    /**
     * @param groupName
     * @param remoteFileName
     * @throws FastDFSException
     * @Description: 删除文件
     * @author: Aaron
     * @date: 2017年7月12日 下午7:03:13
     */
    public void deleteFile(String groupName, String remoteFileName) throws FastDFSException {
        int code;
        StorageClient client = getClient();
        try {
            code = client.delete_file(groupName, remoteFileName);
        } catch (Exception e) {
            throw new FastDFSException(e.getMessage(), e, 0);
        } finally {
            releaseClient(client);
        }
        if (code != 0) {
            throw new FastDFSException(code);
        }
    }


    /**
     * @param group
     * @param path
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws MyException
     * @Description: 设置远程可访问路径
     * @author: Aaron
     * @date: 2017年7月12日 下午7:03:34
     */
    public String setFileAbsolutePath(String group, String path, String fileName)
            throws IOException, NoSuchAlgorithmException, MyException {
        int ts = (int) (System.currentTimeMillis() / 1000), port;
        String token = "";
        if (factory.isG_anti_steal_token()) {
            token = ProtoCommon.getToken(path, ts, factory.getG_secret_key());
            token = "?token=" + token + "&ts=" + ts;
        }
        List<String> addressList;
        if (factory.getNginx_address() != null) {
            addressList = factory.getNginx_address();
        } else {
            addressList = factory.getTracker_servers();
        }

        Random random = new Random();
        int i = random.nextInt(addressList.size());
        String[] split = addressList.get(i).split(":", 2);

        if (split.length > 1) {
            port = Integer.parseInt(split[1].trim());
        } else {
            port = factory.getG_tracker_http_port();
        }
        String address = split[0].trim();

        /**
         * 下载恢复原文件名称的写法 在地址后面追加参数  &attname=XX.doc
         * 此写法，必须配合nginx一起使用，在ngnix.conf添加如下配置
         *

            location ~/group([0-9])/M00 {
                if ($arg_attname ~* \.(doc|docx|txt|pdf|zip|rar|txt)$) {
                    add_header Content-Disposition "attachment;filename=$arg_attname";
                }
                ngx_fastdfs_module;
            }
         *
         */
        return factory.getProtocol() +
                address + ":" +
                port +
                factory.getSepapator() +
                group +
                factory.getSepapator() +
                path  + token + "&attname=" + fileName;
    }

    public void setFileAbsolutePath(Fastdfsfile fastDfsInfo) throws IOException, NoSuchAlgorithmException, MyException {
        fastDfsInfo.setCallPath(this.setFileAbsolutePath(fastDfsInfo.getGroupName(), fastDfsInfo.getFilePath(), fastDfsInfo.getFileName()));
    }

    protected StorageClient getClient() {
        StorageClient client = null;
        while (client == null) {
            try {
                client = connPoolFactory.getClient();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return client;
    }

    protected void releaseClient(StorageClient client) {
        connPoolFactory.releaseConnection(client);
    }
}
