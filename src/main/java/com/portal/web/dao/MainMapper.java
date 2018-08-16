package com.portal.web.dao;

import com.portal.back.model.User;
import com.portal.web.model.ImageBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by peng
 * 2018/5/17 0017.
 */
public interface MainMapper {

    //@Select("SELECT t.imageName,t.imageUrl,t.imageDesc FROM  image t")  // mapper的注解方式
    public List<ImageBean> getImgList();

    @Select("select  t.id id,t.username userName,t.password passWord,t.nickName nickName,t.updatedate updatedate," +
            "t.createDate createDate   from t_user t limit #{index},#{pageSize}")
    public List<User> getUserPage(@Param("index")Integer index,@Param("pageSize") Integer pageSize);

    @Select("select count(id) from t_user")
    public Integer getUserTotal();

}
