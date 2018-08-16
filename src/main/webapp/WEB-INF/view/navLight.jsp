<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%--<%@ include file="../view" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nav</title>
    <style>
        .panel-group{max-height:770px;overflow: auto;}
        .leftMenu{margin:10px;margin-top:5px;}
        .leftMenu .panel-heading{font-size:14px;padding-left:20px;height:36px;line-height:36px;color:white;position:relative;cursor:pointer;}/*转成手形图标*/
        .leftMenu .panel-heading span{position:absolute;right:10px;top:12px;}
        .leftMenu .menu-item-left{padding: 2px; background: transparent; border:1px solid transparent;border-radius: 6px;}
        .leftMenu .menu-item-left:hover{background:#C4E3F3;border:1px solid #1E90FF;}
    </style>
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">

</head>
<body>
<div class="page-header" style="width: 93%;margin-left: auto;margin-right: auto;margin-top: 30px;">
    <h1>Brother Team Portal
        <small>A group of like-minded brothers</small>
    </h1>
</div>
<div class="row">
    <div class="col-md-2">
        <div class="panel-group table-responsive" role="tablist">
            <div class="panel panel-primary leftMenu">
                <!-- 利用data-target指定要折叠的分组列表 -->
                <div class="panel-heading" id="collapseListGroupHeading1" data-toggle="collapse" data-target="#collapseListGroup1" role="tab" >
                    <h4 class="panel-title">
                        分组1
                        <span class="glyphicon glyphicon-chevron-up right"></span>
                    </h4>
                </div>
                <!-- .panel-collapse和.collapse标明折叠元素 .in表示要显示出来 -->
                <div id="collapseListGroup1" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="collapseListGroupHeading1">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <!-- 利用data-target指定URL -->
                            <button class="menu-item-left" data-target="test2.html">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-1
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-2
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-3
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-4
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-5
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-6
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-7
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-8
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-9
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-10
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项1-11
                            </button>
                        </li>
                    </ul>
                </div>
            </div><!--panel end-->
            <div class="panel panel-primary leftMenu">
                <div class="panel-heading" id="collapseListGroupHeading2" data-toggle="collapse" data-target="#collapseListGroup2" role="tab" >
                    <h4 class="panel-title">
                        分组2
                        <span class="glyphicon glyphicon-chevron-down right"></span>
                    </h4>
                </div>
                <div id="collapseListGroup2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="collapseListGroupHeading2">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项2-1
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项2-2
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项2-3
                            </button>
                        </li>
                        <li class="list-group-item">
                            <button class="menu-item-left">
                                <span class="glyphicon glyphicon-triangle-right"></span>分组项2-4
                            </button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-10">
        内容
    </div>
</div>


<%-- jquery JS--%>
<script type="text/javascript" src="/plugins/jquery/jquery-2.1.4.min.js"></script>
<%-- bootstrap JS--%>
<script type="text/javascript" src="/plugins/bootstrap/bootstrap.min.js"></script>
<script>
    $(function(){
        $(".panel-heading").click(function(e){
            /*切换折叠指示图标*/
            $(this).find("span").toggleClass("glyphicon-chevron-down");
            $(this).find("span").toggleClass("glyphicon-chevron-up");
        });
    });
</script>
</body>
</html>