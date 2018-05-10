package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Advertising {
    private Long advertisingId;

    private String advertisingName;

    private String advertisingManufacturer;

    private String advertisingLocation;

    private String advertisingCost;

    private Date advertisingCreateTime;

    private Date advertisingStartTime;

    private Date advertisingEndTime;

    private String advertisingState;

    public Long getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(Long advertisingId) {
        this.advertisingId = advertisingId;
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName == null ? null : advertisingName.trim();
    }

    public String getAdvertisingManufacturer() {
        return advertisingManufacturer;
    }

    public void setAdvertisingManufacturer(String advertisingManufacturer) {
        this.advertisingManufacturer = advertisingManufacturer == null ? null : advertisingManufacturer.trim();
    }

    public String getAdvertisingLocation() {
        return advertisingLocation;
    }

    public void setAdvertisingLocation(String advertisingLocation) {
        this.advertisingLocation = advertisingLocation == null ? null : advertisingLocation.trim();
    }

    public String getAdvertisingCost() {
        return advertisingCost;
    }

    public void setAdvertisingCost(String advertisingCost) {
        this.advertisingCost = advertisingCost == null ? null : advertisingCost.trim();
    }

    public Date getAdvertisingCreateTime() {
        return advertisingCreateTime;
    }

    public void setAdvertisingCreateTime(Date advertisingCreateTime) {
        this.advertisingCreateTime = advertisingCreateTime;
    }

    public Date getAdvertisingStartTime() {
        return advertisingStartTime;
    }

    public void setAdvertisingStartTime(Date advertisingStartTime) {
        this.advertisingStartTime = advertisingStartTime;
    }

    public Date getAdvertisingEndTime() {
        return advertisingEndTime;
    }

    public void setAdvertisingEndTime(Date advertisingEndTime) {
        this.advertisingEndTime = advertisingEndTime;
    }

    public String getAdvertisingState() {
        return advertisingState;
    }

    public void setAdvertisingState(String advertisingState) {
        this.advertisingState = advertisingState == null ? null : advertisingState.trim();
    }
}