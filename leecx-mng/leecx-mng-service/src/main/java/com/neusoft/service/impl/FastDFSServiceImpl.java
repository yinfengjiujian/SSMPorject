package com.neusoft.service.impl;

import com.neusoft.common.utils.LeeJSONResult;
import com.neusoft.mapper.FastdfsfileMapper;
import com.neusoft.pojo.Fastdfsfile;
import com.neusoft.service.FastDFSService;
import org.apache.commons.lang3.StringUtils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Date;

/**
 * <p>Title: com.neusoft.service.impl</p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/20 11:34
 * Description: 文件操作类服务
 */
@Service
public class FastDFSServiceImpl implements FastDFSService{

    @Autowired
    private Sid sid;

    @Autowired
    private FastdfsfileMapper fastdfsfileMapper;

    /**
     * 保存上传的文件信息对象
     *
     * @param fastdfsfile
     * @return
     */
    @Override
    public boolean saveFastDFSFile(Fastdfsfile fastdfsfile) {
        //设置文件保存主键
        String file_id = fastdfsfile.getFileId();
        if (StringUtils.isBlank(file_id)) {
            String fileid = sid.nextShort();
            fastdfsfile.setFileId(fileid);
        }
        //设置文件保存时间
        fastdfsfile.setFileDate(new Date());
        //设置文件是否有效 1-有效，2-无效
        fastdfsfile.setIsActivate(1);
        int result = fastdfsfileMapper.insert(fastdfsfile);
        return result == 1 ? true : false;
    }

    /**
     * 删除文件
     *
     * @param file_id
     */
    @Override
    public void deleteFastDFSFileById(String file_id) {
        fastdfsfileMapper.deleteByPrimaryKey(file_id);
    }

}
