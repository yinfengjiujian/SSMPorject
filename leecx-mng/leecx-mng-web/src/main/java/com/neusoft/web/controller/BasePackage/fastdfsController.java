package com.neusoft.web.controller.BasePackage;

import com.neusoft.components.fastdfs.FastDFSTemplate;
import com.neusoft.components.fastdfs.FastDfsInfo;
import com.neusoft.components.fastdfs.exception.FastDFSException;
import com.neusoft.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/fastdfs")
public class fastdfsController extends BaseController {

    @Autowired
    private FastDFSTemplate fastDFSTemplate;

    @RequestMapping(value = "/UploadAdnDel", method = RequestMethod.GET)
    public void testUploadAndDel() throws FastDFSException {
        FastDfsInfo rv = fastDFSTemplate.upload("".getBytes(), "txt");
        System.out.println(rv);
        fastDFSTemplate.deleteFile(rv);
    }

    @RequestMapping(value = "/testPool",method = RequestMethod.GET)
    public void testPool() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                File file = new File("C:\\meinv.jpg");
                FileInputStream fis = new FileInputStream(file);
                byte[] b = new byte[fis.available()];
                fis.read(b);
                Map<String, String> map = new HashMap<>();
                FastDfsInfo rv = fastDFSTemplate.upload(b, "jpg", map);
                System.out.println(rv.getFileAbsolutePath());
                fastDFSTemplate.deleteFile(rv);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 1; i++) {
            new Thread(runnable).start();
        }
        Thread.currentThread().join();
    }

}
