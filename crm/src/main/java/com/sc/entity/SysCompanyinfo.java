package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysCompanyinfo implements Serializable {
    private String pk;

    private String companyName;

    private String companyCode;

    private String email;

    private String contacts;

    private String companyAddress;

    private String fixedphone;

    private String mobilephone;

    private String fax;

    private String bankDeposit;

    private String bankAccount;

    private String effective;

    private String beizhu;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changDate;

    @Override
	public String toString() {
		return "SysCompanyinfo [pk=" + pk + ", companyName=" + companyName + ", companyCode=" + companyCode + ", email="
				+ email + ", contacts=" + contacts + ", companyAddress=" + companyAddress + ", fixedphone=" + fixedphone
				+ ", mobilephone=" + mobilephone + ", fax=" + fax + ", bankDeposit=" + bankDeposit + ", bankAccount="
				+ bankAccount + ", effective=" + effective + ", beizhu=" + beizhu + ", changDate=" + changDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysCompanyinfo(String pk, String companyName, String companyCode, String email, String contacts, String companyAddress, String fixedphone, String mobilephone, String fax, String bankDeposit, String bankAccount, String effective, String beizhu, Date changDate) {
        this.pk = pk;
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.email = email;
        this.contacts = contacts;
        this.companyAddress = companyAddress;
        this.fixedphone = fixedphone;
        this.mobilephone = mobilephone;
        this.fax = fax;
        this.bankDeposit = bankDeposit;
        this.bankAccount = bankAccount;
        this.effective = effective;
        this.beizhu = beizhu;
        this.changDate = changDate;
    }

    public SysCompanyinfo() {
        super();
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getFixedphone() {
        return fixedphone;
    }

    public void setFixedphone(String fixedphone) {
        this.fixedphone = fixedphone == null ? null : fixedphone.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBankDeposit() {
        return bankDeposit;
    }

    public void setBankDeposit(String bankDeposit) {
        this.bankDeposit = bankDeposit == null ? null : bankDeposit.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getChangDate() {
        return changDate;
    }

    public void setChangDate(Date changDate) {
        this.changDate = changDate;
    }
}