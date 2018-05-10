package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumAppraiseReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumAppraiseReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Long value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Long value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Long value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Long value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Long> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Long> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Long value1, Long value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdIsNull() {
            addCriterion("reply_appraise_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdIsNotNull() {
            addCriterion("reply_appraise_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdEqualTo(Long value) {
            addCriterion("reply_appraise_id =", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdNotEqualTo(Long value) {
            addCriterion("reply_appraise_id <>", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdGreaterThan(Long value) {
            addCriterion("reply_appraise_id >", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_appraise_id >=", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdLessThan(Long value) {
            addCriterion("reply_appraise_id <", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_appraise_id <=", value, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdIn(List<Long> values) {
            addCriterion("reply_appraise_id in", values, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdNotIn(List<Long> values) {
            addCriterion("reply_appraise_id not in", values, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdBetween(Long value1, Long value2) {
            addCriterion("reply_appraise_id between", value1, value2, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyAppraiseIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_appraise_id not between", value1, value2, "replyAppraiseId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNull() {
            addCriterion("reply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNotNull() {
            addCriterion("reply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdEqualTo(Long value) {
            addCriterion("reply_user_id =", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotEqualTo(Long value) {
            addCriterion("reply_user_id <>", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThan(Long value) {
            addCriterion("reply_user_id >", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_user_id >=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThan(Long value) {
            addCriterion("reply_user_id <", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_user_id <=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIn(List<Long> values) {
            addCriterion("reply_user_id in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotIn(List<Long> values) {
            addCriterion("reply_user_id not in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdBetween(Long value1, Long value2) {
            addCriterion("reply_user_id between", value1, value2, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_user_id not between", value1, value2, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowIsNull() {
            addCriterion("reply_is_show is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowIsNotNull() {
            addCriterion("reply_is_show is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowEqualTo(String value) {
            addCriterion("reply_is_show =", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowNotEqualTo(String value) {
            addCriterion("reply_is_show <>", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowGreaterThan(String value) {
            addCriterion("reply_is_show >", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("reply_is_show >=", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowLessThan(String value) {
            addCriterion("reply_is_show <", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowLessThanOrEqualTo(String value) {
            addCriterion("reply_is_show <=", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowLike(String value) {
            addCriterion("reply_is_show like", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowNotLike(String value) {
            addCriterion("reply_is_show not like", value, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowIn(List<String> values) {
            addCriterion("reply_is_show in", values, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowNotIn(List<String> values) {
            addCriterion("reply_is_show not in", values, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowBetween(String value1, String value2) {
            addCriterion("reply_is_show between", value1, value2, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyIsShowNotBetween(String value1, String value2) {
            addCriterion("reply_is_show not between", value1, value2, "replyIsShow");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIsNull() {
            addCriterion("reply_create_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIsNotNull() {
            addCriterion("reply_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeEqualTo(Date value) {
            addCriterion("reply_create_time =", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotEqualTo(Date value) {
            addCriterion("reply_create_time <>", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeGreaterThan(Date value) {
            addCriterion("reply_create_time >", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_create_time >=", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeLessThan(Date value) {
            addCriterion("reply_create_time <", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_create_time <=", value, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeIn(List<Date> values) {
            addCriterion("reply_create_time in", values, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotIn(List<Date> values) {
            addCriterion("reply_create_time not in", values, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("reply_create_time between", value1, value2, "replyCreateTime");
            return (Criteria) this;
        }

        public Criteria andReplyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_create_time not between", value1, value2, "replyCreateTime");
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