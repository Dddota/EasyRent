<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>首页</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="css/bootstrap.css" rel="stylesheet">
    <style type="text/css">

        dd{
            display: inline-block;
        }

        #houseList{
            padding-top: 200px;
        }
        [class*="col-"]{
            border: 1px solid #dddddd;
        }
    </style>
</head>
<body>
<script src="js/jquery-1.12.4.js"></script>
<script src="js/bootstrap.js"></script>


<section>
    <div class="container">
        <header>
            <%@ include file="common/header.jsp" %>

        </header>
        <div>
            <%@ include file="/common/search.jsp"%>
        </div>


        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <dl class=" list-inline">
                <div>
                    <a href="javascript:;" onclick="">区域</a>
                </div>
                <div>
                    <dl>这里遍历显示区域</dl>
                </div>
                <dt class="title" >租金：</dt>
                <dd class="rent">不限&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">500元以下</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">500-1000</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">1000-1500</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">1500-2000</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">2000-3000</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">3000-4500</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="rent"><a href="javascript:;" onclick="">4500以上</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dt class="title">厅室：</dt>
                <dd class="type">不限&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="type"><a href="javascript:;" onclick="">一室</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="type"><a href="javascript:;" onclick="">两室</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="type"><a href="javascript:;" onclick="">三室</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="type"><a href="javascript:;" onclick="">四室</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="type"><a href="javascript:;" onclick="">四室以上</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>

                <dt class="title">方式：</dt>
                <dd class="model">不限&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="model"><a href="javascript:;" onclick="">整套出租</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>
                <dd class="model"><a href="javascript:;" onclick="">单间出租</a>&nbsp;&nbsp;&nbsp;&nbsp;</dd>

            </dl>
        </div>

        <div class="list-group" >
            <ul class="media-list" id="houseList">
            </ul>
        </div>
    </div>
</section>

<footer>
    <%@ include file="common/footer.jsp" %>
</footer>
</body>
<script>
    jQuery(document).ready(function($){
        function initHouseList(){
            $.ajax({
                "url"		: "<%=basePath%>/HouseServlet",
                "type"		: "get",
                "data"		: "opr=houseList&tid=0",
                "dataType"	: "html",
                "success"	: processHouseList
            });

            <%-- $.getJSON("<%=basePath%>/HouseServlet", "opr=houseList", processHouseList); --%>
        };

        function processHouseList(data) {
            $("#houseList").html(data);
        };

        initHouseList();

        function searchHouse(){
            var key = $("#likeHouse").val();
            $.ajax({
                "url"		: "<%=basePath%>/HouseServlet",
                "type"		: "get",
                "data"		: "opr=likeHouse&key="+key,
                "dataType"	: "html",
                "success"	: processHouseList
            });
        };


        $("#search").click(function(){
            searchHouse();
        });


        $("#t_1").click(function(){
            $.ajax({
                "url"		: "<%=basePath%>/HouseServlet",
                "type"		: "get",
                "data"		: "opr=houseList&tid=1",
                "dataType"	: "html",
                "success"	: processHouseList
            });
        });
    });


</script>

</html>
