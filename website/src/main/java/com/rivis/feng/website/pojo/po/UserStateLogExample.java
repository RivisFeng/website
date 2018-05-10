package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserStateLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNull() {
            addCriterion("log_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNotNull() {
            addCriterion("log_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeEqualTo(Date value) {
            addCriterion("log_create_time =", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotEqualTo(Date value) {
            addCriterion("log_create_time <>", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThan(Date value) {
            addCriterion("log_create_time >", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_create_time >=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThan(Date value) {
            addCriterion("log_create_time <", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_create_time <=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIn(List<Date> values) {
            addCriterion("log_create_time in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotIn(List<Date> values) {
            addCriterion("log_create_time not in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("log_create_time between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_create_time not between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("log_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("log_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("log_ip =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("log_ip <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("log_ip >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("log_ip >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("log_ip <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("log_ip <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("log_ip like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("log_ip not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("log_ip in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("log_ip not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("log_ip between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("log_ip not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogAreaIsNull() {
            addCriterion("log_area is null");
            return (Criteria) this;
        }

        public Criteria andLogAreaIsNotNull() {
            addCriterion("log_area is not null");
            return (Criteria) this;
        }

        public Criteria andLogAreaEqualTo(String value) {
            addCriterion("log_area =", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaNotEqualTo(String value) {
            addCriterion("log_area <>", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaGreaterThan(String value) {
            addCriterion("log_area >", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaGreaterThanOrEqualTo(String value) {
            addCriterion("log_area >=", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaLessThan(String value) {
            addCriterion("log_area <", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaLessThanOrEqualTo(String value) {
            addCriterion("log_area <=", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaLike(String value) {
            addCriterion("log_area like", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaNotLike(String value) {
            addCriterion("log_area not like", value, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaIn(List<String> values) {
            addCriterion("log_area in", values, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaNotIn(List<String> values) {
            addCriterion("log_area not in", values, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaBetween(String value1, String value2) {
            addCriterion("log_area between", value1, value2, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogAreaNotBetween(String value1, String value2) {
            addCriterion("log_area not between", value1, value2, "logArea");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIsNull() {
            addCriterion("log_equipment is null");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIsNotNull() {
            addCriterion("log_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentEqualTo(String value) {
            addCriterion("log_equipment =", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotEqualTo(String value) {
            addCriterion("log_equipment <>", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentGreaterThan(String value) {
            addCriterion("log_equipment >", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("log_equipment >=", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLessThan(String value) {
            addCriterion("log_equipment <", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLessThanOrEqualTo(String value) {
            addCriterion("log_equipment <=", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLike(String value) {
            addCriterion("log_equipment like", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotLike(String value) {
            addCriterion("log_equipment not like", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIn(List<String> values) {
            addCriterion("log_equipment in", values, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotIn(List<String> values) {
            addCriterion("log_equipment not in", values, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentBetween(String value1, String value2) {
            addCriterion("log_equipment between", value1, value2, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotBetween(String value1, String value2) {
            addCriterion("log_equipment not between", value1, value2, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogSoftIsNull() {
            addCriterion("log_soft is null");
            return (Criteria) this;
        }

        public Criteria andLogSoftIsNotNull() {
            addCriterion("log_soft is not null");
            return (Criteria) this;
        }

        public Criteria andLogSoftEqualTo(String value) {
            addCriterion("log_soft =", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftNotEqualTo(String value) {
            addCriterion("log_soft <>", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftGreaterThan(String value) {
            addCriterion("log_soft >", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftGreaterThanOrEqualTo(String value) {
            addCriterion("log_soft >=", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftLessThan(String value) {
            addCriterion("log_soft <", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftLessThanOrEqualTo(String value) {
            addCriterion("log_soft <=", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftLike(String value) {
            addCriterion("log_soft like", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftNotLike(String value) {
            addCriterion("log_soft not like", value, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftIn(List<String> values) {
            addCriterion("log_soft in", values, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftNotIn(List<String> values) {
            addCriterion("log_soft not in", values, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftBetween(String value1, String value2) {
            addCriterion("log_soft between", value1, value2, "logSoft");
            return (Criteria) this;
        }

        public Criteria andLogSoftNotBetween(String value1, String value2) {
            addCriterion("log_soft not between", value1, value2, "logSoft");
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