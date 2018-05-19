package com.portal.web.dao;

import com.portal.web.model.ImageBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by peng
 * 2018/5/17 0017.
 */
public interface MainMapper {

    @Select("SELECT t.imageName,t.imageUrl,t.imageDesc FROM  image t")  // mapper的注解方式
    public List<ImageBean> getImgList();

}
