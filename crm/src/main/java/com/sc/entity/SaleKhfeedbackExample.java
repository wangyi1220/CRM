package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleKhfeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleKhfeedbackExample() {
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

        public Criteria andFeedbackRecorIdIsNull() {
            addCriterion("FEEDBACK_RECOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdIsNotNull() {
            addCriterion("FEEDBACK_RECOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdEqualTo(Long value) {
            addCriterion("FEEDBACK_RECOR_ID =", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdNotEqualTo(Long value) {
            addCriterion("FEEDBACK_RECOR_ID <>", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdGreaterThan(Long value) {
            addCriterion("FEEDBACK_RECOR_ID >", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_RECOR_ID >=", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdLessThan(Long value) {
            addCriterion("FEEDBACK_RECOR_ID <", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdLessThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_RECOR_ID <=", value, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdIn(List<Long> values) {
            addCriterion("FEEDBACK_RECOR_ID in", values, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdNotIn(List<Long> values) {
            addCriterion("FEEDBACK_RECOR_ID not in", values, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_RECOR_ID between", value1, value2, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecorIdNotBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_RECOR_ID not between", value1, value2, "feedbackRecorId");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIsNull() {
            addCriterion("RECORD_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIsNotNull() {
            addCriterion("RECORD_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityEqualTo(String value) {
            addCriterion("RECORD_PRIORITY =", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotEqualTo(String value) {
            addCriterion("RECORD_PRIORITY <>", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityGreaterThan(String value) {
            addCriterion("RECORD_PRIORITY >", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_PRIORITY >=", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLessThan(String value) {
            addCriterion("RECORD_PRIORITY <", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLessThanOrEqualTo(String value) {
            addCriterion("RECORD_PRIORITY <=", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLike(String value) {
            addCriterion("RECORD_PRIORITY like", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotLike(String value) {
            addCriterion("RECORD_PRIORITY not like", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIn(List<String> values) {
            addCriterion("RECORD_PRIORITY in", values, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotIn(List<String> values) {
            addCriterion("RECORD_PRIORITY not in", values, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityBetween(String value1, String value2) {
            addCriterion("RECORD_PRIORITY between", value1, value2, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotBetween(String value1, String value2) {
            addCriterion("RECORD_PRIORITY not between", value1, value2, "recordPriority");
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNull() {
            addCriterion("FEEDBACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNotNull() {
            addCriterion("FEEDBACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE =", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <>", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThan(String value) {
            addCriterion("FEEDBACK_TYPE >", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE >=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThan(String value) {
            addCriterion("FEEDBACK_TYPE <", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLike(String value) {
            addCriterion("FEEDBACK_TYPE like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotLike(String value) {
            addCriterion("FEEDBACK_TYPE not like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE not in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE not between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Date value) {
            addCriterion("FEEDBACK_TIME >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Date value) {
            addCriterion("FEEDBACK_TIME <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNull() {
            addCriterion("FEEDBACK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNotNull() {
            addCriterion("FEEDBACK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonEqualTo(String value) {
            addCriterion("FEEDBACK_REASON =", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <>", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThan(String value) {
            addCriterion("FEEDBACK_REASON >", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON >=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThan(String value) {
            addCriterion("FEEDBACK_REASON <", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLike(String value) {
            addCriterion("FEEDBACK_REASON like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotLike(String value) {
            addCriterion("FEEDBACK_REASON not like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIn(List<String> values) {
            addCriterion("FEEDBACK_REASON in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotIn(List<String> values) {
            addCriterion("FEEDBACK_REASON not in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON not between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIsNull() {
            addCriterion("PERSON_IN_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIsNotNull() {
            addCriterion("PERSON_IN_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeEqualTo(String value) {
            addCriterion("PERSON_IN_CHARGE =", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotEqualTo(String value) {
            addCriterion("PERSON_IN_CHARGE <>", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeGreaterThan(String value) {
            addCriterion("PERSON_IN_CHARGE >", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_IN_CHARGE >=", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLessThan(String value) {
            addCriterion("PERSON_IN_CHARGE <", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLessThanOrEqualTo(String value) {
            addCriterion("PERSON_IN_CHARGE <=", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLike(String value) {
            addCriterion("PERSON_IN_CHARGE like", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotLike(String value) {
            addCriterion("PERSON_IN_CHARGE not like", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIn(List<String> values) {
            addCriterion("PERSON_IN_CHARGE in", values, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotIn(List<String> values) {
            addCriterion("PERSON_IN_CHARGE not in", values, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeBetween(String value1, String value2) {
            addCriterion("PERSON_IN_CHARGE between", value1, value2, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotBetween(String value1, String value2) {
            addCriterion("PERSON_IN_CHARGE not between", value1, value2, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIsNull() {
            addCriterion("FEEDBACK_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIsNotNull() {
            addCriterion("FEEDBACK_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE =", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE <>", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceGreaterThan(String value) {
            addCriterion("FEEDBACK_SOURCE >", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE >=", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLessThan(String value) {
            addCriterion("FEEDBACK_SOURCE <", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE <=", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLike(String value) {
            addCriterion("FEEDBACK_SOURCE like", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotLike(String value) {
            addCriterion("FEEDBACK_SOURCE not like", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIn(List<String> values) {
            addCriterion("FEEDBACK_SOURCE in", values, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotIn(List<String> values) {
            addCriterion("FEEDBACK_SOURCE not in", values, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceBetween(String value1, String value2) {
            addCriterion("FEEDBACK_SOURCE between", value1, value2, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_SOURCE not between", value1, value2, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeIsNull() {
            addCriterion("FEEDBACL_THEME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeIsNotNull() {
            addCriterion("FEEDBACL_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeEqualTo(String value) {
            addCriterion("FEEDBACL_THEME =", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeNotEqualTo(String value) {
            addCriterion("FEEDBACL_THEME <>", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeGreaterThan(String value) {
            addCriterion("FEEDBACL_THEME >", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACL_THEME >=", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeLessThan(String value) {
            addCriterion("FEEDBACL_THEME <", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACL_THEME <=", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeLike(String value) {
            addCriterion("FEEDBACL_THEME like", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeNotLike(String value) {
            addCriterion("FEEDBACL_THEME not like", value, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeIn(List<String> values) {
            addCriterion("FEEDBACL_THEME in", values, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeNotIn(List<String> values) {
            addCriterion("FEEDBACL_THEME not in", values, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeBetween(String value1, String value2) {
            addCriterion("FEEDBACL_THEME between", value1, value2, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbaclThemeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACL_THEME not between", value1, value2, "feedbaclTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeIsNull() {
            addCriterion("FEEDBACK_DISCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeIsNotNull() {
            addCriterion("FEEDBACK_DISCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeEqualTo(String value) {
            addCriterion("FEEDBACK_DISCRIBE =", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeNotEqualTo(String value) {
            addCriterion("FEEDBACK_DISCRIBE <>", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeGreaterThan(String value) {
            addCriterion("FEEDBACK_DISCRIBE >", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DISCRIBE >=", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeLessThan(String value) {
            addCriterion("FEEDBACK_DISCRIBE <", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DISCRIBE <=", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeLike(String value) {
            addCriterion("FEEDBACK_DISCRIBE like", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeNotLike(String value) {
            addCriterion("FEEDBACK_DISCRIBE not like", value, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeIn(List<String> values) {
            addCriterion("FEEDBACK_DISCRIBE in", values, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeNotIn(List<String> values) {
            addCriterion("FEEDBACK_DISCRIBE not in", values, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DISCRIBE between", value1, value2, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDiscribeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DISCRIBE not between", value1, value2, "feedbackDiscribe");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("\"ANALYSIS \" is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("\"ANALYSIS \" is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("\"ANALYSIS \" =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("\"ANALYSIS \" <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("\"ANALYSIS \" >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("\"ANALYSIS \" >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("\"ANALYSIS \" <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("\"ANALYSIS \" <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("\"ANALYSIS \" like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("\"ANALYSIS \" not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("\"ANALYSIS \" in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("\"ANALYSIS \" not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("\"ANALYSIS \" between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("\"ANALYSIS \" not between", value1, value2, "analysis");
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