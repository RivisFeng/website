package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userPricture;

    private Date userBirthday;

    private String userGender;

    private String userPhone;

    private Long userCityId;

    private String userAddress;

    private String userIsDelete;

    private String userIsVip;

    private String userMail;

    private Date userCreateTime;

    private String userFrom;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getUserPricture() {
        return userPricture;
    }

    public void setUserPricture(String userPricture) {
        this.userPricture = userPricture == null ? null : userPricture.trim();
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

    public Long getUserCityId() {
        return userCityId;
    }

    public void setUserCityId(Long userCityId) {
        this.userCityId = userCityId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserIsDelete() {
        return userIsDelete;
    }

    public void setUserIsDelete(String userIsDelete) {
        this.userIsDelete = userIsDelete == null ? null : userIsDelete.trim();
    }

    public String getUserIsVip() {
        return userIsVip;
    }

    public void setUserIsVip(String userIsVip) {
        this.userIsVip = userIsVip == null ? null : userIsVip.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom == null ? null : userFrom.trim();
    }
}