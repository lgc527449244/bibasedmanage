package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmSchedule;

public interface BmScheduleDao {
    int deleteByPrimaryKey(String id);

    int insert(BmSchedule record);

    int insertSelective(BmSchedule record);

    BmSchedule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmSchedule record);

    int updateByPrimaryKey(BmSchedule record);
}