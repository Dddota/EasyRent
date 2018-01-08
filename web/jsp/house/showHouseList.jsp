<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:forEach items="${requestScope.List }" var="house" varStatus="i">
    <a class="list-group-item"><li class="media">
        <div class="media-left">
            <img class="media-object img-rounded" src="/EasyRent/img/1.jpg" alt="...">
        </div >
        <div class="media-body">
            <h4 class="media-heading">${house.getModel().getModel() } | ${house.getTitle() }</h4>
                    ${house.getType().getType() }&nbsp;&nbsp;&nbsp;&nbsp;${house.area }<br>
                    ${house.getAddress().getStreet().getCityAddress().getAddress() }<br>

        </div>
    </li></a>
</c:forEach>
