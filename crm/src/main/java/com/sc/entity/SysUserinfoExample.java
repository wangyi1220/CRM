package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserinfoExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Long value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Long value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Long value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Long value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Long value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Long> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Long> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Long value1, Long value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Long value1, Long value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("EMP_SEX is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("EMP_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("EMP_SEX =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("EMP_SEX <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("EMP_SEX >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_SEX >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("EMP_SEX <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("EMP_SEX <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("EMP_SEX like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("EMP_SEX not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("EMP_SEX in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("EMP_SEX not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("EMP_SEX between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("EMP_SEX not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoIsNull() {
            addCriterion("EMP_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoIsNotNull() {
            addCriterion("EMP_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoEqualTo(String value) {
            addCriterion("EMP_PHOTO =", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoNotEqualTo(String value) {
            addCriterion("EMP_PHOTO <>", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoGreaterThan(String value) {
            addCriterion("EMP_PHOTO >", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PHOTO >=", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLessThan(String value) {
            addCriterion("EMP_PHOTO <", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLessThanOrEqualTo(String value) {
            addCriterion("EMP_PHOTO <=", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLike(String value) {
            addCriterion("EMP_PHOTO like", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoNotLike(String value) {
            addCriterion("EMP_PHOTO not like", value, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoIn(List<String> values) {
            addCriterion("EMP_PHOTO in", values, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoNotIn(List<String> values) {
            addCriterion("EMP_PHOTO not in", values, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBetween(String value1, String value2) {
            addCriterion("EMP_PHOTO between", value1, value2, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoNotBetween(String value1, String value2) {
            addCriterion("EMP_PHOTO not between", value1, value2, "empPhoto");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(Long value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(Long value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(Long value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(Long value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(Long value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<Long> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<Long> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(Long value1, Long value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(Long value1, Long value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andJiaxiangIsNull() {
            addCriterion("JIAXIANG is null");
            return (Criteria) this;
        }

        public Criteria andJiaxiangIsNotNull() {
            addCriterion("JIAXIANG is not null");
            return (Criteria) this;
        }

        public Criteria andJiaxiangEqualTo(String value) {
            addCriterion("JIAXIANG =", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangNotEqualTo(String value) {
            addCriterion("JIAXIANG <>", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangGreaterThan(String value) {
            addCriterion("JIAXIANG >", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangGreaterThanOrEqualTo(String value) {
            addCriterion("JIAXIANG >=", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangLessThan(String value) {
            addCriterion("JIAXIANG <", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangLessThanOrEqualTo(String value) {
            addCriterion("JIAXIANG <=", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangLike(String value) {
            addCriterion("JIAXIANG like", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangNotLike(String value) {
            addCriterion("JIAXIANG not like", value, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangIn(List<String> values) {
            addCriterion("JIAXIANG in", values, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangNotIn(List<String> values) {
            addCriterion("JIAXIANG not in", values, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangBetween(String value1, String value2) {
            addCriterion("JIAXIANG between", value1, value2, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andJiaxiangNotBetween(String value1, String value2) {
            addCriterion("JIAXIANG not between", value1, value2, "jiaxiang");
            return (Criteria) this;
        }

        public Criteria andXianzaiIsNull() {
            addCriterion("XIANZAI is null");
            return (Criteria) this;
        }

        public Criteria andXianzaiIsNotNull() {
            addCriterion("XIANZAI is not null");
            return (Criteria) this;
        }

        public Criteria andXianzaiEqualTo(String value) {
            addCriterion("XIANZAI =", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiNotEqualTo(String value) {
            addCriterion("XIANZAI <>", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiGreaterThan(String value) {
            addCriterion("XIANZAI >", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiGreaterThanOrEqualTo(String value) {
            addCriterion("XIANZAI >=", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiLessThan(String value) {
            addCriterion("XIANZAI <", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiLessThanOrEqualTo(String value) {
            addCriterion("XIANZAI <=", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiLike(String value) {
            addCriterion("XIANZAI like", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiNotLike(String value) {
            addCriterion("XIANZAI not like", value, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiIn(List<String> values) {
            addCriterion("XIANZAI in", values, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiNotIn(List<String> values) {
            addCriterion("XIANZAI not in", values, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiBetween(String value1, String value2) {
            addCriterion("XIANZAI between", value1, value2, "xianzai");
            return (Criteria) this;
        }

        public Criteria andXianzaiNotBetween(String value1, String value2) {
            addCriterion("XIANZAI not between", value1, value2, "xianzai");
            return (Criteria) this;
        }

        public Criteria andEmpEduIsNull() {
            addCriterion("EMP_EDU is null");
            return (Criteria) this;
        }

        public Criteria andEmpEduIsNotNull() {
            addCriterion("EMP_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEduEqualTo(String value) {
            addCriterion("EMP_EDU =", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduNotEqualTo(String value) {
            addCriterion("EMP_EDU <>", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduGreaterThan(String value) {
            addCriterion("EMP_EDU >", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_EDU >=", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduLessThan(String value) {
            addCriterion("EMP_EDU <", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduLessThanOrEqualTo(String value) {
            addCriterion("EMP_EDU <=", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduLike(String value) {
            addCriterion("EMP_EDU like", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduNotLike(String value) {
            addCriterion("EMP_EDU not like", value, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduIn(List<String> values) {
            addCriterion("EMP_EDU in", values, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduNotIn(List<String> values) {
            addCriterion("EMP_EDU not in", values, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduBetween(String value1, String value2) {
            addCriterion("EMP_EDU between", value1, value2, "empEdu");
            return (Criteria) this;
        }

        public Criteria andEmpEduNotBetween(String value1, String value2) {
            addCriterion("EMP_EDU not between", value1, value2, "empEdu");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIsNull() {
            addCriterion("ZHENGZHI is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIsNotNull() {
            addCriterion("ZHENGZHI is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiEqualTo(String value) {
            addCriterion("ZHENGZHI =", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotEqualTo(String value) {
            addCriterion("ZHENGZHI <>", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiGreaterThan(String value) {
            addCriterion("ZHENGZHI >", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGZHI >=", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiLessThan(String value) {
            addCriterion("ZHENGZHI <", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiLessThanOrEqualTo(String value) {
            addCriterion("ZHENGZHI <=", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiLike(String value) {
            addCriterion("ZHENGZHI like", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotLike(String value) {
            addCriterion("ZHENGZHI not like", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIn(List<String> values) {
            addCriterion("ZHENGZHI in", values, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotIn(List<String> values) {
            addCriterion("ZHENGZHI not in", values, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiBetween(String value1, String value2) {
            addCriterion("ZHENGZHI between", value1, value2, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotBetween(String value1, String value2) {
            addCriterion("ZHENGZHI not between", value1, value2, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNull() {
            addCriterion("GRADUATE is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("GRADUATE is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(String value) {
            addCriterion("GRADUATE =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(String value) {
            addCriterion("GRADUATE <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(String value) {
            addCriterion("GRADUATE >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATE >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(String value) {
            addCriterion("GRADUATE <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(String value) {
            addCriterion("GRADUATE <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLike(String value) {
            addCriterion("GRADUATE like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotLike(String value) {
            addCriterion("GRADUATE not like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<String> values) {
            addCriterion("GRADUATE in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<String> values) {
            addCriterion("GRADUATE not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(String value1, String value2) {
            addCriterion("GRADUATE between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(String value1, String value2) {
            addCriterion("GRADUATE not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIsNull() {
            addCriterion("ONLINE_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIsNotNull() {
            addCriterion("ONLINE_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactEqualTo(String value) {
            addCriterion("ONLINE_CONTACT =", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotEqualTo(String value) {
            addCriterion("ONLINE_CONTACT <>", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactGreaterThan(String value) {
            addCriterion("ONLINE_CONTACT >", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT >=", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLessThan(String value) {
            addCriterion("ONLINE_CONTACT <", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT <=", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLike(String value) {
            addCriterion("ONLINE_CONTACT like", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotLike(String value) {
            addCriterion("ONLINE_CONTACT not like", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIn(List<String> values) {
            addCriterion("ONLINE_CONTACT in", values, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotIn(List<String> values) {
            addCriterion("ONLINE_CONTACT not in", values, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT between", value1, value2, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT not between", value1, value2, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailIsNull() {
            addCriterion("ONLINE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailIsNotNull() {
            addCriterion("ONLINE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailEqualTo(String value) {
            addCriterion("ONLINE_DETAIL =", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailNotEqualTo(String value) {
            addCriterion("ONLINE_DETAIL <>", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailGreaterThan(String value) {
            addCriterion("ONLINE_DETAIL >", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_DETAIL >=", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailLessThan(String value) {
            addCriterion("ONLINE_DETAIL <", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_DETAIL <=", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailLike(String value) {
            addCriterion("ONLINE_DETAIL like", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailNotLike(String value) {
            addCriterion("ONLINE_DETAIL not like", value, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailIn(List<String> values) {
            addCriterion("ONLINE_DETAIL in", values, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailNotIn(List<String> values) {
            addCriterion("ONLINE_DETAIL not in", values, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailBetween(String value1, String value2) {
            addCriterion("ONLINE_DETAIL between", value1, value2, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineDetailNotBetween(String value1, String value2) {
            addCriterion("ONLINE_DETAIL not between", value1, value2, "onlineDetail");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNull() {
            addCriterion("CHECK_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("CHECK_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(String value) {
            addCriterion("CHECK_STATE =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(String value) {
            addCriterion("CHECK_STATE <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(String value) {
            addCriterion("CHECK_STATE >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATE >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(String value) {
            addCriterion("CHECK_STATE <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATE <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLike(String value) {
            addCriterion("CHECK_STATE like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotLike(String value) {
            addCriterion("CHECK_STATE not like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<String> values) {
            addCriterion("CHECK_STATE in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<String> values) {
            addCriterion("CHECK_STATE not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(String value1, String value2) {
            addCriterion("CHECK_STATE between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATE not between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Long value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Long value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Long value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Long value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Long> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Long> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andEmpStateIsNull() {
            addCriterion("EMP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andEmpStateIsNotNull() {
            addCriterion("EMP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStateEqualTo(String value) {
            addCriterion("EMP_STATE =", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateNotEqualTo(String value) {
            addCriterion("EMP_STATE <>", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateGreaterThan(String value) {
            addCriterion("EMP_STATE >", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_STATE >=", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateLessThan(String value) {
            addCriterion("EMP_STATE <", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateLessThanOrEqualTo(String value) {
            addCriterion("EMP_STATE <=", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateLike(String value) {
            addCriterion("EMP_STATE like", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateNotLike(String value) {
            addCriterion("EMP_STATE not like", value, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateIn(List<String> values) {
            addCriterion("EMP_STATE in", values, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateNotIn(List<String> values) {
            addCriterion("EMP_STATE not in", values, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateBetween(String value1, String value2) {
            addCriterion("EMP_STATE between", value1, value2, "empState");
            return (Criteria) this;
        }

        public Criteria andEmpStateNotBetween(String value1, String value2) {
            addCriterion("EMP_STATE not between", value1, value2, "empState");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BEIZHU =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BEIZHU <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BEIZHU >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHU >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BEIZHU <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BEIZHU <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BEIZHU like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BEIZHU not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BEIZHU in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BEIZHU not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BEIZHU between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BEIZHU not between", value1, value2, "beizhu");
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

        public Criteria andChangDateIsNull() {
            addCriterion("CHANG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChangDateIsNotNull() {
            addCriterion("CHANG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChangDateEqualTo(Date value) {
            addCriterion("CHANG_DATE =", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateNotEqualTo(Date value) {
            addCriterion("CHANG_DATE <>", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateGreaterThan(Date value) {
            addCriterion("CHANG_DATE >", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANG_DATE >=", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateLessThan(Date value) {
            addCriterion("CHANG_DATE <", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateLessThanOrEqualTo(Date value) {
            addCriterion("CHANG_DATE <=", value, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateIn(List<Date> values) {
            addCriterion("CHANG_DATE in", values, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateNotIn(List<Date> values) {
            addCriterion("CHANG_DATE not in", values, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateBetween(Date value1, Date value2) {
            addCriterion("CHANG_DATE between", value1, value2, "changDate");
            return (Criteria) this;
        }

        public Criteria andChangDateNotBetween(Date value1, Date value2) {
            addCriterion("CHANG_DATE not between", value1, value2, "changDate");
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