package com.rivis.feng.website.common.util;

import com.rivis.feng.website.common.constant.SystemConstants;
import com.rivis.feng.website.common.constant.UserConstants;
import com.rivis.feng.website.common.util.subsidiary.SnowflakeIdWorker;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/**
 * String工具类
 *
 * @author Rivis
 * @date 2018/5/9 21:37
 */
public class StringUtil {

    /**
     * 校验一个字符串是否为空
     *
     * @author Rivis
     * @param param {String}
     * @return {boolean}
     */
    public static boolean stringIsNull(String param) {
        return StringUtils.isBlank(param);
    }

    /**
     * 生成自增主键ID,采用Twitter的开源自增ID算法Snowflake
     *
     * @author Rivis
     * @return {long}
     */
    public static long createPrimaryKey() {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0,0);
        long id = snowflakeIdWorker.nextId();
        return id;
    }

    /**
     * 校验一个字符串是否是一个链接地址
     *
     * @author Rivis
     * @param url {String} 链接地址
     * @return {Boolean}
     */
    public static Boolean checkUrl(String url) {
        Boolean flag = false;
        Pattern pattern = Pattern.compile(SystemConstants.CHECK_HTTP_URL);
        if (pattern.matcher(url).matches()) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * iso-8859-1转UTF-8
     *
     * @author Rivis
     * @param param {String} 需要转码的数据
     * @return {String}
     */
    public static String stringCoding(String param){
        try {
            param = new String(param.getBytes(SystemConstants.ISO_8859_1), SystemConstants.UTF8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return param;
    }

    /**
     * 去除字符串的结尾部分
     *
     * @param orgStr {String} 要去除结尾的字符串
     * @param lastStr {String} 需要去除的结尾部分
     * @return {String} 去除结尾的字符串
     */
    public static String removeLastStr(String orgStr, String lastStr) {
        //如果传入的字符串orgStr以lastStr结尾，就去除以lastStr结尾的部分。
        if (orgStr.endsWith(lastStr)) {
            orgStr = orgStr.substring(0, orgStr.lastIndexOf(lastStr));
        }
        return orgStr;
    }

    /**
     * String类型字符串转String类型的数组
     *
     * @author Rivis
     * @param orgStr {String} 要转为数组的字符串
     * @param splitStr {String} 字符串转数组的条件
     * @return {String[]} 字符串转为的数组
     */
    public static String[] splitToArray(String orgStr,String splitStr) {
        return removeLastStr(orgStr, splitStr).split(splitStr);
    }

    /**
     * 将Object类型转为String类型
     *
     * @param param {Object} 要转为String类型的Object类型
     * @return {String} 转为String类型的Object类型
     */
    public static String toString(Object param) {
        return param.toString();
    }

    /**
     * 隐匿信息
     *
     * @author Rivis
     * @param param {String} 需要隐匿的信息
     * @return {String} 隐匿后的信息
     */
    public static String hideString(String param) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(param.substring(0, 6));
        stringBuffer.append("****");
        stringBuffer.append(param.substring(param.length() - 4, param.length()));
        return stringBuffer.toString();
    }

    /**
     * 加密用户密码
     *
     * @author Rivis
     * @param inPassword {String} 要加密的用户密码
     * @return {String} 加密好的密码
     * @throws Exception
     */
    public static String userPasswordEncode(String inPassword) throws Exception {
        return SHAUtil.encrypt(AESUtil.encrypt(inPassword));
    }

    /**
     * 校验密码是否正确
     * @param inPassword {String} 待验证的字符串
     * @param oldPassword {String} 使用MD5加密过的16进制字符串
     * @return {boolean} 匹配返回true，不匹配返回false
     */
    public static boolean validatePassword(String inPassword , String oldPassword) throws Exception {
        String encryptPassword = userPasswordEncode(inPassword);
        return encryptPassword.equals(oldPassword);
    }

    /**
     * 加密字符串
     * @param param
     * @return
     */
    public static String encrypt(String param) {
        if (!stringIsNull(param)) {
            return AESUtil.encrypt(param);
        }
        return "";
    }

    /**
     * 解密字符串
     * @param param
     * @return
     */
    public static String decrypt(String param) {
        if (!stringIsNull(param)) {
            return AESUtil.decrypt(param);
        }
        return "";
    }

    /**
     * 验证是否是HTTP链接
     *
     * @author Rivis
     * @param {String} value 某串数字
     * @return {boolean}
     * @throws
     */
    public static boolean checkPhone(String value) {
        Boolean flag = false;
        // 正则表达式
        Pattern pattern = Pattern.compile(UserConstants.CHECK_PHONE);
        if (stringIsNull(value)) {
            flag = pattern.matcher(value).matches();
        }
        return flag;
    }

    public static Boolean stringIsEquals(String param1, String param2) {
        Boolean flag = false;
        if (StringUtils.equals(param1, param2)) {
            flag = true;
        }
        return flag;
    }

}
