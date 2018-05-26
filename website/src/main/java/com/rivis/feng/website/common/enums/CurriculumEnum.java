package com.rivis.feng.website.common.enums;

/**
 * @author Rivis
 * @date 2018/5/13 13:06
 * @description
 */
public enum CurriculumEnum {

    CURRICULUM_QUERY_IS_NULL(888888, "为查找到该课程"),
    ;

    private Integer code;

    private String message;

    CurriculumEnum(Integer code, String message) {
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
