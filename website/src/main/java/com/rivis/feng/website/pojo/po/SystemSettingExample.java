package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemSettingExample() {
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

        public Criteria andSettingIdIsNull() {
            addCriterion("setting_id is null");
            return (Criteria) this;
        }

        public Criteria andSettingIdIsNotNull() {
            addCriterion("setting_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettingIdEqualTo(Long value) {
            addCriterion("setting_id =", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotEqualTo(Long value) {
            addCriterion("setting_id <>", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdGreaterThan(Long value) {
            addCriterion("setting_id >", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("setting_id >=", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdLessThan(Long value) {
            addCriterion("setting_id <", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdLessThanOrEqualTo(Long value) {
            addCriterion("setting_id <=", value, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdIn(List<Long> values) {
            addCriterion("setting_id in", values, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotIn(List<Long> values) {
            addCriterion("setting_id not in", values, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdBetween(Long value1, Long value2) {
            addCriterion("setting_id between", value1, value2, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingIdNotBetween(Long value1, Long value2) {
            addCriterion("setting_id not between", value1, value2, "settingId");
            return (Criteria) this;
        }

        public Criteria andSettingTitileIsNull() {
            addCriterion("setting_titile is null");
            return (Criteria) this;
        }

        public Criteria andSettingTitileIsNotNull() {
            addCriterion("setting_titile is not null");
            return (Criteria) this;
        }

        public Criteria andSettingTitileEqualTo(String value) {
            addCriterion("setting_titile =", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileNotEqualTo(String value) {
            addCriterion("setting_titile <>", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileGreaterThan(String value) {
            addCriterion("setting_titile >", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileGreaterThanOrEqualTo(String value) {
            addCriterion("setting_titile >=", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileLessThan(String value) {
            addCriterion("setting_titile <", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileLessThanOrEqualTo(String value) {
            addCriterion("setting_titile <=", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileLike(String value) {
            addCriterion("setting_titile like", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileNotLike(String value) {
            addCriterion("setting_titile not like", value, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileIn(List<String> values) {
            addCriterion("setting_titile in", values, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileNotIn(List<String> values) {
            addCriterion("setting_titile not in", values, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileBetween(String value1, String value2) {
            addCriterion("setting_titile between", value1, value2, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingTitileNotBetween(String value1, String value2) {
            addCriterion("setting_titile not between", value1, value2, "settingTitile");
            return (Criteria) this;
        }

        public Criteria andSettingNameIsNull() {
            addCriterion("setting_name is null");
            return (Criteria) this;
        }

        public Criteria andSettingNameIsNotNull() {
            addCriterion("setting_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettingNameEqualTo(String value) {
            addCriterion("setting_name =", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotEqualTo(String value) {
            addCriterion("setting_name <>", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameGreaterThan(String value) {
            addCriterion("setting_name >", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameGreaterThanOrEqualTo(String value) {
            addCriterion("setting_name >=", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLessThan(String value) {
            addCriterion("setting_name <", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLessThanOrEqualTo(String value) {
            addCriterion("setting_name <=", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameLike(String value) {
            addCriterion("setting_name like", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotLike(String value) {
            addCriterion("setting_name not like", value, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameIn(List<String> values) {
            addCriterion("setting_name in", values, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotIn(List<String> values) {
            addCriterion("setting_name not in", values, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameBetween(String value1, String value2) {
            addCriterion("setting_name between", value1, value2, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingNameNotBetween(String value1, String value2) {
            addCriterion("setting_name not between", value1, value2, "settingName");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNull() {
            addCriterion("setting_value is null");
            return (Criteria) this;
        }

        public Criteria andSettingValueIsNotNull() {
            addCriterion("setting_value is not null");
            return (Criteria) this;
        }

        public Criteria andSettingValueEqualTo(String value) {
            addCriterion("setting_value =", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotEqualTo(String value) {
            addCriterion("setting_value <>", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThan(String value) {
            addCriterion("setting_value >", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueGreaterThanOrEqualTo(String value) {
            addCriterion("setting_value >=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThan(String value) {
            addCriterion("setting_value <", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLessThanOrEqualTo(String value) {
            addCriterion("setting_value <=", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueLike(String value) {
            addCriterion("setting_value like", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotLike(String value) {
            addCriterion("setting_value not like", value, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueIn(List<String> values) {
            addCriterion("setting_value in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotIn(List<String> values) {
            addCriterion("setting_value not in", values, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueBetween(String value1, String value2) {
            addCriterion("setting_value between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValueNotBetween(String value1, String value2) {
            addCriterion("setting_value not between", value1, value2, "settingValue");
            return (Criteria) this;
        }

        public Criteria andSettingValuesIsNull() {
            addCriterion("setting_values is null");
            return (Criteria) this;
        }

        public Criteria andSettingValuesIsNotNull() {
            addCriterion("setting_values is not null");
            return (Criteria) this;
        }

        public Criteria andSettingValuesEqualTo(String value) {
            addCriterion("setting_values =", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesNotEqualTo(String value) {
            addCriterion("setting_values <>", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesGreaterThan(String value) {
            addCriterion("setting_values >", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesGreaterThanOrEqualTo(String value) {
            addCriterion("setting_values >=", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesLessThan(String value) {
            addCriterion("setting_values <", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesLessThanOrEqualTo(String value) {
            addCriterion("setting_values <=", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesLike(String value) {
            addCriterion("setting_values like", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesNotLike(String value) {
            addCriterion("setting_values not like", value, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesIn(List<String> values) {
            addCriterion("setting_values in", values, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesNotIn(List<String> values) {
            addCriterion("setting_values not in", values, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesBetween(String value1, String value2) {
            addCriterion("setting_values between", value1, value2, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingValuesNotBetween(String value1, String value2) {
            addCriterion("setting_values not between", value1, value2, "settingValues");
            return (Criteria) this;
        }

        public Criteria andSettingDataIsNull() {
            addCriterion("setting_data is null");
            return (Criteria) this;
        }

        public Criteria andSettingDataIsNotNull() {
            addCriterion("setting_data is not null");
            return (Criteria) this;
        }

        public Criteria andSettingDataEqualTo(String value) {
            addCriterion("setting_data =", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataNotEqualTo(String value) {
            addCriterion("setting_data <>", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataGreaterThan(String value) {
            addCriterion("setting_data >", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataGreaterThanOrEqualTo(String value) {
            addCriterion("setting_data >=", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataLessThan(String value) {
            addCriterion("setting_data <", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataLessThanOrEqualTo(String value) {
            addCriterion("setting_data <=", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataLike(String value) {
            addCriterion("setting_data like", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataNotLike(String value) {
            addCriterion("setting_data not like", value, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataIn(List<String> values) {
            addCriterion("setting_data in", values, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataNotIn(List<String> values) {
            addCriterion("setting_data not in", values, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataBetween(String value1, String value2) {
            addCriterion("setting_data between", value1, value2, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingDataNotBetween(String value1, String value2) {
            addCriterion("setting_data not between", value1, value2, "settingData");
            return (Criteria) this;
        }

        public Criteria andSettingFromIsNull() {
            addCriterion("setting_from is null");
            return (Criteria) this;
        }

        public Criteria andSettingFromIsNotNull() {
            addCriterion("setting_from is not null");
            return (Criteria) this;
        }

        public Criteria andSettingFromEqualTo(String value) {
            addCriterion("setting_from =", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromNotEqualTo(String value) {
            addCriterion("setting_from <>", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromGreaterThan(String value) {
            addCriterion("setting_from >", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromGreaterThanOrEqualTo(String value) {
            addCriterion("setting_from >=", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromLessThan(String value) {
            addCriterion("setting_from <", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromLessThanOrEqualTo(String value) {
            addCriterion("setting_from <=", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromLike(String value) {
            addCriterion("setting_from like", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromNotLike(String value) {
            addCriterion("setting_from not like", value, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromIn(List<String> values) {
            addCriterion("setting_from in", values, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromNotIn(List<String> values) {
            addCriterion("setting_from not in", values, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromBetween(String value1, String value2) {
            addCriterion("setting_from between", value1, value2, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingFromNotBetween(String value1, String value2) {
            addCriterion("setting_from not between", value1, value2, "settingFrom");
            return (Criteria) this;
        }

        public Criteria andSettingSortIsNull() {
            addCriterion("setting_sort is null");
            return (Criteria) this;
        }

        public Criteria andSettingSortIsNotNull() {
            addCriterion("setting_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSettingSortEqualTo(String value) {
            addCriterion("setting_sort =", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortNotEqualTo(String value) {
            addCriterion("setting_sort <>", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortGreaterThan(String value) {
            addCriterion("setting_sort >", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortGreaterThanOrEqualTo(String value) {
            addCriterion("setting_sort >=", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortLessThan(String value) {
            addCriterion("setting_sort <", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortLessThanOrEqualTo(String value) {
            addCriterion("setting_sort <=", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortLike(String value) {
            addCriterion("setting_sort like", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortNotLike(String value) {
            addCriterion("setting_sort not like", value, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortIn(List<String> values) {
            addCriterion("setting_sort in", values, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortNotIn(List<String> values) {
            addCriterion("setting_sort not in", values, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortBetween(String value1, String value2) {
            addCriterion("setting_sort between", value1, value2, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingSortNotBetween(String value1, String value2) {
            addCriterion("setting_sort not between", value1, value2, "settingSort");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionIsNull() {
            addCriterion("setting_description is null");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionIsNotNull() {
            addCriterion("setting_description is not null");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionEqualTo(String value) {
            addCriterion("setting_description =", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionNotEqualTo(String value) {
            addCriterion("setting_description <>", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionGreaterThan(String value) {
            addCriterion("setting_description >", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("setting_description >=", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionLessThan(String value) {
            addCriterion("setting_description <", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionLessThanOrEqualTo(String value) {
            addCriterion("setting_description <=", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionLike(String value) {
            addCriterion("setting_description like", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionNotLike(String value) {
            addCriterion("setting_description not like", value, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionIn(List<String> values) {
            addCriterion("setting_description in", values, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionNotIn(List<String> values) {
            addCriterion("setting_description not in", values, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionBetween(String value1, String value2) {
            addCriterion("setting_description between", value1, value2, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingDescriptionNotBetween(String value1, String value2) {
            addCriterion("setting_description not between", value1, value2, "settingDescription");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeIsNull() {
            addCriterion("setting_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeIsNotNull() {
            addCriterion("setting_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeEqualTo(Date value) {
            addCriterion("setting_create_time =", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeNotEqualTo(Date value) {
            addCriterion("setting_create_time <>", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeGreaterThan(Date value) {
            addCriterion("setting_create_time >", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("setting_create_time >=", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeLessThan(Date value) {
            addCriterion("setting_create_time <", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("setting_create_time <=", value, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeIn(List<Date> values) {
            addCriterion("setting_create_time in", values, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeNotIn(List<Date> values) {
            addCriterion("setting_create_time not in", values, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeBetween(Date value1, Date value2) {
            addCriterion("setting_create_time between", value1, value2, "settingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSettingCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("setting_create_time not between", value1, value2, "settingCreateTime");
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