package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumAppraiseReply {
    private Long replyId;

    private Long replyAppraiseId;

    private Long replyUserId;

    private String replyContent;

    private String replyIsShow;

    private Date replyCreateTime;

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getReplyAppraiseId() {
        return replyAppraiseId;
    }

    public void setReplyAppraiseId(Long replyAppraiseId) {
        this.replyAppraiseId = replyAppraiseId;
    }

    public Long getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Long replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public String getReplyIsShow() {
        return replyIsShow;
    }

    public void setReplyIsShow(String replyIsShow) {
        this.replyIsShow = replyIsShow == null ? null : replyIsShow.trim();
    }

    public Date getReplyCreateTime() {
        return replyCreateTime;
    }

    public void setReplyCreateTime(Date replyCreateTime) {
        this.replyCreateTime = replyCreateTime;
    }
}