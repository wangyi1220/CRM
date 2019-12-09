package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class KcGoods implements Serializable {
    private String goodsId;

    private String goodsName;

    private String goodsKinds;

    private String goodsSpecs;

    private String unit;

    private String cangkuId;

    private String kcNum;

    private String goodsCost;

    private String goodsPrice;

    private String goodsSellingPrice;

    private String note;

    private String companyId;

    private Date lastModifyTime;

    private static final long serialVersionUID = 1L;

    public KcGoods(String goodsId, String goodsName, String goodsKinds, String goodsSpecs, String unit, String cangkuId, String kcNum, String goodsCost, String goodsPrice, String goodsSellingPrice, String note, String companyId, Date lastModifyTime) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsKinds = goodsKinds;
        this.goodsSpecs = goodsSpecs;
        this.unit = unit;
        this.cangkuId = cangkuId;
        this.kcNum = kcNum;
        this.goodsCost = goodsCost;
        this.goodsPrice = goodsPrice;
        this.goodsSellingPrice = goodsSellingPrice;
        this.note = note;
        this.companyId = companyId;
        this.lastModifyTime = lastModifyTime;
    }

    public KcGoods() {
        super();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsKinds() {
        return goodsKinds;
    }

    public void setGoodsKinds(String goodsKinds) {
        this.goodsKinds = goodsKinds == null ? null : goodsKinds.trim();
    }

    public String getGoodsSpecs() {
        return goodsSpecs;
    }

    public void setGoodsSpecs(String goodsSpecs) {
        this.goodsSpecs = goodsSpecs == null ? null : goodsSpecs.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCangkuId() {
        return cangkuId;
    }

    public void setCangkuId(String cangkuId) {
        this.cangkuId = cangkuId == null ? null : cangkuId.trim();
    }

    public String getKcNum() {
        return kcNum;
    }

    public void setKcNum(String kcNum) {
        this.kcNum = kcNum == null ? null : kcNum.trim();
    }

    public String getGoodsCost() {
        return goodsCost;
    }

    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost == null ? null : goodsCost.trim();
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public String getGoodsSellingPrice() {
        return goodsSellingPrice;
    }

    public void setGoodsSellingPrice(String goodsSellingPrice) {
        this.goodsSellingPrice = goodsSellingPrice == null ? null : goodsSellingPrice.trim();
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