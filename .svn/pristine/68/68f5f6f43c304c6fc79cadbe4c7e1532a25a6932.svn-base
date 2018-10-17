<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.t1{
width: 1200px;
height: 900px;
font-family: "微软雅黑";
font-size: 17px;
}
.d1{
font-size: 30px;
color: #2EA1FE;
font-family: "微软雅黑";
}
tr:HOVER {
background-color: #C8E6FF;
}
td{
width: 350px;
}
#s1{
width: 200px;
}
#b1{
background-color: #82C7FF;
width: 400px;
border: 0px;
height: 50px;
font-family: "微软雅黑";
font-size: 20px;
}

</style>
<script type="text/javascript">
function ff() {
	document.form1.submit();
}
</script>
</head>
<body>
<form:form commandName="dsell" action="/Piloteer/showtt" method="post" name="form1">
<table align="center" class="t1">
<div align="center" class="d1">
只差两步，多卖20%，七天成交
</div>
<tr>
<td>售卖车型：</td>
<td>
<select name="brand" id="s1">	
<c:forEach items="${brand}" var="b">
<option value="">${b.BRAND }</option>		
</c:forEach>
</select>
<form:errors path="brand"/>
</td>
<td>
<select name="cartype" id="s1">	
<c:forEach items="${cartype}" var="b">
<option value="">${b.CARTYPE }</option>		
</c:forEach>
</select>
</td>
<form:errors path="cartype"/>
</tr>
<tr>
<td>上牌时间：</td>
<td>
<select id="s1" name="year">
<option value="1">2018年</option>
<option value="2">2017年</option>
<option value="3">2016年</option>
<option value="4">2015年</option>
<option value="5">2014年</option><form:errors path="year"/>
</select>

</td>
<td>
<select name="month" id="s1">	
	<c:forEach items="${month}" var="b">
		<option value="">${b.MONTH }</option>		
	</c:forEach>
</select>
</td>
<form:errors path="month"/>
</tr>
<tr>
<td>行驶里程：</td>
<td>
<input type="text" name="text">万公里
</td>
</tr>
<tr>
<td>牌照地：</td>
<td>
<select name="area" id="s1">	
	<c:forEach items="${area}" var="b">
		<option value="">${b.AREA }
		<form:errors path="area"/>
		</option>		
	</c:forEach>
</select>
</td>

</tr>
<tr>
<td>车况：</td>
<td>
 <select name="type" id="s1">	
<c:forEach items="${con}" var="b">
<option value="">${b.TYPE }</option>		
</c:forEach>
</select>
</td>
<form:errors path="type"/>
</tr>
<tr>
<td>后续需求：</td>
<td>
<input type="radio" checked="checked" id="r1">买新车
<input type="radio">买二手车
<input type="radio">无购车计划
</td>
</tr>
<tr>
<td></td>
<td colspan="3" align="center">
<input type="button" value="下一步" onclick="ff()" id="b1">
</td>
</tr>
</table>
<div id="footer">
	<div class="foot-a1">
		<div class="wrap">
			<ul class="clearfix">
            	<li>
                	<img src="images/db1.png"/>
                    <p>365项检测认证</p>
                </li>
                <li>
                	<img src="images/db2.png"/>
                    <p>5000公里无需保养</p>
                </li>
                <li>
                	<img src="images/db3.png"/>
                    <p>1年或两万公里无忧质保</p>
                </li>
                <li>
                	<img src="images/db4.png"/>
                    <p>7天无忧退换</p>
                </li>
                <li>
                	<img src="images/db5.png"/>
                    <p> 置换有增值</p>
                </li>
            </ul>
		</div>
	</div>

<div class="foot-a">
		<div class="wrap clearfix">
			<div class="fDl left dInline ">
				<strong>亿金承诺</strong>
				<ul>
					<li><a href="#">365项严苛检测</a></li>
                    <li><a href="#">5000公里无需保养</a></li>
                    <li><a href="#">一年或两万公里质保</a></li>
                    <li><a href="#">7天退换</a></li>
				</ul>
			</div>
			<div class="fDl left dInline ">
				<strong>买卖二手车指南</strong>
				<ul>
					<li><a href="../../../News/Content/channel/24/id/143.html" target="_blank">“禁止长时间停车”到底能</a></li><li><a href="../../../News/Content/channel/24/id/139.html" target="_blank">20年前开桑塔纳的大款们，</a></li><li><a href="../../../News/Content/channel/24/id/138.html" target="_blank">豪华入门跨界车之争,奔驰G</a></li><li><a href="../../../News/Content/channel/24/id/131.html" target="_blank">像初恋一样爱它，该给它怎</a></li><li><a href="../../../News/Content/channel/24/id/133.html" target="_blank">常开车不等于会开车 你的</a></li>				</ul>
			</div>
			<div class="fDl left dInline ">
				<strong>售后服务</strong>
				<ul>
					<li><a href="#">24小时道路救援</a></li>
                    <li><a href="#">豪车凹陷修复</a></li>
                    <li><a href="#">定期上门维修保养服务</a></li>
                    <li><a href="#">预约保养工时优惠</a></li>
				</ul>
			</div>
			<div class="fDl left dInline ">
				<strong>关于亿金</strong>
				<ul>
					<li><a href="../../../News/index/channel/28/list/30.html" target="_blank">亿金动态</a></li>
					<li><a href="../../../News/index/channel/28/list/39.html" target="_blank">亿金荣誉</a></li>
					<li><a href="../../../News/index/channel/28/list/37.html" target="_blank">亿金优势</a></li>
					<li><a href="../../../News/index/channel/28/list/41.html" target="_blank">联系亿金</a></li>
					<li><a href="../../../News/index/channel/28/list/42.html" target="_blank">评估团队</a></li>
				</ul>
			</div>
			<div class="fDl left dInline ">
				<strong>亿金文化</strong>
				<ul>
					<li><a href="#">诚·立中原</a></li>
                    <li><a href="#">信·立天下</a></li>
                    <li><a href="#">改变、规范、引领一方市场</a></li>
                    <li><a href="#">颠覆中原人购车理念</a></li>
				</ul>
			</div>

</form:form>
</body>
</html>