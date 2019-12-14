<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!--日期格式化  -->
<%@ page import="java.text.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addofficeKpi.jsp' starting page</title>
    
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
    <form action="OfficeKpictrl/addofficeKpi.do">
    <table>
           <tr><td>考核任务指标：</td><td><input type="text" name="kpiKpi"  ></td></tr>
           <tr><td>考核任务详情：</td><td><input type="text" name="kpiDetail"></td></tr>
           <tr><td>所属公司：</td><td><input type="text" name="companyId" ></td></tr>
           <%-- <input type="hidden" name="finalUpdataTime" value="<%=new Date().getTime() %>"> --%>
          <tr><td><input type="submit" value="提交"></td><td>
           <input type="reset" value="重置"></td></tr>
    </table>
    </form>
    </center>
  </body>
</html>
