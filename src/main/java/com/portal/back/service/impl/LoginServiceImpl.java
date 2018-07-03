package com.portal.back.service.impl;

import com.portal.back.dao.LoginMapper;
import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import com.portal.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User getUserByUserName(String userName) {
        return loginMapper.getUserByUserName(userName);
    }

    @Override
    public Boolean login(String userName, String passWord) {
        User user = loginMapper.getUserByUserName(userName);
        String pwd = user.getPassWord();
        String md5_pwd = Md5Util.getMd5Str(passWord);
        if (!Md5Util.getMd5Str(passWord).equals(pwd))
            return false;
        Integer res = loginMapper.updateUserStatus(userName);
        return res > 0 ? true : false;
    }

    @Override
    public Boolean logout(String userName) {
        Integer res = loginMapper.logout(userName);
        return res > 0 ? true : false;
    }
}
