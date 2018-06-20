package com.neusoft.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * <p>Title: com.neusoft.common.utils</p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/19 18:13
 * Description: 文件工具操作类
 */
public class FileUtil {

    final static Logger log = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 获取文件的后缀名称
     * @param file
     * @return
     */
    public static String getFileSuffix(File file){
        if (file == null) {
            log.error("文件操作对象为空！请确认");
            return null;
        }
        String fileName = file.getName();
        return  fileName.substring(fileName.lastIndexOf(".") + 1);
    }

}
