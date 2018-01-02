package com.jmu.bibasedmanage.pojo;

import java.util.Date;

public class BmReport {
    private String id;

    private String teacherGroupId;

    private String studentId;

    private String topicId;

    private String filePath;

    private String review;

    private Integer score;

    private String backFilePath;

    private String reportType;

    private Date createTime;

    private Date updateTime;

    private String recordStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeacherGroupId() {
        return teacherGroupId;
    }

    public void setTeacherGroupId(String teacherGroupId) {
        this.teacherGroupId = teacherGroupId == null ? null : teacherGroupId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getBackFilePath() {
        return backFilePath;
    }

    public void setBackFilePath(String backFilePath) {
        this.backFilePath = backFilePath == null ? null : backFilePath.trim();
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
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