<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style>
	body{
	background-color:rgba(0,0,0,0.1);
}
	form{
	width:400px;
	margin:0px auto;
	background-color:white;
}
	a{
	float:right;
	}
	form p{
	text-indent:2em;
	}
	#register{
	background-color:red;
	color:white;
	height:30px;
	width:200px;
	}
	form p:last-child{
	padding-left:65px;
	}
	.register{
	font-size:22px;
	padding-left:70px;
	}
	#login{
		float:right;
	}
	</style>
	
  </head>
  
  <body>
    <form action="/EasyBuy/UserServlet?opr=register" method="post">
    <span class="register">注册</span><span id="login">已有商城账号，我要<a href="/EasyBuy/pre/settlement/login.jsp">登录</a></span>
    <input type="hidden" name="id">
    <p>*登录用户名<input type="text" name="loginName" id="loginName"></p>
    <p>*密码<input type="password" name="password" id="password"></p>
    <p>*确认密码<input type="password" name ="repassword" id="repassword"></p>
    <p>*真实姓名<input type="text" name="userName" id="userName"></p>
    <p>*性别<input type="radio" name="sex" value = "1"checked>男<input type="radio" name="sex" value="0">女</p>
    <p>*身份证号<input type="text" name="identityCode"></p>
    <p>*邮箱<input type="text" name="email"></p>
    <p>*手机<input type="text" name="mobile"></p>
    <input type="hidden" name="type" value=0>
    <p><input type="submit" value="立即注册" id="register"></p>
    </form>
  </body>
</html>
