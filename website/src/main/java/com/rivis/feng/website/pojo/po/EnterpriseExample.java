package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Long value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Long value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Long value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Long value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Long value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Long> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Long> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Long value1, Long value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Long value1, Long value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdIsNull() {
            addCriterion("enterprise_city_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdIsNotNull() {
            addCriterion("enterprise_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdEqualTo(Long value) {
            addCriterion("enterprise_city_id =", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdNotEqualTo(Long value) {
            addCriterion("enterprise_city_id <>", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdGreaterThan(Long value) {
            addCriterion("enterprise_city_id >", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enterprise_city_id >=", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdLessThan(Long value) {
            addCriterion("enterprise_city_id <", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdLessThanOrEqualTo(Long value) {
            addCriterion("enterprise_city_id <=", value, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdIn(List<Long> values) {
            addCriterion("enterprise_city_id in", values, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdNotIn(List<Long> values) {
            addCriterion("enterprise_city_id not in", values, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdBetween(Long value1, Long value2) {
            addCriterion("enterprise_city_id between", value1, value2, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIdNotBetween(Long value1, Long value2) {
            addCriterion("enterprise_city_id not between", value1, value2, "enterpriseCityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIsNull() {
            addCriterion("enterprise_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIsNotNull() {
            addCriterion("enterprise_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_create_time =", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_create_time <>", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_create_time >", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_create_time >=", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeLessThan(Date value) {
            addCriterion("enterprise_create_time <", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_create_time <=", value, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_create_time in", values, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_create_time not in", values, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_create_time between", value1, value2, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_create_time not between", value1, value2, "enterpriseCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateIsNull() {
            addCriterion("enterprise_state is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateIsNotNull() {
            addCriterion("enterprise_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateEqualTo(String value) {
            addCriterion("enterprise_state =", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateNotEqualTo(String value) {
            addCriterion("enterprise_state <>", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateGreaterThan(String value) {
            addCriterion("enterprise_state >", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_state >=", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateLessThan(String value) {
            addCriterion("enterprise_state <", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateLessThanOrEqualTo(String value) {
            addCriterion("enterprise_state <=", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateLike(String value) {
            addCriterion("enterprise_state like", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateNotLike(String value) {
            addCriterion("enterprise_state not like", value, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateIn(List<String> values) {
            addCriterion("enterprise_state in", values, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateNotIn(List<String> values) {
            addCriterion("enterprise_state not in", values, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateBetween(String value1, String value2) {
            addCriterion("enterprise_state between", value1, value2, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseStateNotBetween(String value1, String value2) {
            addCriterion("enterprise_state not between", value1, value2, "enterpriseState");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNull() {
            addCriterion("enterprise_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNotNull() {
            addCriterion("enterprise_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressEqualTo(String value) {
            addCriterion("enterprise_address =", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotEqualTo(String value) {
            addCriterion("enterprise_address <>", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThan(String value) {
            addCriterion("enterprise_address >", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address >=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThan(String value) {
            addCriterion("enterprise_address <", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address <=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLike(String value) {
            addCriterion("enterprise_address like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotLike(String value) {
            addCriterion("enterprise_address not like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIn(List<String> values) {
            addCriterion("enterprise_address in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotIn(List<String> values) {
            addCriterion("enterprise_address not in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressBetween(String value1, String value2) {
            addCriterion("enterprise_address between", value1, value2, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotBetween(String value1, String value2) {
            addCriterion("enterprise_address not between", value1, value2, "enterpriseAddress");
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