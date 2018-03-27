package com.bs.create_life.util;

import com.bs.create_life.po.FilePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileOutputStream;

public class FileUtil {

    @Value("${spring.realPath}")
    private static String realPath;



    public static void uploadFile(byte[] file, String fileName) throws Exception {
        File targetFile = new File(realPath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(realPath + fileName);
        out.write(file);
        FilePO filePO = new FilePO();
        filePO.setNetPath(null);
        filePO.setType(fileName.substring(fileName.lastIndexOf(".")));
        //filePO.setId();

        out.flush();
        out.close();
    }
}
