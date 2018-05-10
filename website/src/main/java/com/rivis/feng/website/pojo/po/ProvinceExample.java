package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvinceExample() {
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceStateIsNull() {
            addCriterion("province_state is null");
            return (Criteria) this;
        }

        public Criteria andProvinceStateIsNotNull() {
            addCriterion("province_state is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceStateEqualTo(String value) {
            addCriterion("province_state =", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateNotEqualTo(String value) {
            addCriterion("province_state <>", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateGreaterThan(String value) {
            addCriterion("province_state >", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateGreaterThanOrEqualTo(String value) {
            addCriterion("province_state >=", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateLessThan(String value) {
            addCriterion("province_state <", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateLessThanOrEqualTo(String value) {
            addCriterion("province_state <=", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateLike(String value) {
            addCriterion("province_state like", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateNotLike(String value) {
            addCriterion("province_state not like", value, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateIn(List<String> values) {
            addCriterion("province_state in", values, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateNotIn(List<String> values) {
            addCriterion("province_state not in", values, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateBetween(String value1, String value2) {
            addCriterion("province_state between", value1, value2, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceStateNotBetween(String value1, String value2) {
            addCriterion("province_state not between", value1, value2, "provinceState");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeIsNull() {
            addCriterion("province_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeIsNotNull() {
            addCriterion("province_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeEqualTo(Date value) {
            addCriterion("province_create_time =", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeNotEqualTo(Date value) {
            addCriterion("province_create_time <>", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeGreaterThan(Date value) {
            addCriterion("province_create_time >", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("province_create_time >=", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeLessThan(Date value) {
            addCriterion("province_create_time <", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("province_create_time <=", value, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeIn(List<Date> values) {
            addCriterion("province_create_time in", values, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeNotIn(List<Date> values) {
            addCriterion("province_create_time not in", values, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeBetween(Date value1, Date value2) {
            addCriterion("province_create_time between", value1, value2, "provinceCreateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("province_create_time not between", value1, value2, "provinceCreateTime");
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