package com.jmu.bibasedmanage.service;

import com.jmu.bibasedmanage.pojo.BmOperation;

import java.util.List;

/**
 * Created by ljc on 2017/12/26.
 */
public interface OperationService {
    /**
     * 通过roleId查询操作
     * @param roleId
     * @return
     */
    List<BmOperation> getOperationByRoleId(String roleId);
}
