package com.rivis.feng.website.common.enums;

/**
 * 常用枚举类
 *
 * @Auther: Rivis
 * @Date: 2018/4/18 18:27
 * @Description:
 */
public enum BaseEnum {

    SUCCESS(000000, "成功"),

    ERROR(999999, "成功");

    private Integer code;

    private String message;

    BaseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
