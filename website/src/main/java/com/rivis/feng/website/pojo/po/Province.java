package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Province {
    private Long provinceId;

    private String provinceName;

    private String provinceState;

    private Date provinceCreateTime;

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getProvinceState() {
        return provinceState;
    }

    public void setProvinceState(String provinceState) {
        this.provinceState = provinceState == null ? null : provinceState.trim();
    }

    public Date getProvinceCreateTime() {
        return provinceCreateTime;
    }

    public void setProvinceCreateTime(Date provinceCreateTime) {
        this.provinceCreateTime = provinceCreateTime;
    }
}