package com.rivis.feng.website.pojo.po;

import java.util.Date;

public class CurriculumOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long orderUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_curriculum_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Long orderCurriculumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private Date orderCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_create_user_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private String orderCreateUserState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_cost
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private String orderCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curriculum_order.order_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    private String orderState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_id
     *
     * @return the value of curriculum_order.order_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_id
     *
     * @param orderId the value for curriculum_order.order_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_user_id
     *
     * @return the value of curriculum_order.order_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getOrderUserId() {
        return orderUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_user_id
     *
     * @param orderUserId the value for curriculum_order.order_user_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderUserId(Long orderUserId) {
        this.orderUserId = orderUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_curriculum_id
     *
     * @return the value of curriculum_order.order_curriculum_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Long getOrderCurriculumId() {
        return orderCurriculumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_curriculum_id
     *
     * @param orderCurriculumId the value for curriculum_order.order_curriculum_id
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderCurriculumId(Long orderCurriculumId) {
        this.orderCurriculumId = orderCurriculumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_create_time
     *
     * @return the value of curriculum_order.order_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_create_time
     *
     * @param orderCreateTime the value for curriculum_order.order_create_time
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_create_user_state
     *
     * @return the value of curriculum_order.order_create_user_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getOrderCreateUserState() {
        return orderCreateUserState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_create_user_state
     *
     * @param orderCreateUserState the value for curriculum_order.order_create_user_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderCreateUserState(String orderCreateUserState) {
        this.orderCreateUserState = orderCreateUserState == null ? null : orderCreateUserState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_cost
     *
     * @return the value of curriculum_order.order_cost
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getOrderCost() {
        return orderCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_cost
     *
     * @param orderCost the value for curriculum_order.order_cost
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderCost(String orderCost) {
        this.orderCost = orderCost == null ? null : orderCost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column curriculum_order.order_state
     *
     * @return the value of curriculum_order.order_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column curriculum_order.order_state
     *
     * @param orderState the value for curriculum_order.order_state
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }
}