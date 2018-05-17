package com.portal.back.service;

import com.portal.back.model.User;

/**
 * Created by fanlipeng on 2018/5/17 0017.
 */
public interface LoginService {

    public User getUserByUserName(String userName);

}
