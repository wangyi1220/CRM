package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleKhinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleKhinfoExample() {
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
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserAttributeIsNull() {
            addCriterion("USER_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andUserAttributeIsNotNull() {
            addCriterion("USER_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andUserAttributeEqualTo(String value) {
            addCriterion("USER_ATTRIBUTE =", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeNotEqualTo(String value) {
            addCriterion("USER_ATTRIBUTE <>", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeGreaterThan(String value) {
            addCriterion("USER_ATTRIBUTE >", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ATTRIBUTE >=", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeLessThan(String value) {
            addCriterion("USER_ATTRIBUTE <", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeLessThanOrEqualTo(String value) {
            addCriterion("USER_ATTRIBUTE <=", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeLike(String value) {
            addCriterion("USER_ATTRIBUTE like", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeNotLike(String value) {
            addCriterion("USER_ATTRIBUTE not like", value, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeIn(List<String> values) {
            addCriterion("USER_ATTRIBUTE in", values, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeNotIn(List<String> values) {
            addCriterion("USER_ATTRIBUTE not in", values, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeBetween(String value1, String value2) {
            addCriterion("USER_ATTRIBUTE between", value1, value2, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andUserAttributeNotBetween(String value1, String value2) {
            addCriterion("USER_ATTRIBUTE not between", value1, value2, "userAttribute");
            return (Criteria) this;
        }

        public Criteria andWebIsNull() {
            addCriterion("WEB is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("WEB is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("WEB =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("WEB <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("WEB >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("WEB >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("WEB <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("WEB <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("WEB like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("WEB not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("WEB in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("WEB not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("WEB between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("WEB not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("STOCK_CODE =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("STOCK_CODE <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("STOCK_CODE >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("STOCK_CODE <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("STOCK_CODE like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("STOCK_CODE not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("STOCK_CODE in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("STOCK_CODE not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("STOCK_CODE between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("STOCK_CODE not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIsNull() {
            addCriterion("SUPERIOR_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIsNotNull() {
            addCriterion("SUPERIOR_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT =", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT <>", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitGreaterThan(String value) {
            addCriterion("SUPERIOR_UNIT >", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT >=", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLessThan(String value) {
            addCriterion("SUPERIOR_UNIT <", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT <=", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLike(String value) {
            addCriterion("SUPERIOR_UNIT like", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotLike(String value) {
            addCriterion("SUPERIOR_UNIT not like", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIn(List<String> values) {
            addCriterion("SUPERIOR_UNIT in", values, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotIn(List<String> values) {
            addCriterion("SUPERIOR_UNIT not in", values, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitBetween(String value1, String value2) {
            addCriterion("SUPERIOR_UNIT between", value1, value2, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR_UNIT not between", value1, value2, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberIsNull() {
            addCriterion("EMPLOYEES_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberIsNotNull() {
            addCriterion("EMPLOYEES_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberEqualTo(String value) {
            addCriterion("EMPLOYEES_NUMBER =", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberNotEqualTo(String value) {
            addCriterion("EMPLOYEES_NUMBER <>", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberGreaterThan(String value) {
            addCriterion("EMPLOYEES_NUMBER >", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEES_NUMBER >=", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberLessThan(String value) {
            addCriterion("EMPLOYEES_NUMBER <", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEES_NUMBER <=", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberLike(String value) {
            addCriterion("EMPLOYEES_NUMBER like", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberNotLike(String value) {
            addCriterion("EMPLOYEES_NUMBER not like", value, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberIn(List<String> values) {
            addCriterion("EMPLOYEES_NUMBER in", values, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberNotIn(List<String> values) {
            addCriterion("EMPLOYEES_NUMBER not in", values, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEES_NUMBER between", value1, value2, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeesNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEES_NUMBER not between", value1, value2, "employeesNumber");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("INDUSTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("INDUSTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(Long value) {
            addCriterion("INDUSTRY_ID =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(Long value) {
            addCriterion("INDUSTRY_ID >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(Long value) {
            addCriterion("INDUSTRY_ID <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<Long> values) {
            addCriterion("INDUSTRY_ID in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<Long> values) {
            addCriterion("INDUSTRY_ID not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("USER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("USER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("USER_STATE =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("USER_STATE <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("USER_STATE >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATE >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("USER_STATE <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("USER_STATE <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("USER_STATE like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("USER_STATE not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("USER_STATE in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("USER_STATE not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("USER_STATE between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("USER_STATE not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("USER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("USER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("USER_SOURCE =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("USER_SOURCE <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("USER_SOURCE >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("USER_SOURCE <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("USER_SOURCE like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("USER_SOURCE not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("USER_SOURCE in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("USER_SOURCE not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("USER_SOURCE between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("USER_SOURCE not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("CHARGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("CHARGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Long value) {
            addCriterion("CHARGE_ID =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Long value) {
            addCriterion("CHARGE_ID <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Long value) {
            addCriterion("CHARGE_ID >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ID >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Long value) {
            addCriterion("CHARGE_ID <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ID <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Long> values) {
            addCriterion("CHARGE_ID in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Long> values) {
            addCriterion("CHARGE_ID not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ID between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ID not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andGdphoneIsNull() {
            addCriterion("GDPHONE is null");
            return (Criteria) this;
        }

        public Criteria andGdphoneIsNotNull() {
            addCriterion("GDPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGdphoneEqualTo(String value) {
            addCriterion("GDPHONE =", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneNotEqualTo(String value) {
            addCriterion("GDPHONE <>", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneGreaterThan(String value) {
            addCriterion("GDPHONE >", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GDPHONE >=", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneLessThan(String value) {
            addCriterion("GDPHONE <", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneLessThanOrEqualTo(String value) {
            addCriterion("GDPHONE <=", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneLike(String value) {
            addCriterion("GDPHONE like", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneNotLike(String value) {
            addCriterion("GDPHONE not like", value, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneIn(List<String> values) {
            addCriterion("GDPHONE in", values, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneNotIn(List<String> values) {
            addCriterion("GDPHONE not in", values, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneBetween(String value1, String value2) {
            addCriterion("GDPHONE between", value1, value2, "gdphone");
            return (Criteria) this;
        }

        public Criteria andGdphoneNotBetween(String value1, String value2) {
            addCriterion("GDPHONE not between", value1, value2, "gdphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("MPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("MPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("MPHONE =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("MPHONE <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("MPHONE >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("MPHONE >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("MPHONE <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("MPHONE <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("MPHONE like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("MPHONE not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("MPHONE in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("MPHONE not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("MPHONE between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("MPHONE not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andUserFaxIsNull() {
            addCriterion("USER_FAX is null");
            return (Criteria) this;
        }

        public Criteria andUserFaxIsNotNull() {
            addCriterion("USER_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andUserFaxEqualTo(String value) {
            addCriterion("USER_FAX =", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxNotEqualTo(String value) {
            addCriterion("USER_FAX <>", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxGreaterThan(String value) {
            addCriterion("USER_FAX >", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxGreaterThanOrEqualTo(String value) {
            addCriterion("USER_FAX >=", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxLessThan(String value) {
            addCriterion("USER_FAX <", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxLessThanOrEqualTo(String value) {
            addCriterion("USER_FAX <=", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxLike(String value) {
            addCriterion("USER_FAX like", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxNotLike(String value) {
            addCriterion("USER_FAX not like", value, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxIn(List<String> values) {
            addCriterion("USER_FAX in", values, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxNotIn(List<String> values) {
            addCriterion("USER_FAX not in", values, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxBetween(String value1, String value2) {
            addCriterion("USER_FAX between", value1, value2, "userFax");
            return (Criteria) this;
        }

        public Criteria andUserFaxNotBetween(String value1, String value2) {
            addCriterion("USER_FAX not between", value1, value2, "userFax");
            return (Criteria) this;
        }

        public Criteria andDepositBankIsNull() {
            addCriterion("DEPOSIT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andDepositBankIsNotNull() {
            addCriterion("DEPOSIT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBankEqualTo(String value) {
            addCriterion("DEPOSIT_BANK =", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotEqualTo(String value) {
            addCriterion("DEPOSIT_BANK <>", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankGreaterThan(String value) {
            addCriterion("DEPOSIT_BANK >", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_BANK >=", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLessThan(String value) {
            addCriterion("DEPOSIT_BANK <", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLessThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_BANK <=", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLike(String value) {
            addCriterion("DEPOSIT_BANK like", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotLike(String value) {
            addCriterion("DEPOSIT_BANK not like", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankIn(List<String> values) {
            addCriterion("DEPOSIT_BANK in", values, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotIn(List<String> values) {
            addCriterion("DEPOSIT_BANK not in", values, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankBetween(String value1, String value2) {
            addCriterion("DEPOSIT_BANK between", value1, value2, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotBetween(String value1, String value2) {
            addCriterion("DEPOSIT_BANK not between", value1, value2, "depositBank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIsNull() {
            addCriterion("NEXT_CONTACT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIsNotNull() {
            addCriterion("NEXT_CONTACT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_TIME =", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_TIME <>", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeGreaterThan(Date value) {
            addCriterion("NEXT_CONTACT_TIME >", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_TIME >=", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeLessThan(Date value) {
            addCriterion("NEXT_CONTACT_TIME <", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeLessThanOrEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_TIME <=", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIn(List<Date> values) {
            addCriterion("NEXT_CONTACT_TIME in", values, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotIn(List<Date> values) {
            addCriterion("NEXT_CONTACT_TIME not in", values, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeBetween(Date value1, Date value2) {
            addCriterion("NEXT_CONTACT_TIME between", value1, value2, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotBetween(Date value1, Date value2) {
            addCriterion("NEXT_CONTACT_TIME not between", value1, value2, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E_MAIL =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E_MAIL <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E_MAIL >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E_MAIL <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E_MAIL like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E_MAIL not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E_MAIL in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E_MAIL not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E_MAIL between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E_MAIL not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andSicCodeIsNull() {
            addCriterion("SIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSicCodeIsNotNull() {
            addCriterion("SIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSicCodeEqualTo(String value) {
            addCriterion("SIC_CODE =", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotEqualTo(String value) {
            addCriterion("SIC_CODE <>", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeGreaterThan(String value) {
            addCriterion("SIC_CODE >", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SIC_CODE >=", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLessThan(String value) {
            addCriterion("SIC_CODE <", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLessThanOrEqualTo(String value) {
            addCriterion("SIC_CODE <=", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLike(String value) {
            addCriterion("SIC_CODE like", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotLike(String value) {
            addCriterion("SIC_CODE not like", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeIn(List<String> values) {
            addCriterion("SIC_CODE in", values, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotIn(List<String> values) {
            addCriterion("SIC_CODE not in", values, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeBetween(String value1, String value2) {
            addCriterion("SIC_CODE between", value1, value2, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotBetween(String value1, String value2) {
            addCriterion("SIC_CODE not between", value1, value2, "sicCode");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("PAY_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("PAY_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("PAY_METHOD =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("PAY_METHOD <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("PAY_METHOD >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_METHOD >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("PAY_METHOD <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("PAY_METHOD <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("PAY_METHOD like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("PAY_METHOD not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("PAY_METHOD in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("PAY_METHOD not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("PAY_METHOD between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("PAY_METHOD not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("IS_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("IS_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(String value) {
            addCriterion("IS_EFFECTIVE =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(String value) {
            addCriterion("IS_EFFECTIVE <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(String value) {
            addCriterion("IS_EFFECTIVE >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EFFECTIVE >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(String value) {
            addCriterion("IS_EFFECTIVE <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(String value) {
            addCriterion("IS_EFFECTIVE <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLike(String value) {
            addCriterion("IS_EFFECTIVE like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotLike(String value) {
            addCriterion("IS_EFFECTIVE not like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<String> values) {
            addCriterion("IS_EFFECTIVE in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<String> values) {
            addCriterion("IS_EFFECTIVE not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(String value1, String value2) {
            addCriterion("IS_EFFECTIVE between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(String value1, String value2) {
            addCriterion("IS_EFFECTIVE not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("DETAILED_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("DETAILED_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("DETAILED_ADDRESS =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("DETAILED_ADDRESS <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("DETAILED_ADDRESS >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILED_ADDRESS >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("DETAILED_ADDRESS <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("DETAILED_ADDRESS <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("DETAILED_ADDRESS like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("DETAILED_ADDRESS not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("DETAILED_ADDRESS in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("DETAILED_ADDRESS not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("DETAILED_ADDRESS between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("DETAILED_ADDRESS not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoIsNull() {
            addCriterion("REMARKS_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoIsNotNull() {
            addCriterion("REMARKS_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoEqualTo(String value) {
            addCriterion("REMARKS_INFO =", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoNotEqualTo(String value) {
            addCriterion("REMARKS_INFO <>", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoGreaterThan(String value) {
            addCriterion("REMARKS_INFO >", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS_INFO >=", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoLessThan(String value) {
            addCriterion("REMARKS_INFO <", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoLessThanOrEqualTo(String value) {
            addCriterion("REMARKS_INFO <=", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoLike(String value) {
            addCriterion("REMARKS_INFO like", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoNotLike(String value) {
            addCriterion("REMARKS_INFO not like", value, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoIn(List<String> values) {
            addCriterion("REMARKS_INFO in", values, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoNotIn(List<String> values) {
            addCriterion("REMARKS_INFO not in", values, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoBetween(String value1, String value2) {
            addCriterion("REMARKS_INFO between", value1, value2, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andRemarksInfoNotBetween(String value1, String value2) {
            addCriterion("REMARKS_INFO not between", value1, value2, "remarksInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNull() {
            addCriterion("LAST_MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("LAST_MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Date value) {
            addCriterion("LAST_MODIFIED =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Date value) {
            addCriterion("LAST_MODIFIED <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Date> values) {
            addCriterion("LAST_MODIFIED in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED not between", value1, value2, "lastModified");
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