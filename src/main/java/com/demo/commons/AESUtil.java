package com.demo.commons;


import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;


import javax.crypto.Cipher;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/*
    @author : Eton.lin
    @description 加解密工具
    @date 2024-11-11 下午 02:21
*/
public class AESUtil {

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


    /**
     * 利用hex生成金鑰
     *
     * @return
     */
    private static SecretKeySpec generateSecretKey()throws Exception{
        return new SecretKeySpec(DatatypeConverter.parseHexBinary(HEX_KEY), SPEC);
    }


    /**
     * 利用固定salt生成金鑰
     * Testing method:暫不使用
     * @return
     */
    private static SecretKeySpec generateSecretKeyByFixedSalt(final String secrect_key) throws Exception{
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(secrect_key.toCharArray(), SALT.getBytes(), 65536, 256);
            SecretKey tmp = factory.generateSecret(spec);
            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), SPEC);

            return secretKey;
        } catch (NoSuchAlgorithmException ex) {
            throw new Exception(ex);
        }

    }

    /**
     * 解密資料(使用內定的iv_key)
     */
    public static String decryptFixed(String dataEncode)throws Exception {
        return decrypt(dataEncode, IV_KEY);
    }

    /**
     * 加密資料(使用內定的iv_key)
     */
    public static String encryptFixed(String text)throws Exception{
        return encrypt(text, IV_KEY);
    }



    public static String decrypt(String dataEncode, String iv_key)throws Exception {
        try{
            byte[] encrypted = DatatypeConverter.parseBase64Binary(dataEncode);

            Cipher cipher = Cipher.getInstance(PKCS5_AlGORITHM);
            IvParameterSpec ivspec = new IvParameterSpec(iv_key.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, generateSecretKey() , ivspec);

            byte[] original = cipher.doFinal(encrypted);
            return new String(original, "UTF-8");

        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }

    }


    public static String encrypt(String data, String iv_key)throws Exception{
        try{
            Cipher cipher = Cipher.getInstance(PKCS5_AlGORITHM);
            byte[] dataBytes = data.getBytes("UTF-8");

            IvParameterSpec ivspec = new IvParameterSpec(iv_key.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, generateSecretKey() , ivspec);
            byte[] encrypted = cipher.doFinal(dataBytes);

            return new String(DatatypeConverter.printBase64Binary(encrypted));
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }

    }

    //=====================DB==========================

    //DB資料庫使用
    //private final static String DB_AES_KEY = "0b25250f64bf743be20277bc3e62852dfcd250cbf3ce699530d3a0bef880gten";
    private final static String DB_AES_KEY = "0b25250f64bf743be20277bc3e62852dfcd250cbf3ce699530d3a0bef880acba";
    /** The DBIV key. */
    private final static String DB_IV_KEY = "9ijn&YGV5rdx6tfc";




    private static SecretKeySpec generateSecretKey_DB()throws Exception{
        return new SecretKeySpec(DatatypeConverter.parseHexBinary(DB_AES_KEY), SPEC);
    }


    public static void main(String[] args) throws Exception {
        String s = "8a82a8834eb0035b";
        String d = decrypt("aUqkBFVm+4fqG+BTFbzlDg==", s);
        System.out.println(d);
    }
}
