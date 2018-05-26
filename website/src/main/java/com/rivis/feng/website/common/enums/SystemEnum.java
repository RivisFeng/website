package com.rivis.feng.website.common.enums;

/**
 * @author Rivis
 * @date 2018/5/13 13:05
 * @description
 */
public enum SystemEnum {

    SYSTEM_SETTING_QUERY_IS_NULL(888888, "为查找到该系统配置"),
    ;

    private Integer code;

    private String message;

    SystemEnum(Integer code, String message) {
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
