package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleSinfo implements Serializable {
    private Long sorderInfoId;

    private Long sorderId;

    private Long goodsId;

    private String goodsQuantity;

    private BigDecimal goodsPrice;

    private String note;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    @Override
	public String toString() {
		return "SaleSinfo [sorderInfoId=" + sorderInfoId + ", sorderId=" + sorderId + ", goodsId=" + goodsId
				+ ", goodsQuantity=" + goodsQuantity + ", goodsPrice=" + goodsPrice + ", note=" + note + ", companyId="
				+ companyId + ", lastModifyTime=" + lastModifyTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleSinfo(Long sorderInfoId, Long sorderId, Long goodsId, String goodsQuantity, BigDecimal goodsPrice, String note, Long companyId, Date lastModifyTime) {
        this.sorderInfoId = sorderInfoId;
        this.sorderId = sorderId;
        this.goodsId = goodsId;
        this.goodsQuantity = goodsQuantity;
        this.goodsPrice = goodsPrice;
        this.note = note;
        this.companyId = companyId;
        this.lastModifyTime = lastModifyTime;
    }

    public SaleSinfo() {
        super();
    }

    public Long getSorderInfoId() {
        return sorderInfoId;
    }

    public void setSorderInfoId(Long sorderInfoId) {
        this.sorderInfoId = sorderInfoId;
    }

    public Long getSorderId() {
        return sorderId;
    }

    public void setSorderId(Long sorderId) {
        this.sorderId = sorderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity == null ? null : goodsQuantity.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
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