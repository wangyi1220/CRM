package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleKhlossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleKhlossExample() {
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

        public Criteria andKhLossIdIsNull() {
            addCriterion("KH_LOSS_ID is null");
            return (Criteria) this;
        }

        public Criteria andKhLossIdIsNotNull() {
            addCriterion("KH_LOSS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKhLossIdEqualTo(Long value) {
            addCriterion("KH_LOSS_ID =", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdNotEqualTo(Long value) {
            addCriterion("KH_LOSS_ID <>", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdGreaterThan(Long value) {
            addCriterion("KH_LOSS_ID >", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdGreaterThanOrEqualTo(Long value) {
            addCriterion("KH_LOSS_ID >=", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdLessThan(Long value) {
            addCriterion("KH_LOSS_ID <", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdLessThanOrEqualTo(Long value) {
            addCriterion("KH_LOSS_ID <=", value, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdIn(List<Long> values) {
            addCriterion("KH_LOSS_ID in", values, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdNotIn(List<Long> values) {
            addCriterion("KH_LOSS_ID not in", values, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdBetween(Long value1, Long value2) {
            addCriterion("KH_LOSS_ID between", value1, value2, "khLossId");
            return (Criteria) this;
        }

        public Criteria andKhLossIdNotBetween(Long value1, Long value2) {
            addCriterion("KH_LOSS_ID not between", value1, value2, "khLossId");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andProcessingModeIsNull() {
            addCriterion("PROCESSING_MODE is null");
            return (Criteria) this;
        }

        public Criteria andProcessingModeIsNotNull() {
            addCriterion("PROCESSING_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingModeEqualTo(String value) {
            addCriterion("PROCESSING_MODE =", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeNotEqualTo(String value) {
            addCriterion("PROCESSING_MODE <>", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeGreaterThan(String value) {
            addCriterion("PROCESSING_MODE >", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSING_MODE >=", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeLessThan(String value) {
            addCriterion("PROCESSING_MODE <", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeLessThanOrEqualTo(String value) {
            addCriterion("PROCESSING_MODE <=", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeLike(String value) {
            addCriterion("PROCESSING_MODE like", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeNotLike(String value) {
            addCriterion("PROCESSING_MODE not like", value, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeIn(List<String> values) {
            addCriterion("PROCESSING_MODE in", values, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeNotIn(List<String> values) {
            addCriterion("PROCESSING_MODE not in", values, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeBetween(String value1, String value2) {
            addCriterion("PROCESSING_MODE between", value1, value2, "processingMode");
            return (Criteria) this;
        }

        public Criteria andProcessingModeNotBetween(String value1, String value2) {
            addCriterion("PROCESSING_MODE not between", value1, value2, "processingMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNull() {
            addCriterion("TREATMENT_MEASURES is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNotNull() {
            addCriterion("TREATMENT_MEASURES is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES =", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <>", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThan(String value) {
            addCriterion("TREATMENT_MEASURES >", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES >=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThan(String value) {
            addCriterion("TREATMENT_MEASURES <", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLike(String value) {
            addCriterion("TREATMENT_MEASURES like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotLike(String value) {
            addCriterion("TREATMENT_MEASURES not like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES not in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES not between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNull() {
            addCriterion("IS_LOSS is null");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNotNull() {
            addCriterion("IS_LOSS is not null");
            return (Criteria) this;
        }

        public Criteria andIsLossEqualTo(String value) {
            addCriterion("IS_LOSS =", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotEqualTo(String value) {
            addCriterion("IS_LOSS <>", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThan(String value) {
            addCriterion("IS_LOSS >", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOSS >=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThan(String value) {
            addCriterion("IS_LOSS <", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThanOrEqualTo(String value) {
            addCriterion("IS_LOSS <=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLike(String value) {
            addCriterion("IS_LOSS like", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotLike(String value) {
            addCriterion("IS_LOSS not like", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossIn(List<String> values) {
            addCriterion("IS_LOSS in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotIn(List<String> values) {
            addCriterion("IS_LOSS not in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossBetween(String value1, String value2) {
            addCriterion("IS_LOSS between", value1, value2, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotBetween(String value1, String value2) {
            addCriterion("IS_LOSS not between", value1, value2, "isLoss");
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