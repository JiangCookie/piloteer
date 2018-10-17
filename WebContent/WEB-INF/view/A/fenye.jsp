<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" import="java.util.Map"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/manage.css"/>
</head>
<body>	
	<div id="container">
		<div id="Main">
		    <!-- 头部 -->
			<div class="first">
				<div class="first-line">名字</div>
			</div>
			
			 <!-- 信息 -->
			
			<c:forEach items="${list}" var="b">			
			<div class="Second">
				<div class="Second-line">${b.USERNAME }</div>
			</div>	
			</c:forEach>
			
			<c:if test="${nowpage>1 }">
				<a href="fenye?page=${nowpage-1 }" >上一页</a>			
			</c:if>
			<c:if test="${nowpage <totalpage}">
				<a href="fenye?page=${nowpage+1 }" >下一页</a>	
			</c:if>
			${nowpage }/${totalpage }页
				
		</div>
		${nowpage }
		${totalpage }
	</div>
</body>
</html>