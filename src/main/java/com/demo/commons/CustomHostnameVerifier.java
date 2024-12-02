package com.demo.commons;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/*
  @author : eton.lin
  @description TODO
  @date 2024-08-30 下午 06:15
 */
public class CustomHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}