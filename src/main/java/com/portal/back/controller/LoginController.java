package com.portal.back.controller;

import com.alibaba.fastjson.JSONObject;
import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import com.portal.base.BaseController;
import com.portal.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
@RequestMapping("/user")
@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/getUser")
    @ResponseBody
    public Result getUserByUserName() {
        String str = new String();//这句就是刚刚提交到本地缓存的 push到github的话
        String userName = request.getParameter("userName");
        Result result = new Result();
        User user = loginService.getUserByUserName(userName);
        result.setCode(200);
        result.setMsg("success");
        result.setData(user);
        return result;
    }

}
