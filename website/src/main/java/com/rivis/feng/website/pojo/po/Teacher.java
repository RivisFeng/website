package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Teacher {
    private Long teacherId;

    private Long teacherUserId;

    private String teacherSchool;

    private String teacherCompensation;

    private Date teacherDimissionTime;

    private String teacherState;

    private String teacherMotto;

    private String teacherPhoto;

    private Date teacherCreateTime;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getTeacherUserId() {
        return teacherUserId;
    }

    public void setTeacherUserId(Long teacherUserId) {
        this.teacherUserId = teacherUserId;
    }

    public String getTeacherSchool() {
        return teacherSchool;
    }

    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool == null ? null : teacherSchool.trim();
    }

    public String getTeacherCompensation() {
        return teacherCompensation;
    }

    public void setTeacherCompensation(String teacherCompensation) {
        this.teacherCompensation = teacherCompensation == null ? null : teacherCompensation.trim();
    }

    public Date getTeacherDimissionTime() {
        return teacherDimissionTime;
    }

    public void setTeacherDimissionTime(Date teacherDimissionTime) {
        this.teacherDimissionTime = teacherDimissionTime;
    }

    public String getTeacherState() {
        return teacherState;
    }

    public void setTeacherState(String teacherState) {
        this.teacherState = teacherState == null ? null : teacherState.trim();
    }

    public String getTeacherMotto() {
        return teacherMotto;
    }

    public void setTeacherMotto(String teacherMotto) {
        this.teacherMotto = teacherMotto == null ? null : teacherMotto.trim();
    }

    public String getTeacherPhoto() {
        return teacherPhoto;
    }

    public void setTeacherPhoto(String teacherPhoto) {
        this.teacherPhoto = teacherPhoto == null ? null : teacherPhoto.trim();
    }

    public Date getTeacherCreateTime() {
        return teacherCreateTime;
    }

    public void setTeacherCreateTime(Date teacherCreateTime) {
        this.teacherCreateTime = teacherCreateTime;
    }
}