package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysDept implements Serializable {
    private Long deptId;

    private String deptName;

    private String beizhu;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changDate;

    @Override
	public String toString() {
		return "SysDept [deptId=" + deptId + ", deptName=" + deptName + ", beizhu=" + beizhu + ", companyId="
				+ companyId + ", changDate=" + changDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysDept(Long deptId, String deptName, String beizhu, Long companyId, Date changDate) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.beizhu = beizhu;
        this.companyId = companyId;
        this.changDate = changDate;
    }

    public SysDept() {
        super();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getChangDate() {
        return changDate;
    }

    public void setChangDate(Date changDate) {
        this.changDate = changDate;
    }
}