package com.sc.entity;

import java.io.Serializable;

public class OOfficePerSche implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//涓婚敭id
	private String title;//鏍囬
	private String start;//寮�濮嬫椂闂�
	private String end;//缁撴潫鏃堕棿
	private String fullname;//璺熸爣棰樹竴鏍峰唴瀹�
	private String confname;//閲嶈绋嬪害
	private String confshortname;//鏆傛湭浣跨敤锛氶粯璁1
	private String allDay;//鏆傛湭浣跨敤锛氶粯璁�0
	private String topic;//鏆傛湭浣跨敤锛氶粯璁も�榙asd鈥�
	private String description;//澶囨敞鍐呭
	private String uid;//鐢ㄦ埛id
	private String cid;//鐢ㄦ埛鍏徃id
	private String lasttime;//鏈�鍚庝慨鏀规椂闂�

	// Constructors

	/** default constructor */
	public OOfficePerSche() {
	}

	/** full constructor */
	public OOfficePerSche(String title, String start, String end,
			String fullname, String confname, String confshortname,
			String allDay, String topic, String description, String uid,
			String cid, String lasttime) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.fullname = fullname;
		this.confname = confname;
		this.confshortname = confshortname;
		this.allDay = allDay;
		this.topic = topic;
		this.description = description;
		this.uid = uid;
		this.cid = cid;
		this.lasttime = lasttime;
	}

	// Property accessors
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getConfname() {
		return this.confname;
	}

	public void setConfname(String confname) {
		this.confname = confname;
	}


	public String getConfshortname() {
		return this.confshortname;
	}

	public void setConfshortname(String confshortname) {
		this.confshortname = confshortname;
	}


	public String getAllDay() {
		return this.allDay;
	}

	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}


	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	
	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getLasttime() {
		return this.lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	@Override
	public String toString() {
		return "OOfficePerSche [id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + ", fullname="
				+ fullname + ", confname=" + confname + ", confshortname=" + confshortname + ", allDay=" + allDay
				+ ", topic=" + topic + ", description=" + description + ", uid=" + uid + ", cid=" + cid + ", lasttime="
				+ lasttime + "]";
	}
	
	
    
}