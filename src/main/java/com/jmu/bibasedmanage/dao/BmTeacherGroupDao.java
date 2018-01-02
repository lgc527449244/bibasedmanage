package com.jmu.bibasedmanage.dao;

import java.util.List;

import com.jmu.bibasedmanage.pojo.BmTeacherGroup;

public interface BmTeacherGroupDao {
    int deleteByPrimaryKey(String id);

    int insert(BmTeacherGroup record);

    int insertSelective(BmTeacherGroup record);

    BmTeacherGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmTeacherGroup record);

    int updateByPrimaryKey(BmTeacherGroup record);
    
    BmTeacherGroup selectByTeacherid(String id);
    
    List<BmTeacherGroup> searchStudent(String id);
}