package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumAppraiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumAppraiseExample() {
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

        public Criteria andAppraiseIdIsNull() {
            addCriterion("appraise_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdIsNotNull() {
            addCriterion("appraise_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdEqualTo(Long value) {
            addCriterion("appraise_id =", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdNotEqualTo(Long value) {
            addCriterion("appraise_id <>", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdGreaterThan(Long value) {
            addCriterion("appraise_id >", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appraise_id >=", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdLessThan(Long value) {
            addCriterion("appraise_id <", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdLessThanOrEqualTo(Long value) {
            addCriterion("appraise_id <=", value, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdIn(List<Long> values) {
            addCriterion("appraise_id in", values, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdNotIn(List<Long> values) {
            addCriterion("appraise_id not in", values, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdBetween(Long value1, Long value2) {
            addCriterion("appraise_id between", value1, value2, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseIdNotBetween(Long value1, Long value2) {
            addCriterion("appraise_id not between", value1, value2, "appraiseId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdIsNull() {
            addCriterion("appraise_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdIsNotNull() {
            addCriterion("appraise_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdEqualTo(Long value) {
            addCriterion("appraise_user_id =", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdNotEqualTo(Long value) {
            addCriterion("appraise_user_id <>", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdGreaterThan(Long value) {
            addCriterion("appraise_user_id >", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appraise_user_id >=", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdLessThan(Long value) {
            addCriterion("appraise_user_id <", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdLessThanOrEqualTo(Long value) {
            addCriterion("appraise_user_id <=", value, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdIn(List<Long> values) {
            addCriterion("appraise_user_id in", values, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdNotIn(List<Long> values) {
            addCriterion("appraise_user_id not in", values, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdBetween(Long value1, Long value2) {
            addCriterion("appraise_user_id between", value1, value2, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseUserIdNotBetween(Long value1, Long value2) {
            addCriterion("appraise_user_id not between", value1, value2, "appraiseUserId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdIsNull() {
            addCriterion("appraise_curriculum_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdIsNotNull() {
            addCriterion("appraise_curriculum_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdEqualTo(Long value) {
            addCriterion("appraise_curriculum_id =", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdNotEqualTo(Long value) {
            addCriterion("appraise_curriculum_id <>", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdGreaterThan(Long value) {
            addCriterion("appraise_curriculum_id >", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appraise_curriculum_id >=", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdLessThan(Long value) {
            addCriterion("appraise_curriculum_id <", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdLessThanOrEqualTo(Long value) {
            addCriterion("appraise_curriculum_id <=", value, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdIn(List<Long> values) {
            addCriterion("appraise_curriculum_id in", values, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdNotIn(List<Long> values) {
            addCriterion("appraise_curriculum_id not in", values, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdBetween(Long value1, Long value2) {
            addCriterion("appraise_curriculum_id between", value1, value2, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseCurriculumIdNotBetween(Long value1, Long value2) {
            addCriterion("appraise_curriculum_id not between", value1, value2, "appraiseCurriculumId");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentIsNull() {
            addCriterion("appraise_content is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentIsNotNull() {
            addCriterion("appraise_content is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentEqualTo(String value) {
            addCriterion("appraise_content =", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentNotEqualTo(String value) {
            addCriterion("appraise_content <>", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentGreaterThan(String value) {
            addCriterion("appraise_content >", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentGreaterThanOrEqualTo(String value) {
            addCriterion("appraise_content >=", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentLessThan(String value) {
            addCriterion("appraise_content <", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentLessThanOrEqualTo(String value) {
            addCriterion("appraise_content <=", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentLike(String value) {
            addCriterion("appraise_content like", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentNotLike(String value) {
            addCriterion("appraise_content not like", value, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentIn(List<String> values) {
            addCriterion("appraise_content in", values, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentNotIn(List<String> values) {
            addCriterion("appraise_content not in", values, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentBetween(String value1, String value2) {
            addCriterion("appraise_content between", value1, value2, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseContentNotBetween(String value1, String value2) {
            addCriterion("appraise_content not between", value1, value2, "appraiseContent");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowIsNull() {
            addCriterion("appraise_is_show is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowIsNotNull() {
            addCriterion("appraise_is_show is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowEqualTo(String value) {
            addCriterion("appraise_is_show =", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowNotEqualTo(String value) {
            addCriterion("appraise_is_show <>", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowGreaterThan(String value) {
            addCriterion("appraise_is_show >", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("appraise_is_show >=", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowLessThan(String value) {
            addCriterion("appraise_is_show <", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowLessThanOrEqualTo(String value) {
            addCriterion("appraise_is_show <=", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowLike(String value) {
            addCriterion("appraise_is_show like", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowNotLike(String value) {
            addCriterion("appraise_is_show not like", value, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowIn(List<String> values) {
            addCriterion("appraise_is_show in", values, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowNotIn(List<String> values) {
            addCriterion("appraise_is_show not in", values, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowBetween(String value1, String value2) {
            addCriterion("appraise_is_show between", value1, value2, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsShowNotBetween(String value1, String value2) {
            addCriterion("appraise_is_show not between", value1, value2, "appraiseIsShow");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberIsNull() {
            addCriterion("appraise_agree_number is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberIsNotNull() {
            addCriterion("appraise_agree_number is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberEqualTo(String value) {
            addCriterion("appraise_agree_number =", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberNotEqualTo(String value) {
            addCriterion("appraise_agree_number <>", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberGreaterThan(String value) {
            addCriterion("appraise_agree_number >", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("appraise_agree_number >=", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberLessThan(String value) {
            addCriterion("appraise_agree_number <", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberLessThanOrEqualTo(String value) {
            addCriterion("appraise_agree_number <=", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberLike(String value) {
            addCriterion("appraise_agree_number like", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberNotLike(String value) {
            addCriterion("appraise_agree_number not like", value, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberIn(List<String> values) {
            addCriterion("appraise_agree_number in", values, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberNotIn(List<String> values) {
            addCriterion("appraise_agree_number not in", values, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberBetween(String value1, String value2) {
            addCriterion("appraise_agree_number between", value1, value2, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseAgreeNumberNotBetween(String value1, String value2) {
            addCriterion("appraise_agree_number not between", value1, value2, "appraiseAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberIsNull() {
            addCriterion("appraise_no_agree_number is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberIsNotNull() {
            addCriterion("appraise_no_agree_number is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberEqualTo(String value) {
            addCriterion("appraise_no_agree_number =", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberNotEqualTo(String value) {
            addCriterion("appraise_no_agree_number <>", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberGreaterThan(String value) {
            addCriterion("appraise_no_agree_number >", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("appraise_no_agree_number >=", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberLessThan(String value) {
            addCriterion("appraise_no_agree_number <", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberLessThanOrEqualTo(String value) {
            addCriterion("appraise_no_agree_number <=", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberLike(String value) {
            addCriterion("appraise_no_agree_number like", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberNotLike(String value) {
            addCriterion("appraise_no_agree_number not like", value, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberIn(List<String> values) {
            addCriterion("appraise_no_agree_number in", values, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberNotIn(List<String> values) {
            addCriterion("appraise_no_agree_number not in", values, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberBetween(String value1, String value2) {
            addCriterion("appraise_no_agree_number between", value1, value2, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseNoAgreeNumberNotBetween(String value1, String value2) {
            addCriterion("appraise_no_agree_number not between", value1, value2, "appraiseNoAgreeNumber");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeIsNull() {
            addCriterion("appraise_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeIsNotNull() {
            addCriterion("appraise_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeEqualTo(Date value) {
            addCriterion("appraise_create_time =", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeNotEqualTo(Date value) {
            addCriterion("appraise_create_time <>", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeGreaterThan(Date value) {
            addCriterion("appraise_create_time >", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appraise_create_time >=", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeLessThan(Date value) {
            addCriterion("appraise_create_time <", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("appraise_create_time <=", value, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeIn(List<Date> values) {
            addCriterion("appraise_create_time in", values, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeNotIn(List<Date> values) {
            addCriterion("appraise_create_time not in", values, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("appraise_create_time between", value1, value2, "appraiseCreateTime");
            return (Criteria) this;
        }

        public Criteria andAppraiseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("appraise_create_time not between", value1, value2, "appraiseCreateTime");
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