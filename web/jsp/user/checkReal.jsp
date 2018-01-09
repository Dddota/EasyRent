<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/5
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../../docs/favicon.ico">
    <title>检查是否实名验证</title>
    <link href="../../css/bootstrap.css" rel="stylesheet">
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<div class="container" style="height: 200px">
    <form class="form-horizontal " method="post" action="" style="margin-top:100px " >
        <div class="form-group">
            <label for="userName" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-2">
                <input type="text" name="userName" class="form-control" id="userName" placeholder="姓名">
            </div>
        </div>
        <div class="form-group">
            <label for="idcard" class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-4">
                <input type="text" name="idcard" class="form-control" id="idcard" placeholder="15位或18位身份证号码">
            </div>
        </div>
        <div class="col-sm-offset-2 col-sm-10 ">
            <button type="submit" id="submit" class="btn btn-default btn-lg">提交</button>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">
    $(function () {
        $("#submit").click(function () {
            confirm($("#userName").val()+$("#idcard").val())
        })
    })


</script>
</html>
