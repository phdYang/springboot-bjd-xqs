package com.bjd515.bjdxqs.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: zhaoyang
 * Date: 2019/8/20
 * Time: 19:26
 * Description: No Description
 */
public class FileOp {

    /**
     * 将文件ba'p
     * @param file
     * @return
     */
    public static File saveModelOnLocal(MultipartFile file){
        String fileName = file.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        String localFileName = System.currentTimeMillis() + fileSuffix;
        String filePath = "D:" + File.separator + "zhaoyangsWork"+
                File.separator + "bjd-xqs-1.0" +
                File.separator + "modelSave" +
                File.separator + fileName;
        File localFile = new File(filePath);
        try {
//            if (!localFile.exists())
//                localFile.mkdirs();
            file.transferTo(localFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return localFile;
    }
}
