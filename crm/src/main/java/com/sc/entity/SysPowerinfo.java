package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysPowerinfo implements Serializable {
    private Long powerId;

    private String powerName;

    private String powerUrl;

    private Long powerColumnsId;

    private String remarks;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    private String powerCode;
    
    private String isHasPower;

    public String getIsHasPower() {
		return isHasPower;
	}

	public void setIsHasPower(String isHasPower) {
		this.isHasPower = isHasPower;
	}

	private static final long serialVersionUID = 1L;

    public SysPowerinfo(Long powerId, String powerName, String powerUrl, Long powerColumnsId, String remarks, Date changeDate, String powerCode) {
        this.powerId = powerId;
        this.powerName = powerName;
        this.powerUrl = powerUrl;
        this.powerColumnsId = powerColumnsId;
        this.remarks = remarks;
        this.changeDate = changeDate;
        this.powerCode = powerCode;
    }

    public SysPowerinfo() {
        super();
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl == null ? null : powerUrl.trim();
    }

    public Long getPowerColumnsId() {
        return powerColumnsId;
    }

    public void setPowerColumnsId(Long powerColumnsId) {
        this.powerColumnsId = powerColumnsId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getPowerCode() {
        return powerCode;
    }

    public void setPowerCode(String powerCode) {
        this.powerCode = powerCode == null ? null : powerCode.trim();
    }
}