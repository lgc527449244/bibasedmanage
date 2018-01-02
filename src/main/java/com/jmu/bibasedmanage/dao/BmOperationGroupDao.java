package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmOperationGroup;

public interface BmOperationGroupDao {
    int deleteByPrimaryKey(String id);

    int insert(BmOperationGroup record);

    int insertSelective(BmOperationGroup record);

    BmOperationGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmOperationGroup record);

    int updateByPrimaryKey(BmOperationGroup record);
}