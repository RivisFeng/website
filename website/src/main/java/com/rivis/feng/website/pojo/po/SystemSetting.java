package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class SystemSetting {
    private Long settingId;

    private String settingTitile;

    private String settingName;

    private String settingValue;

    private String settingValues;

    private String settingData;

    private String settingFrom;

    private String settingSort;

    private String settingDescription;

    private Date settingCreateTime;

    public Long getSettingId() {
        return settingId;
    }

    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    public String getSettingTitile() {
        return settingTitile;
    }

    public void setSettingTitile(String settingTitile) {
        this.settingTitile = settingTitile == null ? null : settingTitile.trim();
    }

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName == null ? null : settingName.trim();
    }

    public String getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue == null ? null : settingValue.trim();
    }

    public String getSettingValues() {
        return settingValues;
    }

    public void setSettingValues(String settingValues) {
        this.settingValues = settingValues == null ? null : settingValues.trim();
    }

    public String getSettingData() {
        return settingData;
    }

    public void setSettingData(String settingData) {
        this.settingData = settingData == null ? null : settingData.trim();
    }

    public String getSettingFrom() {
        return settingFrom;
    }

    public void setSettingFrom(String settingFrom) {
        this.settingFrom = settingFrom == null ? null : settingFrom.trim();
    }

    public String getSettingSort() {
        return settingSort;
    }

    public void setSettingSort(String settingSort) {
        this.settingSort = settingSort == null ? null : settingSort.trim();
    }

    public String getSettingDescription() {
        return settingDescription;
    }

    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription == null ? null : settingDescription.trim();
    }

    public Date getSettingCreateTime() {
        return settingCreateTime;
    }

    public void setSettingCreateTime(Date settingCreateTime) {
        this.settingCreateTime = settingCreateTime;
    }
}