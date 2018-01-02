package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmRoleOperation;

public interface BmRoleOperationDao {
    int deleteByPrimaryKey(String id);

    int insert(BmRoleOperation record);

    int insertSelective(BmRoleOperation record);

    BmRoleOperation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmRoleOperation record);

    int updateByPrimaryKey(BmRoleOperation record);
}