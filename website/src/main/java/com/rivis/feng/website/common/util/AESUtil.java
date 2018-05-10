package com.rivis.feng.website.common.util;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES加密，解密工具类
 *
 * @author Rivis
 * @date 2018/5/9 22:24
 */
public class AESUtil {

    /** 算法密钥. */
    private static final String KEY_ALGORITHM = "AES";

    /** 默认的加密算法. */
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    /** 密钥. */
    private static final String KEY = "mrkuluyukikikuch";

    /**
     * 生成密钥
     *
     * @author Rivis
     * @return {byte[]} 生成的密钥
     */
    private static byte[] initSecretKey() {
        //返回生成指定算法密钥生成器的 KeyGenerator 对象
        KeyGenerator kg = null;
        try {
            kg = KeyGenerator.getInstance(KEY_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new byte[0];
        }
        //初始化此密钥生成器，使其具有确定的密钥大小
        //AES 要求密钥长度为 128
        kg.init(128);
        //生成一个密钥
        SecretKey secretKey = kg.generateKey();
        return secretKey.getEncoded();
    }

    /**
     * 生成密钥
     *
     * @author Rivis
     * @param key {byte[]}
     * @return {Key}
     */
    private static Key toKey(byte[] key) {
        //生成密钥
        return new SecretKeySpec(key, KEY_ALGORITHM);
    }

    /**
     * 加密方法
     *
     * @author Rivis
     * @param data {byte[]} 需要加密的数据
     * @param key {Key} 加密密钥
     * @return {byte[]} 加密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] encrypt(byte[] data, Key key) throws Exception {
        return encrypt(data, key, DEFAULT_CIPHER_ALGORITHM);
    }

    /**
     * 加密方法
     *
     * @author Rivis
     * @param data {byte[]} 需要加密的数据
     * @param key {byte[]} 加密密钥
     * @return {byte[]} 加密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        return encrypt(data, key, DEFAULT_CIPHER_ALGORITHM);
    }

    /**
     * 开始加密
     *
     * @author Rivis
     * @param data {byte[]} 需要加密的数据
     * @param key {byte[]} 加密密钥
     * @param cipherAlgorithm {String} 加密算法
     * @return {byte[]} 加密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] encrypt(byte[] data, byte[] key, String cipherAlgorithm) throws Exception {
        //还原密钥
        Key k = toKey(key);
        return encrypt(data, k, cipherAlgorithm);
    }

    /**
     * 开始加密
     *
     * @author Rivis
     * @param data {byte[]} 需要加密的数据
     * @param key {byte[]} 加密密钥
     * @param cipherAlgorithm {String} 加密算法
     * @return {byte[]} 加密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] encrypt(byte[] data, Key key, String cipherAlgorithm) throws Exception {
        //实例化
        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        //使用密钥初始化，设置为加密模式
        cipher.init(Cipher.ENCRYPT_MODE, key);
        //执行操作
        return cipher.doFinal(data);
    }

    /**
     * 解密
     * @param data {byte[]} 要解密的数据
     * @param key {byte[]} 解密密钥
     * @return {byte[]} 解密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        return decrypt(data, key, DEFAULT_CIPHER_ALGORITHM);
    }

    /**
     * 解密
     * @param data {byte[]} 要解密的数据
     * @param key {Key} 解密密钥
     * @return {byte[]} 解密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] decrypt(byte[] data, Key key) throws Exception {
        return decrypt(data, key, DEFAULT_CIPHER_ALGORITHM);
    }

    /**
     * 开始解密
     *
     * @author Rivis
     * @param data {byte[]} 要解密的数据
     * @param key {byte[]} 解密密钥
     * @param cipherAlgorithm {String} 解密算法
     * @return {byte[]} 解密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] decrypt(byte[] data, byte[] key, String cipherAlgorithm) throws Exception {
        //还原密钥
        Key k = toKey(key);
        return decrypt(data, k, cipherAlgorithm);
    }

    /**
     * 开始解密
     *
     * @author Rivis
     * @param data {byte[]} 要解密的数据
     * @param key {Key} 解密密钥
     * @param cipherAlgorithm {String} 解密算法
     * @return {byte[]} 解密后的数据
     * @throws Exception 可能抛出的异常
     */
    private static byte[] decrypt(byte[] data, Key key, String cipherAlgorithm) throws Exception {
        //实例化
        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        //使用密钥初始化，设置为解密模式
        cipher.init(Cipher.DECRYPT_MODE, key);
        //执行操作
        return cipher.doFinal(data);
    }

    /**
     * 测试用
     *
     * @author Rivis
     * @param data {byte[]} 加密或解密后的数据
     * @return {String} 加密或解密后的数据转化为的字符串
     */
    private static String showByteArray(byte[] data) {
        if (null == data) {
            return null;
        }
        StringBuilder sb = new StringBuilder("{");
        for (byte b : data) {
            sb.append(b).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

    /**
     * 加密数据
     *
     * @author Rivis
     * @param data {String} 要加密的数据
     * @return {String} 加密后的数据
     */
    public static String encrypt(String data) {
        byte[] key = KEY.getBytes();
        // 生成密钥
        Key k = toKey(key);
        // 加密数据
        byte[] encryptData = new byte[0];
        try {
            encryptData = encrypt(data.getBytes(), k);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Base64Util.base64Encode(encryptData);
    }

    /**
     * 解密数据
     *
     * @author Rivis
     * @param data {String} 要解密的数据
     * @return {String} 解密后的数据
     */
    public static String decrypt(String data) {
        byte[] key = KEY.getBytes();
        // 生成密钥
        Key k = toKey(key);
        byte[] decryptData = new byte[0];
        try {
            decryptData = Base64Util.base64Decode(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] returnDecryptData = new byte[0];
        try {
            returnDecryptData = decrypt(decryptData, k);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(returnDecryptData);
    }

}
