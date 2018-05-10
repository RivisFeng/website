package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Enterprise {
    private Long enterpriseId;

    private String enterpriseName;

    private Long enterpriseCityId;

    private Date enterpriseCreateTime;

    private String enterpriseState;

    private String enterpriseAddress;

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Long getEnterpriseCityId() {
        return enterpriseCityId;
    }

    public void setEnterpriseCityId(Long enterpriseCityId) {
        this.enterpriseCityId = enterpriseCityId;
    }

    public Date getEnterpriseCreateTime() {
        return enterpriseCreateTime;
    }

    public void setEnterpriseCreateTime(Date enterpriseCreateTime) {
        this.enterpriseCreateTime = enterpriseCreateTime;
    }

    public String getEnterpriseState() {
        return enterpriseState;
    }

    public void setEnterpriseState(String enterpriseState) {
        this.enterpriseState = enterpriseState == null ? null : enterpriseState.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }
}