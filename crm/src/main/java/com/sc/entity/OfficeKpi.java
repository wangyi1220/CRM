package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OfficeKpi implements Serializable {
    private BigDecimal kpiId;

    private String kpiKpi;

    private String kpiDetail;

    private BigDecimal companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date finalUpdataTime;

    @Override
	public String toString() {
		return "OfficeKpi [kpiId=" + kpiId + ", kpiKpi=" + kpiKpi + ", kpiDetail=" + kpiDetail + ", companyId="
				+ companyId + ", finalUpdataTime=" + finalUpdataTime + "]";
	}

	private static final long serialVersionUID = 1L;

    public OfficeKpi(BigDecimal kpiId, String kpiKpi, String kpiDetail, BigDecimal companyId, Date finalUpdataTime) {
        this.kpiId = kpiId;
        this.kpiKpi = kpiKpi;
        this.kpiDetail = kpiDetail;
        this.companyId = companyId;
        this.finalUpdataTime = finalUpdataTime;
    }

    public OfficeKpi() {
        super();
    }

    public BigDecimal getKpiId() {
        return kpiId;
    }

    public void setKpiId(BigDecimal kpiId) {
        this.kpiId = kpiId;
    }

    public String getKpiKpi() {
        return kpiKpi;
    }

    public void setKpiKpi(String kpiKpi) {
        this.kpiKpi = kpiKpi == null ? null : kpiKpi.trim();
    }

    public String getKpiDetail() {
        return kpiDetail;
    }

    public void setKpiDetail(String kpiDetail) {
        this.kpiDetail = kpiDetail == null ? null : kpiDetail.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public Date getFinalUpdataTime() {
        return finalUpdataTime;
    }

    public void setFinalUpdataTime(Date finalUpdataTime) {
        this.finalUpdataTime = finalUpdataTime;
    }
}