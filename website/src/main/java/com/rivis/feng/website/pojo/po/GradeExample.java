package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public GradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
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
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Long value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Long value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Long value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Long value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Long> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Long> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Long value1, Long value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNull() {
            addCriterion("grade_state is null");
            return (Criteria) this;
        }

        public Criteria andGradeStateIsNotNull() {
            addCriterion("grade_state is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStateEqualTo(String value) {
            addCriterion("grade_state =", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotEqualTo(String value) {
            addCriterion("grade_state <>", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThan(String value) {
            addCriterion("grade_state >", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateGreaterThanOrEqualTo(String value) {
            addCriterion("grade_state >=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThan(String value) {
            addCriterion("grade_state <", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLessThanOrEqualTo(String value) {
            addCriterion("grade_state <=", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateLike(String value) {
            addCriterion("grade_state like", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotLike(String value) {
            addCriterion("grade_state not like", value, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateIn(List<String> values) {
            addCriterion("grade_state in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotIn(List<String> values) {
            addCriterion("grade_state not in", values, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateBetween(String value1, String value2) {
            addCriterion("grade_state between", value1, value2, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeStateNotBetween(String value1, String value2) {
            addCriterion("grade_state not between", value1, value2, "gradeState");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIsNull() {
            addCriterion("grade_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIsNotNull() {
            addCriterion("grade_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeEqualTo(Date value) {
            addCriterion("grade_create_time =", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotEqualTo(Date value) {
            addCriterion("grade_create_time <>", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeGreaterThan(Date value) {
            addCriterion("grade_create_time >", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_create_time >=", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeLessThan(Date value) {
            addCriterion("grade_create_time <", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("grade_create_time <=", value, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeIn(List<Date> values) {
            addCriterion("grade_create_time in", values, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotIn(List<Date> values) {
            addCriterion("grade_create_time not in", values, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("grade_create_time between", value1, value2, "gradeCreateTime");
            return (Criteria) this;
        }

        public Criteria andGradeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("grade_create_time not between", value1, value2, "gradeCreateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbggenerated do_not_delete_during_merge Sat May 19 23:25:23 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
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