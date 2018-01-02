package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmTeacher;

public interface BmTeacherDao {
    int deleteByPrimaryKey(String id);

    int insert(BmTeacher record);

    int insertSelective(BmTeacher record);

    BmTeacher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmTeacher record);

    int updateByPrimaryKey(BmTeacher record);
}