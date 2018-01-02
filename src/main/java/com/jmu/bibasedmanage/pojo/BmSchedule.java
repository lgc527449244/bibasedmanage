package com.jmu.bibasedmanage.pojo;

import java.util.Date;

public class BmSchedule {
    private String id;

    private String studentId;

    private String content;

    private String progressQuality;

    private String inspectionSituation;

    private String topicName;

    private Date createTime;

    private Date updateTime;

    private String recordStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProgressQuality() {
        return progressQuality;
    }

    public void setProgressQuality(String progressQuality) {
        this.progressQuality = progressQuality == null ? null : progressQuality.trim();
    }

    public String getInspectionSituation() {
        return inspectionSituation;
    }

    public void setInspectionSituation(String inspectionSituation) {
        this.inspectionSituation = inspectionSituation == null ? null : inspectionSituation.trim();
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus == null ? null : recordStatus.trim();
    }
}