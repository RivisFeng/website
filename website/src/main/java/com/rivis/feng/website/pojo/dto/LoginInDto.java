package com.rivis.feng.website.pojo.dto;

/**
 * 登录入参
 *
 * @author Rivis
 * @date 2018-04-25
 * @despaction
 */
public class LoginInDto {

    private String userPhone;

    private String userPassword;

    private String checkCode;

    public LoginInDto() {
    }

    public LoginInDto(String userPhone, String userPassword, String checkCode) {
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.checkCode = checkCode;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Override
    public String toString() {
        return "LoginInDto{" +
                "userPhone='" + userPhone + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", checkCode='" + checkCode + '\'' +
                '}';
    }
}
