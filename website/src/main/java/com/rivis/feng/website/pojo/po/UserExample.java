package com.rivis.feng.website.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPrictureIsNull() {
            addCriterion("user_pricture is null");
            return (Criteria) this;
        }

        public Criteria andUserPrictureIsNotNull() {
            addCriterion("user_pricture is not null");
            return (Criteria) this;
        }

        public Criteria andUserPrictureEqualTo(String value) {
            addCriterion("user_pricture =", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureNotEqualTo(String value) {
            addCriterion("user_pricture <>", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureGreaterThan(String value) {
            addCriterion("user_pricture >", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureGreaterThanOrEqualTo(String value) {
            addCriterion("user_pricture >=", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureLessThan(String value) {
            addCriterion("user_pricture <", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureLessThanOrEqualTo(String value) {
            addCriterion("user_pricture <=", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureLike(String value) {
            addCriterion("user_pricture like", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureNotLike(String value) {
            addCriterion("user_pricture not like", value, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureIn(List<String> values) {
            addCriterion("user_pricture in", values, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureNotIn(List<String> values) {
            addCriterion("user_pricture not in", values, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureBetween(String value1, String value2) {
            addCriterion("user_pricture between", value1, value2, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserPrictureNotBetween(String value1, String value2) {
            addCriterion("user_pricture not between", value1, value2, "userPricture");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserCityIdIsNull() {
            addCriterion("user_city_id is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIdIsNotNull() {
            addCriterion("user_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityIdEqualTo(Long value) {
            addCriterion("user_city_id =", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdNotEqualTo(Long value) {
            addCriterion("user_city_id <>", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdGreaterThan(Long value) {
            addCriterion("user_city_id >", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_city_id >=", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdLessThan(Long value) {
            addCriterion("user_city_id <", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdLessThanOrEqualTo(Long value) {
            addCriterion("user_city_id <=", value, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdIn(List<Long> values) {
            addCriterion("user_city_id in", values, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdNotIn(List<Long> values) {
            addCriterion("user_city_id not in", values, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdBetween(Long value1, Long value2) {
            addCriterion("user_city_id between", value1, value2, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserCityIdNotBetween(Long value1, Long value2) {
            addCriterion("user_city_id not between", value1, value2, "userCityId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNull() {
            addCriterion("user_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNotNull() {
            addCriterion("user_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteEqualTo(String value) {
            addCriterion("user_is_delete =", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotEqualTo(String value) {
            addCriterion("user_is_delete <>", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThan(String value) {
            addCriterion("user_is_delete >", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_delete >=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThan(String value) {
            addCriterion("user_is_delete <", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("user_is_delete <=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLike(String value) {
            addCriterion("user_is_delete like", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotLike(String value) {
            addCriterion("user_is_delete not like", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIn(List<String> values) {
            addCriterion("user_is_delete in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotIn(List<String> values) {
            addCriterion("user_is_delete not in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteBetween(String value1, String value2) {
            addCriterion("user_is_delete between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotBetween(String value1, String value2) {
            addCriterion("user_is_delete not between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsVipIsNull() {
            addCriterion("user_is_vip is null");
            return (Criteria) this;
        }

        public Criteria andUserIsVipIsNotNull() {
            addCriterion("user_is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsVipEqualTo(String value) {
            addCriterion("user_is_vip =", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipNotEqualTo(String value) {
            addCriterion("user_is_vip <>", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipGreaterThan(String value) {
            addCriterion("user_is_vip >", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_vip >=", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipLessThan(String value) {
            addCriterion("user_is_vip <", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipLessThanOrEqualTo(String value) {
            addCriterion("user_is_vip <=", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipLike(String value) {
            addCriterion("user_is_vip like", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipNotLike(String value) {
            addCriterion("user_is_vip not like", value, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipIn(List<String> values) {
            addCriterion("user_is_vip in", values, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipNotIn(List<String> values) {
            addCriterion("user_is_vip not in", values, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipBetween(String value1, String value2) {
            addCriterion("user_is_vip between", value1, value2, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserIsVipNotBetween(String value1, String value2) {
            addCriterion("user_is_vip not between", value1, value2, "userIsVip");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("user_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("user_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("user_mail =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("user_mail <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("user_mail >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("user_mail >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("user_mail <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("user_mail <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("user_mail like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("user_mail not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("user_mail in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("user_mail not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("user_mail between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("user_mail not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNull() {
            addCriterion("user_from is null");
            return (Criteria) this;
        }

        public Criteria andUserFromIsNotNull() {
            addCriterion("user_from is not null");
            return (Criteria) this;
        }

        public Criteria andUserFromEqualTo(String value) {
            addCriterion("user_from =", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotEqualTo(String value) {
            addCriterion("user_from <>", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThan(String value) {
            addCriterion("user_from >", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromGreaterThanOrEqualTo(String value) {
            addCriterion("user_from >=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThan(String value) {
            addCriterion("user_from <", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLessThanOrEqualTo(String value) {
            addCriterion("user_from <=", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromLike(String value) {
            addCriterion("user_from like", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotLike(String value) {
            addCriterion("user_from not like", value, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromIn(List<String> values) {
            addCriterion("user_from in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotIn(List<String> values) {
            addCriterion("user_from not in", values, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromBetween(String value1, String value2) {
            addCriterion("user_from between", value1, value2, "userFrom");
            return (Criteria) this;
        }

        public Criteria andUserFromNotBetween(String value1, String value2) {
            addCriterion("user_from not between", value1, value2, "userFrom");
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