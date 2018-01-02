package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmTopic;

public interface BmTopicDao {
    int deleteByPrimaryKey(String id);

    int insert(BmTopic record);

    int insertSelective(BmTopic record);

    BmTopic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmTopic record);

    int updateByPrimaryKey(BmTopic record);
}