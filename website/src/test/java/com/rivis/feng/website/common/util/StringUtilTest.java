package com.rivis.feng.website.common.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rivis
 * @date 2018/5/12 17:07
 * @description
 */
public class StringUtilTest {

    @Test
    public void createPrimaryKey() {
    }

    @Test
    public void checkUrl() {
    }

    @Test
    public void stringCoding() {
    }

    @Test
    public void encrypt() {
        System.err.println(StringUtil.encrypt("0"));
    }

    @Test
    public void decrypt() {
        System.err.println(StringUtil.decrypt("q/8u/PKPRgzCK1h2cYfuPg=="));
    }

    @Test
    public void splitToArray() {
    }

    @Test
    public void removeLastStr() {
    }

    @Test
    public void hideString() {
    }

    @Test
    public void userPasswordEncode() {
        try {
            System.err.println(StringUtil.userPasswordEncode("RivisFeng0310"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void stringIsNull() {
        String flag = "avx";
        System.err.println(StringUtils.isBlank(flag));
    }

    @Test
    public void stringIsEquals() {
        System.err.println(StringUtil.stringIsEquals("1", "1"));
    }

}