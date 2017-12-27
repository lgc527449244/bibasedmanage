package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmOperation;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface BmOperationDao {
    int deleteByPrimaryKey(String id);

    int insert(BmOperation record);

    int insertSelective(BmOperation record);

    BmOperation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmOperation record);

    int updateByPrimaryKey(BmOperation record);

    //通过roleId查询operation
    List<BmOperation> selectByRoleId(String roleId);
}