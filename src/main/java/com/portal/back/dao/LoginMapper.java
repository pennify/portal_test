package com.portal.back.dao;

import com.portal.back.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public interface LoginMapper {

//    @Select("select * from t_user t where t.username = #{userName}")
    public User getUserByUserName(String userName);


//    @Select("select * from user where id = #{user.id}")
    public User getUserById(@Param("user") User user);

    @Update("update t_user t set t.isLogin = 1 where t.username = #{userName}")
    public Integer updateUserStatus(String userName);

    @Update("update t_user t set t.isLogin = 0 where t.username = #{userName}")
    public Integer logout(String UserName);

}
