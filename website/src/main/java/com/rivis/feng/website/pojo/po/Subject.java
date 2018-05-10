package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Subject {
    private Long subjectId;

    private String subjectName;

    private Date subjectCreateTime;

    private String subjectState;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Date getSubjectCreateTime() {
        return subjectCreateTime;
    }

    public void setSubjectCreateTime(Date subjectCreateTime) {
        this.subjectCreateTime = subjectCreateTime;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState == null ? null : subjectState.trim();
    }
}