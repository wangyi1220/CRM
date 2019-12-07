<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'b.jsp' starting page</title>
    
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
       这是b.jsp页面
      <br>
      
      <%
        request.setCharacterEncoding("UTF-8");//设置请求字符编码
        String s=request.getParameter("uname");//通过参数名称获取参数值
        if(s==null){
           out.println("请先登录！");
           out.println("<br><a href='a.jsp'>点击登录</a>");
        }else{
           out.println("你好："+s);
        }
       %>
       
  </body>
</html>
