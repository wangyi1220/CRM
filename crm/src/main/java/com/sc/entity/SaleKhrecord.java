package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleKhrecord implements Serializable {
    private Long contactRecordId;

    private String contactTitle;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date contactTime;

    private Long userId;

    private String contactContent;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModified;

    @Override
	public String toString() {
		return "SaleKhrecord [contactRecordId=" + contactRecordId + ", contactTitle=" + contactTitle + ", contactTime="
				+ contactTime + ", userId=" + userId + ", contactContent=" + contactContent + ", companyId=" + companyId
				+ ", lastModified=" + lastModified + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleKhrecord(Long contactRecordId, String contactTitle, Date contactTime, Long userId, String contactContent, Long companyId, Date lastModified) {
        this.contactRecordId = contactRecordId;
        this.contactTitle = contactTitle;
        this.contactTime = contactTime;
        this.userId = userId;
        this.contactContent = contactContent;
        this.companyId = companyId;
        this.lastModified = lastModified;
    }

    public SaleKhrecord() {
        super();
    }

    public Long getContactRecordId() {
        return contactRecordId;
    }

    public void setContactRecordId(Long contactRecordId) {
        this.contactRecordId = contactRecordId;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle == null ? null : contactTitle.trim();
    }

    public Date getContactTime() {
        return contactTime;
    }

    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent == null ? null : contactContent.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}