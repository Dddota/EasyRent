<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../docs/favicon.ico">
    <title>顶部栏</title><!--//显示title。-->
    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <style>
        .input-group>a{
            font-size: larger;
        }
    </style>
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<script src="/EasyRent/js/bootstrap-hover-dropdown.js"></script>
<div class="row">
<div class="col-md-12  col-lg-12 col-sm-12 hidden-xs">
    <div class="col-md-3 col-lg-3 text-center">
        <iframe  name="fancybox-frame1514986691901" class=" embed-responsive-ite " frameborder="0" scrolling="no" height="34px" src="http://i.tianqi.com/index.php?c=code&a=getcode&id=34&h=15&w=280">
        </iframe>
    </div>
    <div class="col-md-3 col-lg-3">
        <c:set var="isLogin" value="${empty sessionScope.User }" />
        <c:choose>
            <c:when test="${isLogin }">
                <a class="btn  hidden-xs hidden-sm" href="/EasyRent/jsp/user/login.html">登录</a>
                <a class="btn  hidden-xs hidden-sm" href="/EasyRent/jsp/user/register.jsp">注册</a>
            </c:when>
            <c:when test="${!isLogin }">
                <span>你好，${sessionScope.User.loginName }<a href="/EasyRent/UserServlet?opr=login_out">注销</a></span>
            </c:when>
        </c:choose>
    </div>
    <div class="col-md-5 col-lg-5">
        <div class="btn-group">
            <a role="button" class="btn btn-default dropdown-toggle" data-hover="dropdown"  aria-haspopup="true" aria-expanded="false" href="/EasyRent/jsp/user/myinfo.jsp">个人中心</a>
            <ul class="dropdown-menu">
                <li><a href="#">我的发布</a></li>
                <li><a href="#">我的积分</a></li>
                <li><a href="#">我的帐号</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">客服服务</a></li>
                <li><a href="#">投诉建议</a></li>
            </ul>
        </div>
        <a href="#" class="btn btn-default" role="button" >订单管理</a>
        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle" data-hover="dropdown" aria-haspopup="true" aria-expanded="false" href="#">浏览记录</button>
            <ul class="dropdown-menu"><%--自我生成的记录--%>
                <li><a href="#"></a>1</li>
                <li><a href="#"></a>2</li>
                <li><a href="#"></a>3</li>
                <li><a href="#"></a>4</li>
            </ul>
        </div>
        <a href="#" class="btn btn-default" role="button" >网站导航</a>
    </div>
</div>
<div class="col-xs-12 hidden-sm hidden-md hidden-lg">
    <nav class="navbar navbar-default navbar-static-top">
        <div class="container form-inline">
            <nav>LOGO
                <div class="input-group">
                <input type="search" class="btn-xs">
                    <a href="javascript:;" onclick="searchHouse() " >搜</a>&nbsp&nbsp&nbsp&nbsp
                    <a class="" href="#">发布</a>|<a  href="#" >我的</a>
                </div>
                </nav>

        </div>
    </nav>
</div>

</div>
<span role="separator" class="divider"></span>
</body>
</html>
