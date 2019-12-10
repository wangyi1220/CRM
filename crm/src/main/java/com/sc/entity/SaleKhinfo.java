package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleKhinfo implements Serializable {
    private Long userId;

    private String userName;

    private String userAttribute;

    private String web;

    private String stockCode;

    private String superiorUnit;

    private String owner;

    private String employeesNumber;

    private Long industryId;

    private String userType;

    private String userState;

    private String userSource;

    private Long chargeId;

    private String gdphone;

    private String mphone;

    private String userFax;

    private String depositBank;

    private String bankAccount;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date nextContactTime;

    private String eMail;

    private String sicCode;

    private String payMethod;

    private String isEffective;

    private String detailedAddress;

    private String remarksInfo;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModified;

    @Override
	public String toString() {
		return "SaleKhinfo [userId=" + userId + ", userName=" + userName + ", userAttribute=" + userAttribute + ", web="
				+ web + ", stockCode=" + stockCode + ", superiorUnit=" + superiorUnit + ", owner=" + owner
				+ ", employeesNumber=" + employeesNumber + ", industryId=" + industryId + ", userType=" + userType
				+ ", userState=" + userState + ", userSource=" + userSource + ", chargeId=" + chargeId + ", gdphone="
				+ gdphone + ", mphone=" + mphone + ", userFax=" + userFax + ", depositBank=" + depositBank
				+ ", bankAccount=" + bankAccount + ", nextContactTime=" + nextContactTime + ", eMail=" + eMail
				+ ", sicCode=" + sicCode + ", payMethod=" + payMethod + ", isEffective=" + isEffective
				+ ", detailedAddress=" + detailedAddress + ", remarksInfo=" + remarksInfo + ", companyId=" + companyId
				+ ", lastModified=" + lastModified + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleKhinfo(Long userId, String userName, String userAttribute, String web, String stockCode, String superiorUnit, String owner, String employeesNumber, Long industryId, String userType, String userState, String userSource, Long chargeId, String gdphone, String mphone, String userFax, String depositBank, String bankAccount, Date nextContactTime, String eMail, String sicCode, String payMethod, String isEffective, String detailedAddress, String remarksInfo, Long companyId, Date lastModified) {
        this.userId = userId;
        this.userName = userName;
        this.userAttribute = userAttribute;
        this.web = web;
        this.stockCode = stockCode;
        this.superiorUnit = superiorUnit;
        this.owner = owner;
        this.employeesNumber = employeesNumber;
        this.industryId = industryId;
        this.userType = userType;
        this.userState = userState;
        this.userSource = userSource;
        this.chargeId = chargeId;
        this.gdphone = gdphone;
        this.mphone = mphone;
        this.userFax = userFax;
        this.depositBank = depositBank;
        this.bankAccount = bankAccount;
        this.nextContactTime = nextContactTime;
        this.eMail = eMail;
        this.sicCode = sicCode;
        this.payMethod = payMethod;
        this.isEffective = isEffective;
        this.detailedAddress = detailedAddress;
        this.remarksInfo = remarksInfo;
        this.companyId = companyId;
        this.lastModified = lastModified;
    }

    public SaleKhinfo() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAttribute() {
        return userAttribute;
    }

    public void setUserAttribute(String userAttribute) {
        this.userAttribute = userAttribute == null ? null : userAttribute.trim();
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getSuperiorUnit() {
        return superiorUnit;
    }

    public void setSuperiorUnit(String superiorUnit) {
        this.superiorUnit = superiorUnit == null ? null : superiorUnit.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber == null ? null : employeesNumber.trim();
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource == null ? null : userSource.trim();
    }

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public String getGdphone() {
        return gdphone;
    }

    public void setGdphone(String gdphone) {
        this.gdphone = gdphone == null ? null : gdphone.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getUserFax() {
        return userFax;
    }

    public void setUserFax(String userFax) {
        this.userFax = userFax == null ? null : userFax.trim();
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank == null ? null : depositBank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Date getNextContactTime() {
        return nextContactTime;
    }

    public void setNextContactTime(Date nextContactTime) {
        this.nextContactTime = nextContactTime;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode == null ? null : sicCode.trim();
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
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

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}