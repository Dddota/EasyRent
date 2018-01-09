<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/9
  Time: 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>管理员登录</title>
    <link href="../css/bootstrap.css" rel="stylesheet">
    <style>
        /*web background*/
        .container{
            display:table;
            height:100%;
            background-image: url("/img/background.jpg");
            background-repeat: no-repeat;
            background-position: center;
        }

        .row{
            display: table-cell;
            vertical-align: middle;
        }
        /* centered columns styles */
        .row-centered {
            text-align:center;
        }
        .col-centered {
            display:inline-block;
            float:none;
            text-align:left;
            margin-right:-4px;
        }
    </style>

</head>
<body>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/bootstrap.js"></script>
<div class="container">
    <div class="row row-centered">
        <div class="well col-md-4 col-centered">
            <h2 class="text-center">欢迎登录<br>杭城e租管理员平台</h2>
            <form:form action="#" method="post" role="form">
                <div class="input-group input-group-md">
                    <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-user " aria-hidden="true"></i></span>
                    <input type="text" class="form-control" id="userid" name="userid" placeholder="ID"/>
                </div>
                <div class="input-group input-group-md">
                    <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" class="form-control" id="password" name="password" placeholder="密码"/>
                </div>
                <br/>
                <button type="submit" class="btn btn-success btn-block">登录</button>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
