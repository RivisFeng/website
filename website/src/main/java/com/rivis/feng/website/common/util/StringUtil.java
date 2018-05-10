package com.rivis.feng.website.common.util;

import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/**
 * 常用字符串操作类
 *
 * @author Rivis
 * @date 2018/5/9 21:37
 */
public class StringUtil {

    /**
     * 生成自增主键ID,采用Twitter的开源自增ID算法Snowflake
     *
     * @author Rivis
     * @return {String}
     */
    public static String createPrimaryKey() {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0,0);
        long id = snowflakeIdWorker.nextId();
        return String.valueOf(id);
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
        String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
        Pattern pattern = Pattern.compile(regex);
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
    public static String stringCoding(@NotNull String param){
        try {
            param = new String(param.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return param;
    }

    /**
     * String类型字符串转String类型的数组
     *
     * @author Rivis
     * @param orgStr {String} 要转为数组的字符串
     * @param splitStr {String} 字符串转数组的条件
     * @return {String[]} 字符串转为的数组
     */
    public static String[] splitToArray(String orgStr, String splitStr) {
        return removeLastStr(orgStr, splitStr).split(splitStr);
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
     * 将Object类型转为String类型
     *
     * @param param {Object} 要转为String类型的Object类型
     * @return {String} 转为String类型的Object类型
     */
    public static String toString(@NotNull Object param) {
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

}
