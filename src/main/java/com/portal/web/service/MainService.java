package com.portal.web.service;

import com.portal.back.model.User;
import com.portal.web.model.ImageBean;

import java.util.List;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public interface MainService {
    public List<ImageBean> getImgList();

    public List<User> getUserPage(Integer index,Integer pageSize);

    public Integer getUserTotal();

}
