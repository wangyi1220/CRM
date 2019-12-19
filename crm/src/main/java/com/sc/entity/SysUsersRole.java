package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUsersRole implements Serializable {
    private Long surId;

    private Long usersId;

    private Long roleId;

    private Long opetaterId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    @Override
	public String toString() {
		return "SysUsersRole [surId=" + surId + ", usersId=" + usersId + ", roleId=" + roleId + ", opetaterId="
				+ opetaterId + ", changeDate=" + changeDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysUsersRole(Long surId, Long usersId, Long roleId, Long opetaterId, Date changeDate) {
        this.surId = surId;
        this.usersId = usersId;
        this.roleId = roleId;
        this.opetaterId = opetaterId;
        this.changeDate = changeDate;
    }

    public SysUsersRole() {
        super();
    }

    public Long getSurId() {
        return surId;
    }

    public void setSurId(Long surId) {
        this.surId = surId;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOpetaterId() {
        return opetaterId;
    }

    public void setOpetaterId(Long opetaterId) {
        this.opetaterId = opetaterId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}