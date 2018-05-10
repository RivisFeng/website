package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumDetail {
    private Long detailId;

    private Long detailCurriculumId;

    private Date curriculumStartTime;

    private Date curriculumEndTime;

    private Date curriculumExecuteDate;

    private Date curriculumExecuteTime;

    private String curriculumOutline;

    private String curriculumPresentation;

    private Date curriculumCreateTime;

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getDetailCurriculumId() {
        return detailCurriculumId;
    }

    public void setDetailCurriculumId(Long detailCurriculumId) {
        this.detailCurriculumId = detailCurriculumId;
    }

    public Date getCurriculumStartTime() {
        return curriculumStartTime;
    }

    public void setCurriculumStartTime(Date curriculumStartTime) {
        this.curriculumStartTime = curriculumStartTime;
    }

    public Date getCurriculumEndTime() {
        return curriculumEndTime;
    }

    public void setCurriculumEndTime(Date curriculumEndTime) {
        this.curriculumEndTime = curriculumEndTime;
    }

    public Date getCurriculumExecuteDate() {
        return curriculumExecuteDate;
    }

    public void setCurriculumExecuteDate(Date curriculumExecuteDate) {
        this.curriculumExecuteDate = curriculumExecuteDate;
    }

    public Date getCurriculumExecuteTime() {
        return curriculumExecuteTime;
    }

    public void setCurriculumExecuteTime(Date curriculumExecuteTime) {
        this.curriculumExecuteTime = curriculumExecuteTime;
    }

    public String getCurriculumOutline() {
        return curriculumOutline;
    }

    public void setCurriculumOutline(String curriculumOutline) {
        this.curriculumOutline = curriculumOutline == null ? null : curriculumOutline.trim();
    }

    public String getCurriculumPresentation() {
        return curriculumPresentation;
    }

    public void setCurriculumPresentation(String curriculumPresentation) {
        this.curriculumPresentation = curriculumPresentation == null ? null : curriculumPresentation.trim();
    }

    public Date getCurriculumCreateTime() {
        return curriculumCreateTime;
    }

    public void setCurriculumCreateTime(Date curriculumCreateTime) {
        this.curriculumCreateTime = curriculumCreateTime;
    }
}