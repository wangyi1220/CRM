<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
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
       <h1>用户修改</h1>
       <form action="usersctrl/add.do" method="post"
            enctype="multipart/form-data">
            
            <table border="1" width="40%" cellpadding="0" cellspacing="0" 
               >
                <tr>
                  <td style="text-align: right;">用户名</td>
                  <td>
                 
                      <input type="text" name="uname">
                  </td>
                </tr>
                <tr>
                  <td style="text-align: right;">密码</td>
                  <td>
                      <input type="password" name="upass">
                  </td>
                </tr>
                <tr>
                  <td style="text-align: right;">年龄</td>
                  <td>
                      <input type="text" name="age">
                  </td>
                </tr>
                <tr>
                  <td style="text-align: right;">性别</td>
                  <td>
                      <input type="radio" name="sex" value="男" checked="checked">男
                      <input type="radio" name="sex" value="女" >女
                  </td>
                </tr>
                <tr>
                  <td style="text-align: right;">生日</td>
                  <td>
                      <input type="text" name="birthday">
                  </td>
                </tr>
                <tr>
                   <td style="text-align: right;">状态</td>
                   <td>
                      <select name="active">
                          <option value="0" selected="selected">启用</option>
                          <option value="1">禁用</option>
                      </select>
                   </td>
                </tr>
                <tr>
                   <td style="text-align: right;">照片</td>
                   <td>
                      <input type="file" name="upload">
                   </td>
                </tr>
                 <tr>
                    <td colspan="2" style="text-align: center;">
                      <input type="submit" value="提交">
                   </td>
                </tr>
                
            </table>
            
       </form>
       
     </center>
  </body>
</html>
