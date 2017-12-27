package com.jmu.bibasedmanage.pojo;

import java.util.Date;

public class BmUser {
    private String id;

    private String roleId;

    private String loginName;

    private String loginPassword;

    private String salt;

    private String userStatus;

    private Date userLockTime;

    private Date lastLoginTime;

    private String tsId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public Date getUserLockTime() {
        return userLockTime;
    }

    public void setUserLockTime(Date userLockTime) {
        this.userLockTime = userLockTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getTsId() {
        return tsId;
    }

    public void setTsId(String tsId) {
        this.tsId = tsId == null ? null : tsId.trim();
    }
}