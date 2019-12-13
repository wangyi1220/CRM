package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class KcGoods implements Serializable {
    private Long goodsId;//商品编号

    private String goodsName;//商品名称

    private String goodsKinds;//商品类别

    private String goodsSpecs;//规格说明

    private String unit;//单位

    private Long cangkuId;//仓库编号

    private String kcNum;//库存数量

    private String goodsCost;//成本价

    private String goodsPrice;//零售价

    private String goodsSellingPrice;//经销价

    private String note;//备注信息

    private Long companyId;//公司编号

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;//最后修改时间

    @Override
	public String toString() {
		return "KcGoods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsKinds=" + goodsKinds
				+ ", goodsSpecs=" + goodsSpecs + ", unit=" + unit + ", cangkuId=" + cangkuId + ", kcNum=" + kcNum
				+ ", goodsCost=" + goodsCost + ", goodsPrice=" + goodsPrice + ", goodsSellingPrice=" + goodsSellingPrice
				+ ", note=" + note + ", companyId=" + companyId + ", lastModifyTime=" + lastModifyTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public KcGoods(Long goodsId, String goodsName, String goodsKinds, String goodsSpecs, String unit, Long cangkuId, String kcNum, String goodsCost, String goodsPrice, String goodsSellingPrice, String note, Long companyId, Date lastModifyTime) {
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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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

    public Long getCangkuId() {
        return cangkuId;
    }

    public void setCangkuId(Long cangkuId) {
        this.cangkuId = cangkuId;
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