package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Grade {
    private Long gradeId;

    private String gradeName;

    private String gradeState;

    private Date gradeCreateTime;

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getGradeState() {
        return gradeState;
    }

    public void setGradeState(String gradeState) {
        this.gradeState = gradeState == null ? null : gradeState.trim();
    }

    public Date getGradeCreateTime() {
        return gradeCreateTime;
    }

    public void setGradeCreateTime(Date gradeCreateTime) {
        this.gradeCreateTime = gradeCreateTime;
    }
}