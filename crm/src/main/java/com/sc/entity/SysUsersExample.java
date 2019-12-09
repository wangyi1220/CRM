package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsersExample() {
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

        public Criteria andUsersIdIsNull() {
            addCriterion("USERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("USERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Long value) {
            addCriterion("USERS_ID =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Long value) {
            addCriterion("USERS_ID <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Long value) {
            addCriterion("USERS_ID >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USERS_ID >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Long value) {
            addCriterion("USERS_ID <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Long value) {
            addCriterion("USERS_ID <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Long> values) {
            addCriterion("USERS_ID in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Long> values) {
            addCriterion("USERS_ID not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Long value1, Long value2) {
            addCriterion("USERS_ID between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Long value1, Long value2) {
            addCriterion("USERS_ID not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNull() {
            addCriterion("USERS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNotNull() {
            addCriterion("USERS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNameEqualTo(String value) {
            addCriterion("USERS_NAME =", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotEqualTo(String value) {
            addCriterion("USERS_NAME <>", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThan(String value) {
            addCriterion("USERS_NAME >", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_NAME >=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThan(String value) {
            addCriterion("USERS_NAME <", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThanOrEqualTo(String value) {
            addCriterion("USERS_NAME <=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLike(String value) {
            addCriterion("USERS_NAME like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotLike(String value) {
            addCriterion("USERS_NAME not like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameIn(List<String> values) {
            addCriterion("USERS_NAME in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotIn(List<String> values) {
            addCriterion("USERS_NAME not in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameBetween(String value1, String value2) {
            addCriterion("USERS_NAME between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotBetween(String value1, String value2) {
            addCriterion("USERS_NAME not between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNull() {
            addCriterion("USERS_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNotNull() {
            addCriterion("USERS_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordEqualTo(String value) {
            addCriterion("USERS_PASSWORD =", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotEqualTo(String value) {
            addCriterion("USERS_PASSWORD <>", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThan(String value) {
            addCriterion("USERS_PASSWORD >", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_PASSWORD >=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThan(String value) {
            addCriterion("USERS_PASSWORD <", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThanOrEqualTo(String value) {
            addCriterion("USERS_PASSWORD <=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLike(String value) {
            addCriterion("USERS_PASSWORD like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotLike(String value) {
            addCriterion("USERS_PASSWORD not like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIn(List<String> values) {
            addCriterion("USERS_PASSWORD in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotIn(List<String> values) {
            addCriterion("USERS_PASSWORD not in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordBetween(String value1, String value2) {
            addCriterion("USERS_PASSWORD between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotBetween(String value1, String value2) {
            addCriterion("USERS_PASSWORD not between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Long value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Long value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Long value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Long value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Long value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Long> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Long> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Long value1, Long value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Long value1, Long value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
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

        public Criteria andUsersStateIsNull() {
            addCriterion("USERS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUsersStateIsNotNull() {
            addCriterion("USERS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersStateEqualTo(String value) {
            addCriterion("USERS_STATE =", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateNotEqualTo(String value) {
            addCriterion("USERS_STATE <>", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateGreaterThan(String value) {
            addCriterion("USERS_STATE >", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateGreaterThanOrEqualTo(String value) {
            addCriterion("USERS_STATE >=", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateLessThan(String value) {
            addCriterion("USERS_STATE <", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateLessThanOrEqualTo(String value) {
            addCriterion("USERS_STATE <=", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateLike(String value) {
            addCriterion("USERS_STATE like", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateNotLike(String value) {
            addCriterion("USERS_STATE not like", value, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateIn(List<String> values) {
            addCriterion("USERS_STATE in", values, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateNotIn(List<String> values) {
            addCriterion("USERS_STATE not in", values, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateBetween(String value1, String value2) {
            addCriterion("USERS_STATE between", value1, value2, "usersState");
            return (Criteria) this;
        }

        public Criteria andUsersStateNotBetween(String value1, String value2) {
            addCriterion("USERS_STATE not between", value1, value2, "usersState");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNull() {
            addCriterion("CHANGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNotNull() {
            addCriterion("CHANGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDateEqualTo(Date value) {
            addCriterion("CHANGE_DATE =", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotEqualTo(Date value) {
            addCriterion("CHANGE_DATE <>", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThan(Date value) {
            addCriterion("CHANGE_DATE >", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGE_DATE >=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThan(Date value) {
            addCriterion("CHANGE_DATE <", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThanOrEqualTo(Date value) {
            addCriterion("CHANGE_DATE <=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateIn(List<Date> values) {
            addCriterion("CHANGE_DATE in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotIn(List<Date> values) {
            addCriterion("CHANGE_DATE not in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateBetween(Date value1, Date value2) {
            addCriterion("CHANGE_DATE between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotBetween(Date value1, Date value2) {
            addCriterion("CHANGE_DATE not between", value1, value2, "changeDate");
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