package com.sc.entity;

import java.math.BigDecimal;
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

        public Criteria andCgXqIdEqualTo(BigDecimal value) {
            addCriterion("CG_XQ_ID =", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotEqualTo(BigDecimal value) {
            addCriterion("CG_XQ_ID <>", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThan(BigDecimal value) {
            addCriterion("CG_XQ_ID >", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CG_XQ_ID >=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThan(BigDecimal value) {
            addCriterion("CG_XQ_ID <", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CG_XQ_ID <=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdIn(List<BigDecimal> values) {
            addCriterion("CG_XQ_ID in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotIn(List<BigDecimal> values) {
            addCriterion("CG_XQ_ID not in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CG_XQ_ID between", value1, value2, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andCgdIdEqualTo(Long value) {
            addCriterion("CGD_ID =", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotEqualTo(Long value) {
            addCriterion("CGD_ID <>", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThan(Long value) {
            addCriterion("CGD_ID >", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CGD_ID >=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThan(Long value) {
            addCriterion("CGD_ID <", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThanOrEqualTo(Long value) {
            addCriterion("CGD_ID <=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdIn(List<Long> values) {
            addCriterion("CGD_ID in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotIn(List<Long> values) {
            addCriterion("CGD_ID not in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdBetween(Long value1, Long value2) {
            addCriterion("CGD_ID between", value1, value2, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotBetween(Long value1, Long value2) {
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

        public Criteria andCpIdEqualTo(BigDecimal value) {
            addCriterion("CP_ID =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(BigDecimal value) {
            addCriterion("CP_ID <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(BigDecimal value) {
            addCriterion("CP_ID >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CP_ID >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(BigDecimal value) {
            addCriterion("CP_ID <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CP_ID <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<BigDecimal> values) {
            addCriterion("CP_ID in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<BigDecimal> values) {
            addCriterion("CP_ID not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CP_ID between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andGsIdEqualTo(BigDecimal value) {
            addCriterion("GS_ID =", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotEqualTo(BigDecimal value) {
            addCriterion("GS_ID <>", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThan(BigDecimal value) {
            addCriterion("GS_ID >", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GS_ID >=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThan(BigDecimal value) {
            addCriterion("GS_ID <", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GS_ID <=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdIn(List<BigDecimal> values) {
            addCriterion("GS_ID in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotIn(List<BigDecimal> values) {
            addCriterion("GS_ID not in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GS_ID between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andCpPriceIsNull() {
            addCriterion("CP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCpPriceIsNotNull() {
            addCriterion("CP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCpPriceEqualTo(String value) {
            addCriterion("CP_PRICE =", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotEqualTo(String value) {
            addCriterion("CP_PRICE <>", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceGreaterThan(String value) {
            addCriterion("CP_PRICE >", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceGreaterThanOrEqualTo(String value) {
            addCriterion("CP_PRICE >=", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceLessThan(String value) {
            addCriterion("CP_PRICE <", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceLessThanOrEqualTo(String value) {
            addCriterion("CP_PRICE <=", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceLike(String value) {
            addCriterion("CP_PRICE like", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotLike(String value) {
            addCriterion("CP_PRICE not like", value, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceIn(List<String> values) {
            addCriterion("CP_PRICE in", values, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotIn(List<String> values) {
            addCriterion("CP_PRICE not in", values, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceBetween(String value1, String value2) {
            addCriterion("CP_PRICE between", value1, value2, "cpPrice");
            return (Criteria) this;
        }

        public Criteria andCpPriceNotBetween(String value1, String value2) {
            addCriterion("CP_PRICE not between", value1, value2, "cpPrice");
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