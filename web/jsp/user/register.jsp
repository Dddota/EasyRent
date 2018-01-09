<%@page import="cn.easyrent.model.Question"%>
<%@page import="cn.easyrent.service.impl.QuestionDaoServiceImpl"%>
<%@page import="cn.easyrent.service.QuestionDaoService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>注册</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.css" rel="stylesheet">



    <!-- Custom styles for this template -->
    <link  rel="stylesheet" type="text/css" href="../../css/regin.css">


        <%
            QuestionDaoService questionDaoService = new QuestionDaoServiceImpl();
            List<Question> questionList = questionDaoService.showAllQuestion();
%>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<div class="container img-responsive" style="background-image: url(../../img/background.jpg);background-repeat: no-repeat;background-position: bottom" >
    <form class="form-regin" method="post" action="/EasyRent/UserServlet?opr=register">
        <div class="form-group">
            <input type="text" name = "loginName" id="inputLoginname" class="form-control" placeholder="账号" required>
        </div>
        <div class="form-group">
            <input type="password" name="password" id="inputPassword" class="form-control" placeholder="密码" required>
        </div>
        <div class="form-group">
            <input type="password"  name = "repassword"id="inputrePassword" class="form-control" placeholder="确认密码" required>
        </div>
        <div class="form-group">
            <label class="form-control text-justify" >
                性别：
                <label class="radio-inline">
                    <input type="radio" id="inputGenderM" name="gender" value="1" checked/>男
                </label>
                <label class="radio-inline">
                    <input type="radio"  name="gender" id="inputGenderF" value="0"/>女
                </label>
            </label>
        </div>
        <div class="form-group">
            <input type="text" name="telephone" id="inputTelephone" class="form-control" placeholder="电话号码" required>
        </div>
        <div class="form-group">
            <input type="email" name="email" id="inputEmail" class="form-control" placeholder="邮箱地址" required autofocus>
        </div>
        <div class="form-group">
            <select class="form-control" name="qid">
                <%for(Question question:questionList){%>
                <option value=<%=question.getId() %>><%=question.getQuestion() %></option>
                <% }%>
            </select>
            </select>
            <input type="text" name="answer" id="inputAnswer1" class="form-control"  placeholder="问题答案" required >
        </div>
        <div class="form-group">
            <label class="form-control" >
                <label for="inputHeadIcon">上传头像 </label>
                <input type="file" name="picPath" id="inputHeadIcon"/>
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block " type="submit">注册</button>

    </form>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="bootstrap-3.3.7/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>