package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdIsNull() {
            addCriterion("teacher_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdIsNotNull() {
            addCriterion("teacher_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdEqualTo(Long value) {
            addCriterion("teacher_user_id =", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdNotEqualTo(Long value) {
            addCriterion("teacher_user_id <>", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdGreaterThan(Long value) {
            addCriterion("teacher_user_id >", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_user_id >=", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdLessThan(Long value) {
            addCriterion("teacher_user_id <", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_user_id <=", value, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdIn(List<Long> values) {
            addCriterion("teacher_user_id in", values, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdNotIn(List<Long> values) {
            addCriterion("teacher_user_id not in", values, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdBetween(Long value1, Long value2) {
            addCriterion("teacher_user_id between", value1, value2, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherUserIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_user_id not between", value1, value2, "teacherUserId");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIsNull() {
            addCriterion("teacher_school is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIsNotNull() {
            addCriterion("teacher_school is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolEqualTo(String value) {
            addCriterion("teacher_school =", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotEqualTo(String value) {
            addCriterion("teacher_school <>", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolGreaterThan(String value) {
            addCriterion("teacher_school >", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_school >=", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLessThan(String value) {
            addCriterion("teacher_school <", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLessThanOrEqualTo(String value) {
            addCriterion("teacher_school <=", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLike(String value) {
            addCriterion("teacher_school like", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotLike(String value) {
            addCriterion("teacher_school not like", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIn(List<String> values) {
            addCriterion("teacher_school in", values, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotIn(List<String> values) {
            addCriterion("teacher_school not in", values, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolBetween(String value1, String value2) {
            addCriterion("teacher_school between", value1, value2, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotBetween(String value1, String value2) {
            addCriterion("teacher_school not between", value1, value2, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationIsNull() {
            addCriterion("teacher_compensation is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationIsNotNull() {
            addCriterion("teacher_compensation is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationEqualTo(String value) {
            addCriterion("teacher_compensation =", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationNotEqualTo(String value) {
            addCriterion("teacher_compensation <>", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationGreaterThan(String value) {
            addCriterion("teacher_compensation >", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_compensation >=", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationLessThan(String value) {
            addCriterion("teacher_compensation <", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationLessThanOrEqualTo(String value) {
            addCriterion("teacher_compensation <=", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationLike(String value) {
            addCriterion("teacher_compensation like", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationNotLike(String value) {
            addCriterion("teacher_compensation not like", value, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationIn(List<String> values) {
            addCriterion("teacher_compensation in", values, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationNotIn(List<String> values) {
            addCriterion("teacher_compensation not in", values, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationBetween(String value1, String value2) {
            addCriterion("teacher_compensation between", value1, value2, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherCompensationNotBetween(String value1, String value2) {
            addCriterion("teacher_compensation not between", value1, value2, "teacherCompensation");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeIsNull() {
            addCriterion("teacher_dimission_time is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeIsNotNull() {
            addCriterion("teacher_dimission_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeEqualTo(Date value) {
            addCriterion("teacher_dimission_time =", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeNotEqualTo(Date value) {
            addCriterion("teacher_dimission_time <>", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeGreaterThan(Date value) {
            addCriterion("teacher_dimission_time >", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_dimission_time >=", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeLessThan(Date value) {
            addCriterion("teacher_dimission_time <", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_dimission_time <=", value, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeIn(List<Date> values) {
            addCriterion("teacher_dimission_time in", values, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeNotIn(List<Date> values) {
            addCriterion("teacher_dimission_time not in", values, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeBetween(Date value1, Date value2) {
            addCriterion("teacher_dimission_time between", value1, value2, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherDimissionTimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_dimission_time not between", value1, value2, "teacherDimissionTime");
            return (Criteria) this;
        }

        public Criteria andTeacherStateIsNull() {
            addCriterion("teacher_state is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStateIsNotNull() {
            addCriterion("teacher_state is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStateEqualTo(String value) {
            addCriterion("teacher_state =", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateNotEqualTo(String value) {
            addCriterion("teacher_state <>", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateGreaterThan(String value) {
            addCriterion("teacher_state >", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_state >=", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateLessThan(String value) {
            addCriterion("teacher_state <", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateLessThanOrEqualTo(String value) {
            addCriterion("teacher_state <=", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateLike(String value) {
            addCriterion("teacher_state like", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateNotLike(String value) {
            addCriterion("teacher_state not like", value, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateIn(List<String> values) {
            addCriterion("teacher_state in", values, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateNotIn(List<String> values) {
            addCriterion("teacher_state not in", values, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateBetween(String value1, String value2) {
            addCriterion("teacher_state between", value1, value2, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherStateNotBetween(String value1, String value2) {
            addCriterion("teacher_state not between", value1, value2, "teacherState");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoIsNull() {
            addCriterion("teacher_motto is null");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoIsNotNull() {
            addCriterion("teacher_motto is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoEqualTo(String value) {
            addCriterion("teacher_motto =", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoNotEqualTo(String value) {
            addCriterion("teacher_motto <>", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoGreaterThan(String value) {
            addCriterion("teacher_motto >", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_motto >=", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoLessThan(String value) {
            addCriterion("teacher_motto <", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoLessThanOrEqualTo(String value) {
            addCriterion("teacher_motto <=", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoLike(String value) {
            addCriterion("teacher_motto like", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoNotLike(String value) {
            addCriterion("teacher_motto not like", value, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoIn(List<String> values) {
            addCriterion("teacher_motto in", values, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoNotIn(List<String> values) {
            addCriterion("teacher_motto not in", values, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoBetween(String value1, String value2) {
            addCriterion("teacher_motto between", value1, value2, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherMottoNotBetween(String value1, String value2) {
            addCriterion("teacher_motto not between", value1, value2, "teacherMotto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIsNull() {
            addCriterion("teacher_photo is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIsNotNull() {
            addCriterion("teacher_photo is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoEqualTo(String value) {
            addCriterion("teacher_photo =", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotEqualTo(String value) {
            addCriterion("teacher_photo <>", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoGreaterThan(String value) {
            addCriterion("teacher_photo >", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_photo >=", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLessThan(String value) {
            addCriterion("teacher_photo <", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLessThanOrEqualTo(String value) {
            addCriterion("teacher_photo <=", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLike(String value) {
            addCriterion("teacher_photo like", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotLike(String value) {
            addCriterion("teacher_photo not like", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIn(List<String> values) {
            addCriterion("teacher_photo in", values, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotIn(List<String> values) {
            addCriterion("teacher_photo not in", values, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoBetween(String value1, String value2) {
            addCriterion("teacher_photo between", value1, value2, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotBetween(String value1, String value2) {
            addCriterion("teacher_photo not between", value1, value2, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIsNull() {
            addCriterion("teacher_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIsNotNull() {
            addCriterion("teacher_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeEqualTo(Date value) {
            addCriterion("teacher_create_time =", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotEqualTo(Date value) {
            addCriterion("teacher_create_time <>", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeGreaterThan(Date value) {
            addCriterion("teacher_create_time >", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_create_time >=", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeLessThan(Date value) {
            addCriterion("teacher_create_time <", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_create_time <=", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIn(List<Date> values) {
            addCriterion("teacher_create_time in", values, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotIn(List<Date> values) {
            addCriterion("teacher_create_time not in", values, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeBetween(Date value1, Date value2) {
            addCriterion("teacher_create_time between", value1, value2, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_create_time not between", value1, value2, "teacherCreateTime");
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