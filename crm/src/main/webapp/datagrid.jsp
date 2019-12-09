<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 引入css -->
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5.5/themes/icon.css">
	<!-- 引入js -->
	<script type="text/javascript" src="js/jquery-easyui-1.5.5/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery-easyui-1.5.5/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/jquery-easyui-1.5.5/locale/easyui-lang-zh_CN.js"></script>
  </head>
  
  <body>
    <table id="tbl"></table>
  </body>
</html>
<script>
	
	$("#tbl").datagrid({
		url:"usersctrl/listjson.do",
		dataType:"json",
		width: "330px",
		columns:[
			[
				{field:"uid",title: "编号",width:"100px"},
				{field:"uname",title: "用户名",width:"100px"},
				{field:"sex",title: "性别",width:"100px"}
			]
		]
	})
	
</script>