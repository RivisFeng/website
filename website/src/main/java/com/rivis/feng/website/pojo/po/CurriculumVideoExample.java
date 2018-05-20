package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumVideoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public CurriculumVideoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
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
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdIsNull() {
            addCriterion("video_curriculum_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdIsNotNull() {
            addCriterion("video_curriculum_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdEqualTo(Long value) {
            addCriterion("video_curriculum_id =", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdNotEqualTo(Long value) {
            addCriterion("video_curriculum_id <>", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdGreaterThan(Long value) {
            addCriterion("video_curriculum_id >", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_curriculum_id >=", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdLessThan(Long value) {
            addCriterion("video_curriculum_id <", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdLessThanOrEqualTo(Long value) {
            addCriterion("video_curriculum_id <=", value, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdIn(List<Long> values) {
            addCriterion("video_curriculum_id in", values, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdNotIn(List<Long> values) {
            addCriterion("video_curriculum_id not in", values, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdBetween(Long value1, Long value2) {
            addCriterion("video_curriculum_id between", value1, value2, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoCurriculumIdNotBetween(Long value1, Long value2) {
            addCriterion("video_curriculum_id not between", value1, value2, "videoCurriculumId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoSortIsNull() {
            addCriterion("video_sort is null");
            return (Criteria) this;
        }

        public Criteria andVideoSortIsNotNull() {
            addCriterion("video_sort is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSortEqualTo(String value) {
            addCriterion("video_sort =", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortNotEqualTo(String value) {
            addCriterion("video_sort <>", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortGreaterThan(String value) {
            addCriterion("video_sort >", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortGreaterThanOrEqualTo(String value) {
            addCriterion("video_sort >=", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortLessThan(String value) {
            addCriterion("video_sort <", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortLessThanOrEqualTo(String value) {
            addCriterion("video_sort <=", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortLike(String value) {
            addCriterion("video_sort like", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortNotLike(String value) {
            addCriterion("video_sort not like", value, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortIn(List<String> values) {
            addCriterion("video_sort in", values, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortNotIn(List<String> values) {
            addCriterion("video_sort not in", values, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortBetween(String value1, String value2) {
            addCriterion("video_sort between", value1, value2, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoSortNotBetween(String value1, String value2) {
            addCriterion("video_sort not between", value1, value2, "videoSort");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNull() {
            addCriterion("video_state is null");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNotNull() {
            addCriterion("video_state is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStateEqualTo(String value) {
            addCriterion("video_state =", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotEqualTo(String value) {
            addCriterion("video_state <>", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThan(String value) {
            addCriterion("video_state >", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThanOrEqualTo(String value) {
            addCriterion("video_state >=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThan(String value) {
            addCriterion("video_state <", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThanOrEqualTo(String value) {
            addCriterion("video_state <=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLike(String value) {
            addCriterion("video_state like", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotLike(String value) {
            addCriterion("video_state not like", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateIn(List<String> values) {
            addCriterion("video_state in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotIn(List<String> values) {
            addCriterion("video_state not in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateBetween(String value1, String value2) {
            addCriterion("video_state between", value1, value2, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotBetween(String value1, String value2) {
            addCriterion("video_state not between", value1, value2, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeIsNull() {
            addCriterion("video_create_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeIsNotNull() {
            addCriterion("video_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeEqualTo(Date value) {
            addCriterion("video_create_time =", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeNotEqualTo(Date value) {
            addCriterion("video_create_time <>", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeGreaterThan(Date value) {
            addCriterion("video_create_time >", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("video_create_time >=", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeLessThan(Date value) {
            addCriterion("video_create_time <", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("video_create_time <=", value, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeIn(List<Date> values) {
            addCriterion("video_create_time in", values, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeNotIn(List<Date> values) {
            addCriterion("video_create_time not in", values, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("video_create_time between", value1, value2, "videoCreateTime");
            return (Criteria) this;
        }

        public Criteria andVideoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("video_create_time not between", value1, value2, "videoCreateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_video
     *
     * @mbggenerated do_not_delete_during_merge Sat May 19 23:25:22 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table curriculum_video
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
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