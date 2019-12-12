package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class SaleSoutOrder implements Serializable {
    private Long sorderId;

    private Date sorderDate;

    private String invoiceNum;

    private Long uid;

    private Long cid;

    private String samount;

    private String sstatus;

    private String isRebate;

    private String orderStatus;

    private String note;

    private Long companyId;

    private Date lastModifyTime;

    private static final long serialVersionUID = 1L;

    public SaleSoutOrder(Long sorderId, Date sorderDate, String invoiceNum, Long uid, Long cid, String samount, String sstatus, String isRebate, String orderStatus, String note, Long companyId, Date lastModifyTime) {
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

    public Long getSorderId() {
        return sorderId;
    }

    public void setSorderId(Long sorderId) {
        this.sorderId = sorderId;
    }

    public Date getSorderDate() {
        return sorderDate;
    }

    public void setSorderDate(Date sorderDate) {
        this.sorderDate = sorderDate;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum == null ? null : invoiceNum.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}