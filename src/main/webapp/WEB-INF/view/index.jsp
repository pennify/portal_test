<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%--<%@ include file="../view" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- Link Swiper's CSS -->
    <link type="text/css" rel="stylesheet" href="/plugins/swipper/swiper.min.css">
    <link type="text/css" rel="stylesheet" href="/css/index.css">
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">

</head>
<body>
<div class="page-header" style="width: 93%;margin-left: auto;margin-right: auto;margin-top: 30px;">
    <h1>Brother Team Portal
        <small>A group of like-minded brothers</small>
    </h1>
</div>
<div class="row" style="width:100%;">
    <nav class="navbar navbar-default" style="width: 90%;margin-left: auto;margin-right: auto;margin-top: 5px;">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#" href="javascript:void(0);" onclick="onLaoyang('老洋喝熊')">首页</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">简介 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">合作伙伴</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Link</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>
<div class="row" style="width:100%;height: 70%;margin-top: 10px;">
    <!-- Swiper -->
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide">
                <img src="/img/855691.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/1155206.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/1155208.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/1155210.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/1155212.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/1160777.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/ball.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/house.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/moon.jpg" style="height: 100%;width: 100%">
            </div>
            <div class="swiper-slide">
                <img src="/img/poacher.jpg" style="height: 100%;width: 100%">
            </div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
        <!-- Add Arrows -->
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
    </div>
</div>
<div class="row" style="width: 100%;margin-top: 10px;padding-left: 4%;">
    <div class="col-md-1">
        <div class="row-fluid">
            <div class="span12">
                <ul class="nav nav-list">
                    <li class="nav-header">
                        列表标题
                    </li>
                    <li class="active">
                        <a href="javascript:void(0);" onclick="onLaoyang('老洋喝熊')">首页</a>
                    </li>
                    <li>
                        <a href="#">库</a>
                    </li>
                    <li>
                        <a href="#">应用</a>
                    </li>
                    <li class="nav-header">
                        功能列表
                    </li>
                    <li>
                        <a href="#">资料</a>
                    </li>
                    <li>
                        <a href="#">设置</a>
                    </li>
                    <li class="divider">
                    </li>
                    <li>
                        <a href="#">帮助</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="col-md-11">.col-md-4</div>
</div>
<%-- jquery JS--%>
<script type="text/javascript" src="/plugins/jquery/jquery-2.1.4.min.js"></script>
<!-- Swiper JS -->
<script type="text/javascript" src="/plugins/swipper/swiper.min.js"></script>
<%-- bootstrap JS--%>
<script type="text/javascript" src="/plugins/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/index.js"></script>
<!-- Initialize Swiper -->
<%--<script>
    var swiper = new Swiper('.swiper-container', {
        slidesPerView: 1,
        spaceBetween: 30,
        loop: true,
        pagination: {
            el: '.swiper-pagination',
            clickable: true
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev'
        }
    });
</script>--%>
</body>
</html>