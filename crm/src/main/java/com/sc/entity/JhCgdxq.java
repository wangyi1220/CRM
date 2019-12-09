package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class JhCgdxq implements Serializable {
    private String cgXqId;

    private String cgdId;

    private String cpId;

    private Long cpNumber;

    private String isRk;

    private String operator;

    private String remark;

    private String gsId;

    private Date ltime;

    private static final long serialVersionUID = 1L;

    public JhCgdxq(String cgXqId, String cgdId, String cpId, Long cpNumber, String isRk, String operator, String remark, String gsId, Date ltime) {
        this.cgXqId = cgXqId;
        this.cgdId = cgdId;
        this.cpId = cpId;
        this.cpNumber = cpNumber;
        this.isRk = isRk;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
    }

    public JhCgdxq() {
        super();
    }

    public String getCgXqId() {
        return cgXqId;
    }

    public void setCgXqId(String cgXqId) {
        this.cgXqId = cgXqId == null ? null : cgXqId.trim();
    }

    public String getCgdId() {
        return cgdId;
    }

    public void setCgdId(String cgdId) {
        this.cgdId = cgdId == null ? null : cgdId.trim();
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId == null ? null : cpId.trim();
    }

    public Long getCpNumber() {
        return cpNumber;
    }

    public void setCpNumber(Long cpNumber) {
        this.cpNumber = cpNumber;
    }

    public String getIsRk() {
        return isRk;
    }

    public void setIsRk(String isRk) {
        this.isRk = isRk == null ? null : isRk.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getGsId() {
        return gsId;
    }

    public void setGsId(String gsId) {
        this.gsId = gsId == null ? null : gsId.trim();
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }
}