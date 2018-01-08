<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 19:01
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
    <title>显示INFO页面</title><!--//显示title。-->
    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.css" rel="stylesheet">

    <![endif]-->
    <script src="../../js/jquery-1.12.4.js"></script>
    <script src="../../js/bootstrap.js"></script>
    <style>
        [class*="col-"]{
            border: 1px solid #dddddd;
        }
    </style>
</head>
<body>

<div class="container">
    <header>
        <%@ include file="../../common/header.jsp"%>
    </header>
    <div >
        <%@ include file="/common/search.jsp"%>
    </div>
    <div class="row">
        <h1>.h1 标题</h1>
        <h6>.h6 发布时间 浏览人数</h6>
        <div class="house-basic-info">租房信息区</div>
        <div class="col-md-5">图片区
            <img src="img/1.jpg" class="img-responsive" alt="Responsive image">
            <div class="row hidden-xs hidden-sm ">
                <div class="col-md-1">
                    <button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>
                    </button>
                </div>
                <div class="col-md-3">
                    <a href="#" class="thumbnail">
                        <img src="img/2.jpg"  class="img-responsive">
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#" class="thumbnail">
                        <img src="img/3.jpg" class="img-responsive">
                    </a>
                </div>
                <div class=" col-md-3">
                    <a href="#" class="thumbnail">
                        <img src="img/4.jpg" class="img-responsive">
                    </a>
                </div>
                <div class="col-md-1">
                    <button type="button" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                    </button>
                </div>

            </div>
        </div>

        <div class="col-md-5">信息区
            <div >信息区列表头，缺省class
                <div class="page-header">
                    <h1>租金 <small>租赁方式</small>
                    </h1>
                </div>
                <div >
                    房子信息,缺省class
                    <ul class="list-unstyled">
                        <li> 租赁方式：</li>
                        <li> 房屋类型：</li>
                        <li> 朝向楼层：</li>
                        <li> 所在小区：</li>
                        <li> 所属区域：</li>
                        <li> 详细地址：</li>
                    </ul>
                </div>
            </div>
            <div >
                <p class="bg-warning btn-lg">联系电话:1234-5678-901</p>加过滤，没登录中间4位打*或提示登录显示电话
            </div>
        </div>
        <div class="col-md-2 hidden-xs hidden-sm">房东信息
            <img src="img/touxiang.jpg" class="img-responsive " alt="Responsive image">
            <a href="#">他的租房</a><a href="#">信用记录</a>
            <div >
                提示栏
                <p class="bg-warning btn-danger" >在签订合同前，切勿支付任何费用，以免上当受骗</p>
                <div class="btn-group">
                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">举报</button>
                    <ul class="dropdown-menu">
                        <li><a href="#">电话冒用</a></li>
                        <li><a href="#">虚假信息</a></li>
                        <li><a href="#">与真实信息不相符</a></li>
                        <li><a href="#">举报此链接</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="divider"></div>
    <div class="row">详细信息栏，缺省class
        <div class="col-md-8">详细信息
            <nav>导航栏，“小区情况直接跳转下面小区搜索页面，”暂放</nav>
            <div>详情
                <div></div>
                <table class="table table-responsive">
                    <tr>
                        <td><p>家用设备</p></td><td></td>
                    </tr>
                    <tr>
                        <td><p>房屋亮点</p></td><td></td>
                    </tr>
                    <tr>
                        <td><p>房源描述</p></td><td></td>
                    </tr>
                </table>
            </div>
            <div>地图坐标</div>
        </div>
        <div class="col-md-4">推荐</div>
    </div>
</div>
<footer>
<%@ include file="../../common/footer.jsp"%>
</footer>
</body>
</html>
