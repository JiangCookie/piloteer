<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
@IMPORT url("<%=request.getContextPath() %>/css/Bsc.css");
</style>
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
	background-color: #EBF2F2;
   }
</style>
<script type="text/javascript">

function dels(dd){
location.href="Delcollect?id="+dd;

}

</script>
</head>
<body>
<table>
<tr>
    <td height="200">
    
    </td>
</tr>
</table>
<form action="Delcollect" name="form1"> 
	<table class="tab11"  cellpadding="0" cellspacing="0" >
		<tr class="tdmess">
		<td align="center">
		车辆简述
		</td>
			
			<td  align="center">
				价格价格区间
			</td>
			<td  align="center">
			       操作
			</td>
			
		</tr>
 
	<c:forEach items="${list}" var="m">
	
	<tr>
	<input type="hidden" value="" name="id">
	<td align="center">
	<img alt="" src="/springmvc1806/upfile/
	${m.newfilename}" ><br>该车为${m.BRAND}车型，车系是${m.CARTYPE}
	</td>
	
	<td align="center">
	${m.PRICESECTION}
	</td>
	<td align="center">
	<input type="button" value="移除" onclick="dels(${m.ID })">
	</td>
	</tr>	
	</c:forEach>
	</table>
	

	</form>
</body>
</html>