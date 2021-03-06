package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public CurriculumOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Long value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Long value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Long value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Long value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Long> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Long> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Long value1, Long value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdIsNull() {
            addCriterion("order_curriculum_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdIsNotNull() {
            addCriterion("order_curriculum_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdEqualTo(Long value) {
            addCriterion("order_curriculum_id =", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdNotEqualTo(Long value) {
            addCriterion("order_curriculum_id <>", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdGreaterThan(Long value) {
            addCriterion("order_curriculum_id >", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_curriculum_id >=", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdLessThan(Long value) {
            addCriterion("order_curriculum_id <", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdLessThanOrEqualTo(Long value) {
            addCriterion("order_curriculum_id <=", value, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdIn(List<Long> values) {
            addCriterion("order_curriculum_id in", values, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdNotIn(List<Long> values) {
            addCriterion("order_curriculum_id not in", values, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdBetween(Long value1, Long value2) {
            addCriterion("order_curriculum_id between", value1, value2, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCurriculumIdNotBetween(Long value1, Long value2) {
            addCriterion("order_curriculum_id not between", value1, value2, "orderCurriculumId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateIsNull() {
            addCriterion("order_create_user_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateIsNotNull() {
            addCriterion("order_create_user_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateEqualTo(String value) {
            addCriterion("order_create_user_state =", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateNotEqualTo(String value) {
            addCriterion("order_create_user_state <>", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateGreaterThan(String value) {
            addCriterion("order_create_user_state >", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_create_user_state >=", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateLessThan(String value) {
            addCriterion("order_create_user_state <", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateLessThanOrEqualTo(String value) {
            addCriterion("order_create_user_state <=", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateLike(String value) {
            addCriterion("order_create_user_state like", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateNotLike(String value) {
            addCriterion("order_create_user_state not like", value, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateIn(List<String> values) {
            addCriterion("order_create_user_state in", values, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateNotIn(List<String> values) {
            addCriterion("order_create_user_state not in", values, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateBetween(String value1, String value2) {
            addCriterion("order_create_user_state between", value1, value2, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCreateUserStateNotBetween(String value1, String value2) {
            addCriterion("order_create_user_state not between", value1, value2, "orderCreateUserState");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNull() {
            addCriterion("order_cost is null");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNotNull() {
            addCriterion("order_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCostEqualTo(String value) {
            addCriterion("order_cost =", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotEqualTo(String value) {
            addCriterion("order_cost <>", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThan(String value) {
            addCriterion("order_cost >", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThanOrEqualTo(String value) {
            addCriterion("order_cost >=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThan(String value) {
            addCriterion("order_cost <", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThanOrEqualTo(String value) {
            addCriterion("order_cost <=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLike(String value) {
            addCriterion("order_cost like", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotLike(String value) {
            addCriterion("order_cost not like", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostIn(List<String> values) {
            addCriterion("order_cost in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotIn(List<String> values) {
            addCriterion("order_cost not in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostBetween(String value1, String value2) {
            addCriterion("order_cost between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotBetween(String value1, String value2) {
            addCriterion("order_cost not between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_order
     *
     * @mbggenerated do_not_delete_during_merge Sat May 19 23:25:22 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}