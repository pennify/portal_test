package com.portal.back.service;

import com.portal.back.model.User;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public interface LoginService {

    public User getUserByUserName(String userName);

    public Boolean login(String userName,String passWord);

    public Boolean logout(String userName);
}
