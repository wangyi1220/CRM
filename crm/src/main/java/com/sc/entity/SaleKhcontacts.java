package com.sc.entity;

import java.io.Serializable;

public class SaleKhcontacts implements Serializable {
    @Override
	public String toString() {
		return "SaleKhcontacts [contactId=" + contactId + ", userId=" + userId + ", contactName=" + contactName
				+ ", englishName=" + englishName + ", post=" + post + ", department=" + department + ", mphone="
				+ mphone + ", ophone=" + ophone + ", eMail=" + eMail + ", address=" + address + ", remarksInfo="
				+ remarksInfo + ", companyId=" + companyId + "]";
	}

	private Long contactId;

    private Long userId;

    private String contactName;

    private String englishName;

    private String post;

    private String department;

    private String mphone;

    private String ophone;

    private String eMail;

    private String address;

    private String remarksInfo;

    private Long companyId;

    private static final long serialVersionUID = 1L;

    public SaleKhcontacts(Long contactId, Long userId, String contactName, String englishName, String post, String department, String mphone, String ophone, String eMail, String address, String remarksInfo, Long companyId) {
        this.contactId = contactId;
        this.userId = userId;
        this.contactName = contactName;
        this.englishName = englishName;
        this.post = post;
        this.department = department;
        this.mphone = mphone;
        this.ophone = ophone;
        this.eMail = eMail;
        this.address = address;
        this.remarksInfo = remarksInfo;
        this.companyId = companyId;
    }

    public SaleKhcontacts() {
        super();
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemarksInfo() {
        return remarksInfo;
    }

    public void setRemarksInfo(String remarksInfo) {
        this.remarksInfo = remarksInfo == null ? null : remarksInfo.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}