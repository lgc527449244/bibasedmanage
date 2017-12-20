package com.jmu.bibasedmanage.service;

import com.jmu.bibasedmanage.pojo.BmStudent;
import com.jmu.bibasedmanage.vo.Page;

import java.util.Map;

/**
 * Created by ljc on 2017/12/18.
 */
public interface StudentService {

    /**
     * 分页查询
     * @param map（pageNo:当前页,pageSize：每页条数）
     * @param page
     * @return
     */
    Page<BmStudent> list(Map map, Page<BmStudent> page);

    String add(BmStudent bmStudent);

    void update(BmStudent bmStudent);

    void delete(String id);
}
