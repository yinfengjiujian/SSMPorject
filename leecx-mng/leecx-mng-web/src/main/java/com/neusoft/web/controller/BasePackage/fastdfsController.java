package com.neusoft.web.controller.BasePackage;

import com.neusoft.common.utils.LeeJSONResult;
import com.neusoft.components.fastdfs.FastDFSTemplate;
import com.neusoft.components.fastdfs.FastDfsInfo;
import com.neusoft.components.fastdfs.exception.FastDFSException;
import com.neusoft.web.controller.BaseController;
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

    @Autowired
    private FastDFSTemplate fastDFSTemplate;

    @RequestMapping(value = "/UploadAdnDel", method = RequestMethod.GET)
    public void testUploadAndDel() throws FastDFSException {
        FastDfsInfo fastDfsInfo = fastDFSTemplate.upload("".getBytes(), "txt");
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
                FastDfsInfo fastDfsInfo = fastDFSTemplate.upload(b, "jpg", map);
                System.out.println(fastDfsInfo.getFileAbsolutePath());
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

        FastDfsInfo fastDfsInfo = null;
        try {
            File file = new File("C:\\336d6baa85.jpg");
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            Map<String, String> map = new HashMap<>();
            fastDfsInfo = fastDFSTemplate.upload(b, "jpg", map);
            System.out.println(fastDfsInfo.getFileAbsolutePath());
//            fastDFSTemplate.deleteFile(fastDfsInfo);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FastDFSException e) {
            e.printStackTrace();
        }
        return LeeJSONResult.ok(fastDfsInfo);
    }

}
