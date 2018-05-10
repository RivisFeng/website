package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Derma {
    private Long dermaId;

    private Long dermaUserId;

    private String dermaName;

    private String dermaColor;

    private String dermaModuleStyle;

    private String dermaBackgroundImage;

    private Date dermaCreateTime;

    public Long getDermaId() {
        return dermaId;
    }

    public void setDermaId(Long dermaId) {
        this.dermaId = dermaId;
    }

    public Long getDermaUserId() {
        return dermaUserId;
    }

    public void setDermaUserId(Long dermaUserId) {
        this.dermaUserId = dermaUserId;
    }

    public String getDermaName() {
        return dermaName;
    }

    public void setDermaName(String dermaName) {
        this.dermaName = dermaName == null ? null : dermaName.trim();
    }

    public String getDermaColor() {
        return dermaColor;
    }

    public void setDermaColor(String dermaColor) {
        this.dermaColor = dermaColor == null ? null : dermaColor.trim();
    }

    public String getDermaModuleStyle() {
        return dermaModuleStyle;
    }

    public void setDermaModuleStyle(String dermaModuleStyle) {
        this.dermaModuleStyle = dermaModuleStyle == null ? null : dermaModuleStyle.trim();
    }

    public String getDermaBackgroundImage() {
        return dermaBackgroundImage;
    }

    public void setDermaBackgroundImage(String dermaBackgroundImage) {
        this.dermaBackgroundImage = dermaBackgroundImage == null ? null : dermaBackgroundImage.trim();
    }

    public Date getDermaCreateTime() {
        return dermaCreateTime;
    }

    public void setDermaCreateTime(Date dermaCreateTime) {
        this.dermaCreateTime = dermaCreateTime;
    }
}