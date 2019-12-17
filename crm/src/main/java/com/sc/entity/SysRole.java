package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class SysRole implements Serializable {
    private Long roleId;

    private String roleName;

    private String roleDescribe;

    private Long superRoleId;
    
    private SysRole sysRole;

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	private Long operaterId;
	
	private String operaterName;

	private List<SysUserinfo> sysUserinfoes;
	
	private List<SysUsers> sysUsers;
	
    public List<SysUsers> getSysUsers() {
		return sysUsers;
	}

	public void setSysUsers(List<SysUsers> sysUsers) {
		this.sysUsers = sysUsers;
	}

	public List<SysUserinfo> getSysUserinfoes() {
		return sysUserinfoes;
	}

	public void setSysUserinfoes(List<SysUserinfo> sysUserinfoes) {
		this.sysUserinfoes = sysUserinfoes;
	}

	public String getOperaterName() {
		return operaterName;
	}

	public void setOperaterName(String operaterName) {
		this.operaterName = operaterName;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changeDate;
	

    @Override
	public String toString() {
		return "SysRole [roleId=" + roleId + ", roleName=" + roleName + ", roleDescribe=" + roleDescribe
				+ ", superRoleId=" + superRoleId + ", operaterId=" + operaterId + ", changeDate=" + changeDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysRole(Long roleId, String roleName, String roleDescribe, Long superRoleId, Long operaterId, Date changeDate) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescribe = roleDescribe;
        this.superRoleId = superRoleId;
        this.operaterId = operaterId;
        this.changeDate = changeDate;
    }

    public SysRole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }

    public Long getSuperRoleId() {
        return superRoleId;
    }

    public void setSuperRoleId(Long superRoleId) {
        this.superRoleId = superRoleId;
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