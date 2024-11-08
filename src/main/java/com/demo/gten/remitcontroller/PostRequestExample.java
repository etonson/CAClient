package com.demo.gten.remitcontroller;
import org.apache.commons.text.StringEscapeUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/*
    @author : Eton.lin
    @description TODO
    @date 2024-11-07 下午 02:53
*/
public class PostRequestExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8080/GTEN/web/remit/queryToken");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            int responseCode = connection.getResponseCode();
            // 取得回傳資訊stream
            StringBuilder sb ;
            String result = null ;
            if (200 == responseCode) {
                InputStream is = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                sb = new StringBuilder();
                String temp ;
                while (null != (temp = br.readLine())) {
                    sb.append(temp);
                }
                result =  StringEscapeUtils.unescapeXml(sb.toString());
                System.out.println("response result->");
                System.out.println(result);
                is.close();
                isr.close();
                br.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}