package com.rivis.feng.website.common.util;

import com.rivis.feng.website.common.util.subsidiary.Keccak;

import java.security.MessageDigest;

import static com.rivis.feng.website.common.enums.SHAEnum.SHA3_256;
import static com.rivis.feng.website.common.util.HexUtil.getHex;

/**
 * SHA加密工具类
 *
 * @author Rivis
 * @date 2018-05-09
 */
public class SHAUtil {

    /***
     * SHA加密 生成40位SHA码,jdk自带的MessageDigest实现
     *
     * @author Rivis
     * @param inString {String} 待加密字符串
     * @return {String} 返回40位SHA码
     */
    @Deprecated
    protected static String shaEncode(String inString) throws Exception {
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inString.getBytes("UTF-8");
        byte[] md5Bytes = sha.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    /***
     * SHA加密 生成40位SHA码
     *
     * @author Rivis
     * @param inString {String} 待加密字符串
     * @return {String} 返回40位SHA码
     */
    protected static String encrypt(String inString) {
        String inStringHex = getHex(inString.getBytes());
        Keccak keccak = new Keccak();
        return keccak.getHash(inStringHex, SHA3_256);
    }

}
