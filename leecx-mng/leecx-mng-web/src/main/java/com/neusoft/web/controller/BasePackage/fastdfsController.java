package com.neusoft.web.controller.BasePackage;

import com.neusoft.common.utils.FileUtil;
import com.neusoft.common.utils.LeeJSONResult;
import com.neusoft.components.fastdfs.FastDFSTemplate;
import com.neusoft.components.fastdfs.exception.FastDFSException;
import com.neusoft.pojo.Fastdfsfile;
import com.neusoft.service.FastDFSService;
import com.neusoft.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/fastdfs")
public class fastdfsController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(fastdfsController.class);

    @Autowired
    private FastDFSTemplate fastDFSTemplate;

    @Autowired
    private FastDFSService fastDFSService;

    @RequestMapping(value = "/UploadAdnDel", method = RequestMethod.GET)
    public void testUploadAndDel() throws FastDFSException {
        Fastdfsfile fastDfsInfo = fastDFSTemplate.upload("".getBytes(), "txt","");
        System.out.println(fastDfsInfo);
        fastDFSTemplate.deleteFile(fastDfsInfo);
    }

    @RequestMapping(value = "/testPool", method = RequestMethod.GET)
    public void testPool() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                File file = new File("C:\\336d6baa85.jpg");
                FileInputStream fis = new FileInputStream(file);
                byte[] b = new byte[fis.available()];
                fis.read(b);
                Map<String, String> map = new HashMap<>();
                Fastdfsfile fastDfsInfo = fastDFSTemplate.upload(b, "jpg", map,file.getName());
                System.out.println(fastDfsInfo.getCallPath());
//                fastDFSTemplate.deleteFile(fastDfsInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 1; i++) {
            new Thread(runnable).start();
        }
        Thread.currentThread().join();
    }

    @RequestMapping(value = "/testUpload", method = RequestMethod.GET)
    @ResponseBody
    public LeeJSONResult testUpload() {
        Fastdfsfile fastDfsInfo = null;
        try {
            File file = new File("C:\\4416000014_河源市人力资源和社会保障局_20180520_27804.doc");
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            Map<String, String> map = new HashMap<>();
            fastDfsInfo = fastDFSTemplate.upload(b, FileUtil.getFileSuffix(file), map,file.getName());
            if (fastDfsInfo == null) {
                logger.error("上传文件失败，请确认！");
            }
            boolean result = fastDFSService.saveFastDFSFile(fastDfsInfo);
            if (result) {
                System.out.println(fastDfsInfo.getCallPath());
            }
//            fastDFSTemplate.deleteFile(fastDfsInfo);
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
        } catch (FastDFSException e) {
            logger.error(e.getMessage(),e);
        }
        return LeeJSONResult.ok(fastDfsInfo);
    }

}
