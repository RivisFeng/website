package com.rivis.feng.website.common.enums;

/**
 * @author Rivis
 * @date 2018/5/13 13:05
 * @description
 */
public enum UserEnum {
    USER_IS_NULL(999998, "用户为空"),

    USER_PHONE_IS_NULL(999998, "用户为空"),

    USER_PASSWORD_IS_NULL(999997, "用户为空"),

    USER_PASSWORD_ERROR(999996, "用户为空"),

    USER_QUERY_ERROR(999995, "用户为空"),

    USER_IS_NOT_TEACHER(999994, "用户为空"),

    USER_IS_NOT_ADMIN(999993, "用户为空"),
    ;

    private Integer code;

    private String message;

    UserEnum(Integer code, String message) {
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
