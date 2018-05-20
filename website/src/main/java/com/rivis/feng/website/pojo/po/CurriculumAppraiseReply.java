package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumAppraiseReply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long replyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_appraise_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long replyAppraiseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long replyUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_content
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private String replyContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_is_show
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private String replyIsShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_appraise_reply.reply_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Date replyCreateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_id
     *
     * @return the value of curriculum_appraise_reply.reply_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getReplyId() {
        return replyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_id
     *
     * @param replyId the value for curriculum_appraise_reply.reply_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_appraise_id
     *
     * @return the value of curriculum_appraise_reply.reply_appraise_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getReplyAppraiseId() {
        return replyAppraiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_appraise_id
     *
     * @param replyAppraiseId the value for curriculum_appraise_reply.reply_appraise_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyAppraiseId(Long replyAppraiseId) {
        this.replyAppraiseId = replyAppraiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_user_id
     *
     * @return the value of curriculum_appraise_reply.reply_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getReplyUserId() {
        return replyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_user_id
     *
     * @param replyUserId the value for curriculum_appraise_reply.reply_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyUserId(Long replyUserId) {
        this.replyUserId = replyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_content
     *
     * @return the value of curriculum_appraise_reply.reply_content
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_content
     *
     * @param replyContent the value for curriculum_appraise_reply.reply_content
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_is_show
     *
     * @return the value of curriculum_appraise_reply.reply_is_show
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getReplyIsShow() {
        return replyIsShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_is_show
     *
     * @param replyIsShow the value for curriculum_appraise_reply.reply_is_show
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyIsShow(String replyIsShow) {
        this.replyIsShow = replyIsShow == null ? null : replyIsShow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_appraise_reply.reply_create_time
     *
     * @return the value of curriculum_appraise_reply.reply_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Date getReplyCreateTime() {
        return replyCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_appraise_reply.reply_create_time
     *
     * @param replyCreateTime the value for curriculum_appraise_reply.reply_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setReplyCreateTime(Date replyCreateTime) {
        this.replyCreateTime = replyCreateTime;
    }
}