package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectOrderWechatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectOrderWechatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderWechatIdIsNull() {
            addCriterion("order_wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdIsNotNull() {
            addCriterion("order_wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdEqualTo(Long value) {
            addCriterion("order_wechat_id =", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdNotEqualTo(Long value) {
            addCriterion("order_wechat_id <>", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdGreaterThan(Long value) {
            addCriterion("order_wechat_id >", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_wechat_id >=", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdLessThan(Long value) {
            addCriterion("order_wechat_id <", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdLessThanOrEqualTo(Long value) {
            addCriterion("order_wechat_id <=", value, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdIn(List<Long> values) {
            addCriterion("order_wechat_id in", values, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdNotIn(List<Long> values) {
            addCriterion("order_wechat_id not in", values, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdBetween(Long value1, Long value2) {
            addCriterion("order_wechat_id between", value1, value2, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatIdNotBetween(Long value1, Long value2) {
            addCriterion("order_wechat_id not between", value1, value2, "orderWechatId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdIsNull() {
            addCriterion("subject_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdIsNotNull() {
            addCriterion("subject_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdEqualTo(Long value) {
            addCriterion("subject_order_id =", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdNotEqualTo(Long value) {
            addCriterion("subject_order_id <>", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdGreaterThan(Long value) {
            addCriterion("subject_order_id >", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("subject_order_id >=", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdLessThan(Long value) {
            addCriterion("subject_order_id <", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("subject_order_id <=", value, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdIn(List<Long> values) {
            addCriterion("subject_order_id in", values, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdNotIn(List<Long> values) {
            addCriterion("subject_order_id not in", values, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdBetween(Long value1, Long value2) {
            addCriterion("subject_order_id between", value1, value2, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andSubjectOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("subject_order_id not between", value1, value2, "subjectOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdIsNull() {
            addCriterion("order_wechat_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdIsNotNull() {
            addCriterion("order_wechat_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdEqualTo(Long value) {
            addCriterion("order_wechat_user_id =", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdNotEqualTo(Long value) {
            addCriterion("order_wechat_user_id <>", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdGreaterThan(Long value) {
            addCriterion("order_wechat_user_id >", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_wechat_user_id >=", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdLessThan(Long value) {
            addCriterion("order_wechat_user_id <", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdLessThanOrEqualTo(Long value) {
            addCriterion("order_wechat_user_id <=", value, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdIn(List<Long> values) {
            addCriterion("order_wechat_user_id in", values, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdNotIn(List<Long> values) {
            addCriterion("order_wechat_user_id not in", values, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdBetween(Long value1, Long value2) {
            addCriterion("order_wechat_user_id between", value1, value2, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatUserIdNotBetween(Long value1, Long value2) {
            addCriterion("order_wechat_user_id not between", value1, value2, "orderWechatUserId");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateIsNull() {
            addCriterion("order_wechat_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateIsNotNull() {
            addCriterion("order_wechat_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateEqualTo(String value) {
            addCriterion("order_wechat_state =", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateNotEqualTo(String value) {
            addCriterion("order_wechat_state <>", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateGreaterThan(String value) {
            addCriterion("order_wechat_state >", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_wechat_state >=", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateLessThan(String value) {
            addCriterion("order_wechat_state <", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateLessThanOrEqualTo(String value) {
            addCriterion("order_wechat_state <=", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateLike(String value) {
            addCriterion("order_wechat_state like", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateNotLike(String value) {
            addCriterion("order_wechat_state not like", value, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateIn(List<String> values) {
            addCriterion("order_wechat_state in", values, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateNotIn(List<String> values) {
            addCriterion("order_wechat_state not in", values, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateBetween(String value1, String value2) {
            addCriterion("order_wechat_state between", value1, value2, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatStateNotBetween(String value1, String value2) {
            addCriterion("order_wechat_state not between", value1, value2, "orderWechatState");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeIsNull() {
            addCriterion("order_wechat_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeIsNotNull() {
            addCriterion("order_wechat_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeEqualTo(Date value) {
            addCriterion("order_wechat_create_time =", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeNotEqualTo(Date value) {
            addCriterion("order_wechat_create_time <>", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeGreaterThan(Date value) {
            addCriterion("order_wechat_create_time >", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_wechat_create_time >=", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeLessThan(Date value) {
            addCriterion("order_wechat_create_time <", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_wechat_create_time <=", value, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeIn(List<Date> values) {
            addCriterion("order_wechat_create_time in", values, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeNotIn(List<Date> values) {
            addCriterion("order_wechat_create_time not in", values, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_wechat_create_time between", value1, value2, "orderWechatCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderWechatCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_wechat_create_time not between", value1, value2, "orderWechatCreateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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