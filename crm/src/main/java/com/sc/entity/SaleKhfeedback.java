package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SaleKhfeedback implements Serializable {
    private Long feedbackRecorId;

    private String recordPriority;

    private Long userId;

    private String state;

    private String feedbackType;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date feedbackTime;

    private String feedbackReason;

    private String personInCharge;

    private String feedbackSource;

    private String feedbaclTheme;

    private String feedbackDiscribe;

    private String analysis;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModified;

    @Override
	public String toString() {
		return "SaleKhfeedback [feedbackRecorId=" + feedbackRecorId + ", recordPriority=" + recordPriority + ", userId="
				+ userId + ", state=" + state + ", feedbackType=" + feedbackType + ", feedbackTime=" + feedbackTime
				+ ", feedbackReason=" + feedbackReason + ", personInCharge=" + personInCharge + ", feedbackSource="
				+ feedbackSource + ", feedbaclTheme=" + feedbaclTheme + ", feedbackDiscribe=" + feedbackDiscribe
				+ ", analysis=" + analysis + ", companyId=" + companyId + ", lastModified=" + lastModified + "]";
	}

	private static final long serialVersionUID = 1L;

    public SaleKhfeedback(Long feedbackRecorId, String recordPriority, Long userId, String state, String feedbackType, Date feedbackTime, String feedbackReason, String personInCharge, String feedbackSource, String feedbaclTheme, String feedbackDiscribe, String analysis, Long companyId, Date lastModified) {
        this.feedbackRecorId = feedbackRecorId;
        this.recordPriority = recordPriority;
        this.userId = userId;
        this.state = state;
        this.feedbackType = feedbackType;
        this.feedbackTime = feedbackTime;
        this.feedbackReason = feedbackReason;
        this.personInCharge = personInCharge;
        this.feedbackSource = feedbackSource;
        this.feedbaclTheme = feedbaclTheme;
        this.feedbackDiscribe = feedbackDiscribe;
        this.analysis = analysis;
        this.companyId = companyId;
        this.lastModified = lastModified;
    }

    public SaleKhfeedback() {
        super();
    }

    public Long getFeedbackRecorId() {
        return feedbackRecorId;
    }

    public void setFeedbackRecorId(Long feedbackRecorId) {
        this.feedbackRecorId = feedbackRecorId;
    }

    public String getRecordPriority() {
        return recordPriority;
    }

    public void setRecordPriority(String recordPriority) {
        this.recordPriority = recordPriority == null ? null : recordPriority.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType == null ? null : feedbackType.trim();
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackReason() {
        return feedbackReason;
    }

    public void setFeedbackReason(String feedbackReason) {
        this.feedbackReason = feedbackReason == null ? null : feedbackReason.trim();
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge == null ? null : personInCharge.trim();
    }

    public String getFeedbackSource() {
        return feedbackSource;
    }

    public void setFeedbackSource(String feedbackSource) {
        this.feedbackSource = feedbackSource == null ? null : feedbackSource.trim();
    }

    public String getFeedbaclTheme() {
        return feedbaclTheme;
    }

    public void setFeedbaclTheme(String feedbaclTheme) {
        this.feedbaclTheme = feedbaclTheme == null ? null : feedbaclTheme.trim();
    }

    public String getFeedbackDiscribe() {
        return feedbackDiscribe;
    }

    public void setFeedbackDiscribe(String feedbackDiscribe) {
        this.feedbackDiscribe = feedbackDiscribe == null ? null : feedbackDiscribe.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
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