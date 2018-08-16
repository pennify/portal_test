<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>轮播页面</title>
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap-table/bootstrap-table.min.css">
    <script type="text/javascript" src="/plugins/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="/plugins/layer/layer.min.js" ></script>
    <script type="text/javascript" src="/plugins/jquery/ajaxfileupload.js"></script>
    <script type="text/javascript" src="/js/sliderView.js"></script>
</head>
<body>
<div class="panel-heading">
    <h4>轮播图片查询</h4>
</div>
<div class="panel panel-default">
    <table id="mytab" class="table table-hover"></table>
    <div id="toolbar" class="btn-group pull-right" style="margin-right: 20px;">
        <button id="btn_delete" type="button" class="btn btn-default" onclick="deleteDate()">
            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
        </button>
        <button id="btn_add" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
    </div>
</div>
</body>
</html>