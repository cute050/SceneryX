package com.yp.sx.common.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;

/**
 * @author yp
 * @since 2022/11/13
 **/
public class PassUtil {

    //SHA算法的类型  指纹算法
    public static final String SHA1 = "SHA-1";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    /**RSA算法的公钥*/
    public static final String PUBKEY = "absk_key";
    /**RSA算法的私钥*/
    public static final String PRIKEY = "pvsx_key";

    //1、编码格式
    /**
     * base64进行编码
     * @param msg 要编码的字符串
     * @return 编码之后的字符串-密文*/
    public static String base64enc(String msg) {
        return Base64.getEncoder ().encodeToString (msg.getBytes ());
    }

    private static String base64encByte(byte[] msg) {
        return Base64.getEncoder ().encodeToString (msg);
    }

    private static byte[] base64decByte(String msg) {
        return Base64.getDecoder ().decode (msg);
    }
    /**
     * base64进行解密
     * @param msg 要解码的字符串
     * @return 解码之后的字符串-明文*/
    public static String base64dec(String msg) {
        return new String (Base64.getDecoder ().decode (msg));
    }

    /**
     * MD5进行摘要
     * @param msg 要加密的字符串
     * @return MD5加密的字符串的Base64字符串*/
    public static String md5(String msg) {
        try {
            //创建摘要算法对象
            MessageDigest messageDigest = MessageDigest.getInstance ("MD5");
            messageDigest.update (msg.getBytes ());
            return base64encByte (messageDigest.digest ());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
        }
        return null;
    }

    /**
     * SHA摘要算法
     * @param type 类型 是SHA-1 SHA-256 SHA-512
     * @param msg 要加密的字符串
     * @return 加密之后的密文*/
    public static String sha(String type, String msg) {
        try {
            //创建摘要算法对象
            MessageDigest messageDigest = MessageDigest.getInstance (type);
            messageDigest.update (msg.getBytes ());
            return base64encByte (messageDigest.digest ());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
        }
        return null;
    }

    //创建 对称加密---密钥
    /**
     * 创建AES算法的密钥
     * @return AES的密钥*/
    public static String createAESKey() {
        try {
            //1、创建随机key
            KeyGenerator generator = KeyGenerator.getInstance ("AES");
            generator.init (128);
            SecretKey key = generator.generateKey ();
            return base64encByte (key.getEncoded ());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
        }
        return null;
    }
    //AES 加密 返回的是base64格式
    /**
     * AES加密
     * @param key 密钥
     * @param msg 要加密的字符串
     * @return 加密之后的密文*/
    public static String aesenc(String key, String msg) {
        SecretKeySpec secretKeySpec = new SecretKeySpec (base64decByte (key), "AES");
        try {
            Cipher cipher = Cipher.getInstance ("AES");
            cipher.init (Cipher.ENCRYPT_MODE, secretKeySpec);
            return base64encByte (cipher.doFinal (msg.getBytes ()));
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }
    //AES 解密 返回的是base64格式
    /**
     * AES解密
     * @param key 密钥
     * @param msg 要解密的字符串
     * @return 解密之后的明文*/
    public static String aesdec(String key, String msg) {
        SecretKeySpec secretKeySpec = new SecretKeySpec (base64decByte (key), "AES");
        try {
            Cipher cipher = Cipher.getInstance ("AES");
            cipher.init (Cipher.DECRYPT_MODE, secretKeySpec);
            return new String (cipher.doFinal (base64decByte (msg)));
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }

    //创建-RSA 密钥 一对儿 公私钥
    /**
     *创建RSA的密钥对儿，公钥和私钥
     *  */
    public static HashMap<String, String> createRSAKey() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance ("RSA");
            KeyPair keyPair = generator.generateKeyPair ();
            //创建使用私钥
            RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate ();
            //创建使用公钥
            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic ();
            HashMap<String, String> keys = new HashMap<> (2);
            keys.put (PUBKEY, base64encByte (publicKey.getEncoded()));
            keys.put (PRIKEY, base64encByte (privateKey.getEncoded ()));
            return keys;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
        }
        return null;
    }
    /**
     * rsa 公钥-加密
     * @param key 公钥
     * @param msg 要加密的字符串
     * @return 加密之后的密文*/
    public static String rsaEncPub(String key,String msg){
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(base64decByte(key));
        try {
            KeyFactory keyFactory = KeyFactory.getInstance ("RSA");
            PublicKey publicKey = keyFactory.generatePublic (keySpec);
            Cipher cipher = Cipher.getInstance ("RSA");
            cipher.init (Cipher.ENCRYPT_MODE, publicKey);
            return base64encByte(cipher.doFinal(msg.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //RSA  私钥-加密
    /**
     * rsa 私钥-加密
     * @param key 私钥
     * @param msg 要加密的字符串
     * @return 加密之后的密文*/
    public static String rsaEnc(String key, String msg) {
        try {
            //转换私钥
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec (base64decByte (key));
            KeyFactory keyFactory = KeyFactory.getInstance ("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate (keySpec);
            Cipher cipher = Cipher.getInstance ("RSA");
            cipher.init (Cipher.ENCRYPT_MODE, privateKey);
            return  base64encByte(cipher.doFinal(msg.getBytes()));
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }
    //RSA  公钥-解密
    /**
     * rsa 公钥-解密，对应的是私钥加密
     * @param key 公钥
     * @param msg 要解密的字符串
     * @return 解密之后的明文*/
    public static String rsaDec(String key, String msg) {
        try {
            //转换公钥
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec (base64decByte (key));
            KeyFactory keyFactory = KeyFactory.getInstance ("RSA");
            PublicKey publicKey = keyFactory.generatePublic (keySpec);
            Cipher cipher = Cipher.getInstance ("RSA");
            cipher.init (Cipher.DECRYPT_MODE, publicKey);
            return new String (cipher.doFinal (base64decByte (msg)), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }
    /**
     * RSA  私钥-解密 对应的是公钥加密
     * @param key 私钥
     * @param msg 解密的密文
     * @return 解密之后的明文
     */
    public static String rsaDecPri(String key, String msg) {
        try {
            //转换私钥
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec (base64decByte (key));
            KeyFactory keyFactory = KeyFactory.getInstance ("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate (keySpec);
            Cipher cipher = Cipher.getInstance ("RSA");
            cipher.init (Cipher.DECRYPT_MODE, privateKey);
            return new String(cipher.doFinal(base64decByte(msg)),"UTF-8");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }
}
