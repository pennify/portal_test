package com.portal.back.controller;

import com.alibaba.fastjson.JSONObject;
import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fanlipeng on 2018/5/17 0017.
 */
@RequestMapping("/user")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/getUser")
    @ResponseBody
    public JSONObject getUserByUserName(HttpServletRequest request){

        String userName = request.getParameter("userName");
        JSONObject jsonObject = new JSONObject();
        User user = loginService.getUserByUserName(userName);
        jsonObject.put("flag",true);
        jsonObject.put("msg","success");
        jsonObject.put("user",user);
        return jsonObject;
    };

}
