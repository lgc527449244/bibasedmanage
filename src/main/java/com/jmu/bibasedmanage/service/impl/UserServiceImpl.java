package com.jmu.bibasedmanage.service.impl;

import com.jmu.bibasedmanage.dao.UserDao;
import com.jmu.bibasedmanage.pojo.User;
import com.jmu.bibasedmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ljc on 2017/12/13.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User getById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
