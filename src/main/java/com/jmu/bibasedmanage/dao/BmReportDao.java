package com.jmu.bibasedmanage.dao;

import com.jmu.bibasedmanage.pojo.BmReport;

public interface BmReportDao {
    int deleteByPrimaryKey(String id);

    int insert(BmReport record);

    int insertSelective(BmReport record);

    BmReport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmReport record);

    int updateByPrimaryKey(BmReport record);
}