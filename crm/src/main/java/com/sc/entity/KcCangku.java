package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class KcCangku implements Serializable {
    private String cangkuId;

    private String cangkuName;

    private String cangkuNote;

    private Date cangkuLastModifyTime;

    private String companyId;

    private static final long serialVersionUID = 1L;

    public KcCangku(String cangkuId, String cangkuName, String cangkuNote, Date cangkuLastModifyTime, String companyId) {
        this.cangkuId = cangkuId;
        this.cangkuName = cangkuName;
        this.cangkuNote = cangkuNote;
        this.cangkuLastModifyTime = cangkuLastModifyTime;
        this.companyId = companyId;
    }

    public KcCangku() {
        super();
    }

    public String getCangkuId() {
        return cangkuId;
    }

    public void setCangkuId(String cangkuId) {
        this.cangkuId = cangkuId == null ? null : cangkuId.trim();
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }
}