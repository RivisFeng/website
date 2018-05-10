package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisingExample() {
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

        public Criteria andAdvertisingIdIsNull() {
            addCriterion("advertising_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIsNotNull() {
            addCriterion("advertising_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdEqualTo(Long value) {
            addCriterion("advertising_id =", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotEqualTo(Long value) {
            addCriterion("advertising_id <>", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThan(Long value) {
            addCriterion("advertising_id >", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("advertising_id >=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThan(Long value) {
            addCriterion("advertising_id <", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThanOrEqualTo(Long value) {
            addCriterion("advertising_id <=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIn(List<Long> values) {
            addCriterion("advertising_id in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotIn(List<Long> values) {
            addCriterion("advertising_id not in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdBetween(Long value1, Long value2) {
            addCriterion("advertising_id between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotBetween(Long value1, Long value2) {
            addCriterion("advertising_id not between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNull() {
            addCriterion("advertising_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNotNull() {
            addCriterion("advertising_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameEqualTo(String value) {
            addCriterion("advertising_name =", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotEqualTo(String value) {
            addCriterion("advertising_name <>", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThan(String value) {
            addCriterion("advertising_name >", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_name >=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThan(String value) {
            addCriterion("advertising_name <", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThanOrEqualTo(String value) {
            addCriterion("advertising_name <=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLike(String value) {
            addCriterion("advertising_name like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotLike(String value) {
            addCriterion("advertising_name not like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIn(List<String> values) {
            addCriterion("advertising_name in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotIn(List<String> values) {
            addCriterion("advertising_name not in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameBetween(String value1, String value2) {
            addCriterion("advertising_name between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotBetween(String value1, String value2) {
            addCriterion("advertising_name not between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerIsNull() {
            addCriterion("advertising_manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerIsNotNull() {
            addCriterion("advertising_manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerEqualTo(String value) {
            addCriterion("advertising_manufacturer =", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerNotEqualTo(String value) {
            addCriterion("advertising_manufacturer <>", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerGreaterThan(String value) {
            addCriterion("advertising_manufacturer >", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_manufacturer >=", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerLessThan(String value) {
            addCriterion("advertising_manufacturer <", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerLessThanOrEqualTo(String value) {
            addCriterion("advertising_manufacturer <=", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerLike(String value) {
            addCriterion("advertising_manufacturer like", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerNotLike(String value) {
            addCriterion("advertising_manufacturer not like", value, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerIn(List<String> values) {
            addCriterion("advertising_manufacturer in", values, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerNotIn(List<String> values) {
            addCriterion("advertising_manufacturer not in", values, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerBetween(String value1, String value2) {
            addCriterion("advertising_manufacturer between", value1, value2, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingManufacturerNotBetween(String value1, String value2) {
            addCriterion("advertising_manufacturer not between", value1, value2, "advertisingManufacturer");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationIsNull() {
            addCriterion("advertising_location is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationIsNotNull() {
            addCriterion("advertising_location is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationEqualTo(String value) {
            addCriterion("advertising_location =", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationNotEqualTo(String value) {
            addCriterion("advertising_location <>", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationGreaterThan(String value) {
            addCriterion("advertising_location >", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_location >=", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationLessThan(String value) {
            addCriterion("advertising_location <", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationLessThanOrEqualTo(String value) {
            addCriterion("advertising_location <=", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationLike(String value) {
            addCriterion("advertising_location like", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationNotLike(String value) {
            addCriterion("advertising_location not like", value, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationIn(List<String> values) {
            addCriterion("advertising_location in", values, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationNotIn(List<String> values) {
            addCriterion("advertising_location not in", values, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationBetween(String value1, String value2) {
            addCriterion("advertising_location between", value1, value2, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingLocationNotBetween(String value1, String value2) {
            addCriterion("advertising_location not between", value1, value2, "advertisingLocation");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostIsNull() {
            addCriterion("advertising_cost is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostIsNotNull() {
            addCriterion("advertising_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostEqualTo(String value) {
            addCriterion("advertising_cost =", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostNotEqualTo(String value) {
            addCriterion("advertising_cost <>", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostGreaterThan(String value) {
            addCriterion("advertising_cost >", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_cost >=", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostLessThan(String value) {
            addCriterion("advertising_cost <", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostLessThanOrEqualTo(String value) {
            addCriterion("advertising_cost <=", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostLike(String value) {
            addCriterion("advertising_cost like", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostNotLike(String value) {
            addCriterion("advertising_cost not like", value, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostIn(List<String> values) {
            addCriterion("advertising_cost in", values, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostNotIn(List<String> values) {
            addCriterion("advertising_cost not in", values, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostBetween(String value1, String value2) {
            addCriterion("advertising_cost between", value1, value2, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCostNotBetween(String value1, String value2) {
            addCriterion("advertising_cost not between", value1, value2, "advertisingCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeIsNull() {
            addCriterion("advertising_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeIsNotNull() {
            addCriterion("advertising_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeEqualTo(Date value) {
            addCriterion("advertising_create_time =", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeNotEqualTo(Date value) {
            addCriterion("advertising_create_time <>", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeGreaterThan(Date value) {
            addCriterion("advertising_create_time >", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("advertising_create_time >=", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeLessThan(Date value) {
            addCriterion("advertising_create_time <", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("advertising_create_time <=", value, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeIn(List<Date> values) {
            addCriterion("advertising_create_time in", values, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeNotIn(List<Date> values) {
            addCriterion("advertising_create_time not in", values, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeBetween(Date value1, Date value2) {
            addCriterion("advertising_create_time between", value1, value2, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("advertising_create_time not between", value1, value2, "advertisingCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeIsNull() {
            addCriterion("advertising_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeIsNotNull() {
            addCriterion("advertising_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeEqualTo(Date value) {
            addCriterion("advertising_start_time =", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeNotEqualTo(Date value) {
            addCriterion("advertising_start_time <>", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeGreaterThan(Date value) {
            addCriterion("advertising_start_time >", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("advertising_start_time >=", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeLessThan(Date value) {
            addCriterion("advertising_start_time <", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("advertising_start_time <=", value, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeIn(List<Date> values) {
            addCriterion("advertising_start_time in", values, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeNotIn(List<Date> values) {
            addCriterion("advertising_start_time not in", values, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeBetween(Date value1, Date value2) {
            addCriterion("advertising_start_time between", value1, value2, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("advertising_start_time not between", value1, value2, "advertisingStartTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeIsNull() {
            addCriterion("advertising_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeIsNotNull() {
            addCriterion("advertising_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeEqualTo(Date value) {
            addCriterion("advertising_end_time =", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeNotEqualTo(Date value) {
            addCriterion("advertising_end_time <>", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeGreaterThan(Date value) {
            addCriterion("advertising_end_time >", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("advertising_end_time >=", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeLessThan(Date value) {
            addCriterion("advertising_end_time <", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("advertising_end_time <=", value, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeIn(List<Date> values) {
            addCriterion("advertising_end_time in", values, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeNotIn(List<Date> values) {
            addCriterion("advertising_end_time not in", values, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeBetween(Date value1, Date value2) {
            addCriterion("advertising_end_time between", value1, value2, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("advertising_end_time not between", value1, value2, "advertisingEndTime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateIsNull() {
            addCriterion("advertising_state is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateIsNotNull() {
            addCriterion("advertising_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateEqualTo(String value) {
            addCriterion("advertising_state =", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateNotEqualTo(String value) {
            addCriterion("advertising_state <>", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateGreaterThan(String value) {
            addCriterion("advertising_state >", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_state >=", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateLessThan(String value) {
            addCriterion("advertising_state <", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateLessThanOrEqualTo(String value) {
            addCriterion("advertising_state <=", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateLike(String value) {
            addCriterion("advertising_state like", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateNotLike(String value) {
            addCriterion("advertising_state not like", value, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateIn(List<String> values) {
            addCriterion("advertising_state in", values, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateNotIn(List<String> values) {
            addCriterion("advertising_state not in", values, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateBetween(String value1, String value2) {
            addCriterion("advertising_state between", value1, value2, "advertisingState");
            return (Criteria) this;
        }

        public Criteria andAdvertisingStateNotBetween(String value1, String value2) {
            addCriterion("advertising_state not between", value1, value2, "advertisingState");
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