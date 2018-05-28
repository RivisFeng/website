package com.rivis.feng.website.pojo.dto;

public class AdminInDto {

    /** 管理员ID. */
    private Long adminId;

    /** 用户ID. */
    private Long userId;

    /** 管理员类型. */
    private String adminType;

    /** 管理员状态. */
    private String adminState;

    public AdminInDto() {
    }

    public AdminInDto(Long adminId, Long userId, String adminType, String adminState) {
        this.adminId = adminId;
        this.userId = userId;
        this.adminType = adminType;
        this.adminState = adminState;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    @Override
    public String toString() {
        return "AdminInDto{" +
                "adminId=" + adminId +
                ", userId=" + userId +
                ", adminType='" + adminType + '\'' +
                ", adminState='" + adminState + '\'' +
                '}';
    }
}
