package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeTaskAssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeTaskAssessmentExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(BigDecimal value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(BigDecimal value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(BigDecimal value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(BigDecimal value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<BigDecimal> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<BigDecimal> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTsakTitleIsNull() {
            addCriterion("TSAK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTsakTitleIsNotNull() {
            addCriterion("TSAK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTsakTitleEqualTo(String value) {
            addCriterion("TSAK_TITLE =", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleNotEqualTo(String value) {
            addCriterion("TSAK_TITLE <>", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleGreaterThan(String value) {
            addCriterion("TSAK_TITLE >", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TSAK_TITLE >=", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleLessThan(String value) {
            addCriterion("TSAK_TITLE <", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleLessThanOrEqualTo(String value) {
            addCriterion("TSAK_TITLE <=", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleLike(String value) {
            addCriterion("TSAK_TITLE like", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleNotLike(String value) {
            addCriterion("TSAK_TITLE not like", value, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleIn(List<String> values) {
            addCriterion("TSAK_TITLE in", values, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleNotIn(List<String> values) {
            addCriterion("TSAK_TITLE not in", values, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleBetween(String value1, String value2) {
            addCriterion("TSAK_TITLE between", value1, value2, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTsakTitleNotBetween(String value1, String value2) {
            addCriterion("TSAK_TITLE not between", value1, value2, "tsakTitle");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentIsNull() {
            addCriterion("TASK_CONCRETE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentIsNotNull() {
            addCriterion("TASK_CONCRETE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentEqualTo(String value) {
            addCriterion("TASK_CONCRETE_CONTENT =", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentNotEqualTo(String value) {
            addCriterion("TASK_CONCRETE_CONTENT <>", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentGreaterThan(String value) {
            addCriterion("TASK_CONCRETE_CONTENT >", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONCRETE_CONTENT >=", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentLessThan(String value) {
            addCriterion("TASK_CONCRETE_CONTENT <", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONCRETE_CONTENT <=", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentLike(String value) {
            addCriterion("TASK_CONCRETE_CONTENT like", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentNotLike(String value) {
            addCriterion("TASK_CONCRETE_CONTENT not like", value, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentIn(List<String> values) {
            addCriterion("TASK_CONCRETE_CONTENT in", values, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentNotIn(List<String> values) {
            addCriterion("TASK_CONCRETE_CONTENT not in", values, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentBetween(String value1, String value2) {
            addCriterion("TASK_CONCRETE_CONTENT between", value1, value2, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskConcreteContentNotBetween(String value1, String value2) {
            addCriterion("TASK_CONCRETE_CONTENT not between", value1, value2, "taskConcreteContent");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerIsNull() {
            addCriterion("TASK_ISSUER is null");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerIsNotNull() {
            addCriterion("TASK_ISSUER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerEqualTo(String value) {
            addCriterion("TASK_ISSUER =", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerNotEqualTo(String value) {
            addCriterion("TASK_ISSUER <>", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerGreaterThan(String value) {
            addCriterion("TASK_ISSUER >", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ISSUER >=", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerLessThan(String value) {
            addCriterion("TASK_ISSUER <", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerLessThanOrEqualTo(String value) {
            addCriterion("TASK_ISSUER <=", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerLike(String value) {
            addCriterion("TASK_ISSUER like", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerNotLike(String value) {
            addCriterion("TASK_ISSUER not like", value, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerIn(List<String> values) {
            addCriterion("TASK_ISSUER in", values, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerNotIn(List<String> values) {
            addCriterion("TASK_ISSUER not in", values, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerBetween(String value1, String value2) {
            addCriterion("TASK_ISSUER between", value1, value2, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskIssuerNotBetween(String value1, String value2) {
            addCriterion("TASK_ISSUER not between", value1, value2, "taskIssuer");
            return (Criteria) this;
        }

        public Criteria andTaskKpiIsNull() {
            addCriterion("TASK_KPI is null");
            return (Criteria) this;
        }

        public Criteria andTaskKpiIsNotNull() {
            addCriterion("TASK_KPI is not null");
            return (Criteria) this;
        }

        public Criteria andTaskKpiEqualTo(String value) {
            addCriterion("TASK_KPI =", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiNotEqualTo(String value) {
            addCriterion("TASK_KPI <>", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiGreaterThan(String value) {
            addCriterion("TASK_KPI >", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_KPI >=", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiLessThan(String value) {
            addCriterion("TASK_KPI <", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiLessThanOrEqualTo(String value) {
            addCriterion("TASK_KPI <=", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiLike(String value) {
            addCriterion("TASK_KPI like", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiNotLike(String value) {
            addCriterion("TASK_KPI not like", value, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiIn(List<String> values) {
            addCriterion("TASK_KPI in", values, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiNotIn(List<String> values) {
            addCriterion("TASK_KPI not in", values, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiBetween(String value1, String value2) {
            addCriterion("TASK_KPI between", value1, value2, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskKpiNotBetween(String value1, String value2) {
            addCriterion("TASK_KPI not between", value1, value2, "taskKpi");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("TASK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("TASK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(Date value) {
            addCriterion("TASK_START_TIME =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(Date value) {
            addCriterion("TASK_START_TIME <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(Date value) {
            addCriterion("TASK_START_TIME >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_START_TIME >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(Date value) {
            addCriterion("TASK_START_TIME <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_START_TIME <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<Date> values) {
            addCriterion("TASK_START_TIME in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<Date> values) {
            addCriterion("TASK_START_TIME not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_START_TIME between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_START_TIME not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeIsNull() {
            addCriterion("TASK_STOP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeIsNotNull() {
            addCriterion("TASK_STOP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeEqualTo(Date value) {
            addCriterion("TASK_STOP_TIME =", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeNotEqualTo(Date value) {
            addCriterion("TASK_STOP_TIME <>", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeGreaterThan(Date value) {
            addCriterion("TASK_STOP_TIME >", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_STOP_TIME >=", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeLessThan(Date value) {
            addCriterion("TASK_STOP_TIME <", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_STOP_TIME <=", value, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeIn(List<Date> values) {
            addCriterion("TASK_STOP_TIME in", values, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeNotIn(List<Date> values) {
            addCriterion("TASK_STOP_TIME not in", values, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_STOP_TIME between", value1, value2, "taskStopTime");
            return (Criteria) this;
        }

        public Criteria andTaskStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_STOP_TIME not between", value1, value2, "taskStopTime");
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

        public Criteria andFinalUpdateTimeIsNull() {
            addCriterion("FINAL_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeIsNotNull() {
            addCriterion("FINAL_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeEqualTo(Date value) {
            addCriterion("FINAL_UPDATE_TIME =", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotEqualTo(Date value) {
            addCriterion("FINAL_UPDATE_TIME <>", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeGreaterThan(Date value) {
            addCriterion("FINAL_UPDATE_TIME >", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINAL_UPDATE_TIME >=", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeLessThan(Date value) {
            addCriterion("FINAL_UPDATE_TIME <", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINAL_UPDATE_TIME <=", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeIn(List<Date> values) {
            addCriterion("FINAL_UPDATE_TIME in", values, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotIn(List<Date> values) {
            addCriterion("FINAL_UPDATE_TIME not in", values, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("FINAL_UPDATE_TIME between", value1, value2, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINAL_UPDATE_TIME not between", value1, value2, "finalUpdateTime");
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