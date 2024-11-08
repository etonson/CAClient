package com.demo.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.text.StringEscapeUtils;

@Getter
@Setter
public class WebAPISecretary {
    private String wsdlURL = "";
    private String body ;

    public String spnedRequest(String method, String head) throws IOException {
        // 初始化位置
        URL url = new URL(wsdlURL);
        // 建立連線
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // 設置參數
        connection.setRequestMethod(method);
        // 設置開頭檔
        connection.setRequestProperty("content-type", head);
        // 設定權限
        connection.setDoInput(true);
        connection.setDoOutput(true);

        // 組合發送參數
        OutputStream os = connection.getOutputStream();
        if (body != null) {
            os.write(body.getBytes());
        }
        // 取得回應資料
        int responseCode = connection.getResponseCode();

        // 取得回傳資訊stream
        StringBuilder sb;
        String result = null;

        if (200 == responseCode) {
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            sb = new StringBuilder();
            String temp;
            while (null != (temp = br.readLine())) {
                sb.append(temp);
            }
            result = StringEscapeUtils.unescapeXml(sb.toString());
            System.out.println("response result->");
            System.out.println(result);
            is.close();
            isr.close();
            br.close();
        }
        os.close();
        return result;
    }
}
