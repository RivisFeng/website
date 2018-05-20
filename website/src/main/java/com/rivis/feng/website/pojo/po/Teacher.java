package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private Long teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_user_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private Long teacherUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_school
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherSchool;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_compensation
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherCompensation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_dimission_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private Date teacherDimissionTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_state
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_motto
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherMotto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_photo
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_create_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private Date teacherCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_look_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherLookNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_agree_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    private String teacherAgreeNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_user_id
     *
     * @return the value of teacher.teacher_user_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public Long getTeacherUserId() {
        return teacherUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_user_id
     *
     * @param teacherUserId the value for teacher.teacher_user_id
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherUserId(Long teacherUserId) {
        this.teacherUserId = teacherUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_school
     *
     * @return the value of teacher.teacher_school
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherSchool() {
        return teacherSchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_school
     *
     * @param teacherSchool the value for teacher.teacher_school
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool == null ? null : teacherSchool.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_compensation
     *
     * @return the value of teacher.teacher_compensation
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherCompensation() {
        return teacherCompensation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_compensation
     *
     * @param teacherCompensation the value for teacher.teacher_compensation
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherCompensation(String teacherCompensation) {
        this.teacherCompensation = teacherCompensation == null ? null : teacherCompensation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_dimission_time
     *
     * @return the value of teacher.teacher_dimission_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public Date getTeacherDimissionTime() {
        return teacherDimissionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_dimission_time
     *
     * @param teacherDimissionTime the value for teacher.teacher_dimission_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherDimissionTime(Date teacherDimissionTime) {
        this.teacherDimissionTime = teacherDimissionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_state
     *
     * @return the value of teacher.teacher_state
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherState() {
        return teacherState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_state
     *
     * @param teacherState the value for teacher.teacher_state
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherState(String teacherState) {
        this.teacherState = teacherState == null ? null : teacherState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_motto
     *
     * @return the value of teacher.teacher_motto
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherMotto() {
        return teacherMotto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_motto
     *
     * @param teacherMotto the value for teacher.teacher_motto
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherMotto(String teacherMotto) {
        this.teacherMotto = teacherMotto == null ? null : teacherMotto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_photo
     *
     * @return the value of teacher.teacher_photo
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherPhoto() {
        return teacherPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_photo
     *
     * @param teacherPhoto the value for teacher.teacher_photo
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherPhoto(String teacherPhoto) {
        this.teacherPhoto = teacherPhoto == null ? null : teacherPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_create_time
     *
     * @return the value of teacher.teacher_create_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public Date getTeacherCreateTime() {
        return teacherCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_create_time
     *
     * @param teacherCreateTime the value for teacher.teacher_create_time
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherCreateTime(Date teacherCreateTime) {
        this.teacherCreateTime = teacherCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_look_number
     *
     * @return the value of teacher.teacher_look_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherLookNumber() {
        return teacherLookNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_look_number
     *
     * @param teacherLookNumber the value for teacher.teacher_look_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherLookNumber(String teacherLookNumber) {
        this.teacherLookNumber = teacherLookNumber == null ? null : teacherLookNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_agree_number
     *
     * @return the value of teacher.teacher_agree_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getTeacherAgreeNumber() {
        return teacherAgreeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_agree_number
     *
     * @param teacherAgreeNumber the value for teacher.teacher_agree_number
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setTeacherAgreeNumber(String teacherAgreeNumber) {
        this.teacherAgreeNumber = teacherAgreeNumber == null ? null : teacherAgreeNumber.trim();
    }
}