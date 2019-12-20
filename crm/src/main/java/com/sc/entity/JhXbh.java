package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JhXbh implements Serializable {
    private BigDecimal xbhId;

    private BigDecimal cpId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date jhTime;

    private String state;

    private String operator;

    private String remark;

    private BigDecimal gsId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ltime;

    @Override
	public String toString() {
		return "JhXbh [xbhId=" + xbhId + ", cpId=" + cpId + ", jhTime=" + jhTime + ", state=" + state + ", operator="
				+ operator + ", remark=" + remark + ", gsId=" + gsId + ", ltime=" + ltime + "]";
	}

	private static final long serialVersionUID = 1L;

    public JhXbh(BigDecimal xbhId, BigDecimal cpId, Date jhTime, String state, String operator, String remark, BigDecimal gsId, Date ltime) {
        this.xbhId = xbhId;
        this.cpId = cpId;
        this.jhTime = jhTime;
        this.state = state;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
    }

    public JhXbh() {
        super();
    }

    public BigDecimal getXbhId() {
        return xbhId;
    }

    public void setXbhId(BigDecimal xbhId) {
        this.xbhId = xbhId;
    }

    public BigDecimal getCpId() {
        return cpId;
    }

    public void setCpId(BigDecimal cpId) {
        this.cpId = cpId;
    }

    public Date getJhTime() {
        return jhTime;
    }

    public void setJhTime(Date jhTime) {
        this.jhTime = jhTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}