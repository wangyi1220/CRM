package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OffMessdeta implements Serializable {
    private Long detailsid;

    private Long messid;

    private Long receiverid;

    private String messstate;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;
    
    //一对一关联查询start
    private OffMess offMess;
    
    public OffMess getOffMess() {
		return offMess;
	}

	public void setOffMess(OffMess offMess) {
		this.offMess = offMess;
	}
    
    //一对一关联查询end

   

	@Override
	public String toString() {
		return "OffMessdeta [detailsid=" + detailsid + ", messid=" + messid + ", receiverid=" + receiverid
				+ ", messstate=" + messstate + ", companyid=" + companyid + ", lasttime=" + lasttime + "]";
	}

	private static final long serialVersionUID = 1L;

    public OffMessdeta(Long detailsid, Long messid, Long receiverid, String messstate, Long companyid, Date lasttime) {
        this.detailsid = detailsid;
        this.messid = messid;
        this.receiverid = receiverid;
        this.messstate = messstate;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffMessdeta() {
        super();
    }

    public Long getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(Long detailsid) {
        this.detailsid = detailsid;
    }

    public Long getMessid() {
        return messid;
    }

    public void setMessid(Long messid) {
        this.messid = messid;
    }

    public Long getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Long receiverid) {
        this.receiverid = receiverid;
    }

    public String getMessstate() {
        return messstate;
    }

    public void setMessstate(String messstate) {
        this.messstate = messstate == null ? null : messstate.trim();
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}