package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JhCgdxq implements Serializable {
    private BigDecimal cgXqId;

    private Long cgdId;

    private BigDecimal cpId;

    private Long cpNumber;

    private String isRk;

    private String operator;

    private String remark;

    private BigDecimal gsId;

    private Date ltime;

    private String cpPrice;

    private static final long serialVersionUID = 1L;

    public JhCgdxq(BigDecimal cgXqId, Long cgdId, BigDecimal cpId, Long cpNumber, String isRk, String operator, String remark, BigDecimal gsId, Date ltime, String cpPrice) {
        this.cgXqId = cgXqId;
        this.cgdId = cgdId;
        this.cpId = cpId;
        this.cpNumber = cpNumber;
        this.isRk = isRk;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
        this.cpPrice = cpPrice;
    }

    public JhCgdxq() {
        super();
    }

    public BigDecimal getCgXqId() {
        return cgXqId;
    }

    public void setCgXqId(BigDecimal cgXqId) {
        this.cgXqId = cgXqId;
    }

    public Long getCgdId() {
        return cgdId;
    }

    public void setCgdId(Long cgdId) {
        this.cgdId = cgdId;
    }

    public BigDecimal getCpId() {
        return cpId;
    }

    public void setCpId(BigDecimal cpId) {
        this.cpId = cpId;
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

    public BigDecimal getGsId() {
        return gsId;
    }

    public void setGsId(BigDecimal gsId) {
        this.gsId = gsId;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getCpPrice() {
        return cpPrice;
    }

    public void setCpPrice(String cpPrice) {
        this.cpPrice = cpPrice == null ? null : cpPrice.trim();
    }
}