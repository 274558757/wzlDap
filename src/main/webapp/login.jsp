<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12 0012
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="<%=request.getContextPath() %>"/>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>j驾协运营平台</title>
    <link Rel="shortcut icon" href="${ctx}/js_css_image/images/favicon.ico">
    <link  type="text/css" rel="stylesheet" href="${ctx}/js_css_image/css/login.css"/>
    <script type="text/javascript" src="${ctx}/js_css_image/js/jquery/jquery-1.8.0.min.js"/>
    <script type="text/javascript" src="${ctx}/js_css_image/js/jquery/jquery.cookie.js"/>
    <script type="text/javascript" src="${ctx}/js_css_image/js/base/jquery.jroo.utils-1.0.js"></script>
    <script type="text/javascript" src="${ctx}/js_css_image/js/core/md5.js"></script>
    <script type="text/javascript">

        var ctx = "${ctx}";
        $(function () {
            if ($("#password").val() != ""){
                $("#password").Show();
                $("#passwordTemp").Hide();
            }
            //cookie自动登录
            var loca = window.location.href+"";
            var cookie_rememberme = $.cookie("cookie.rememberme");
            if(loca.indexOf("login.jsp")>0 && loca.indexOf("logout")<=0 && cookie_rememberme != null){
                $.post("${ctx}/login/login_login.do",
                    {"cookieRememberme":cookie_rememberme},
                    function (data) {
                    loginSuccess(data);
                });
            }

            $("#loginName,#passwordTemp,#password").focus(function () {
                $(".errtips").Hide();
                $(this).addClass("focus")

            }).blur(function () {
               $(this).removeClass("foucs")
            });

            $("#loginName,#passwordTemp,#password").textRemindAuto();

            $("#passwordTemp").focus(function () {
                $(this).Hide();
                $("#password").Show().focus();
            })
            $("#password").blur(function () {
                if ($(this).val()==""){
                    $(this).hide();
                    $("#passwordTemp").Show();
                }
            });
            var logout = "<%= request.getParameter("logout")%>"
            if (logout != ""){
                if (logout == "timeout"){
                    $(".errtips").html("你的登录超时，请重新登录").Show();
                }else if (logout == "repeatlogin"){
                    $(".errtips").html("你的账号已经在别处登录，不可重复登录").Show();
                }
            }
        });


        function submitLogin () {
            if ($("#loginName").val()!= "" && $("#loginName").val() != "请输入账号" &&
             $("#password").val() != "" && $("#password").val() != "请输入密码"){
                $("#sumitBtn").val("登录中...").removeClass("green").addClass("grey").attr("disabled","disabled");
                $.post("${ctx}/login/login_login.do",
                    {"loginName":$("#loginName").val(),
                    "password":hex_md5($("#password").val()),"forceLogin":$("#forceLogin").val()},
                    function (data) {
                        loginSuccess(data);
                    })
            }
        }


        function loginSuccess(data) {
            var msg = data.msg;
            if (msg == "success"){
                window.location.href = "${ctx}/system/layout_layout.do";

            }else {
                $("#submitBtn").val("登录").removeClass("grey").addClass("green").removeAttr("disabled");
                if (msg!="repeatLogin"){
                    $(".errtips").html(msg).Show();
                }else {
                    $(".errtips").html("你的账号已经在别的地方登录，不可重复登录&nbsp;").Show();
                }
            }
        }

    </script>


</head>
<body style="background:#fff;">
<div class="login">
    <div class="loginBg">
        <h1 class="loginH1">you&amp;me，轻松快乐的工作</h1>
        <div class="loginForm">
            <form id="loginForm" method="post" action="${ctx}/login/login_login.do">
                <input type="hidden" name="forceLogin" id="forceLogin" value="N"/>
                <input type="text" class="txt focus" id="loginName" name="loginName" value="" title="请输入账号"/>
                <input type="text" class="txt" id="passwordTemp" value="" title="请输入密码"/>
                <input type="password" style="display: none" class="txt" id="password"
                       name="password" value=""  onkeydown="if(event.keyCode==13||event.which==13)submitLogin();"/>

                <input type="button" class="button green"  value="登录" id="submitBtn" onclick="submitLogin()"  style="width: 120px;height: 38px;font-size: 18px"/>

                <!--找回密码  -->
                <%--    <input type="button" class="button green"  value="找回密码" id="submitBtn" src="${ctx}/WEB-INF/jsp/system/user/recovery/getCheckCode.jsp"  style="width: 120px;height: 38px;font-size: 18px"/>
          --%>

                <%--     <a href="${ctx}/WEB-INF/jsp/system/user/recovery/getCheckCode.jsp"><input type="button" value="找回密码"/>找回密码</a> --%>
                <span class="errtips" id="tips" >${loginMessage}</span>
            </form>
        </div>
    </div>
</div>
</body>
</html>
