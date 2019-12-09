package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeTaskDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeTaskDetailExample() {
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

        public Criteria andTaskDetailIdIsNull() {
            addCriterion("TASK_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdIsNotNull() {
            addCriterion("TASK_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdEqualTo(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID =", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotEqualTo(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID <>", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdGreaterThan(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID >", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID >=", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdLessThan(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID <", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_DETAIL_ID <=", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdIn(List<BigDecimal> values) {
            addCriterion("TASK_DETAIL_ID in", values, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotIn(List<BigDecimal> values) {
            addCriterion("TASK_DETAIL_ID not in", values, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_DETAIL_ID between", value1, value2, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_DETAIL_ID not between", value1, value2, "taskDetailId");
            return (Criteria) this;
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

        public Criteria andTaskUserIdIsNull() {
            addCriterion("TASK_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdIsNotNull() {
            addCriterion("TASK_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdEqualTo(BigDecimal value) {
            addCriterion("TASK_USER_ID =", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotEqualTo(BigDecimal value) {
            addCriterion("TASK_USER_ID <>", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdGreaterThan(BigDecimal value) {
            addCriterion("TASK_USER_ID >", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_USER_ID >=", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdLessThan(BigDecimal value) {
            addCriterion("TASK_USER_ID <", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TASK_USER_ID <=", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdIn(List<BigDecimal> values) {
            addCriterion("TASK_USER_ID in", values, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotIn(List<BigDecimal> values) {
            addCriterion("TASK_USER_ID not in", values, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_USER_ID between", value1, value2, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TASK_USER_ID not between", value1, value2, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedIsNull() {
            addCriterion("TASK_ISFINSHED is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedIsNotNull() {
            addCriterion("TASK_ISFINSHED is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedEqualTo(String value) {
            addCriterion("TASK_ISFINSHED =", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedNotEqualTo(String value) {
            addCriterion("TASK_ISFINSHED <>", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedGreaterThan(String value) {
            addCriterion("TASK_ISFINSHED >", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ISFINSHED >=", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedLessThan(String value) {
            addCriterion("TASK_ISFINSHED <", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedLessThanOrEqualTo(String value) {
            addCriterion("TASK_ISFINSHED <=", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedLike(String value) {
            addCriterion("TASK_ISFINSHED like", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedNotLike(String value) {
            addCriterion("TASK_ISFINSHED not like", value, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedIn(List<String> values) {
            addCriterion("TASK_ISFINSHED in", values, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedNotIn(List<String> values) {
            addCriterion("TASK_ISFINSHED not in", values, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedBetween(String value1, String value2) {
            addCriterion("TASK_ISFINSHED between", value1, value2, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andTaskIsfinshedNotBetween(String value1, String value2) {
            addCriterion("TASK_ISFINSHED not between", value1, value2, "taskIsfinshed");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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