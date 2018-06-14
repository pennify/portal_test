package com.portal.back.controller;

import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import com.portal.base.BaseController;
import com.portal.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 用户管理
 * Created by peng
 * on 2018/5/17 0017.
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    /**
     * 通过用户名获取用户信息
     * @return
     */
    @RequestMapping("/user/getUser")
    @ResponseBody
    public Result getUserByUserName() {

        String userName = request.getParameter("userName");
        Result result = new Result();
        User user = loginService.getUserByUserName(userName);
        result.setCode(200);
        result.setMsg("success");
        result.setData(user);
        return result;
    }

}
