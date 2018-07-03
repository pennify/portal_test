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
        User user = loginService.getUserByUserName(userName);
        return new Result(200,"success",user);
    }

    /**
     * 用户登录
     * @return
     */
    @RequestMapping("/user/login")
    @ResponseBody
    public Result login() {

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        Boolean isLogin = loginService.login(userName,passWord);
        if (!isLogin){
            return new Result(1,"failure");
        }
        return new Result(200,"success",null,"main");
    }

    /**
     * 用户登出
     */
    @RequestMapping("/user/logout")
    @ResponseBody
    public Result logout(){
        String userName = request.getParameter("userName");
        Boolean res = loginService.logout(userName);
        if (!res)
            return new Result(1,"failure");
        return new Result(200,"success");
    }




}
