package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleSoutOrder implements Serializable {
    private String sorderId;

    private String sorderDate;

    private String invoiceNum;

    private String uid;

    private String cid;

    private String samount;

    private String sstatus;

    private String isRebate;

    private String orderStatus;

    private String note;

    private String companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    @Override
	public String toString() {
		return "SaleSoutOrder [sorderId=" + sorderId + ", sorderDate=" + sorderDate + ", invoiceNum=" + invoiceNum
				+ ", uid=" + uid + ", cid=" + cid + ", samount=" + samount + ", sstatus=" + sstatus + ", isRebate="
				+ isRebate + ", orderStatus=" + orderStatus + ", note=" + note + ", companyId=" + companyId
				+ ", lastModifyTime=" + lastModifyTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleSoutOrder(String sorderId, String sorderDate, String invoiceNum, String uid, String cid, String samount, String sstatus, String isRebate, String orderStatus, String note, String companyId, Date lastModifyTime) {
        this.sorderId = sorderId;
        this.sorderDate = sorderDate;
        this.invoiceNum = invoiceNum;
        this.uid = uid;
        this.cid = cid;
        this.samount = samount;
        this.sstatus = sstatus;
        this.isRebate = isRebate;
        this.orderStatus = orderStatus;
        this.note = note;
        this.companyId = companyId;
        this.lastModifyTime = lastModifyTime;
    }

    public SaleSoutOrder() {
        super();
    }

    public String getSorderId() {
        return sorderId;
    }

    public void setSorderId(String sorderId) {
        this.sorderId = sorderId == null ? null : sorderId.trim();
    }

    public String getSorderDate() {
        return sorderDate;
    }

    public void setSorderDate(String sorderDate) {
        this.sorderDate = sorderDate == null ? null : sorderDate.trim();
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum == null ? null : invoiceNum.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getSamount() {
        return samount;
    }

    public void setSamount(String samount) {
        this.samount = samount == null ? null : samount.trim();
    }

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus == null ? null : sstatus.trim();
    }

    public String getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate == null ? null : isRebate.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}