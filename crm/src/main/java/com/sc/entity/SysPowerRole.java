package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysPowerRole implements Serializable {
    private Long id;

    private Long powerId;

    private Long roleId;

    private Long operaterId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    @Override
	public String toString() {
		return "SysPowerRole [id=" + id + ", powerId=" + powerId + ", roleId=" + roleId + ", operaterId=" + operaterId
				+ ", changeDate=" + changeDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysPowerRole(Long id, Long powerId, Long roleId, Long operaterId, Date changeDate) {
        this.id = id;
        this.powerId = powerId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.changeDate = changeDate;
    }

    public SysPowerRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}