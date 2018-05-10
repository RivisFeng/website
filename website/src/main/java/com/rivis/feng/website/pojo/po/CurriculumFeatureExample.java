package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumFeatureExample() {
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

        public Criteria andFeatureIdIsNull() {
            addCriterion("feature_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNotNull() {
            addCriterion("feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdEqualTo(Long value) {
            addCriterion("feature_id =", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotEqualTo(Long value) {
            addCriterion("feature_id <>", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThan(Long value) {
            addCriterion("feature_id >", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feature_id >=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThan(Long value) {
            addCriterion("feature_id <", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThanOrEqualTo(Long value) {
            addCriterion("feature_id <=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIn(List<Long> values) {
            addCriterion("feature_id in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotIn(List<Long> values) {
            addCriterion("feature_id not in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdBetween(Long value1, Long value2) {
            addCriterion("feature_id between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotBetween(Long value1, Long value2) {
            addCriterion("feature_id not between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNull() {
            addCriterion("feature_name is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNotNull() {
            addCriterion("feature_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameEqualTo(String value) {
            addCriterion("feature_name =", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotEqualTo(String value) {
            addCriterion("feature_name <>", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThan(String value) {
            addCriterion("feature_name >", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("feature_name >=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThan(String value) {
            addCriterion("feature_name <", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThanOrEqualTo(String value) {
            addCriterion("feature_name <=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLike(String value) {
            addCriterion("feature_name like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotLike(String value) {
            addCriterion("feature_name not like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIn(List<String> values) {
            addCriterion("feature_name in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotIn(List<String> values) {
            addCriterion("feature_name not in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameBetween(String value1, String value2) {
            addCriterion("feature_name between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotBetween(String value1, String value2) {
            addCriterion("feature_name not between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureStateIsNull() {
            addCriterion("feature_state is null");
            return (Criteria) this;
        }

        public Criteria andFeatureStateIsNotNull() {
            addCriterion("feature_state is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureStateEqualTo(String value) {
            addCriterion("feature_state =", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateNotEqualTo(String value) {
            addCriterion("feature_state <>", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateGreaterThan(String value) {
            addCriterion("feature_state >", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateGreaterThanOrEqualTo(String value) {
            addCriterion("feature_state >=", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateLessThan(String value) {
            addCriterion("feature_state <", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateLessThanOrEqualTo(String value) {
            addCriterion("feature_state <=", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateLike(String value) {
            addCriterion("feature_state like", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateNotLike(String value) {
            addCriterion("feature_state not like", value, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateIn(List<String> values) {
            addCriterion("feature_state in", values, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateNotIn(List<String> values) {
            addCriterion("feature_state not in", values, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateBetween(String value1, String value2) {
            addCriterion("feature_state between", value1, value2, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureStateNotBetween(String value1, String value2) {
            addCriterion("feature_state not between", value1, value2, "featureState");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeIsNull() {
            addCriterion("feature_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeIsNotNull() {
            addCriterion("feature_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeEqualTo(Date value) {
            addCriterion("feature_create_time =", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeNotEqualTo(Date value) {
            addCriterion("feature_create_time <>", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeGreaterThan(Date value) {
            addCriterion("feature_create_time >", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("feature_create_time >=", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeLessThan(Date value) {
            addCriterion("feature_create_time <", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("feature_create_time <=", value, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeIn(List<Date> values) {
            addCriterion("feature_create_time in", values, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeNotIn(List<Date> values) {
            addCriterion("feature_create_time not in", values, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeBetween(Date value1, Date value2) {
            addCriterion("feature_create_time between", value1, value2, "featureCreateTime");
            return (Criteria) this;
        }

        public Criteria andFeatureCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("feature_create_time not between", value1, value2, "featureCreateTime");
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