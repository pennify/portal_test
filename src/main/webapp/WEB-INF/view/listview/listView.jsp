<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="/plugins/bootstrap-table/bootstrap-table.min.css">
    <script type="text/javascript" src="/plugins/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="/plugins/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="/plugins/layer/layer.min.js" ></script>
    <script type="text/javascript" src="/plugins/jquery/ajaxfileupload.js"></script>
    <script type="text/javascript" src="/js/listView/listView.js"></script>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        查询条件
    </div>
    <div class="wrapper wrapper-content">
        <div class="panel-body form-group" style="margin-bottom:0px;">
            <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">姓名：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" name="Name" id="search_name"/>
            </div>
            <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">手机号：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" name="Name" id="search_tel"/>
            </div>
            <div class="col-sm-1 col-sm-offset-4">
                <button class="btn btn-primary" id="search_btn">查询</button>
            </div>
        </div>
    </div>
    <table id="mytab" class="table table-hover"></table>
    <div id="toolbar" class="btn-group pull-right" style="margin-right: 20px;">
        <button id="btn_edit" type="button" class="btn btn-default" style="display: none; border-radius: 0">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
        </button>
        <button id="btn_delete" type="button" class="btn btn-default" style="display: none;">
            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
        </button>
        <button id="btn_add" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
    </div>
</div>
</body>
</html>
