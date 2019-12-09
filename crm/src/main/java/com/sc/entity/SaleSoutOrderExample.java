package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleSoutOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleSoutOrderExample() {
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

        public Criteria andSorderIdIsNull() {
            addCriterion("SORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSorderIdIsNotNull() {
            addCriterion("SORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSorderIdEqualTo(String value) {
            addCriterion("SORDER_ID =", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdNotEqualTo(String value) {
            addCriterion("SORDER_ID <>", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdGreaterThan(String value) {
            addCriterion("SORDER_ID >", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdGreaterThanOrEqualTo(String value) {
            addCriterion("SORDER_ID >=", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdLessThan(String value) {
            addCriterion("SORDER_ID <", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdLessThanOrEqualTo(String value) {
            addCriterion("SORDER_ID <=", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdLike(String value) {
            addCriterion("SORDER_ID like", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdNotLike(String value) {
            addCriterion("SORDER_ID not like", value, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdIn(List<String> values) {
            addCriterion("SORDER_ID in", values, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdNotIn(List<String> values) {
            addCriterion("SORDER_ID not in", values, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdBetween(String value1, String value2) {
            addCriterion("SORDER_ID between", value1, value2, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderIdNotBetween(String value1, String value2) {
            addCriterion("SORDER_ID not between", value1, value2, "sorderId");
            return (Criteria) this;
        }

        public Criteria andSorderDateIsNull() {
            addCriterion("SORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSorderDateIsNotNull() {
            addCriterion("SORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSorderDateEqualTo(String value) {
            addCriterion("SORDER_DATE =", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateNotEqualTo(String value) {
            addCriterion("SORDER_DATE <>", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateGreaterThan(String value) {
            addCriterion("SORDER_DATE >", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateGreaterThanOrEqualTo(String value) {
            addCriterion("SORDER_DATE >=", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateLessThan(String value) {
            addCriterion("SORDER_DATE <", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateLessThanOrEqualTo(String value) {
            addCriterion("SORDER_DATE <=", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateLike(String value) {
            addCriterion("SORDER_DATE like", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateNotLike(String value) {
            addCriterion("SORDER_DATE not like", value, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateIn(List<String> values) {
            addCriterion("SORDER_DATE in", values, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateNotIn(List<String> values) {
            addCriterion("SORDER_DATE not in", values, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateBetween(String value1, String value2) {
            addCriterion("SORDER_DATE between", value1, value2, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andSorderDateNotBetween(String value1, String value2) {
            addCriterion("SORDER_DATE not between", value1, value2, "sorderDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNull() {
            addCriterion("INVOICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNotNull() {
            addCriterion("INVOICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumEqualTo(String value) {
            addCriterion("INVOICE_NUM =", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotEqualTo(String value) {
            addCriterion("INVOICE_NUM <>", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThan(String value) {
            addCriterion("INVOICE_NUM >", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUM >=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThan(String value) {
            addCriterion("INVOICE_NUM <", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUM <=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLike(String value) {
            addCriterion("INVOICE_NUM like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotLike(String value) {
            addCriterion("INVOICE_NUM not like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIn(List<String> values) {
            addCriterion("INVOICE_NUM in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotIn(List<String> values) {
            addCriterion("INVOICE_NUM not in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumBetween(String value1, String value2) {
            addCriterion("INVOICE_NUM between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NUM not between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("CID like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("CID not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andSamountIsNull() {
            addCriterion("SAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSamountIsNotNull() {
            addCriterion("SAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSamountEqualTo(String value) {
            addCriterion("SAMOUNT =", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountNotEqualTo(String value) {
            addCriterion("SAMOUNT <>", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountGreaterThan(String value) {
            addCriterion("SAMOUNT >", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountGreaterThanOrEqualTo(String value) {
            addCriterion("SAMOUNT >=", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountLessThan(String value) {
            addCriterion("SAMOUNT <", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountLessThanOrEqualTo(String value) {
            addCriterion("SAMOUNT <=", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountLike(String value) {
            addCriterion("SAMOUNT like", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountNotLike(String value) {
            addCriterion("SAMOUNT not like", value, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountIn(List<String> values) {
            addCriterion("SAMOUNT in", values, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountNotIn(List<String> values) {
            addCriterion("SAMOUNT not in", values, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountBetween(String value1, String value2) {
            addCriterion("SAMOUNT between", value1, value2, "samount");
            return (Criteria) this;
        }

        public Criteria andSamountNotBetween(String value1, String value2) {
            addCriterion("SAMOUNT not between", value1, value2, "samount");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("SSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("SSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(String value) {
            addCriterion("SSTATUS =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(String value) {
            addCriterion("SSTATUS <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(String value) {
            addCriterion("SSTATUS >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SSTATUS >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(String value) {
            addCriterion("SSTATUS <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(String value) {
            addCriterion("SSTATUS <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLike(String value) {
            addCriterion("SSTATUS like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotLike(String value) {
            addCriterion("SSTATUS not like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<String> values) {
            addCriterion("SSTATUS in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<String> values) {
            addCriterion("SSTATUS not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(String value1, String value2) {
            addCriterion("SSTATUS between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(String value1, String value2) {
            addCriterion("SSTATUS not between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andIsRebateIsNull() {
            addCriterion("IS_REBATE is null");
            return (Criteria) this;
        }

        public Criteria andIsRebateIsNotNull() {
            addCriterion("IS_REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsRebateEqualTo(String value) {
            addCriterion("IS_REBATE =", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotEqualTo(String value) {
            addCriterion("IS_REBATE <>", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateGreaterThan(String value) {
            addCriterion("IS_REBATE >", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REBATE >=", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLessThan(String value) {
            addCriterion("IS_REBATE <", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLessThanOrEqualTo(String value) {
            addCriterion("IS_REBATE <=", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLike(String value) {
            addCriterion("IS_REBATE like", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotLike(String value) {
            addCriterion("IS_REBATE not like", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateIn(List<String> values) {
            addCriterion("IS_REBATE in", values, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotIn(List<String> values) {
            addCriterion("IS_REBATE not in", values, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateBetween(String value1, String value2) {
            addCriterion("IS_REBATE between", value1, value2, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotBetween(String value1, String value2) {
            addCriterion("IS_REBATE not between", value1, value2, "isRebate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
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