package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class OffMess implements Serializable {
    private Long messid;

    private String title;//标题

    private String content;//内容

    private String sender;//发送人

    private Long companyid;//公司id

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;//最后修改时间
    
    //一对多关联查询start
    private List<OffMessdeta> offMessdeta;//在一的一方，配置另外多的集合
    
    
    private String  uanme;
    
    public String getUanme() {
		return uanme;
	}

	public void setUanme(String uanme) {
		this.uanme = uanme;
	}
    
	
	
	//一对一关联查询end
	

	

	

	public List<OffMessdeta> getOffMessdeta() {
		return offMessdeta;
	}

	public void setOffMessdeta(List<OffMessdeta> offMessdeta) {
		this.offMessdeta = offMessdeta;
	}

	@Override
	public String toString() {
		return "OffMess [messid=" + messid + ", title=" + title + ", content=" + content + ", sender=" + sender
				+ ", companyid=" + companyid + ", lasttime=" + lasttime + "]";
	}

	private static final long serialVersionUID = 1L;

    public OffMess(Long messid, String title, String content, String sender, Long companyid, Date lasttime) {
        this.messid = messid;
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffMess() {
        super();
    }

    public Long getMessid() {
        return messid;
    }

    public void setMessid(Long messid) {
        this.messid = messid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
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