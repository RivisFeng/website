package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class SubjectOrderWechat {
    private Long orderWechatId;

    private Long subjectOrderId;

    private Long orderWechatUserId;

    private String orderWechatState;

    private Date orderWechatCreateTime;

    public Long getOrderWechatId() {
        return orderWechatId;
    }

    public void setOrderWechatId(Long orderWechatId) {
        this.orderWechatId = orderWechatId;
    }

    public Long getSubjectOrderId() {
        return subjectOrderId;
    }

    public void setSubjectOrderId(Long subjectOrderId) {
        this.subjectOrderId = subjectOrderId;
    }

    public Long getOrderWechatUserId() {
        return orderWechatUserId;
    }

    public void setOrderWechatUserId(Long orderWechatUserId) {
        this.orderWechatUserId = orderWechatUserId;
    }

    public String getOrderWechatState() {
        return orderWechatState;
    }

    public void setOrderWechatState(String orderWechatState) {
        this.orderWechatState = orderWechatState == null ? null : orderWechatState.trim();
    }

    public Date getOrderWechatCreateTime() {
        return orderWechatCreateTime;
    }

    public void setOrderWechatCreateTime(Date orderWechatCreateTime) {
        this.orderWechatCreateTime = orderWechatCreateTime;
    }
}