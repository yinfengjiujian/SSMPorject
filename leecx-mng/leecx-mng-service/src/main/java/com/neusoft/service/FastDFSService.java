package com.neusoft.service;

import com.neusoft.pojo.Fastdfsfile;

/**
 * <p>Title: com.neusoft.service</p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/20 11:13
 * Description: No Description
 */
public interface FastDFSService {

    /**
     * 保存上传的文件信息对象
     * @param fastdfsfile
     * @return
     */
    public boolean saveFastDFSFile(Fastdfsfile fastdfsfile);

    /**
     * 删除文件信息对象
     * @param file_id
     */
    public void deleteFastDFSFileById(String file_id);

}
