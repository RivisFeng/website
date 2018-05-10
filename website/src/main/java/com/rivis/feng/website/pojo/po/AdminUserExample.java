package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminUserExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdIsNull() {
            addCriterion("admin_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdIsNotNull() {
            addCriterion("admin_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdEqualTo(Long value) {
            addCriterion("admin_user_id =", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdNotEqualTo(Long value) {
            addCriterion("admin_user_id <>", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdGreaterThan(Long value) {
            addCriterion("admin_user_id >", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_user_id >=", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdLessThan(Long value) {
            addCriterion("admin_user_id <", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_user_id <=", value, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdIn(List<Long> values) {
            addCriterion("admin_user_id in", values, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdNotIn(List<Long> values) {
            addCriterion("admin_user_id not in", values, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdBetween(Long value1, Long value2) {
            addCriterion("admin_user_id between", value1, value2, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_user_id not between", value1, value2, "adminUserId");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(String value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(String value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(String value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(String value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(String value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLike(String value) {
            addCriterion("admin_type like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotLike(String value) {
            addCriterion("admin_type not like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<String> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<String> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(String value1, String value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(String value1, String value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(String value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(String value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(String value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(String value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(String value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(String value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLike(String value) {
            addCriterion("admin_state like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotLike(String value) {
            addCriterion("admin_state not like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<String> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<String> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(String value1, String value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(String value1, String value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNull() {
            addCriterion("admin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNotNull() {
            addCriterion("admin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeEqualTo(Date value) {
            addCriterion("admin_create_time =", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotEqualTo(Date value) {
            addCriterion("admin_create_time <>", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThan(Date value) {
            addCriterion("admin_create_time >", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_create_time >=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThan(Date value) {
            addCriterion("admin_create_time <", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_create_time <=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIn(List<Date> values) {
            addCriterion("admin_create_time in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotIn(List<Date> values) {
            addCriterion("admin_create_time not in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_create_time between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_create_time not between", value1, value2, "adminCreateTime");
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