package com.demo.commons;

import java.nio.charset.StandardCharsets;


import javax.crypto.Cipher;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/*
    @author : Eton.lin
    @description 加解密工具
    @date 2024-11-11 下午 02:21
*/
public class AESUtil {
    /** The SPEC type */
    /** The SPEC type */
    private final static String SPEC = "AES";

    /** The PKCS5 padding type. */
    private final static String PKCS5_AlGORITHM = "AES/CBC/PKCS5Padding";

    /** The PKCS7 padding type. */
    private final static String PKCS7_AlGORITHM = "AES/CBC/PKCS7Padding";

    /** The aes key. 256位 , 32碼字符 */
    private final static String AES_KEY = "!QAZ3edc%TGB7ujm@WSX1qaz#EDC4rfv";

    /** The HEX key. */
    private final static String HEX_KEY = "0b25250f64bf743be20277bc3e62852dfcd250cbf3ce699530d3a0bef880a541";

    /** The IV key. */
    private final static String IV_KEY = "9ijn&YGV5rdx6tfc";

    /** The SALT key. */
    private static final String SALT = "@WSX1qaz#EDC4rfv";

    /*
      利用hex生成金鑰
    */
    private static SecretKeySpec generateSecretKey()throws Exception {
        return new SecretKeySpec(HEX_KEY.getBytes(), SPEC);
    }
    public static String encrypt(String data, String iv_key)throws Exception{
        try{
            Cipher cipher = Cipher.getInstance(PKCS5_AlGORITHM);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);

            IvParameterSpec ivspec = new IvParameterSpec(iv_key.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, generateSecretKey() , ivspec);
            byte[] encrypted = cipher.doFinal(dataBytes);
            return new String(encrypted);
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) throws Exception {
        String s = "dbf9286f4677ae45";
        String d = encrypt("7+1=89Bb@123456", s);
        System.out.println(d);
    }
}
