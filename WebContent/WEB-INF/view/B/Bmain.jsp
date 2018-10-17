<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
@IMPORT url("<%=request.getContextPath() %>/css/Bmy.css");
</style>
<style>
	
p{
	color: powderblue;
	
}
a{
text-decoration:none; 
}
a:HOVER {
	background-color: #82C7FF;
   }
</style>
</head>
<body>
	<div class="div0">
<div class="div1">
<table >
<tr>
	<td>
		<p>领航者二手车<br>
		您购买二手车<br>
		的不二选择</p>
	</td>
</tr>

<tr>
    <td>
		<a href="indent" target="iframe1">订单信息</a>
	</td>
</tr>
<tr>
	<td>
		<a href="xiadan" target="iframe1">下单信息</a>
	</td>
</tr>
<tr>
	<td>
		<a href="collect" target="iframe1">收藏</a>
	</td>
</tr>
</table>
</div>
<div class="div2">
<iframe src="collect" width="1000" height="800"  name="iframe1">
	
	
</iframe>
</div>
</div>
</body>
</html>