<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'zhuce.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("#uname").blur(function(e) {
  			var uname=$(this).val();
  			$.ajax({
  				type: "post",
  				url: "loginctrl/checkuname.do",
  				data: "uname="+uname,
  				dataType:"json",
  				success:function(d){
  					console.log(d);
  					$("#sp").html(d.msgContent);
  				},
  				error: function(e){
  					console.log(e);
  					alert("检测用户名失败");
  				}
  			});
  		});
  	});
  </script>
  
  <body>
    <center>
    	<form action="">
    		用户名：<input type="text" name="uname" id="uname" placeholder="请输入用户名"> 
    			  <span id="sp" style="color: red"></span>
    	</form>
    </center>
  </body>
</html>
