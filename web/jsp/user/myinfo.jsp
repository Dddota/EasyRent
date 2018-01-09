<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/7
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <style>
        #right >div{
            display: none;
        }
        .dianzhong{
            display: block;
        }


    </style>
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<div class="container ">
    <div class="row">
    <header>
        <%@ include file="../../common/header.jsp" %>
    </header>
    <section>
        <div>
            <%@ include file="../../common/search.jsp" %>
        </div>
    <div class="col-lg-3 col-md-3">
        <%@ include file="../../common/myinfo_left.jsp" %>
    </div>
    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12" id="right">
        <div id="checkReal"><%@ include file="checkReal.jsp" %></div>
        <div id="profile"><%@ include file="profile.jsp" %></div>
        <div id="changePassword"><%@ include file="changePassword.jsp" %></div>
        <%--<div id=""><%@ include file="" %></div>--%>
    </div>
    </section>
    </div>
</div>
<footer>
    <%@ include file="../../common/footer.jsp" %>
</footer>
<script type="text/javascript">
    $(function () {
        var checkreal=$("#checkReal");
        var profile=$("#profile");
        var changepwd= $("#changePassword");
        $("#gerenziliao").click(function () {
           checkreal.siblings().hide();
           checkreal.show();
        });
        $("#xiugaimima").click(function () {
            profile.siblings().hide()
            profile.show();
        });
        $("#shimingrenzheng").click(function () {
            changepwd.siblings().hide();
            changepwd.show();
        });

    })

</script>
</body>

</html>
