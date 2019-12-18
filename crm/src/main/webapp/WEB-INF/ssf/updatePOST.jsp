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
       <h1>部门修改</h1>
       <form action="SysPostCtrl/update.do" method="post">
            
            <table border="1" width="40%" cellpadding="0" cellspacing="0" 
               >
                <tr>
                  <td style="text-align: right;">职务编号</td>
                  <td>
                      <input type="text" name="postId" value="${u.postId }">
                   
                  </td>
                </tr>
               <tr>
                  <td style="text-align: right;">职务名称</td>
                  <td>
                      <input type="text" name="postName" value="${u.postName }">
                      
                  </td>
                  <tr>
                  <td style="text-align: right;">部门编号</td>
                  <td>
                      <input type="text" name="deptId" value="${u.deptId }">
                  </td>
                  <tr>
                  <td style="text-align: right;">备注</td>
                  <td>
                      <input type="text" name="beizhu" value="${u.beizhu }">
                  </td>
                </tr>
                <tr>
                  <td style="text-align: right;">公司编号</td>
                  <td>
                      <input type="text" name="companyId" value="${u.companyId }">
                  </td>
                </tr>
                
              
                 <tr>
                  <td style="text-align: right;">最后修改时间</td>
                  <td>
                      <input type="text" name="changDate" value="<fmt:formatDate value="${u.changDate }" pattern="yyyy-MM-dd"/>">
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
