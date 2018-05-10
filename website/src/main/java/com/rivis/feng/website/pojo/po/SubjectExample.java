package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Long value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Long value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Long value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Long value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Long> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Long> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Long value1, Long value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeIsNull() {
            addCriterion("subject_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeIsNotNull() {
            addCriterion("subject_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeEqualTo(Date value) {
            addCriterion("subject_create_time =", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeNotEqualTo(Date value) {
            addCriterion("subject_create_time <>", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeGreaterThan(Date value) {
            addCriterion("subject_create_time >", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("subject_create_time >=", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeLessThan(Date value) {
            addCriterion("subject_create_time <", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("subject_create_time <=", value, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeIn(List<Date> values) {
            addCriterion("subject_create_time in", values, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeNotIn(List<Date> values) {
            addCriterion("subject_create_time not in", values, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeBetween(Date value1, Date value2) {
            addCriterion("subject_create_time between", value1, value2, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("subject_create_time not between", value1, value2, "subjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIsNull() {
            addCriterion("subject_state is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIsNotNull() {
            addCriterion("subject_state is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStateEqualTo(String value) {
            addCriterion("subject_state =", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotEqualTo(String value) {
            addCriterion("subject_state <>", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateGreaterThan(String value) {
            addCriterion("subject_state >", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateGreaterThanOrEqualTo(String value) {
            addCriterion("subject_state >=", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLessThan(String value) {
            addCriterion("subject_state <", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLessThanOrEqualTo(String value) {
            addCriterion("subject_state <=", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLike(String value) {
            addCriterion("subject_state like", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotLike(String value) {
            addCriterion("subject_state not like", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIn(List<String> values) {
            addCriterion("subject_state in", values, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotIn(List<String> values) {
            addCriterion("subject_state not in", values, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateBetween(String value1, String value2) {
            addCriterion("subject_state between", value1, value2, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotBetween(String value1, String value2) {
            addCriterion("subject_state not between", value1, value2, "subjectState");
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