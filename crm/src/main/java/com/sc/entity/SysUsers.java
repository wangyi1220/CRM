package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUsers implements Serializable {
    private Long usersId;

    private String usersName;

    private String usersPassword;

    private Long empId;

    private Long companyId;

    private String usersState;

    private Date changeDate;

    private static final long serialVersionUID = 1L;

    public SysUsers(Long usersId, String usersName, String usersPassword, Long empId, Long companyId, String usersState, Date changeDate) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersPassword = usersPassword;
        this.empId = empId;
        this.companyId = companyId;
        this.usersState = usersState;
        this.changeDate = changeDate;
    }

    public SysUsers() {
        super();
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName == null ? null : usersName.trim();
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword == null ? null : usersPassword.trim();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getUsersState() {
        return usersState;
    }

    public void setUsersState(String usersState) {
        this.usersState = usersState == null ? null : usersState.trim();
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}