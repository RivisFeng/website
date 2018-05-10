package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumDetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Long value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Long value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Long value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Long value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Long> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Long> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Long value1, Long value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdIsNull() {
            addCriterion("detail_curriculum_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdIsNotNull() {
            addCriterion("detail_curriculum_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdEqualTo(Long value) {
            addCriterion("detail_curriculum_id =", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdNotEqualTo(Long value) {
            addCriterion("detail_curriculum_id <>", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdGreaterThan(Long value) {
            addCriterion("detail_curriculum_id >", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("detail_curriculum_id >=", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdLessThan(Long value) {
            addCriterion("detail_curriculum_id <", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdLessThanOrEqualTo(Long value) {
            addCriterion("detail_curriculum_id <=", value, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdIn(List<Long> values) {
            addCriterion("detail_curriculum_id in", values, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdNotIn(List<Long> values) {
            addCriterion("detail_curriculum_id not in", values, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdBetween(Long value1, Long value2) {
            addCriterion("detail_curriculum_id between", value1, value2, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andDetailCurriculumIdNotBetween(Long value1, Long value2) {
            addCriterion("detail_curriculum_id not between", value1, value2, "detailCurriculumId");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeIsNull() {
            addCriterion("curriculum_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeIsNotNull() {
            addCriterion("curriculum_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeEqualTo(Date value) {
            addCriterion("curriculum_start_time =", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeNotEqualTo(Date value) {
            addCriterion("curriculum_start_time <>", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeGreaterThan(Date value) {
            addCriterion("curriculum_start_time >", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("curriculum_start_time >=", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeLessThan(Date value) {
            addCriterion("curriculum_start_time <", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("curriculum_start_time <=", value, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeIn(List<Date> values) {
            addCriterion("curriculum_start_time in", values, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeNotIn(List<Date> values) {
            addCriterion("curriculum_start_time not in", values, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeBetween(Date value1, Date value2) {
            addCriterion("curriculum_start_time between", value1, value2, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("curriculum_start_time not between", value1, value2, "curriculumStartTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeIsNull() {
            addCriterion("curriculum_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeIsNotNull() {
            addCriterion("curriculum_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeEqualTo(Date value) {
            addCriterion("curriculum_end_time =", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeNotEqualTo(Date value) {
            addCriterion("curriculum_end_time <>", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeGreaterThan(Date value) {
            addCriterion("curriculum_end_time >", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("curriculum_end_time >=", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeLessThan(Date value) {
            addCriterion("curriculum_end_time <", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("curriculum_end_time <=", value, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeIn(List<Date> values) {
            addCriterion("curriculum_end_time in", values, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeNotIn(List<Date> values) {
            addCriterion("curriculum_end_time not in", values, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeBetween(Date value1, Date value2) {
            addCriterion("curriculum_end_time between", value1, value2, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("curriculum_end_time not between", value1, value2, "curriculumEndTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateIsNull() {
            addCriterion("curriculum_execute_date is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateIsNotNull() {
            addCriterion("curriculum_execute_date is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateEqualTo(Date value) {
            addCriterion("curriculum_execute_date =", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateNotEqualTo(Date value) {
            addCriterion("curriculum_execute_date <>", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateGreaterThan(Date value) {
            addCriterion("curriculum_execute_date >", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("curriculum_execute_date >=", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateLessThan(Date value) {
            addCriterion("curriculum_execute_date <", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateLessThanOrEqualTo(Date value) {
            addCriterion("curriculum_execute_date <=", value, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateIn(List<Date> values) {
            addCriterion("curriculum_execute_date in", values, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateNotIn(List<Date> values) {
            addCriterion("curriculum_execute_date not in", values, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateBetween(Date value1, Date value2) {
            addCriterion("curriculum_execute_date between", value1, value2, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteDateNotBetween(Date value1, Date value2) {
            addCriterion("curriculum_execute_date not between", value1, value2, "curriculumExecuteDate");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeIsNull() {
            addCriterion("curriculum_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeIsNotNull() {
            addCriterion("curriculum_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeEqualTo(Date value) {
            addCriterion("curriculum_execute_time =", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeNotEqualTo(Date value) {
            addCriterion("curriculum_execute_time <>", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeGreaterThan(Date value) {
            addCriterion("curriculum_execute_time >", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("curriculum_execute_time >=", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeLessThan(Date value) {
            addCriterion("curriculum_execute_time <", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("curriculum_execute_time <=", value, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeIn(List<Date> values) {
            addCriterion("curriculum_execute_time in", values, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeNotIn(List<Date> values) {
            addCriterion("curriculum_execute_time not in", values, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("curriculum_execute_time between", value1, value2, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("curriculum_execute_time not between", value1, value2, "curriculumExecuteTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineIsNull() {
            addCriterion("curriculum_outline is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineIsNotNull() {
            addCriterion("curriculum_outline is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineEqualTo(String value) {
            addCriterion("curriculum_outline =", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineNotEqualTo(String value) {
            addCriterion("curriculum_outline <>", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineGreaterThan(String value) {
            addCriterion("curriculum_outline >", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("curriculum_outline >=", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineLessThan(String value) {
            addCriterion("curriculum_outline <", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineLessThanOrEqualTo(String value) {
            addCriterion("curriculum_outline <=", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineLike(String value) {
            addCriterion("curriculum_outline like", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineNotLike(String value) {
            addCriterion("curriculum_outline not like", value, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineIn(List<String> values) {
            addCriterion("curriculum_outline in", values, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineNotIn(List<String> values) {
            addCriterion("curriculum_outline not in", values, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineBetween(String value1, String value2) {
            addCriterion("curriculum_outline between", value1, value2, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumOutlineNotBetween(String value1, String value2) {
            addCriterion("curriculum_outline not between", value1, value2, "curriculumOutline");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationIsNull() {
            addCriterion("curriculum_presentation is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationIsNotNull() {
            addCriterion("curriculum_presentation is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationEqualTo(String value) {
            addCriterion("curriculum_presentation =", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationNotEqualTo(String value) {
            addCriterion("curriculum_presentation <>", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationGreaterThan(String value) {
            addCriterion("curriculum_presentation >", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationGreaterThanOrEqualTo(String value) {
            addCriterion("curriculum_presentation >=", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationLessThan(String value) {
            addCriterion("curriculum_presentation <", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationLessThanOrEqualTo(String value) {
            addCriterion("curriculum_presentation <=", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationLike(String value) {
            addCriterion("curriculum_presentation like", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationNotLike(String value) {
            addCriterion("curriculum_presentation not like", value, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationIn(List<String> values) {
            addCriterion("curriculum_presentation in", values, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationNotIn(List<String> values) {
            addCriterion("curriculum_presentation not in", values, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationBetween(String value1, String value2) {
            addCriterion("curriculum_presentation between", value1, value2, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumPresentationNotBetween(String value1, String value2) {
            addCriterion("curriculum_presentation not between", value1, value2, "curriculumPresentation");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeIsNull() {
            addCriterion("curriculum_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeIsNotNull() {
            addCriterion("curriculum_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeEqualTo(Date value) {
            addCriterion("curriculum_create_time =", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeNotEqualTo(Date value) {
            addCriterion("curriculum_create_time <>", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeGreaterThan(Date value) {
            addCriterion("curriculum_create_time >", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("curriculum_create_time >=", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeLessThan(Date value) {
            addCriterion("curriculum_create_time <", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("curriculum_create_time <=", value, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeIn(List<Date> values) {
            addCriterion("curriculum_create_time in", values, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeNotIn(List<Date> values) {
            addCriterion("curriculum_create_time not in", values, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeBetween(Date value1, Date value2) {
            addCriterion("curriculum_create_time between", value1, value2, "curriculumCreateTime");
            return (Criteria) this;
        }

        public Criteria andCurriculumCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("curriculum_create_time not between", value1, value2, "curriculumCreateTime");
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