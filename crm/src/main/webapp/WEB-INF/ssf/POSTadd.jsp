<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'usersadd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 引入日历控件js -->
	<script language="javascript" type="text/javascript" src="<%=basePath %>js/My97DatePicker/WdatePicker.js"></script>

  </head>
  
  <body>
    
    <center>
       <h2>添加用户</h2>
       <form action="SysPostCtrl/add.do" method="post">
          <table width="40%" border="1">
            <tr>
              <td>职务编号</td>
              <td>
                <input type="text" name=postId>
              </td>
            </tr>
            <tr>
              <td>职务名称</td>
              <td>
                <input type="text" name="postName">
              </td>
            </tr>
             <tr>
              <td>部门编号</td>
              <td>
                <input type="text" name="deptId">
              </td>
            </tr>
              <tr>
              <td>备注</td>
              <td>
                <input type="text" name="beizhu">
              </td>
            </tr>
             <tr>
              <td>公司编号</td>
              <td>
                <input type="text" name="companyId">
              </td>
            </tr>
     
            
           
            
            <tr>
              <td colspan="2" align="center">
                 <input type="submit" value="提交">
              </td>
            </tr>
          </table>
       </form> 
    </center>

  </body>
</html>