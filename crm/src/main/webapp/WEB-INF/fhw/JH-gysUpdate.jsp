<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'JH-gysAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <script src="js/jquery.min.js"></script>
	<link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_self">
	
	
  </head>
  
  <body>
  		
  		<center>
  			<h1>供应商信息修改</h1>
  		</center>
  		<form action="GongYingShangctrl/gysAdd.do">
  			<span style="position:absolute;left:100px; ">供应商名称：<input type="text" name="gysName" value="${gysUpdate.gysName }"></span>
  			<span style="position: absolute;right:200px; ">供应商简称：<input type="text" name="gysJc" value="${gysUpdate.gysJc }"></span><br><br>
  			<span style="position:absolute;left:100px; ">联系人：&emsp;&emsp;<input type="text" name="lxr" value="${gysUpdate.lxr }"></span>
  			<span style="position: absolute;right:200px; ">固定电话：<input type="text" name="gdPhone" value="${gysUpdate.gdPhone }"></span><br><br>
  			<span style="position:absolute;left:100px; ">移动电话：&emsp;<input type="text" name="ydPhone" value="${gysUpdate.ydPhone }"></span>
  			<span style="position: absolute;right:200px; ">联系传真：<input type="text" name="lxcz" value="${gysUpdate.lxcz }"></span><br><br>
  			<span style="position:absolute;left:100px; ">联系地址：&emsp;<input type="text" name="lxdz" value="${gysUpdate.lxdz }"></span>
  			<span style="position: absolute;right:200px; ">联系邮编：<input type="text" name="lxyb" value="${gysUpdate.lxyb }"></span><br><br>
  			<span style="position:absolute;left:100px; ">邮箱：&emsp;&emsp;&emsp;<input type="text" name="mail" value="${gysUpdate.mail }"></span>
  			<span style="position: absolute;right:200px; ">开户银行：<input type="text" name="khbank" value="${gysUpdate.khbank }"></span><br><br>
  			<span style="position:absolute;left:100px; ">银行账户：&emsp;<input type="text" name="yhzh" value="${gysUpdate.yhzh }"></span>
  			<span style="position: absolute;right:200px; ">公司主页：<input type="text" name="gszy" value="${gysUpdate.gszy }"></span><br><br>
  			<span style="position:absolute;left:100px; ">操作人员：&emsp;<input type="text" name="operator" value="${gysUpdate.operator }"></span>
  			<span style="position: absolute;right:200px; ">备注信息：<input type="text" name="remark" value="${gysUpdate.remark }"></span><br><br>
  			<br><br><br>
			<center>
  				<button class="btn btn-primary " type="submit" > <i class="fa fa-check"></i>&nbsp;提交</button>
  				<button class="btn btn-primary " type="reset" ><i class="fa fa-check"></i>&nbsp;清空</button>
  			</center>
  			
  		</form>
  </body>
</html>


<script>
	$(document).ready(function() {
			
			$("h1").click(function() {
				alert("wwwwwwwwww")
			})
			
			
	})
</script>
