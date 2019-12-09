package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcCangkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcCangkuExample() {
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

        public Criteria andCangkuIdIsNull() {
            addCriterion("CANGKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCangkuIdIsNotNull() {
            addCriterion("CANGKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCangkuIdEqualTo(String value) {
            addCriterion("CANGKU_ID =", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotEqualTo(String value) {
            addCriterion("CANGKU_ID <>", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdGreaterThan(String value) {
            addCriterion("CANGKU_ID >", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANGKU_ID >=", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLessThan(String value) {
            addCriterion("CANGKU_ID <", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLessThanOrEqualTo(String value) {
            addCriterion("CANGKU_ID <=", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdLike(String value) {
            addCriterion("CANGKU_ID like", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotLike(String value) {
            addCriterion("CANGKU_ID not like", value, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdIn(List<String> values) {
            addCriterion("CANGKU_ID in", values, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotIn(List<String> values) {
            addCriterion("CANGKU_ID not in", values, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdBetween(String value1, String value2) {
            addCriterion("CANGKU_ID between", value1, value2, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuIdNotBetween(String value1, String value2) {
            addCriterion("CANGKU_ID not between", value1, value2, "cangkuId");
            return (Criteria) this;
        }

        public Criteria andCangkuNameIsNull() {
            addCriterion("CANGKU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCangkuNameIsNotNull() {
            addCriterion("CANGKU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCangkuNameEqualTo(String value) {
            addCriterion("CANGKU_NAME =", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameNotEqualTo(String value) {
            addCriterion("CANGKU_NAME <>", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameGreaterThan(String value) {
            addCriterion("CANGKU_NAME >", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("CANGKU_NAME >=", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameLessThan(String value) {
            addCriterion("CANGKU_NAME <", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameLessThanOrEqualTo(String value) {
            addCriterion("CANGKU_NAME <=", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameLike(String value) {
            addCriterion("CANGKU_NAME like", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameNotLike(String value) {
            addCriterion("CANGKU_NAME not like", value, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameIn(List<String> values) {
            addCriterion("CANGKU_NAME in", values, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameNotIn(List<String> values) {
            addCriterion("CANGKU_NAME not in", values, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameBetween(String value1, String value2) {
            addCriterion("CANGKU_NAME between", value1, value2, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNameNotBetween(String value1, String value2) {
            addCriterion("CANGKU_NAME not between", value1, value2, "cangkuName");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteIsNull() {
            addCriterion("CANGKU_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteIsNotNull() {
            addCriterion("CANGKU_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteEqualTo(String value) {
            addCriterion("CANGKU_NOTE =", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteNotEqualTo(String value) {
            addCriterion("CANGKU_NOTE <>", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteGreaterThan(String value) {
            addCriterion("CANGKU_NOTE >", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteGreaterThanOrEqualTo(String value) {
            addCriterion("CANGKU_NOTE >=", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteLessThan(String value) {
            addCriterion("CANGKU_NOTE <", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteLessThanOrEqualTo(String value) {
            addCriterion("CANGKU_NOTE <=", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteLike(String value) {
            addCriterion("CANGKU_NOTE like", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteNotLike(String value) {
            addCriterion("CANGKU_NOTE not like", value, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteIn(List<String> values) {
            addCriterion("CANGKU_NOTE in", values, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteNotIn(List<String> values) {
            addCriterion("CANGKU_NOTE not in", values, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteBetween(String value1, String value2) {
            addCriterion("CANGKU_NOTE between", value1, value2, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuNoteNotBetween(String value1, String value2) {
            addCriterion("CANGKU_NOTE not between", value1, value2, "cangkuNote");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeIsNull() {
            addCriterion("CANGKU_LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeIsNotNull() {
            addCriterion("CANGKU_LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeEqualTo(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME =", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeNotEqualTo(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME <>", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeGreaterThan(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME >", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME >=", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeLessThan(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME <", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANGKU_LAST_MODIFY_TIME <=", value, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeIn(List<Date> values) {
            addCriterion("CANGKU_LAST_MODIFY_TIME in", values, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeNotIn(List<Date> values) {
            addCriterion("CANGKU_LAST_MODIFY_TIME not in", values, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("CANGKU_LAST_MODIFY_TIME between", value1, value2, "cangkuLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCangkuLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANGKU_LAST_MODIFY_TIME not between", value1, value2, "cangkuLastModifyTime");
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

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
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