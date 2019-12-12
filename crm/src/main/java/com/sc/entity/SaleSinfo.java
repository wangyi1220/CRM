package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class SaleSinfo implements Serializable {
    private String sorderInfoId;

    private String sorderId;

    private String goodsId;

    private String goodsQuantity;

    private String goodsPrice;

    private String note;

    private String companyId;

    private Date lastModifyTime;

    private static final long serialVersionUID = 1L;

    public SaleSinfo(String sorderInfoId, String sorderId, String goodsId, String goodsQuantity, String goodsPrice, String note, String companyId, Date lastModifyTime) {
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

    public String getSorderInfoId() {
        return sorderInfoId;
    }

    public void setSorderInfoId(String sorderInfoId) {
        this.sorderInfoId = sorderInfoId == null ? null : sorderInfoId.trim();
    }

    public String getSorderId() {
        return sorderId;
    }

    public void setSorderId(String sorderId) {
        this.sorderId = sorderId == null ? null : sorderId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity == null ? null : goodsQuantity.trim();
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
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