<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title>小程序后台管理系统 - 登录</title>
    <meta name="keywords" content="小程序后台管理系统">
    <meta name="description" content="小程序">
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">
    <link href="/css/font-awesome.css"  rel="stylesheet"/>
    <link href="/css/style.css"  rel="stylesheet"/>
    <link href="/css/login.min.css"  rel="stylesheet"/>
    <link href="../static/ajax/libs/iCheck/custom.css" th:href="@{/ajax/libs/iCheck/custom.css}" rel="stylesheet"/>
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->
    <link rel="shortcut icon" href="../static/favicon.ico" th:href="@{favicon.ico}"/>
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location
        }
        ;
    </script>
</head>

<body class="signin">

<div class="signinpanel">
    <div class="row">
        <div class="col-sm-7">
            <div class="signin-info">
                <div class="logopanel m-b">
                    <h1 style="color: #1872ab;font-size: 25px"><img alt="[ Come on! ]" src="/img/favicon.ico"> Welcome</h1>
                </div>
                <div class="m-b"></div>
                <h4>欢迎使用 <strong>后台管理系统</strong></h4>
                <ul class="m-b">
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> SpringBoot</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> Mybatis</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> Shiro</li>
                    <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> Thymeleaf</li>--%>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> Bootstrap</li>
                </ul>
                <strong>还没有账号？ <a href="#">立即注册&raquo;</a></strong>
            </div>
        </div>
        <div class="col-sm-5">
            <form id="signupForm">
                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">不忘初心，方得始终</p>
                <input type="text" id="username" name="username" class="form-control uname" placeholder="用户名"/>
                <input type="password" id="password" name="password" class="form-control pword m-b" placeholder="密码"/>
                <div class="row" th:if="${captchaEbabled==true}">
                    <div class="col-xs-6">
                        <input type="text" name="validateCode" class="form-control code" placeholder="验证码"
                               maxlength="5">
                    </div>
                    <div class="col-xs-6">
                        <a href="javascript:void(0);" title="点击更换验证码">
                            <img th:src="@{captcha/captchaImage(type=${captchaType})}" class="imgcode" width="85%"/>
                        </a>
                    </div>
                </div>
                <input class="i-checks" type="checkbox" name="rememberme"/>&nbsp;&nbsp;记住我
                <button class="btn btn-success btn-block">登录</button>
            </form>
        </div>
    </div>
    <div class="signup-footer" style="margin-top: 260px">
        <div class="pull-left">
            &copy; 2018 All Rights Reserved. Peng
        </div>
    </div>
</div>
<!-- 全局js -->
<%-- jquery JS--%>
<script type="text/javascript" src="/plugins/jquery/jquery.min.js"></script>
<%-- bootstrap JS--%>
<script type="text/javascript" src="/plugins/bootstrap/bootstrap.min.js"></script>
<!-- 验证插件 -->
<script src="/plugins/validate/jquery.validate.min.js"></script>
<script src="/plugins/validate/messages_zh.min.js"></script>
<script src="/plugins/layer/layer.min.js" ></script>
<script src="/plugins/iCheck/icheck.min.js" ></script>
<%--<script src="http://tajs.qq.com/stats?sId=62048022"></script>--%>
<script src="/js/login.js"></script>
</body>
</html>
