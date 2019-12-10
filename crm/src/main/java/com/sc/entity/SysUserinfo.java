package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUserinfo implements Serializable {
    private Long empId;

    private String empName;

    private String empSex;

    private String empPhoto;

    private Long idNumber;

    private String jiaxiang;

    private String xianzai;

    private String empEdu;

    private String zhengzhi;

    private String graduate;

    private String phoneNumber;

    private String onlineContact;

    private String onlineDetail;

    private String checkState;

    private Long postId;

    private String empState;

    private String beizhu;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date changDate;

    @Override
	public String toString() {
		return "SysUserinfo [empId=" + empId + ", empName=" + empName + ", empSex=" + empSex + ", empPhoto=" + empPhoto
				+ ", idNumber=" + idNumber + ", jiaxiang=" + jiaxiang + ", xianzai=" + xianzai + ", empEdu=" + empEdu
				+ ", zhengzhi=" + zhengzhi + ", graduate=" + graduate + ", phoneNumber=" + phoneNumber
				+ ", onlineContact=" + onlineContact + ", onlineDetail=" + onlineDetail + ", checkState=" + checkState
				+ ", postId=" + postId + ", empState=" + empState + ", beizhu=" + beizhu + ", companyId=" + companyId
				+ ", changDate=" + changDate + "]";
	}

	private static final long serialVersionUID = 1L;

    public SysUserinfo(Long empId, String empName, String empSex, String empPhoto, Long idNumber, String jiaxiang, String xianzai, String empEdu, String zhengzhi, String graduate, String phoneNumber, String onlineContact, String onlineDetail, String checkState, Long postId, String empState, String beizhu, Long companyId, Date changDate) {
        this.empId = empId;
        this.empName = empName;
        this.empSex = empSex;
        this.empPhoto = empPhoto;
        this.idNumber = idNumber;
        this.jiaxiang = jiaxiang;
        this.xianzai = xianzai;
        this.empEdu = empEdu;
        this.zhengzhi = zhengzhi;
        this.graduate = graduate;
        this.phoneNumber = phoneNumber;
        this.onlineContact = onlineContact;
        this.onlineDetail = onlineDetail;
        this.checkState = checkState;
        this.postId = postId;
        this.empState = empState;
        this.beizhu = beizhu;
        this.companyId = companyId;
        this.changDate = changDate;
    }

    public SysUserinfo() {
        super();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public String getEmpPhoto() {
        return empPhoto;
    }

    public void setEmpPhoto(String empPhoto) {
        this.empPhoto = empPhoto == null ? null : empPhoto.trim();
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getJiaxiang() {
        return jiaxiang;
    }

    public void setJiaxiang(String jiaxiang) {
        this.jiaxiang = jiaxiang == null ? null : jiaxiang.trim();
    }

    public String getXianzai() {
        return xianzai;
    }

    public void setXianzai(String xianzai) {
        this.xianzai = xianzai == null ? null : xianzai.trim();
    }

    public String getEmpEdu() {
        return empEdu;
    }

    public void setEmpEdu(String empEdu) {
        this.empEdu = empEdu == null ? null : empEdu.trim();
    }

    public String getZhengzhi() {
        return zhengzhi;
    }

    public void setZhengzhi(String zhengzhi) {
        this.zhengzhi = zhengzhi == null ? null : zhengzhi.trim();
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate == null ? null : graduate.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getOnlineContact() {
        return onlineContact;
    }

    public void setOnlineContact(String onlineContact) {
        this.onlineContact = onlineContact == null ? null : onlineContact.trim();
    }

    public String getOnlineDetail() {
        return onlineDetail;
    }

    public void setOnlineDetail(String onlineDetail) {
        this.onlineDetail = onlineDetail == null ? null : onlineDetail.trim();
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState == null ? null : checkState.trim();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState == null ? null : empState.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getChangDate() {
        return changDate;
    }

    public void setChangDate(Date changDate) {
        this.changDate = changDate;
    }
}