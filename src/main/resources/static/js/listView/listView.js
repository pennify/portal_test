/**
 * @author: peng
 * @Date:  2018/8/6.
 */
$(function () {
//生成用户数据
    $('#mytab').bootstrapTable({
        method: 'post',
        contentType: "application/x-www-form-urlencoded",//必须要有！！！！
        url:"/portal_test/portal/getDataPage",//要请求数据的文件路径
        height:tableHeight(),//高度调整
        toolbar: '#toolbar',//指定工具栏
        striped: true, //是否显示行间隔色
        dataType:'json',
        dataField: "rows",//bootstrap table 可以前端分页也可以后端分页，这里
        //我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的
        //rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
        pageNumber: 1, //初始化加载第一页，默认第一页
        pagination:true,//是否分页
        showPaginationSwitch:true,
        queryParamsType:'limit',//查询参数组织方式
        queryParams:queryParams,//请求服务器时所传的参数
        sidePagination:'server',//指定服务器端分页
        pageSize:10,//单页记录数
        pageList:[5,10,20,30],//分页步进值
        showRefresh:true,//刷新按钮
        showColumns:true,
        clickToSelect: true,//是否启用点击选中行
        toolbarAlign:'right',//工具栏对齐方式
        buttonsAlign:'right',//按钮对齐方式
        columns:[
            {
                title:'全选',
                field:'select',
                //复选框
                checkbox:true,
                width:25,
                align:'center',
                valign:'middle',
            },
            {
                title:'ID',
                field:'id',
                align:'center',
                valign:'middle',
                visible:false
            },
            {
                title:'图片',
                field:'picName',
                align:'center',
                sortable:true,
                formatter:function (res) {
                    return '<img src="/portal_test/portal/getImg?fileName='+'3465aa0497bd46d6a1f5957adbdb296a.png'+'" height="100" width="100">';
                    // return '<img src="/upload/effect.gif" height="100" width="100">';
                }
            },
            {
                title:'姓名',
                field:'nickName',
                align:'center',
                valign:'middle',
                sortable:true
            },
            {
                title:'手机号',
                field:'passWord',
                align:'center',
                valign:'middle'
            },
            {
                title:'更新时间',
                field:'updatedate',
                align:'center',
                valign:'middle'
            },
            {
                title:'注册日期',
                field:'createDate',
                align:'center',
                sortable:true,
                valign:'middle',
                formatter:operateFormatter
            },
            {
                title:'状态',
                field:'isLogin',
                align:'center',
                valign:'middle',
                //列数据格式化
                formatter:operateFormatter
            },
            {
                title:'操作',
                field:'operation',
                align:'center',
                valign:'middle',
                //列数据格式化
                formatter:function (res) {
                    return '<input type="file" id="uploadFile" name="uploadFile" style="display: none"'+
                        'onchange="uploadTyoeCheck()"/><input type="button" onclick="saveupfile()" value="上传图片"/>';
                }
            }
        ],
        locale:'zh-CN',//中文支持,
        responseHandler:function(res){
            //在ajax获取到数据，渲染表格之前，修改数据源
            return res;
        }
    });

});
//三个参数，value代表该列的值
function operateFormatter(value,row,index){
    if(value==2){
        return '<i class="fa fa-lock" style="color:red"></i>'
    }else if(value==1){
        return '<i class="fa fa-unlock" style="color:green"></i>'
    }else{
        return '数据错误'
    }
}

//请求服务数据时所传参数
function queryParams(params){
    return{
        //每页多少条数据
        pageSize: 20,
        //请求第几页
        pageIndex:1
    }
}
//查询按钮事件
$('#search_btn').click(function(){
    $('#mytab').bootstrapTable('refresh', {url: '/portal_test/portal/getDataPage'});
});
//tableHeight函数
function tableHeight(){
    //可以根据自己页面情况进行调整
    return $(window).height()-100;
}


function uploadTyoeCheck() {
    var fileValue = $("#uploadFile").val();
    if (fileValue == null || fileValue == '') {
        layer.msg("请选择图片");
        return;
    }
    if (!fileValue.match(/.jpg|.png|.gif/i)) {
        layer.msg("选择的文件格式不正确");
        return;
    }

    $('#uploadFile').val();
    $.ajaxFileUpload({
        'url': "/portal_test/portal/uploadPhoto",
        'fileElementId': "uploadFile",
        /*'data': {
         'docTypeId': 1,
         'proId': $('#procPhoneId').val(),
         'businessState': $('#nodeId').val()
         },*/
        'contentType': "text/html",//application/xml
        'processData': true,
        'beforeSend': function () {
        },
        'complete': function () {
        },
        'dataType': 'JSON',
        'success': function (data) {
            var res = JSON.parse(data);
            saveProPhotoDesc(res.docId, res.ftpDirectory);
        }
    });
}

function saveupfile() {
    $('#uploadFile').click();

}