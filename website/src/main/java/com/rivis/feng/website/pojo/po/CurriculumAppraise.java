package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumAppraise {
    private Long appraiseId;

    private Long appraiseUserId;

    private Long appraiseCurriculumId;

    private String appraiseContent;

    private String appraiseIsShow;

    private String appraiseAgreeNumber;

    private String appraiseNoAgreeNumber;

    private Date appraiseCreateTime;

    public Long getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(Long appraiseId) {
        this.appraiseId = appraiseId;
    }

    public Long getAppraiseUserId() {
        return appraiseUserId;
    }

    public void setAppraiseUserId(Long appraiseUserId) {
        this.appraiseUserId = appraiseUserId;
    }

    public Long getAppraiseCurriculumId() {
        return appraiseCurriculumId;
    }

    public void setAppraiseCurriculumId(Long appraiseCurriculumId) {
        this.appraiseCurriculumId = appraiseCurriculumId;
    }

    public String getAppraiseContent() {
        return appraiseContent;
    }

    public void setAppraiseContent(String appraiseContent) {
        this.appraiseContent = appraiseContent == null ? null : appraiseContent.trim();
    }

    public String getAppraiseIsShow() {
        return appraiseIsShow;
    }

    public void setAppraiseIsShow(String appraiseIsShow) {
        this.appraiseIsShow = appraiseIsShow == null ? null : appraiseIsShow.trim();
    }

    public String getAppraiseAgreeNumber() {
        return appraiseAgreeNumber;
    }

    public void setAppraiseAgreeNumber(String appraiseAgreeNumber) {
        this.appraiseAgreeNumber = appraiseAgreeNumber == null ? null : appraiseAgreeNumber.trim();
    }

    public String getAppraiseNoAgreeNumber() {
        return appraiseNoAgreeNumber;
    }

    public void setAppraiseNoAgreeNumber(String appraiseNoAgreeNumber) {
        this.appraiseNoAgreeNumber = appraiseNoAgreeNumber == null ? null : appraiseNoAgreeNumber.trim();
    }

    public Date getAppraiseCreateTime() {
        return appraiseCreateTime;
    }

    public void setAppraiseCreateTime(Date appraiseCreateTime) {
        this.appraiseCreateTime = appraiseCreateTime;
    }
}