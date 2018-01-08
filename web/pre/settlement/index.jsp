<%@page import="cn.easyrent.model.User"%>
<%@page import="cn.easyrent.service.impl.UserDaoServiceImpl"%>
<%@page import="cn.easyrent.service.UserDaoService"%>
<%@page import="cn.easyrent.model.House"%>
<%@page import="cn.easyrent.service.impl.HouseDaoServiceImpl"%>
<%@page import="cn.easyrent.service.HouseDaoService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
  HouseDaoService houseDaoService = new HouseDaoServiceImpl();
  List<House> houseList = houseDaoService.showHouseMsg();
  UserDaoService userDaoService = new UserDaoServiceImpl();
  
   %>
  <body>
   <%@ include file="../../common/header.jsp" %>
   <div>
   <ul>
   <%for(House house:houseList){ %>
   <li><%
   out.print(house.getAddress());
   out.print(house.getArea());
   out.print(house.getDirectionfloor());
   out.print(house.getInfo());
   out.print(house.getModel());
   out.print(house.getType());
   out.print(house.getPicpath());
   out.print(house.getRent());
   int hUid = house.getUid();
   User HouseUser  = userDaoService.selectUserById(hUid);//获取发布人的对象
   out.print(HouseUser.getLoginName());
   
    %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EasyRent/OrderServlet?opr=add&hId=<%=house.getId() %>&uId=<%=uId %>">预订</a><a>收藏</a></li>
<% }%>
</ul>
</div>
<div>
<%
String message = (String) session.getAttribute("message");
out.print(message);
 %>
</div>
</body>
</html>
