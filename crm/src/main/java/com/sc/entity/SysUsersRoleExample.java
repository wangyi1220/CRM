package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsersRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsersRoleExample() {
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

        public Criteria andSurIdIsNull() {
            addCriterion("SUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSurIdIsNotNull() {
            addCriterion("SUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSurIdEqualTo(Long value) {
            addCriterion("SUR_ID =", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdNotEqualTo(Long value) {
            addCriterion("SUR_ID <>", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdGreaterThan(Long value) {
            addCriterion("SUR_ID >", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUR_ID >=", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdLessThan(Long value) {
            addCriterion("SUR_ID <", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdLessThanOrEqualTo(Long value) {
            addCriterion("SUR_ID <=", value, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdIn(List<Long> values) {
            addCriterion("SUR_ID in", values, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdNotIn(List<Long> values) {
            addCriterion("SUR_ID not in", values, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdBetween(Long value1, Long value2) {
            addCriterion("SUR_ID between", value1, value2, "surId");
            return (Criteria) this;
        }

        public Criteria andSurIdNotBetween(Long value1, Long value2) {
            addCriterion("SUR_ID not between", value1, value2, "surId");
            return (Criteria) this;
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdIsNull() {
            addCriterion("OPETATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdIsNotNull() {
            addCriterion("OPETATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdEqualTo(Long value) {
            addCriterion("OPETATER_ID =", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdNotEqualTo(Long value) {
            addCriterion("OPETATER_ID <>", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdGreaterThan(Long value) {
            addCriterion("OPETATER_ID >", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPETATER_ID >=", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdLessThan(Long value) {
            addCriterion("OPETATER_ID <", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdLessThanOrEqualTo(Long value) {
            addCriterion("OPETATER_ID <=", value, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdIn(List<Long> values) {
            addCriterion("OPETATER_ID in", values, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdNotIn(List<Long> values) {
            addCriterion("OPETATER_ID not in", values, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdBetween(Long value1, Long value2) {
            addCriterion("OPETATER_ID between", value1, value2, "opetaterId");
            return (Criteria) this;
        }

        public Criteria andOpetaterIdNotBetween(Long value1, Long value2) {
            addCriterion("OPETATER_ID not between", value1, value2, "opetaterId");
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