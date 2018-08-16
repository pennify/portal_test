package com.portal.back.controller;

import com.portal.back.model.User;
import com.portal.back.service.LoginService;
import com.portal.base.BaseController;
import com.portal.base.Result;
import com.portal.util.Md5Util;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
     * 注解的方式获取配置文件中的值
     */
    @Value("${test}")
    private String test;

    @RequestMapping("/user/getCode")
    @ResponseBody
    public String getCode(){

        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://sdk999ws.eucp.b2m.cn:8080/sdk/SDKService?wsdl");

        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        Object[] objects = new Object[0];
        try {
            List<String> strs = new ArrayList<>();
            strs.add("15092740187");
            strs.add("13156173256");
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sendSMS", "9SDK-EMY-0999-RFTON","932434","",strs, "你好，内容", "a1s3","gbk",5,0);
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return "OK";
    }

    /**
     * 用户登录页面
     * @return
     */
    @RequestMapping("login")
    public String loginPage(){
        return "login";
    }

    /**
     * 通过用户名获取用户信息
     * @return
     */
    @RequestMapping("/user/getUser")
    @ResponseBody
    public Result getUserByUserName() {
        System.out.println("test : " + test);
        String userName = request.getParameter("userName");
        User user = loginService.getUserByUserName(userName);
        Result result = new Result(200,"success",user);
        System.out.println("result: " + result.toString());
        return result;
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("/user/addUser")
    @ResponseBody
    public Result addUser(User user){

        user.setCreateDate(new Date());
        user.setPassWord(Md5Util.getMd5Str(user.getPassWord()));
        System.out.println("param :" + user.toString());
        Boolean isTrue = loginService.addUser(user);
        return isTrue ? new Result(200,"success") : new Result(1,"failure");
    }



    /**
     * 用户登录
     * @return
     */
    @RequestMapping("/user/login")
    @ResponseBody
    public Result login(Model model) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Boolean isLogin = loginService.login(username,password);
        if (!isLogin){
            return new Result(1,"账号密码错误，登录失败");
        }
        return new Result(200,"登陆成功",null,"/portal/index");
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

    /**
     * 左侧菜单伸展
     */
    @RequestMapping("user/navLight")
    public String navLight(){
        return "navLight";
    }


}
