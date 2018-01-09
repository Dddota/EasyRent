<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../../docs/favicon.ico">
    <link href="../../css/bootstrap.css" rel="stylesheet">
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<div class="container" style="height: 200px">
    <form class="form-horizontal " method="post" action="" style="margin-top:100px " >
        <div class="form-group">
            <label for="oldpassword" class="col-sm-2 control-label">原密码</label>
            <div class="col-sm-3">
                <input type="password" name="oldpassword" class="form-control" id="oldpassword" placeholder="原密码">
            </div>
        </div>
        <div class="form-group">
            <label for="newpassword" class="col-sm-2 control-label">新密码</label>
            <div class="col-sm-3">
                <input type="password" name="newpassword" class="form-control" id="newpassword" placeholder="新密码">
            </div>
        </div>
        <div class="form-group">
            <label for="repassword" class="col-sm-2 control-label">重复新密码</label>
            <div class="col-sm-3">
                <input type="password" name="repassword" class="form-control" id="repassword" placeholder="重复输入新密码">
            </div>
        </div>
        <div class="col-sm-offset-2 col-sm-10 ">
            <button type="submit" id="submit" class="btn btn-default btn-lg">提交</button>
        </div>
    </form>
</div>
</body>
<script>





</script>
</html>
