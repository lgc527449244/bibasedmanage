package com.jmu.bibasedmanage.service.impl;

import com.jmu.bibasedmanage.dao.BmOperationDao;
import com.jmu.bibasedmanage.pojo.BmOperation;
import com.jmu.bibasedmanage.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ljc on 2017/12/26.
 */
@Transactional
@Service
public class OperationServiceImpl implements OperationService{
    @Autowired
    private BmOperationDao bmOperationDao;

    public List<BmOperation> getOperationByRoleId(String roleId) {
        return bmOperationDao.selectByRoleId(roleId);
    }
}
