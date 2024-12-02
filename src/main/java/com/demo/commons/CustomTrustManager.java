package com.demo.commons;

import javax.net.ssl.X509TrustManager;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/*
  @author : eton.lin
  @description TODO
  @date 2024-08-30 下午 06:15
 */
public class CustomTrustManager implements X509TrustManager {

    public CustomTrustManager(KeyStore keystore) throws NoSuchAlgorithmException, KeyStoreException {
        super();
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
