package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class SysPowerColumns implements Serializable {
    private Long columnsId;

    private String columnsName;

    private String remarks;

    private Date changeDate;

    private static final long serialVersionUID = 1L;

    public SysPowerColumns(Long columnsId, String columnsName, String remarks, Date changeDate) {
        this.columnsId = columnsId;
        this.columnsName = columnsName;
        this.remarks = remarks;
        this.changeDate = changeDate;
    }

    public SysPowerColumns() {
        super();
    }

    public Long getColumnsId() {
        return columnsId;
    }

    public void setColumnsId(Long columnsId) {
        this.columnsId = columnsId;
    }

    public String getColumnsName() {
        return columnsName;
    }

    public void setColumnsName(String columnsName) {
        this.columnsName = columnsName == null ? null : columnsName.trim();
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
}