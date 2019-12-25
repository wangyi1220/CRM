package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleSoutOrder implements Serializable {
    private Long sorderId;//销售单编号--soid

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date sorderDate;//制单日期

    private String invoiceNum;//发票号码

    private Long uid;//用户编号

    private Long cid;//客户编号

    private String samount;//销售金额

    private String sstatus;//销售出库状态

    private String isRebate;//是否返利

    private String orderStatus;//订单状态

    private String note;//备注信息

    private Long companyId;//公司编号

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;//最后修改时间
     
    private List<SaleSinfo> saleSinfo;
    @Override
	public String toString() {
		return "SaleSoutOrder [sorderId=" + sorderId + ", sorderDate=" + sorderDate + ", invoiceNum=" + invoiceNum
				+ ", uid=" + uid + ", cid=" + cid + ", samount=" + samount + ", sstatus=" + sstatus + ", isRebate="
				+ isRebate + ", orderStatus=" + orderStatus + ", note=" + note + ", companyId=" + companyId
				+ ", lastModifyTime=" + lastModifyTime + "]";
	}

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
    
    

    public List<SaleSinfo> getSaleSinfo() {
		return saleSinfo;
	}

	public void setSaleSinfo(List<SaleSinfo> saleSinfo) {
		this.saleSinfo = saleSinfo;
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