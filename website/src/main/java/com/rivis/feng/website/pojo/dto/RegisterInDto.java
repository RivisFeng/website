package com.rivis.feng.website.pojo.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Rivis
 * @date 2018/5/21 22:14
 * @description
 */
public class RegisterInDto {

    /** 用户昵称. */
    @NotNull
    private String userName;

    /** 用户密码. */
    @NotNull
    private String userPassword;

    /** 用户重复输入校验密码. */
    @NotNull
    private String userCheckPassword;

    /** 用户头像. */
    private String userPicture;

    /** 用户生日. */
    private Date userBirthday;

    /** 用户性别. */
    private String userGender;

    /** 用户手机. */
    @NotNull
    private String userPhone;

    /** 用户所在城市. */
    private Long userCityId;

    /** 用户住址. */
    private String userAddress;

    /** 用户邮箱. */
    private String userMail;

    /** 用户注册来源. */
    @NotNull
    private String userFrom;

    public RegisterInDto() {
    }

    public RegisterInDto(@NotNull String userName, @NotNull String userPassword, @NotNull String userCheckPassword, String userPicture, Date userBirthday, String userGender, @NotNull String userPhone, Long userCityId, String userAddress, String userMail, @NotNull String userFrom) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCheckPassword = userCheckPassword;
        this.userPicture = userPicture;
        this.userBirthday = userBirthday;
        this.userGender = userGender;
        this.userPhone = userPhone;
        this.userCityId = userCityId;
        this.userAddress = userAddress;
        this.userMail = userMail;
        this.userFrom = userFrom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCheckPassword() {
        return userCheckPassword;
    }

    public void setUserCheckPassword(String userCheckPassword) {
        this.userCheckPassword = userCheckPassword;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
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
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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
        this.userAddress = userAddress;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    @Override
    public String toString() {
        return "RegisterInDto{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCheckPassword='" + userCheckPassword + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", userBirthday=" + userBirthday +
                ", userGender='" + userGender + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userCityId=" + userCityId +
                ", userAddress='" + userAddress + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userFrom='" + userFrom + '\'' +
                '}';
    }
}
