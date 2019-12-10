package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JhXbh implements Serializable {
    private String xbhId;

    private String cpId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date jhTime;

    private String state;

    private String operator;

    private String remark;

    private String gsId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ltime;

    @Override
	public String toString() {
		return "JhXbh [xbhId=" + xbhId + ", cpId=" + cpId + ", jhTime=" + jhTime + ", state=" + state + ", operator="
				+ operator + ", remark=" + remark + ", gsId=" + gsId + ", ltime=" + ltime + "]";
	}

	private static final long serialVersionUID = 1L;

    public JhXbh(String xbhId, String cpId, Date jhTime, String state, String operator, String remark, String gsId, Date ltime) {
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

    public String getXbhId() {
        return xbhId;
    }

    public void setXbhId(String xbhId) {
        this.xbhId = xbhId == null ? null : xbhId.trim();
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId == null ? null : cpId.trim();
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