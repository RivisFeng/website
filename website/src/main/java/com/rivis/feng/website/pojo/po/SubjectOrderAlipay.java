package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class SubjectOrderAlipay {
    private Long orderAlipayId;

    private Long subjectOrderId;

    private Long orderAlipayUserId;

    private String orderAlipayState;

    private Date orderAlipayCreateTime;

    public Long getOrderAlipayId() {
        return orderAlipayId;
    }

    public void setOrderAlipayId(Long orderAlipayId) {
        this.orderAlipayId = orderAlipayId;
    }

    public Long getSubjectOrderId() {
        return subjectOrderId;
    }

    public void setSubjectOrderId(Long subjectOrderId) {
        this.subjectOrderId = subjectOrderId;
    }

    public Long getOrderAlipayUserId() {
        return orderAlipayUserId;
    }

    public void setOrderAlipayUserId(Long orderAlipayUserId) {
        this.orderAlipayUserId = orderAlipayUserId;
    }

    public String getOrderAlipayState() {
        return orderAlipayState;
    }

    public void setOrderAlipayState(String orderAlipayState) {
        this.orderAlipayState = orderAlipayState == null ? null : orderAlipayState.trim();
    }

    public Date getOrderAlipayCreateTime() {
        return orderAlipayCreateTime;
    }

    public void setOrderAlipayCreateTime(Date orderAlipayCreateTime) {
        this.orderAlipayCreateTime = orderAlipayCreateTime;
    }
}