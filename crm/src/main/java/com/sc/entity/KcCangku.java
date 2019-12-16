package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class KcCangku implements Serializable {
    private Long cangkuId;

    private String cangkuName;

    private String cangkuNote;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date cangkuLastModifyTime;

    @Override
	public String toString() {
		return "KcCangku [cangkuId=" + cangkuId + ", cangkuName=" + cangkuName + ", cangkuNote=" + cangkuNote
				+ ", cangkuLastModifyTime=" + cangkuLastModifyTime + ", companyId=" + companyId + "]";
	}

	private Long companyId;

    private static final long serialVersionUID = 1L;

    public KcCangku(Long cangkuId, String cangkuName, String cangkuNote, Date cangkuLastModifyTime, Long companyId) {
        this.cangkuId = cangkuId;
        this.cangkuName = cangkuName;
        this.cangkuNote = cangkuNote;
        this.cangkuLastModifyTime = cangkuLastModifyTime;
        this.companyId = companyId;
    }

    public KcCangku() {
        super();
    }

    public Long getCangkuId() {
        return cangkuId;
    }

    public void setCangkuId(Long cangkuId) {
        this.cangkuId = cangkuId;
    }

    public String getCangkuName() {
        return cangkuName;
    }

    public void setCangkuName(String cangkuName) {
        this.cangkuName = cangkuName == null ? null : cangkuName.trim();
    }

    public String getCangkuNote() {
        return cangkuNote;
    }

    public void setCangkuNote(String cangkuNote) {
        this.cangkuNote = cangkuNote == null ? null : cangkuNote.trim();
    }

    public Date getCangkuLastModifyTime() {
        return cangkuLastModifyTime;
    }

    public void setCangkuLastModifyTime(Date cangkuLastModifyTime) {
        this.cangkuLastModifyTime = cangkuLastModifyTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}