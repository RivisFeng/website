package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class UserStateLog {
    private Long logId;

    private String logType;

    private Date logCreateTime;

    private String logIp;

    private String logArea;

    private String logEquipment;

    private String logSoft;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public Date getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Date logCreateTime) {
        this.logCreateTime = logCreateTime;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    public String getLogArea() {
        return logArea;
    }

    public void setLogArea(String logArea) {
        this.logArea = logArea == null ? null : logArea.trim();
    }

    public String getLogEquipment() {
        return logEquipment;
    }

    public void setLogEquipment(String logEquipment) {
        this.logEquipment = logEquipment == null ? null : logEquipment.trim();
    }

    public String getLogSoft() {
        return logSoft;
    }

    public void setLogSoft(String logSoft) {
        this.logSoft = logSoft == null ? null : logSoft.trim();
    }
}