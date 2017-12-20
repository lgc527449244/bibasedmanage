package com.jmu.bibasedmanage.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.jmu.bibasedmanage.pojo.BmStudent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BmStudentDao {
    int deleteByPrimaryKey(String id);

    int insert(BmStudent record);

    int insertSelective(BmStudent record);

    BmStudent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BmStudent record);

    int updateByPrimaryKey(BmStudent record);

    List<BmStudent> selectByPage(PageBounds pageBounds);
}