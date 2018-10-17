<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 .divmess{
	           margin-top: 0px;
	        }
    .divtop{
            margin: auto;
	          text-align: center;
	          width:1800px;
	          height:435px;
	        }   
			table{
				margin: auto;
				width: 720px;		
				
			}
		
			td{ 
				border-right: 1px solid #99CCFF;
				border-bottom: 1px solid #99CCFF;
				line-height: 45px;
			}
			.td1{
			
			    width:250px;
				text-align: right;
				background-color: #E9DBFF;
			}
			.td2{
				border-bottom:2px solid  #99CCFF;
				border-right: 1px solid #99CCFF;
				text-align: left;
				background-color: #E0E9F9;
			}
			.d1{
			    
				color:purple ;
				font-size:15px;
			}
			.but1{
			text-align:center;
      
       width:70px;
       height:32px;
       border:0px;
       color:black;
 background-image:url("img/88.png");
       font-size:20px;
			}
			
			
		
		
		</style>
				<script type="text/javascript" src="/Piloteer/js/jquery.js"></script>
		<script type="text/javascript">
		function ff(){
			
			document.form1.submit();
			
		}
		function isname(){
			  var username= $("#username").val();
		
			  $.ajax({
		 	   url:"ajaxisname",
			   type:"POST",
			   dataType:"json",
			   data:{
				   "username":username
				   
			   },
			   async:false,
			   success:function(data){
				  
				   data=data+"";
				if(data=="true"){
					
					document.getElementById("lab1").innerHTML="该用户名称已存在";
				}else{
					document.getElementById("lab1").innerHTML="该用户名称未被使用";
					
				}
				
				
			   }
		 });
		 }
		function istel(){
			  var tel= $("#tel").val();
			
			  $.ajax({
		 	   url:"ajaxistel",
			   type:"POST",
			   dataType:"json",
			   data:{
				   "tel":tel
				   
			   },
			   async:false,
			   success:function(data){
				  
				   data=data+"";
				if(data=="true"){
					
					document.getElementById("f4").innerHTML="电话号码已被占用";
				}else{
					document.getElementById("f4").innerHTML="电话号码未被使用";
					
				}
				
				
			   }
		 });
		 }
		</script>
</head>
<body>

<div  class="divtop">

	<img alt="" src="img/4c.jpg">
</div>		
			
    <div class="divmess">
    
   <form action="/Piloteer/Ezhuce"  name="form1" method="post">
  
    <table >

			<tr>
				<td class="td1">登录名:</td>
				<td class="td2"><input  type="text" name="username" id="username" onblur="isname()"> 
				
				<label id="lab1" class="d1">可包含a-z的字符串（6-15位)</label>
			    </td>
			</tr>
			<tr>
				<td class="td1">密码:</td>
				<td class="td2"><input type="password"  name="password"><font id="f2" class="d1">至少包含6个a-z、0-9范围的字符。</font></td>
			</tr>
		<tr>
				<td class="td1">再次确认密码:</td>
				<td class="td2"><input type="password" name="conpassword"><font id="f3" class="d1">确认两次输入一致</font></td>
			</tr>
			<tr>
				<td class="td1">手机号:</td>
				<td class="td2"><input type="text" name="tel" id="tel"  onblur="istel()"><label id="f4" class="d1">仅限中国大陆手机号 </label></td>
			</tr>
			
				
		
			<tr>
				<td class="td1"><input type="reset" value="重填" class="but1"></td>
				<td class="td2"><input  type="button" value="注册" class="but1" onclick="ff()" >
				
				

				</td>
			
			</tr>
			
			
		</table>
	</form>
		</div>
</body>
</html>