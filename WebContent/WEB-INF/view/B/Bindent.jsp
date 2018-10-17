<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   .tab11{
       margin:auto;
       width: 900px;
       border-left: 1px solid #E57DCB; 
       border-top: 1px solid #E57DCB; 
       text-align: center;
   }
   .tab11 td{
      border-bottom: 1px solid #E57DCB; 
      border-right: 1px solid #E57DCB; 
      height: 30px;
   }
   .tdmess{
      font-size: 13px;
      font-weight: bold;
   }
   tr:HOVER {
	background-color: #ECFFFF;
   }
</style>
</head>
<body>
<table>
<tr>
    <td height="200">
    
    </td>
</tr>
</table>
 <table class="tab11" cellpadding="0" cellspacing="0" >
               <tr class="tdmess">
               <td>订单编号</td>
               <td>订单时间</td>
               <td>品牌</td>
               <td>车系</td>             
               </tr>
             <!-- 数据 -->
             <c:forEach items="${list}" var="m">
             <tr>
               <!-- <td><img alt="" src="/Piloteer/upfile/${m.ID }" width="60"></td>   -->
               <td>${m.INDENT}</td>
               <td>${m.TIME}</td>
               <td>${m.BRAND}</td>
               <td>${m.CARTYPE}</td>
               </tr>
             </c:forEach>
             </table>
</body>
</html>