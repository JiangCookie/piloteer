<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">

  .tab11{
  margin:auto;
       width:1399px;
       border-top: 1px solid #E3E3E3; 
        border-left:1px solid #E3E3E3;
        line-height: 40px;
       text-align: center;
       
   }
   td{
      border-bottom: 1px solid #E3E3E3; 
      border-right: 1px solid #E3E3E3; 
      
   }
   a{
   text-decoration: none;
   }
</style>

</head>
<body>

<table class="tab11" cellpadding="0" cellspacing="0" >
               <tr class="tdmess">           
               <td>编号</td>
               <td>车主姓名</td>
               <td>车龄</td>
               <td>品牌</td>    
             
               <td>里程</td>
               <td>排量</td>    
               <td>排放标准</td> 
               <td>座数</td>  
                <td>车系</td>  
                 <td>颜色</td>
                 <td colspan="2">审查结果</td> 
                             
               </tr>
                <!-- 数据 -->
             <c:forEach items="${list}" var="m">
             <tr>              
               <td>${m.ID}</td>
               <td><a href="edit=${m.INDENT}">${m.USERNAME}</a></td>
               <td>${m.AGE }</td>
               <td>${m.BRAND}</td>  
               <td>${m.MILE}</td>
               <td>${m.OIL}</td>
               <td>${m.STANDARD}</td>
               <td>${m.NUM}</td>
               <td>${m.CARTYPE}</td>
               <td>${m.COLOR}</td>
                 <td><a href="">通过</a></td>
                 <td><a href="">驳回</a></td>                
               </tr>
             </c:forEach>
             </table>
        
</body>
</html>