<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_self">
	
	
  </head>
  
  <body>
  		<center>
  			<h1>添加供应商</h1>
  		</center>
  		<form action="GongYingShangctrl/gysAdd.do">
  			<span style="position:absolute;left:100px; ">供应商名称：<input type="text" name="gysName"></span>
  			<span style="position: absolute;right:200px; ">供应商简称：<input type="text" name="gysJc"></span><br><br>
  			<span style="position:absolute;left:100px; ">联系人：&emsp;&emsp;<input type="text" name="lxr"></span>
  			<span style="position: absolute;right:200px; ">固定电话：<input type="text" name="gdPhone"></span><br><br>
  			<span style="position:absolute;left:100px; ">移动电话：&emsp;<input type="text" name="ydPhone"></span>
  			<span style="position: absolute;right:200px; ">联系传真：<input type="text" name="lxcz"></span><br><br>
  			<span style="position:absolute;left:100px; ">联系地址：&emsp;<input type="text" name="lxdz"></span>
  			<span style="position: absolute;right:200px; ">联系邮编：<input type="text" name="lxyb"></span><br><br>
  			<span style="position:absolute;left:100px; ">邮箱：&emsp;&emsp;&emsp;<input type="text" name="mail"></span>
  			<span style="position: absolute;right:200px; ">开户银行：<input type="text" name="khbank"></span><br><br>
  			<span style="position:absolute;left:100px; ">银行账户：&emsp;<input type="text" name="yhzh"></span>
  			<span style="position: absolute;right:200px; ">公司主页：<input type="text" name="gszy"></span><br><br>
  			<span style="position:absolute;left:100px; ">操作人员：&emsp;<input type="text" name="operator"></span>
  			<span style="position: absolute;right:200px; ">备注信息：<input type="text" name="remark"></span><br><br>
  			<br><br><br>
			<center>
  				<button class="btn btn-primary " type="submit" > <i class="fa fa-check"></i>&nbsp;提交</button>
  				<button class="btn btn-primary " type="reset" ><i class="fa fa-check"></i>&nbsp;清空</button>
  			</center>
  			
  		</form>
  </body>
</html>
