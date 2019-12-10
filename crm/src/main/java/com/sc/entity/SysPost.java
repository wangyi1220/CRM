package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysPost implements Serializable {
    private Long postId;

    private String postName;

    private Long deptId;

    private String beizhu;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changDate;

    @Override
	public String toString() {
		return "SysPost [postId=" + postId + ", postName=" + postName + ", deptId=" + deptId + ", beizhu=" + beizhu
				+ ", companyId=" + companyId + ", changDate=" + changDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysPost(Long postId, String postName, Long deptId, String beizhu, Long companyId, Date changDate) {
        this.postId = postId;
        this.postName = postName;
        this.deptId = deptId;
        this.beizhu = beizhu;
        this.companyId = companyId;
        this.changDate = changDate;
    }

    public SysPost() {
        super();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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