package com.jmu.bibasedmanage.pojo;

public class BmOperation {
    private String id;

    private String operationGroupId;

    private String name;

    private String enterUrl;

    private String status;

    private Integer ln;

    private String remark;

    private String operationGroupId2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOperationGroupId() {
        return operationGroupId;
    }

    public void setOperationGroupId(String operationGroupId) {
        this.operationGroupId = operationGroupId == null ? null : operationGroupId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnterUrl() {
        return enterUrl;
    }

    public void setEnterUrl(String enterUrl) {
        this.enterUrl = enterUrl == null ? null : enterUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getLn() {
        return ln;
    }

    public void setLn(Integer ln) {
        this.ln = ln;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperationGroupId2() {
        return operationGroupId2;
    }

    public void setOperationGroupId2(String operationGroupId2) {
        this.operationGroupId2 = operationGroupId2 == null ? null : operationGroupId2.trim();
    }
}