package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmUser;
import org.springframework.stereotype.Component;

@Component
public interface BmUserDao {
    int deleteByPrimaryKey(String id);

    int insert(BmUser record);

    int insertSelective(BmUser record);

    BmUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmUser record);

    int updateByPrimaryKey(BmUser record);

    //通过账号查询用户
    BmUser selectByLoginName(String loginName);
}