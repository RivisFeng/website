package com.rivis.feng.website.pojo.po;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author Rivis
 * @date 2018-04-25
 * @despaction
 */
public class User {

    /** 用户ID. */
    private String userId;

    /** 用户姓名. */
    private String userName;

    /** 用户密码. */
    private String userPassword;

    /** 用户生日. */
    private Date userBirthday;

    /** 用户性别. */
    private String userGender;

    /** 用户手机. */
    private String userPhone;

    /** 用户住址. */
    private String userAddress;

    /** 用户是否已经删除. */
    private Integer userDelete;

    /** 用户是否是VIP. */
    private Integer userVip;

    /** 用户邮箱. */
    private String userMail;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(Integer userDelete) {
        this.userDelete = userDelete;
    }

    public Integer getUserVip() {
        return userVip;
    }

    public void setUserVip(Integer userVip) {
        this.userVip = userVip;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }
}