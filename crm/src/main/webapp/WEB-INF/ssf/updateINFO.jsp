<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUser.jsp' starting page</title>
    
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
       <form action="SysUsersInfoCtrl/update.do" method="post"
            enctype="multipart/form-data">
            
            <table border="1" width="40%" cellpadding="0" cellspacing="0" 
               >
                <tr>
                  <td style="text-align: right;">员工姓名</td>
                  <td>
                      <input type="hidden" name="empId" value="${u.empId }">
                      <input type="text" name="empName" value="${u.empName }">
                  </td>
                </tr>
               <tr>
                  <td style="text-align: right;">性别</td>
                  <td>
                      <input type="radio" name="empSex" value="男" ${u.empSex=="男" ? "checked":"" }>男
                      <input type="radio" name="empSex" value="女" ${u.empSex=="女" ? "checked":"" }>女
                  </td>
                </tr> 
               <%--  <tr>
                  <td style="text-align: right;">年龄</td>
                  <td>
                      <input type="text" name="age" value="${u.empPhoto }">
                  </td>
                </tr> --%>
              <%--   <tr>
                  <td style="text-align: right;">生日</td>
                  <td>
                      <input type="text" name="idNumber" value="<fmt:formatDate value="${u.birthday }" pattern="yyyy-MM-dd"/>">
                  </td>
                </tr> --%>
              <!--   <tr>
                   <td style="text-align: right;">状态</td> -->
                   <td style="text-align: right;">用户状态</td>
                  <td>
                   		 <select name="checkState">
                          <option ${u.checkState=="0" ? "selected":"" } value="0">禁用</option>
                          <option ${u.checkState=="1" ? "selected":"" } value="1">启用</option>
                      </select>
                   </td>
               <!--  </tr> -->
                <tr>
                   <td style="text-align: right;">照片</td>
                   <td>
                   <input type="hidden" name="empPhoto" value="${u.empPhoto }">
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
