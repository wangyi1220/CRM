package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private Long logId;

    private Long userId;

    private String visitIp;

    private String power;

    private Date visitDate;

    private Long companyId;

    private static final long serialVersionUID = 1L;

    public SysLog(Long logId, Long userId, String visitIp, String power, Date visitDate, Long companyId) {
        this.logId = logId;
        this.userId = userId;
        this.visitIp = visitIp;
        this.power = power;
        this.visitDate = visitDate;
        this.companyId = companyId;
    }

    public SysLog() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}