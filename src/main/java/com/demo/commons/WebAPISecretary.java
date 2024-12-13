package com.demo.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.text.StringEscapeUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

@Getter
@Setter
public class WebAPISecretary {
    private String wsdlURL = "";
    private String body;

    public String spnedRequest(String method, String head) throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        // 設置SSL環境
        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(null, new TrustManager[] { new CustomTrustManager(null) }, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier(new CustomHostnameVerifier());

        // 初始化URL
        URL url = new URL(wsdlURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
        connection.setRequestProperty("content-type", head);
        connection.setDoInput(true);
        connection.setDoOutput(true);

        // 組合發送參數
        OutputStream os = null;
        if (body != null) {
            os = connection.getOutputStream();
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
            is.close();
            isr.close();
            br.close();
        }
        if (os != null) {
            os.close();
        }
        return result;
    }
}
