<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 21:29
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
    <title>发布页面</title><!--//显示title。-->
    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.css" rel="stylesheet">
</head>
<body>
<script src="../../js/jquery-1.12.4.js"></script>
<script src="../../js/bootstrap.js"></script>
<script type="text/javascript" src="../../js/wangEditor.js"></script>


<script type="text/javascript">
    $(function () {
        var E = window.wangEditor;
        var editor = new E('#editor');
        editor.create();
    })
</script>

<%--<div class="col-md-12 hidden-xs">顶部栏
</div>--%>
<div class="container">
    <header>
        <%@ include file="../../common/header.jsp"%>
    </header>
    <form class="form-horizontal" method="post" action="">

        <div class="form-group">
            <label class="col-sm-2 control-label">出租方式：</label>
            <div class="btn-group col-sm-2" data-toggle="buttons">
                <label class="btn btn-default">
                    <input type="radio" name="status" id="option2" autocomplete="off"> 整租
                </label>
                <label class="btn btn-default">
                    <input type="radio" name="status" id="option3" autocomplete="off"> 合租
                </label>
            </div>
        </div>

        <div class="form-group">
            <label for="streetAddress" class="col-sm-2 control-label">区域：</label>

        </div>
        <div class="form-group">
            <label for="streetAddress" class="col-sm-2 control-label">街道名称：</label>

        </div>
        <div class="form-group">
            <label for="Address" class="col-sm-2 control-label">详细地址：</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="Address" placeholder="请输入详细地址" required>
            </div>
        </div>
        <div class="form-group ">
            <label for="floor" class="col-sm-2 control-label">楼层分布：</label>
            <div class="col-sm-2">
                <div class="input-group">
                    <input type="text" class="form-control" id="floor"  required>
                    <div class="input-group-addon " >楼</div>
                </div>
            </div>
            <label for="direction" class="col-sm-1 control-label">朝向：</label>
            <div class="col-sm-2">
                <%--<div class="input-group">
                <input type="text" class="form-control" id="direction"  required>
            </div>--%>
                <select id="direction" class="form-control ">
                    <option value="east">东</option>
                    <option value="west">西</option>
                    <option value="south">南</option>
                    <option value="north">北</option>
                    <option value="eastsouth">东南</option>
                    <option value="westsouth">西南</option>
                    <option value="eastnorth">东北</option>
                    <option value="westnorth">西北</option>
                </select>
            </div>
            <label for="area" class="col-sm-1 control-label">面积：</label>
            <div class="col-sm-2" >
                <div class="input-group">
                    <input type="text" class="form-control" id="area"  required>
                    <div class="input-group-addon " >㎡</div>
                </div>
            </div>
        </div>
        <div class="form-group">
            <label for="chamber" class="col-sm-2 control-label">房屋户型：</label>
            <div class="col-sm-2">
                <div class="input-group">
                    <input type="text" class="form-control " id="chamber" placeholder="" required>
                    <div class="input-group-addon" >室</div>
                </div>
            </div>
            <div class="col-sm-2 ">
                <div class="input-group">
                    <input type="text" class="form-control" id="hall" placeholder="" required>
                    <div class="input-group-addon " >厅</div>
                </div>
            </div>
            <div class="col-sm-2">
                <div class="input-group">
                    <input type="text" class="form-control" id="bath" placeholder="" required>
                    <div class="input-group-addon " >卫</div>
                </div>
            </div>
        </div>
        <div class="form-group ">
            <label for="rent" class="col-sm-2 control-label">租金：</label>
            <div class="col-sm-2">
                <div class="input-group">
                    <input type="text" class="form-control" id="rent" placeholder="" required>
                    <div class="input-group-addon " >￥</div>
                </div>
            </div>
            <label for="model" class="col-sm-2 control-label">付款方式：</label>
            <div class="col-sm-2 ">
                <select id="model" class="form-control ">
                    <option value="" selected></option>
                    <option value="day">日付</option>
                    <option value="week">周付</option>
                    <option value="1by1">押一付一</option>
                    <option value="1by3">押一付三</option>
                    <option value="halfyear">半年交</option>
                    <option value="1year">一年交</option>
                    <option value="face">面议</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="Title" class="col-sm-2 control-label">房源标题：</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="Title" placeholder="请输入标题：" required>
            </div>
        </div>
        <div class="form-group">
            <label for="editor" class="col-sm-2 control-label">房屋描述：</label>
            <div class="col-sm-8" id="editor">
            </div>
        </div>
        <div class="form-group" >
            <label for="HousePic" class="col-sm-2 control-label">上传照片：</label>
            <input type="file" id="HousePic" class="col-sm-2">
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">发布</button>
            </div>
        </div>
    </form>
</div>
<div>
    <%@ include file="../../common/footer.jsp"%>
</div>
<script>
    $(function () {

        $("#model").blur(function () {
            var cid=$("#model option:selected").val();
            alert(cid)
        })
    })


</script>
</body>
</html>
