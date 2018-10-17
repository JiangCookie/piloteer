<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>


</head>
<body>
<div id="MainForm">
<div class="form_boxA">
<h2>用户卖车上传表</h2>
<table cellpadding="0" cellspacing="0">
<tr>
<th>序号</th>
<th>用户名</th>
<th>品牌</th>
<th>车系</th>
<th>里程数</th>
<th>上牌时间</th>
<th>车牌所在地</th>
<th>车况</th>
<th>价格</th>
<th>审核情况</th>
<th>操作</th>
</tr>


 <c:forEach items="${list}" var="m">
          <tr>    
               <td>${m.ID}</td>
             <td>${m.USERNAME}</td>
          
             <td>${m.BRAND}</td>
             
             <td>${m.CARTYPE}</td>             
               <td>${m.MILE}</td>
               <td><a href="">${m.TIME}</a></td>
               <td>${m.AREA }</td>
               <td>${m.TYPE}</td>  
               <td>${m.PRICE}.00元</td>  
               <td>审核通过</td>
<td><a href="#">查看</a> | <a href="#">操作</a></td>
 </tr>
 </c:forEach>                      
              
            




</table>
<p class="msg">共找到1条用户上传记录，当前显示从第1条至第10条</p>
</div>
</div>

</body>
</html>