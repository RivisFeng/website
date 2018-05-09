package com.rivis.feng.website.common.util;

import java.util.Base64;

/**
 * @author Rivis
 * @date 2018/5/9 23:23
 * @description
 */
public class Base64Util {

    private static Base64.Encoder encoder = Base64.getEncoder();

    private static Base64.Decoder decoder = Base64.getDecoder();

    /**
     * base 64 encode
     *
     * @author Rivis
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    public static String base64Encode(byte[] bytes){
        return encoder.encodeToString(bytes);
    }

    /**
     * base 64 decode
     *
     * @author Rivis
     * @param base64Code 待解码的base 64 code
     * @return 解码后的byte[]
     * @throws Exception
     */
    public static byte[] base64Decode(String base64Code) throws Exception{
        return base64Code.isEmpty() ? null : decoder.decode(base64Code);
    }
}
