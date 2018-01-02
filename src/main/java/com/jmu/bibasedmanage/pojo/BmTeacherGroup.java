package com.jmu.bibasedmanage.pojo;

import java.util.Date;
import java.util.List;

public class BmTeacherGroup {
    private String id;

    private String name;

    private String classroom;

    private Date beginTime;

    private Date endTime;

    private String topicId;

    private Date createTime;

    private Date updateTime;

    private String recordStatus;
     
    private List<BmTeacher> bmTeachers;
    
    private List<BmStudent> bmStudents;
    
    
    public List<BmTeacher> getBmTeachers() {
		return bmTeachers;
	}

	public void setBmTeachers(List<BmTeacher> bmTeachers) {
		this.bmTeachers = bmTeachers;
	}

	

	public List<BmStudent> getBmStudents() {
		return bmStudents;
	}

	public void setBmStudents(List<BmStudent> bmStudents) {
		this.bmStudents = bmStudents;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
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