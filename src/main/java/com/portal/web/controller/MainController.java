package com.portal.web.controller;

import com.portal.web.model.ImageBean;
import com.portal.web.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
@RequestMapping("/portal")
@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    /**
     * 首页
     */
    @RequestMapping("/index")
    public String main(){
        return "index";
    }

    /**
     * 获取图片资源
     */
    public List imgList(HttpServletRequest request){
        List<ImageBean> imgs = mainService.getImgList();
        return imgs;
    }
}
