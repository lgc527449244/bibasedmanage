package com.jmu.bibasedmanage.service.impl;

import com.jmu.bibasedmanage.dao.BmUserDao;
import com.jmu.bibasedmanage.pojo.BmUser;
import com.jmu.bibasedmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by ljc on 2017/12/25.
 */
@Transactional
@Service
public class UserSerivceImpl implements UserService{

    @Autowired
    private BmUserDao bmUserDao;

    public BmUser selectByLoginName(String loginName) {

        return bmUserDao.selectByLoginName(loginName);
    }
}
