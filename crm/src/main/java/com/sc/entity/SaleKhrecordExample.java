package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleKhrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleKhrecordExample() {
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

        public Criteria andContactRecordIdIsNull() {
            addCriterion("CONTACT_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdIsNotNull() {
            addCriterion("CONTACT_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID =", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID <>", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdGreaterThan(Long value) {
            addCriterion("CONTACT_RECORD_ID >", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID >=", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdLessThan(Long value) {
            addCriterion("CONTACT_RECORD_ID <", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID <=", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdIn(List<Long> values) {
            addCriterion("CONTACT_RECORD_ID in", values, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotIn(List<Long> values) {
            addCriterion("CONTACT_RECORD_ID not in", values, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdBetween(Long value1, Long value2) {
            addCriterion("CONTACT_RECORD_ID between", value1, value2, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTACT_RECORD_ID not between", value1, value2, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactTitleIsNull() {
            addCriterion("CONTACT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andContactTitleIsNotNull() {
            addCriterion("CONTACT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andContactTitleEqualTo(String value) {
            addCriterion("CONTACT_TITLE =", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleNotEqualTo(String value) {
            addCriterion("CONTACT_TITLE <>", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleGreaterThan(String value) {
            addCriterion("CONTACT_TITLE >", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TITLE >=", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleLessThan(String value) {
            addCriterion("CONTACT_TITLE <", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TITLE <=", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleLike(String value) {
            addCriterion("CONTACT_TITLE like", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleNotLike(String value) {
            addCriterion("CONTACT_TITLE not like", value, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleIn(List<String> values) {
            addCriterion("CONTACT_TITLE in", values, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleNotIn(List<String> values) {
            addCriterion("CONTACT_TITLE not in", values, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleBetween(String value1, String value2) {
            addCriterion("CONTACT_TITLE between", value1, value2, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTitleNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TITLE not between", value1, value2, "contactTitle");
            return (Criteria) this;
        }

        public Criteria andContactTimeIsNull() {
            addCriterion("CONTACT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andContactTimeIsNotNull() {
            addCriterion("CONTACT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andContactTimeEqualTo(Date value) {
            addCriterion("CONTACT_TIME =", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotEqualTo(Date value) {
            addCriterion("CONTACT_TIME <>", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThan(Date value) {
            addCriterion("CONTACT_TIME >", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTACT_TIME >=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThan(Date value) {
            addCriterion("CONTACT_TIME <", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONTACT_TIME <=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeIn(List<Date> values) {
            addCriterion("CONTACT_TIME in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotIn(List<Date> values) {
            addCriterion("CONTACT_TIME not in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeBetween(Date value1, Date value2) {
            addCriterion("CONTACT_TIME between", value1, value2, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONTACT_TIME not between", value1, value2, "contactTime");
            return (Criteria) this;
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

        public Criteria andContactContentIsNull() {
            addCriterion("CONTACT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNotNull() {
            addCriterion("CONTACT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContactContentEqualTo(String value) {
            addCriterion("CONTACT_CONTENT =", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <>", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThan(String value) {
            addCriterion("CONTACT_CONTENT >", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT >=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThan(String value) {
            addCriterion("CONTACT_CONTENT <", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLike(String value) {
            addCriterion("CONTACT_CONTENT like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotLike(String value) {
            addCriterion("CONTACT_CONTENT not like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentIn(List<String> values) {
            addCriterion("CONTACT_CONTENT in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotIn(List<String> values) {
            addCriterion("CONTACT_CONTENT not in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT between", value1, value2, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT not between", value1, value2, "contactContent");
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