package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Banner {
    private Long bannerId;

    private String bannerName;

    private String bannerUrl;

    private String bannerImageUrl;

    private String bannerSort;

    private String bannerType;

    private String bannerState;

    private String bannerDesc;

    private Date bannerCteateTime;

    public Long getBannerId() {
        return bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName == null ? null : bannerName.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl == null ? null : bannerImageUrl.trim();
    }

    public String getBannerSort() {
        return bannerSort;
    }

    public void setBannerSort(String bannerSort) {
        this.bannerSort = bannerSort == null ? null : bannerSort.trim();
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType == null ? null : bannerType.trim();
    }

    public String getBannerState() {
        return bannerState;
    }

    public void setBannerState(String bannerState) {
        this.bannerState = bannerState == null ? null : bannerState.trim();
    }

    public String getBannerDesc() {
        return bannerDesc;
    }

    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc == null ? null : bannerDesc.trim();
    }

    public Date getBannerCteateTime() {
        return bannerCteateTime;
    }

    public void setBannerCteateTime(Date bannerCteateTime) {
        this.bannerCteateTime = bannerCteateTime;
    }
}