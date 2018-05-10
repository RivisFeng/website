package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DermaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DermaExample() {
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

        public Criteria andDermaIdIsNull() {
            addCriterion("derma_id is null");
            return (Criteria) this;
        }

        public Criteria andDermaIdIsNotNull() {
            addCriterion("derma_id is not null");
            return (Criteria) this;
        }

        public Criteria andDermaIdEqualTo(Long value) {
            addCriterion("derma_id =", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdNotEqualTo(Long value) {
            addCriterion("derma_id <>", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdGreaterThan(Long value) {
            addCriterion("derma_id >", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("derma_id >=", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdLessThan(Long value) {
            addCriterion("derma_id <", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdLessThanOrEqualTo(Long value) {
            addCriterion("derma_id <=", value, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdIn(List<Long> values) {
            addCriterion("derma_id in", values, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdNotIn(List<Long> values) {
            addCriterion("derma_id not in", values, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdBetween(Long value1, Long value2) {
            addCriterion("derma_id between", value1, value2, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaIdNotBetween(Long value1, Long value2) {
            addCriterion("derma_id not between", value1, value2, "dermaId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdIsNull() {
            addCriterion("derma_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdIsNotNull() {
            addCriterion("derma_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdEqualTo(Long value) {
            addCriterion("derma_user_id =", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdNotEqualTo(Long value) {
            addCriterion("derma_user_id <>", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdGreaterThan(Long value) {
            addCriterion("derma_user_id >", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("derma_user_id >=", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdLessThan(Long value) {
            addCriterion("derma_user_id <", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdLessThanOrEqualTo(Long value) {
            addCriterion("derma_user_id <=", value, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdIn(List<Long> values) {
            addCriterion("derma_user_id in", values, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdNotIn(List<Long> values) {
            addCriterion("derma_user_id not in", values, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdBetween(Long value1, Long value2) {
            addCriterion("derma_user_id between", value1, value2, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaUserIdNotBetween(Long value1, Long value2) {
            addCriterion("derma_user_id not between", value1, value2, "dermaUserId");
            return (Criteria) this;
        }

        public Criteria andDermaNameIsNull() {
            addCriterion("derma_name is null");
            return (Criteria) this;
        }

        public Criteria andDermaNameIsNotNull() {
            addCriterion("derma_name is not null");
            return (Criteria) this;
        }

        public Criteria andDermaNameEqualTo(String value) {
            addCriterion("derma_name =", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameNotEqualTo(String value) {
            addCriterion("derma_name <>", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameGreaterThan(String value) {
            addCriterion("derma_name >", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameGreaterThanOrEqualTo(String value) {
            addCriterion("derma_name >=", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameLessThan(String value) {
            addCriterion("derma_name <", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameLessThanOrEqualTo(String value) {
            addCriterion("derma_name <=", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameLike(String value) {
            addCriterion("derma_name like", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameNotLike(String value) {
            addCriterion("derma_name not like", value, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameIn(List<String> values) {
            addCriterion("derma_name in", values, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameNotIn(List<String> values) {
            addCriterion("derma_name not in", values, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameBetween(String value1, String value2) {
            addCriterion("derma_name between", value1, value2, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaNameNotBetween(String value1, String value2) {
            addCriterion("derma_name not between", value1, value2, "dermaName");
            return (Criteria) this;
        }

        public Criteria andDermaColorIsNull() {
            addCriterion("derma_color is null");
            return (Criteria) this;
        }

        public Criteria andDermaColorIsNotNull() {
            addCriterion("derma_color is not null");
            return (Criteria) this;
        }

        public Criteria andDermaColorEqualTo(String value) {
            addCriterion("derma_color =", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorNotEqualTo(String value) {
            addCriterion("derma_color <>", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorGreaterThan(String value) {
            addCriterion("derma_color >", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorGreaterThanOrEqualTo(String value) {
            addCriterion("derma_color >=", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorLessThan(String value) {
            addCriterion("derma_color <", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorLessThanOrEqualTo(String value) {
            addCriterion("derma_color <=", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorLike(String value) {
            addCriterion("derma_color like", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorNotLike(String value) {
            addCriterion("derma_color not like", value, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorIn(List<String> values) {
            addCriterion("derma_color in", values, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorNotIn(List<String> values) {
            addCriterion("derma_color not in", values, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorBetween(String value1, String value2) {
            addCriterion("derma_color between", value1, value2, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaColorNotBetween(String value1, String value2) {
            addCriterion("derma_color not between", value1, value2, "dermaColor");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleIsNull() {
            addCriterion("derma_module_style is null");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleIsNotNull() {
            addCriterion("derma_module_style is not null");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleEqualTo(String value) {
            addCriterion("derma_module_style =", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleNotEqualTo(String value) {
            addCriterion("derma_module_style <>", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleGreaterThan(String value) {
            addCriterion("derma_module_style >", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleGreaterThanOrEqualTo(String value) {
            addCriterion("derma_module_style >=", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleLessThan(String value) {
            addCriterion("derma_module_style <", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleLessThanOrEqualTo(String value) {
            addCriterion("derma_module_style <=", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleLike(String value) {
            addCriterion("derma_module_style like", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleNotLike(String value) {
            addCriterion("derma_module_style not like", value, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleIn(List<String> values) {
            addCriterion("derma_module_style in", values, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleNotIn(List<String> values) {
            addCriterion("derma_module_style not in", values, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleBetween(String value1, String value2) {
            addCriterion("derma_module_style between", value1, value2, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaModuleStyleNotBetween(String value1, String value2) {
            addCriterion("derma_module_style not between", value1, value2, "dermaModuleStyle");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageIsNull() {
            addCriterion("derma_background_image is null");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageIsNotNull() {
            addCriterion("derma_background_image is not null");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageEqualTo(String value) {
            addCriterion("derma_background_image =", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageNotEqualTo(String value) {
            addCriterion("derma_background_image <>", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageGreaterThan(String value) {
            addCriterion("derma_background_image >", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageGreaterThanOrEqualTo(String value) {
            addCriterion("derma_background_image >=", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageLessThan(String value) {
            addCriterion("derma_background_image <", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageLessThanOrEqualTo(String value) {
            addCriterion("derma_background_image <=", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageLike(String value) {
            addCriterion("derma_background_image like", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageNotLike(String value) {
            addCriterion("derma_background_image not like", value, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageIn(List<String> values) {
            addCriterion("derma_background_image in", values, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageNotIn(List<String> values) {
            addCriterion("derma_background_image not in", values, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageBetween(String value1, String value2) {
            addCriterion("derma_background_image between", value1, value2, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaBackgroundImageNotBetween(String value1, String value2) {
            addCriterion("derma_background_image not between", value1, value2, "dermaBackgroundImage");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeIsNull() {
            addCriterion("derma_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeIsNotNull() {
            addCriterion("derma_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeEqualTo(Date value) {
            addCriterion("derma_create_time =", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeNotEqualTo(Date value) {
            addCriterion("derma_create_time <>", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeGreaterThan(Date value) {
            addCriterion("derma_create_time >", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("derma_create_time >=", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeLessThan(Date value) {
            addCriterion("derma_create_time <", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("derma_create_time <=", value, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeIn(List<Date> values) {
            addCriterion("derma_create_time in", values, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeNotIn(List<Date> values) {
            addCriterion("derma_create_time not in", values, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeBetween(Date value1, Date value2) {
            addCriterion("derma_create_time between", value1, value2, "dermaCreateTime");
            return (Criteria) this;
        }

        public Criteria andDermaCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("derma_create_time not between", value1, value2, "dermaCreateTime");
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