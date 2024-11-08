package com.demo.commons;




import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/*
  @author : eton.lin
  @description 將二進制檔案轉成文字檔
  @date 2024-07-23 下午 03:14
*/
public class FileTools {
    public static String getFileByte(String filePath) throws IOException {
        File file = new File(filePath);
        InputStream fin = Files.newInputStream(file.toPath());
        long length = file.length();
        byte[] bytes = new byte[(int) length];
        int offset = 0;
        int numRead = 0;
        while (offset<bytes.length &&(numRead=fin.read(bytes,offset,bytes.length-offset))>=0){
            offset+=numRead;
        }
        fin.close();
        if(offset < bytes.length){
            throw new IOException("不能完全讀取文件："+ file.getName());
        }
        return new String(bytes);
//        return Base64.encode(bytes);
    }
}
