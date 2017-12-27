package com.jmu.bibasedmanage.service.impl;

import com.jmu.bibasedmanage.dao.BmRoleDao;
import com.jmu.bibasedmanage.pojo.BmRole;
import com.jmu.bibasedmanage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by ljc on 2017/12/26.
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private BmRoleDao bmRoleDao;

    public BmRole selectById(String roleId) {
        return bmRoleDao.selectByPrimaryKey(roleId);
    }
}
