package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class City {
    private Long cityId;

    private String cityName;

    private Long cityProvinceId;

    private String cityState;

    private Date cityCreateTime;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Long getCityProvinceId() {
        return cityProvinceId;
    }

    public void setCityProvinceId(Long cityProvinceId) {
        this.cityProvinceId = cityProvinceId;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState == null ? null : cityState.trim();
    }

    public Date getCityCreateTime() {
        return cityCreateTime;
    }

    public void setCityCreateTime(Date cityCreateTime) {
        this.cityCreateTime = cityCreateTime;
    }
}