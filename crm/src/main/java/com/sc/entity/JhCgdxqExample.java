package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JhCgdxqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JhCgdxqExample() {
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

        public Criteria andCgXqIdIsNull() {
            addCriterion("CG_XQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgXqIdIsNotNull() {
            addCriterion("CG_XQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgXqIdEqualTo(String value) {
            addCriterion("CG_XQ_ID =", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotEqualTo(String value) {
            addCriterion("CG_XQ_ID <>", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThan(String value) {
            addCriterion("CG_XQ_ID >", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThanOrEqualTo(String value) {
            addCriterion("CG_XQ_ID >=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThan(String value) {
            addCriterion("CG_XQ_ID <", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThanOrEqualTo(String value) {
            addCriterion("CG_XQ_ID <=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLike(String value) {
            addCriterion("CG_XQ_ID like", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotLike(String value) {
            addCriterion("CG_XQ_ID not like", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdIn(List<String> values) {
            addCriterion("CG_XQ_ID in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotIn(List<String> values) {
            addCriterion("CG_XQ_ID not in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdBetween(String value1, String value2) {
            addCriterion("CG_XQ_ID between", value1, value2, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotBetween(String value1, String value2) {
            addCriterion("CG_XQ_ID not between", value1, value2, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgdIdIsNull() {
            addCriterion("CGD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgdIdIsNotNull() {
            addCriterion("CGD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgdIdEqualTo(String value) {
            addCriterion("CGD_ID =", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotEqualTo(String value) {
            addCriterion("CGD_ID <>", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThan(String value) {
            addCriterion("CGD_ID >", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThanOrEqualTo(String value) {
            addCriterion("CGD_ID >=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThan(String value) {
            addCriterion("CGD_ID <", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThanOrEqualTo(String value) {
            addCriterion("CGD_ID <=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLike(String value) {
            addCriterion("CGD_ID like", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotLike(String value) {
            addCriterion("CGD_ID not like", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdIn(List<String> values) {
            addCriterion("CGD_ID in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotIn(List<String> values) {
            addCriterion("CGD_ID not in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdBetween(String value1, String value2) {
            addCriterion("CGD_ID between", value1, value2, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotBetween(String value1, String value2) {
            addCriterion("CGD_ID not between", value1, value2, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNull() {
            addCriterion("CP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("CP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(String value) {
            addCriterion("CP_ID =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(String value) {
            addCriterion("CP_ID <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(String value) {
            addCriterion("CP_ID >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CP_ID >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(String value) {
            addCriterion("CP_ID <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(String value) {
            addCriterion("CP_ID <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLike(String value) {
            addCriterion("CP_ID like", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotLike(String value) {
            addCriterion("CP_ID not like", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<String> values) {
            addCriterion("CP_ID in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<String> values) {
            addCriterion("CP_ID not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(String value1, String value2) {
            addCriterion("CP_ID between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(String value1, String value2) {
            addCriterion("CP_ID not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpNumberIsNull() {
            addCriterion("CP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCpNumberIsNotNull() {
            addCriterion("CP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCpNumberEqualTo(Long value) {
            addCriterion("CP_NUMBER =", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberNotEqualTo(Long value) {
            addCriterion("CP_NUMBER <>", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberGreaterThan(Long value) {
            addCriterion("CP_NUMBER >", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("CP_NUMBER >=", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberLessThan(Long value) {
            addCriterion("CP_NUMBER <", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberLessThanOrEqualTo(Long value) {
            addCriterion("CP_NUMBER <=", value, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberIn(List<Long> values) {
            addCriterion("CP_NUMBER in", values, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberNotIn(List<Long> values) {
            addCriterion("CP_NUMBER not in", values, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberBetween(Long value1, Long value2) {
            addCriterion("CP_NUMBER between", value1, value2, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andCpNumberNotBetween(Long value1, Long value2) {
            addCriterion("CP_NUMBER not between", value1, value2, "cpNumber");
            return (Criteria) this;
        }

        public Criteria andIsRkIsNull() {
            addCriterion("IS_RK is null");
            return (Criteria) this;
        }

        public Criteria andIsRkIsNotNull() {
            addCriterion("IS_RK is not null");
            return (Criteria) this;
        }

        public Criteria andIsRkEqualTo(String value) {
            addCriterion("IS_RK =", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkNotEqualTo(String value) {
            addCriterion("IS_RK <>", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkGreaterThan(String value) {
            addCriterion("IS_RK >", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RK >=", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkLessThan(String value) {
            addCriterion("IS_RK <", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkLessThanOrEqualTo(String value) {
            addCriterion("IS_RK <=", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkLike(String value) {
            addCriterion("IS_RK like", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkNotLike(String value) {
            addCriterion("IS_RK not like", value, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkIn(List<String> values) {
            addCriterion("IS_RK in", values, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkNotIn(List<String> values) {
            addCriterion("IS_RK not in", values, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkBetween(String value1, String value2) {
            addCriterion("IS_RK between", value1, value2, "isRk");
            return (Criteria) this;
        }

        public Criteria andIsRkNotBetween(String value1, String value2) {
            addCriterion("IS_RK not between", value1, value2, "isRk");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNull() {
            addCriterion("GS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNotNull() {
            addCriterion("GS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGsIdEqualTo(String value) {
            addCriterion("GS_ID =", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotEqualTo(String value) {
            addCriterion("GS_ID <>", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThan(String value) {
            addCriterion("GS_ID >", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GS_ID >=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThan(String value) {
            addCriterion("GS_ID <", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThanOrEqualTo(String value) {
            addCriterion("GS_ID <=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLike(String value) {
            addCriterion("GS_ID like", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotLike(String value) {
            addCriterion("GS_ID not like", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdIn(List<String> values) {
            addCriterion("GS_ID in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotIn(List<String> values) {
            addCriterion("GS_ID not in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdBetween(String value1, String value2) {
            addCriterion("GS_ID between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotBetween(String value1, String value2) {
            addCriterion("GS_ID not between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("LTIME is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("LTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("LTIME =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("LTIME <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("LTIME >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LTIME >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("LTIME <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("LTIME <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("LTIME in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("LTIME not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("LTIME between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("LTIME not between", value1, value2, "ltime");
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