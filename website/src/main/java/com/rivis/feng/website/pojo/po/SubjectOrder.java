package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class SubjectOrder {
    private Long orderId;

    private Long orderUserId;

    private Long orderCurriculumId;

    private Date orderCreateTime;

    private String orderCreateUserState;

    private String orderCost;

    private String orderState;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Long orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Long getOrderCurriculumId() {
        return orderCurriculumId;
    }

    public void setOrderCurriculumId(Long orderCurriculumId) {
        this.orderCurriculumId = orderCurriculumId;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderCreateUserState() {
        return orderCreateUserState;
    }

    public void setOrderCreateUserState(String orderCreateUserState) {
        this.orderCreateUserState = orderCreateUserState == null ? null : orderCreateUserState.trim();
    }

    public String getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(String orderCost) {
        this.orderCost = orderCost == null ? null : orderCost.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }
}