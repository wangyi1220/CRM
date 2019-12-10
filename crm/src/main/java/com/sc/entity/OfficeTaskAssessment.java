package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OfficeTaskAssessment implements Serializable {
    private BigDecimal taskId;

    private String tsakTitle;

    private String taskConcreteContent;

    private String taskIssuer;

    private String taskKpi;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskStartTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskStopTime;

    private BigDecimal companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date finalUpdateTime;

    @Override
	public String toString() {
		return "OfficeTaskAssessment [taskId=" + taskId + ", tsakTitle=" + tsakTitle + ", taskConcreteContent="
				+ taskConcreteContent + ", taskIssuer=" + taskIssuer + ", taskKpi=" + taskKpi + ", taskStartTime="
				+ taskStartTime + ", taskStopTime=" + taskStopTime + ", companyId=" + companyId + ", finalUpdateTime="
				+ finalUpdateTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public OfficeTaskAssessment(BigDecimal taskId, String tsakTitle, String taskConcreteContent, String taskIssuer, String taskKpi, Date taskStartTime, Date taskStopTime, BigDecimal companyId, Date finalUpdateTime) {
        this.taskId = taskId;
        this.tsakTitle = tsakTitle;
        this.taskConcreteContent = taskConcreteContent;
        this.taskIssuer = taskIssuer;
        this.taskKpi = taskKpi;
        this.taskStartTime = taskStartTime;
        this.taskStopTime = taskStopTime;
        this.companyId = companyId;
        this.finalUpdateTime = finalUpdateTime;
    }

    public OfficeTaskAssessment() {
        super();
    }

    public BigDecimal getTaskId() {
        return taskId;
    }

    public void setTaskId(BigDecimal taskId) {
        this.taskId = taskId;
    }

    public String getTsakTitle() {
        return tsakTitle;
    }

    public void setTsakTitle(String tsakTitle) {
        this.tsakTitle = tsakTitle == null ? null : tsakTitle.trim();
    }

    public String getTaskConcreteContent() {
        return taskConcreteContent;
    }

    public void setTaskConcreteContent(String taskConcreteContent) {
        this.taskConcreteContent = taskConcreteContent == null ? null : taskConcreteContent.trim();
    }

    public String getTaskIssuer() {
        return taskIssuer;
    }

    public void setTaskIssuer(String taskIssuer) {
        this.taskIssuer = taskIssuer == null ? null : taskIssuer.trim();
    }

    public String getTaskKpi() {
        return taskKpi;
    }

    public void setTaskKpi(String taskKpi) {
        this.taskKpi = taskKpi == null ? null : taskKpi.trim();
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Date getTaskStopTime() {
        return taskStopTime;
    }

    public void setTaskStopTime(Date taskStopTime) {
        this.taskStopTime = taskStopTime;
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public Date getFinalUpdateTime() {
        return finalUpdateTime;
    }

    public void setFinalUpdateTime(Date finalUpdateTime) {
        this.finalUpdateTime = finalUpdateTime;
    }
}