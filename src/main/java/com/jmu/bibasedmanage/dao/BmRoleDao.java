package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmRole;
import org.springframework.stereotype.Component;

@Component
public interface BmRoleDao {
    int deleteByPrimaryKey(String id);

    int insert(BmRole record);

    int insertSelective(BmRole record);

    BmRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmRole record);

    int updateByPrimaryKey(BmRole record);
}