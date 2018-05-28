package com.rivis.feng.website.common.exception;

/**
 * 自定义用户异常
 *
 * @author Rivis
 * @date 2018/05/28
 */
public class UserException extends RuntimeException {

    private Integer code;

    public UserException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
