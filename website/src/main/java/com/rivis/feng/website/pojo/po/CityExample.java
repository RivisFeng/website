package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdIsNull() {
            addCriterion("city_province_id is null");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdIsNotNull() {
            addCriterion("city_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdEqualTo(Long value) {
            addCriterion("city_province_id =", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdNotEqualTo(Long value) {
            addCriterion("city_province_id <>", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdGreaterThan(Long value) {
            addCriterion("city_province_id >", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_province_id >=", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdLessThan(Long value) {
            addCriterion("city_province_id <", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("city_province_id <=", value, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdIn(List<Long> values) {
            addCriterion("city_province_id in", values, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdNotIn(List<Long> values) {
            addCriterion("city_province_id not in", values, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdBetween(Long value1, Long value2) {
            addCriterion("city_province_id between", value1, value2, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("city_province_id not between", value1, value2, "cityProvinceId");
            return (Criteria) this;
        }

        public Criteria andCityStateIsNull() {
            addCriterion("city_state is null");
            return (Criteria) this;
        }

        public Criteria andCityStateIsNotNull() {
            addCriterion("city_state is not null");
            return (Criteria) this;
        }

        public Criteria andCityStateEqualTo(String value) {
            addCriterion("city_state =", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateNotEqualTo(String value) {
            addCriterion("city_state <>", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateGreaterThan(String value) {
            addCriterion("city_state >", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateGreaterThanOrEqualTo(String value) {
            addCriterion("city_state >=", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateLessThan(String value) {
            addCriterion("city_state <", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateLessThanOrEqualTo(String value) {
            addCriterion("city_state <=", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateLike(String value) {
            addCriterion("city_state like", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateNotLike(String value) {
            addCriterion("city_state not like", value, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateIn(List<String> values) {
            addCriterion("city_state in", values, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateNotIn(List<String> values) {
            addCriterion("city_state not in", values, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateBetween(String value1, String value2) {
            addCriterion("city_state between", value1, value2, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityStateNotBetween(String value1, String value2) {
            addCriterion("city_state not between", value1, value2, "cityState");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeIsNull() {
            addCriterion("city_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeIsNotNull() {
            addCriterion("city_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeEqualTo(Date value) {
            addCriterion("city_create_time =", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeNotEqualTo(Date value) {
            addCriterion("city_create_time <>", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeGreaterThan(Date value) {
            addCriterion("city_create_time >", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("city_create_time >=", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeLessThan(Date value) {
            addCriterion("city_create_time <", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("city_create_time <=", value, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeIn(List<Date> values) {
            addCriterion("city_create_time in", values, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeNotIn(List<Date> values) {
            addCriterion("city_create_time not in", values, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeBetween(Date value1, Date value2) {
            addCriterion("city_create_time between", value1, value2, "cityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCityCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("city_create_time not between", value1, value2, "cityCreateTime");
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