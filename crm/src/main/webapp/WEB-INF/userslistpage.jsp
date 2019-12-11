<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userslist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    	<h1>用户列表</h1>
    	<h2><a href="usersctrl/goadd.do">添加用户</a></h2>
    	<table border="1" width="80%" style="text-align: center" cellpadding="0" cellspacing="0">
    		<tr>
    			
    			<th>用户名</th>
    			<th>密码</th>
    			
    		</tr>
    		<c:forEach items="${p.list }" var="user">
	    		<tr>
	    			
	    			<td>${user.usersName }</td>
	    			<td>${user.usersPassword }</td>
	    			
	    		</tr>
    		</c:forEach>
    		
    		 <tr>
             <td style="text-align: center;" colspan="2">
                <a href="SysUsersCtrl/listPage.do?pageNum=${p.firstPage }">首页</a>
                <a href="SysUsersCtrl/listPage.do?pageNum=${p.prePage }">上一页</a>
                <a href="SysUsersCtrl/listPage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="SysUsersCtrl/listPage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr>
    		
    		
    		
    	</table>
    
    
    
    </center>
  </body>
</html>
