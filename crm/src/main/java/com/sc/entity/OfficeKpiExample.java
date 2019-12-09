package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeKpiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeKpiExample() {
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

        public Criteria andKpiIdIsNull() {
            addCriterion("KPI_ID is null");
            return (Criteria) this;
        }

        public Criteria andKpiIdIsNotNull() {
            addCriterion("KPI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKpiIdEqualTo(BigDecimal value) {
            addCriterion("KPI_ID =", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotEqualTo(BigDecimal value) {
            addCriterion("KPI_ID <>", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThan(BigDecimal value) {
            addCriterion("KPI_ID >", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_ID >=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThan(BigDecimal value) {
            addCriterion("KPI_ID <", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KPI_ID <=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdIn(List<BigDecimal> values) {
            addCriterion("KPI_ID in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotIn(List<BigDecimal> values) {
            addCriterion("KPI_ID not in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_ID between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KPI_ID not between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiKpiIsNull() {
            addCriterion("KPI_KPI is null");
            return (Criteria) this;
        }

        public Criteria andKpiKpiIsNotNull() {
            addCriterion("KPI_KPI is not null");
            return (Criteria) this;
        }

        public Criteria andKpiKpiEqualTo(String value) {
            addCriterion("KPI_KPI =", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiNotEqualTo(String value) {
            addCriterion("KPI_KPI <>", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiGreaterThan(String value) {
            addCriterion("KPI_KPI >", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_KPI >=", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiLessThan(String value) {
            addCriterion("KPI_KPI <", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiLessThanOrEqualTo(String value) {
            addCriterion("KPI_KPI <=", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiLike(String value) {
            addCriterion("KPI_KPI like", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiNotLike(String value) {
            addCriterion("KPI_KPI not like", value, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiIn(List<String> values) {
            addCriterion("KPI_KPI in", values, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiNotIn(List<String> values) {
            addCriterion("KPI_KPI not in", values, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiBetween(String value1, String value2) {
            addCriterion("KPI_KPI between", value1, value2, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiKpiNotBetween(String value1, String value2) {
            addCriterion("KPI_KPI not between", value1, value2, "kpiKpi");
            return (Criteria) this;
        }

        public Criteria andKpiDetailIsNull() {
            addCriterion("KPI_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andKpiDetailIsNotNull() {
            addCriterion("KPI_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andKpiDetailEqualTo(String value) {
            addCriterion("KPI_DETAIL =", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailNotEqualTo(String value) {
            addCriterion("KPI_DETAIL <>", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailGreaterThan(String value) {
            addCriterion("KPI_DETAIL >", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_DETAIL >=", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailLessThan(String value) {
            addCriterion("KPI_DETAIL <", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailLessThanOrEqualTo(String value) {
            addCriterion("KPI_DETAIL <=", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailLike(String value) {
            addCriterion("KPI_DETAIL like", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailNotLike(String value) {
            addCriterion("KPI_DETAIL not like", value, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailIn(List<String> values) {
            addCriterion("KPI_DETAIL in", values, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailNotIn(List<String> values) {
            addCriterion("KPI_DETAIL not in", values, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailBetween(String value1, String value2) {
            addCriterion("KPI_DETAIL between", value1, value2, "kpiDetail");
            return (Criteria) this;
        }

        public Criteria andKpiDetailNotBetween(String value1, String value2) {
            addCriterion("KPI_DETAIL not between", value1, value2, "kpiDetail");
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

        public Criteria andCompanyIdEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(BigDecimal value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(BigDecimal value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeIsNull() {
            addCriterion("FINAL_UPDATA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeIsNotNull() {
            addCriterion("FINAL_UPDATA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeEqualTo(Date value) {
            addCriterion("FINAL_UPDATA_TIME =", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeNotEqualTo(Date value) {
            addCriterion("FINAL_UPDATA_TIME <>", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeGreaterThan(Date value) {
            addCriterion("FINAL_UPDATA_TIME >", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINAL_UPDATA_TIME >=", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeLessThan(Date value) {
            addCriterion("FINAL_UPDATA_TIME <", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINAL_UPDATA_TIME <=", value, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeIn(List<Date> values) {
            addCriterion("FINAL_UPDATA_TIME in", values, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeNotIn(List<Date> values) {
            addCriterion("FINAL_UPDATA_TIME not in", values, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("FINAL_UPDATA_TIME between", value1, value2, "finalUpdataTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINAL_UPDATA_TIME not between", value1, value2, "finalUpdataTime");
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