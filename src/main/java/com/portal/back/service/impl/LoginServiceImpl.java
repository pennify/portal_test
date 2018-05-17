package com.portal.back.service.impl;

import com.portal.back.dao.LoginMapper;
import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanlipeng on 2018/5/17 0017.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User getUserByUserName(String userName) {
        return loginMapper.getUserByUserName(userName);
    }
}
