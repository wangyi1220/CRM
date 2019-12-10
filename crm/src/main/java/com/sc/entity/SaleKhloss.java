package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleKhloss implements Serializable {
    private Long khLossId;

    private Long userId;

    private Long operatorId;

    private String processingMode;

    private String treatmentMeasures;

    private String isLoss;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModified;

    @Override
	public String toString() {
		return "SaleKhloss [khLossId=" + khLossId + ", userId=" + userId + ", operatorId=" + operatorId
				+ ", processingMode=" + processingMode + ", treatmentMeasures=" + treatmentMeasures + ", isLoss="
				+ isLoss + ", companyId=" + companyId + ", lastModified=" + lastModified + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleKhloss(Long khLossId, Long userId, Long operatorId, String processingMode, String treatmentMeasures, String isLoss, Long companyId, Date lastModified) {
        this.khLossId = khLossId;
        this.userId = userId;
        this.operatorId = operatorId;
        this.processingMode = processingMode;
        this.treatmentMeasures = treatmentMeasures;
        this.isLoss = isLoss;
        this.companyId = companyId;
        this.lastModified = lastModified;
    }

    public SaleKhloss() {
        super();
    }

    public Long getKhLossId() {
        return khLossId;
    }

    public void setKhLossId(Long khLossId) {
        this.khLossId = khLossId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getProcessingMode() {
        return processingMode;
    }

    public void setProcessingMode(String processingMode) {
        this.processingMode = processingMode == null ? null : processingMode.trim();
    }

    public String getTreatmentMeasures() {
        return treatmentMeasures;
    }

    public void setTreatmentMeasures(String treatmentMeasures) {
        this.treatmentMeasures = treatmentMeasures == null ? null : treatmentMeasures.trim();
    }

    public String getIsLoss() {
        return isLoss;
    }

    public void setIsLoss(String isLoss) {
        this.isLoss = isLoss == null ? null : isLoss.trim();
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