package com.portal.back.dao;

import com.portal.back.model.User;

/**
 * Created by fanlipeng on 2018/5/17 0017.
 */
public interface LoginMapper {

    public User getUserByUserName(String userName);

}
