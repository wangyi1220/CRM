package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OfficeTaskDetail implements Serializable {
    private BigDecimal taskDetailId;

    private BigDecimal taskId;

    private BigDecimal taskUserId;

    private String taskIsfinshed;

    private String status;

    private BigDecimal companyId;
    
    private OfficeTaskAssessment  task;
    
    

    public OfficeTaskAssessment getTask() {
		return task;
	}

	public void setTask(OfficeTaskAssessment task) {
		this.task = task;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date finalUpdataTime;

    @Override
	public String toString() {
		return "OfficeTaskDetail [taskDetailId=" + taskDetailId + ", taskId=" + taskId + ", taskUserId=" + taskUserId
				+ ", taskIsfinshed=" + taskIsfinshed + ", status=" + status + ", companyId=" + companyId
				+ ", finalUpdataTime=" + finalUpdataTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public OfficeTaskDetail(BigDecimal taskDetailId, BigDecimal taskId, BigDecimal taskUserId, String taskIsfinshed, String status, BigDecimal companyId, Date finalUpdataTime) {
        this.taskDetailId = taskDetailId;
        this.taskId = taskId;
        this.taskUserId = taskUserId;
        this.taskIsfinshed = taskIsfinshed;
        this.status = status;
        this.companyId = companyId;
        this.finalUpdataTime = finalUpdataTime;
    }

    public OfficeTaskDetail() {
        super();
    }

    public BigDecimal getTaskDetailId() {
        return taskDetailId;
    }

    public void setTaskDetailId(BigDecimal taskDetailId) {
        this.taskDetailId = taskDetailId;
    }

    public BigDecimal getTaskId() {
        return taskId;
    }

    public void setTaskId(BigDecimal taskId) {
        this.taskId = taskId;
    }

    public BigDecimal getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(BigDecimal taskUserId) {
        this.taskUserId = taskUserId;
    }

    public String getTaskIsfinshed() {
        return taskIsfinshed;
    }

    public void setTaskIsfinshed(String taskIsfinshed) {
        this.taskIsfinshed = taskIsfinshed == null ? null : taskIsfinshed.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public Date getFinalUpdataTime() {
        return finalUpdataTime;
    }

    public void setFinalUpdataTime(Date finalUpdataTime) {
        this.finalUpdataTime = finalUpdataTime;
    }
}