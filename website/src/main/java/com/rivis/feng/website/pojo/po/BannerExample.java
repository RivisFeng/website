package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerNameIsNull() {
            addCriterion("banner_name is null");
            return (Criteria) this;
        }

        public Criteria andBannerNameIsNotNull() {
            addCriterion("banner_name is not null");
            return (Criteria) this;
        }

        public Criteria andBannerNameEqualTo(String value) {
            addCriterion("banner_name =", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameNotEqualTo(String value) {
            addCriterion("banner_name <>", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameGreaterThan(String value) {
            addCriterion("banner_name >", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameGreaterThanOrEqualTo(String value) {
            addCriterion("banner_name >=", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameLessThan(String value) {
            addCriterion("banner_name <", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameLessThanOrEqualTo(String value) {
            addCriterion("banner_name <=", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameLike(String value) {
            addCriterion("banner_name like", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameNotLike(String value) {
            addCriterion("banner_name not like", value, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameIn(List<String> values) {
            addCriterion("banner_name in", values, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameNotIn(List<String> values) {
            addCriterion("banner_name not in", values, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameBetween(String value1, String value2) {
            addCriterion("banner_name between", value1, value2, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerNameNotBetween(String value1, String value2) {
            addCriterion("banner_name not between", value1, value2, "bannerName");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("banner_url =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("banner_url >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("banner_url <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("banner_url like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("banner_url not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("banner_url in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlIsNull() {
            addCriterion("banner_image_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlIsNotNull() {
            addCriterion("banner_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlEqualTo(String value) {
            addCriterion("banner_image_url =", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlNotEqualTo(String value) {
            addCriterion("banner_image_url <>", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlGreaterThan(String value) {
            addCriterion("banner_image_url >", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_image_url >=", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlLessThan(String value) {
            addCriterion("banner_image_url <", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_image_url <=", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlLike(String value) {
            addCriterion("banner_image_url like", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlNotLike(String value) {
            addCriterion("banner_image_url not like", value, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlIn(List<String> values) {
            addCriterion("banner_image_url in", values, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlNotIn(List<String> values) {
            addCriterion("banner_image_url not in", values, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlBetween(String value1, String value2) {
            addCriterion("banner_image_url between", value1, value2, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerImageUrlNotBetween(String value1, String value2) {
            addCriterion("banner_image_url not between", value1, value2, "bannerImageUrl");
            return (Criteria) this;
        }

        public Criteria andBannerSortIsNull() {
            addCriterion("banner_sort is null");
            return (Criteria) this;
        }

        public Criteria andBannerSortIsNotNull() {
            addCriterion("banner_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBannerSortEqualTo(String value) {
            addCriterion("banner_sort =", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortNotEqualTo(String value) {
            addCriterion("banner_sort <>", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortGreaterThan(String value) {
            addCriterion("banner_sort >", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortGreaterThanOrEqualTo(String value) {
            addCriterion("banner_sort >=", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortLessThan(String value) {
            addCriterion("banner_sort <", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortLessThanOrEqualTo(String value) {
            addCriterion("banner_sort <=", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortLike(String value) {
            addCriterion("banner_sort like", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortNotLike(String value) {
            addCriterion("banner_sort not like", value, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortIn(List<String> values) {
            addCriterion("banner_sort in", values, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortNotIn(List<String> values) {
            addCriterion("banner_sort not in", values, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortBetween(String value1, String value2) {
            addCriterion("banner_sort between", value1, value2, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerSortNotBetween(String value1, String value2) {
            addCriterion("banner_sort not between", value1, value2, "bannerSort");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNull() {
            addCriterion("banner_type is null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNotNull() {
            addCriterion("banner_type is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeEqualTo(String value) {
            addCriterion("banner_type =", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotEqualTo(String value) {
            addCriterion("banner_type <>", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThan(String value) {
            addCriterion("banner_type >", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("banner_type >=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThan(String value) {
            addCriterion("banner_type <", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThanOrEqualTo(String value) {
            addCriterion("banner_type <=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLike(String value) {
            addCriterion("banner_type like", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotLike(String value) {
            addCriterion("banner_type not like", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIn(List<String> values) {
            addCriterion("banner_type in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotIn(List<String> values) {
            addCriterion("banner_type not in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeBetween(String value1, String value2) {
            addCriterion("banner_type between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotBetween(String value1, String value2) {
            addCriterion("banner_type not between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerStateIsNull() {
            addCriterion("banner_state is null");
            return (Criteria) this;
        }

        public Criteria andBannerStateIsNotNull() {
            addCriterion("banner_state is not null");
            return (Criteria) this;
        }

        public Criteria andBannerStateEqualTo(String value) {
            addCriterion("banner_state =", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateNotEqualTo(String value) {
            addCriterion("banner_state <>", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateGreaterThan(String value) {
            addCriterion("banner_state >", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateGreaterThanOrEqualTo(String value) {
            addCriterion("banner_state >=", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateLessThan(String value) {
            addCriterion("banner_state <", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateLessThanOrEqualTo(String value) {
            addCriterion("banner_state <=", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateLike(String value) {
            addCriterion("banner_state like", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateNotLike(String value) {
            addCriterion("banner_state not like", value, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateIn(List<String> values) {
            addCriterion("banner_state in", values, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateNotIn(List<String> values) {
            addCriterion("banner_state not in", values, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateBetween(String value1, String value2) {
            addCriterion("banner_state between", value1, value2, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerStateNotBetween(String value1, String value2) {
            addCriterion("banner_state not between", value1, value2, "bannerState");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNull() {
            addCriterion("banner_desc is null");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNotNull() {
            addCriterion("banner_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBannerDescEqualTo(String value) {
            addCriterion("banner_desc =", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotEqualTo(String value) {
            addCriterion("banner_desc <>", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThan(String value) {
            addCriterion("banner_desc >", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThanOrEqualTo(String value) {
            addCriterion("banner_desc >=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThan(String value) {
            addCriterion("banner_desc <", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThanOrEqualTo(String value) {
            addCriterion("banner_desc <=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLike(String value) {
            addCriterion("banner_desc like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotLike(String value) {
            addCriterion("banner_desc not like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescIn(List<String> values) {
            addCriterion("banner_desc in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotIn(List<String> values) {
            addCriterion("banner_desc not in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescBetween(String value1, String value2) {
            addCriterion("banner_desc between", value1, value2, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotBetween(String value1, String value2) {
            addCriterion("banner_desc not between", value1, value2, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeIsNull() {
            addCriterion("banner_cteate_time is null");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeIsNotNull() {
            addCriterion("banner_cteate_time is not null");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeEqualTo(Date value) {
            addCriterion("banner_cteate_time =", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeNotEqualTo(Date value) {
            addCriterion("banner_cteate_time <>", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeGreaterThan(Date value) {
            addCriterion("banner_cteate_time >", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("banner_cteate_time >=", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeLessThan(Date value) {
            addCriterion("banner_cteate_time <", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeLessThanOrEqualTo(Date value) {
            addCriterion("banner_cteate_time <=", value, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeIn(List<Date> values) {
            addCriterion("banner_cteate_time in", values, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeNotIn(List<Date> values) {
            addCriterion("banner_cteate_time not in", values, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeBetween(Date value1, Date value2) {
            addCriterion("banner_cteate_time between", value1, value2, "bannerCteateTime");
            return (Criteria) this;
        }

        public Criteria andBannerCteateTimeNotBetween(Date value1, Date value2) {
            addCriterion("banner_cteate_time not between", value1, value2, "bannerCteateTime");
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