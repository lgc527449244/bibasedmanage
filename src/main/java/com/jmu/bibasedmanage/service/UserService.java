package com.jmu.bibasedmanage.service;

import com.jmu.bibasedmanage.pojo.BmUser;

/**
 * Created by ljc on 2017/12/25.
 */
public interface UserService {
    BmUser selectByLoginName(String loginName);
}
