package com.portal.web.service.impl;

import com.portal.web.dao.MainMapper;
import com.portal.web.model.ImageBean;
import com.portal.web.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private MainMapper mainMapper;

    @Override
    public List<ImageBean> getImgList() {
        return mainMapper.getImgList();
//        return null;
    }
}
