package com.portal.back.dao;

import com.portal.back.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public interface LoginMapper {

    @Select("select * from user t where t.userName = #{userName}")
    public User getUserByUserName(String userName);


    @Select("select * from user where id = #{user.id}")
    public User getUserById(@Param("user") User user);

}
