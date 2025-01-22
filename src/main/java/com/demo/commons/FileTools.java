package com.demo.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

/*
  @author : eton.lin
  @description 將二進制檔案轉成文字檔
  @date 2024-07-23 下午 03:14
*/
public class FileTools {


    public static String getFileAsBase64(String filePath) throws IOException {
        File file = new File(filePath);
        return getFileAsBase64(file);
    }

    public static String getFileAsBase64(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile()) {
            throw new IllegalArgumentException("Invalid file provided.");
        }

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] fileBytes = new byte[(int) file.length()];
            int bytesRead = fileInputStream.read(fileBytes);
            if (bytesRead != fileBytes.length) {
                throw new IOException("Failed to read the entire file.");
            }
            // Convert binary data to Base64
            return Base64.getEncoder().encodeToString(fileBytes);
        }
    }
}
