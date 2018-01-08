<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/6
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <title>搜索栏</title>
    <style>
        #pagesearch{
            margin-top: 20px;
        }
        #main{
            height: 120px;
        }
        #search,#post{

            float: none;
            display: inline-block;
            vertical-align:bottom;
            margin-top:60px;
        }
        #post{
            margin-left: 20px;
        }
    </style>
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<div class="container" id="pagesearch">
<div class="row hidden-xs hidden-sm" id="main" >
        <div class="col-md-3 col-lg-3">
            <img src="../../img/logo.png" class="">
            <h6>网页路径</h6>
        </div>
    <div class="col-md-4 col-lg-4" id="search" >
        <div class="input-group " >
            <input name="" class="form-control btn-lg" id="likeHouse"  type="text"  placeholder="请输入房源相关信息" >
            <span class="input-group-btn">
            <a href="javascript:;" onclick="searchHouse() " class="btn btn-default" role="button">搜房源</a>
            </span>
        </div>
    </div>
        <div class="col-md-3 col-lg-3" id="post">
            <a class="btn btn-default btn-lg alert-warning" role="button" href="#">发布</a>
        </div>
</div>

</div>
</body>
</html>
