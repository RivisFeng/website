package com.rivis.feng.website.common.enums;

/**
 * @author Rivis
 * @date 2018/5/13 13:05
 * @description
 */
public enum UserEnum {
    USER_IS_NULL(999998, "用户为空"),

    USER_PHONE_IS_NULL(999998, "用户手机号码为空"),

    USER_PASSWORD_IS_NULL(999997, "用户密码为空"),

    USER_PASSWORD_ERROR(999996, "用户密码错误"),

    USER_PASSWORD_CHECK_ERROR(999995, "用户两次输入的密码不一致"),

    USER_QUERY_ERROR(999994, "用户查询错误"),

    USER_IS_NOT_TEACHER(999993, "用户不是老师"),

    USER_IS_NOT_ADMIN(999992, "用户不是管理员"),

    PHONE_IS_NOT_PHONE(999992, "用户不是管理员"),

    USER_REGISTER_IS_NULL(999991, "用户注册平台来源为空"),

    USER_REGISTER_SUCCESS(999990, "用户注册成功"),

    USER_REGISTER_ERROR(999989, "用户注册失败"),

    PLEASE_IMPORT_CITY_ADDRESS(999988, "请选择你所在的城市住址"),

    PLEASE_IMPORT_DEAIL_ADDRESS(999980, "请填写你的详细住址"),

    APPLY_FOR_ADMIN_SUCCESS(999987, "申请成为管理员成功"),

    APPLY_FOR_ADMIN_ERROR(999986, "申请成为管理员失败"),

    APPLY_FOR_TEACHER_SUCCESS(999985, "申请成为教师成功"),

    APPLY_FOR_TEACHER_ERROR(999984, "申请成为教师失败"),

    USER_ID_IS_NULL(999983, "用户ID为空"),

    ADMIN_TYPE_IS_NULL(999982, "管理员类型为空"),

    ADMIN_STATE_IS_NULL(999981, "管理员状态为空"),

    ADMIN_ID_IS_NULL(999979, "管理员ID为空"),

    USER_LOGIN_SUCCESS(999978, "用户登录成功"),

    USER_LOGIN_ERROR(999977, "用户登录失败"),
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
