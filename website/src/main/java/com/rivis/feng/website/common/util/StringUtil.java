package com.rivis.feng.website.common.util;

/**
 * 常用字符串操作类
 *
 * @author Rivis
 * @date 2018/5/9 21:37
 * @description
 */
public class StringUtil {

    /**
     * 生成自增主键ID
     *
     * @author Rivis
     * @return {String}
     * @description 采用Twitter的开源自增ID算法Snowflake
     */
    public static String createPrimaryKey() {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0,0);
        long id = snowflakeIdWorker.nextId();
        return String.valueOf(id);
    }

}
