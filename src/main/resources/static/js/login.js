
$(function() {
    validateRule();
    // $(".i-checks").iCheck({checkboxClass:"icheckbox_square-green-login"});
	// $('.imgcode').click(function() {
	// 	var url = ctx + "captcha/captchaImage?type=" + captchaType + "&s=" + Math.random();
	// 	$(".imgcode").attr("src", url);
	// });
});

$.validator.setDefaults({
    submitHandler: function() {
        login();
    }
});

function login() {
	var username = $("input[name='username']").val().trim();
    var password = $("input[name='password']").val().trim();
    var validateCode = $("input[name='validateCode']").val();
    var rememberMe = $("input[name='rememberme']").is(':checked');
    $.ajax({
        type: "POST",
        url: "/portal_test/user/login",
        data: {
            "username": username,
            "password": password,
            "validateCode" : validateCode,
            "rememberMe": rememberMe
        },
        success: function(r) {
            if (r.code == 200) {
                parent.location.href = '/portal_test' + r.redirect;
            } else {
            	$('.imgcode').click();
                layer.msg(r.msg);
            }
        }
    });
}

function validateRule() {
    var icon = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        rules: {
            username: {
                required: true
            },
            password: {
                required: true
            }
        },
        messages: {
            username: {
                required: icon + "请输入您的用户名",
            },
            password: {
                required: icon + "请输入您的密码",
            }
        }
    })
}
