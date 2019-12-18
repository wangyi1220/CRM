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
       <form action="SysUsersInfoCtrl/add.do" method="post" enctype="multipart/form-data">
          <table width="40%" border="1">
            <tr>
              <td>用户名</td>
              <td>
                <input type="text" name="empName">
              </td>
            </tr>
            <tr>
              <td>电话号码</td>
              <td>
                <input type="text" name="phoneNumber">
              </td>
            </tr>
            <tr>
              <td>性别</td>
              <td>
                <input type="radio" name="empSex" value="男" checked="checked">男
                <input type="radio" name="empSex" value="女">女
              </td>
            </tr>
     
            
            <tr>
              <td>图片</td>
              <td>
               <input type="file" name="upload">
              </td>
            </tr>
            <tr>
              <td>用户状态状态</td>
              <td>
                <select name="checkState">
                  <option value="0">启用</option>
                  <option value="1">禁用</option>
                </select>
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