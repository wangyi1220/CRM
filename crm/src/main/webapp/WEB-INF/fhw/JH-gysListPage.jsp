<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gysListPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
  </head>
  
  <body>
   		    
  <div class="container">
        
        
   		
   			<h2 id="h1">楞头一下</h2>
   			<input type="text" id="t1" style=" width: 400px;height: 60px;font-size: 16pt; ">
   			<input type="button"  id="b1"  style="width: 100px;height: 60px;border: 1px solid blue" value="楞头一下">
   			<div id="div1" style="width: 400px;height: 130px;border: 1px solid red;position: relative;margin-left: -105px;margin-top: -5px;display: none"></div>
   		
   
        <h1><a href="gysAdd">添加供应商</a></h1>
        <table class="table table-hover table-bordered table-striped table-condensed">
            <thead>
                <tr>
                    <td><input type="checkbox" ></td>
                    <td>供应商编号 </td>
                    <td>供应商名称 </td>
                    <td>联系人 </td>
                    <td>联系电话 </td>
                    <td>开户银行 </td>
                    <td>银行卡号 </td>
                    <td>备注信息 </td>
                    <td>状态 </td>
                    <td>操作 ${pGsy.list.size()}</td>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${pGsy.list}"  var="gsy">
                <tr>
                    <td><input type="checkbox" ></td>
                                 	<td> ${gsy.gysName}</td>

                    
                    <td>
                    		<input type="button" value="删除"> 
                    		<input type="button" value="修改"> 
                    </td>
                </tr>
               </c:forEach>
                
            </tbody>
        </table>
        
    </div>
  </body>
</html>




<script type="text/javascript">
	$(document).ready(function(){
	
	//仿百度提示搜索
			
				$("#t1").keyup(function(){
				
						if($("#t1").val()!=""){
							var data=$(this).val();
							$.post("gysSearch.do",{data:data},function(data,status){
								
										$("#div1").show();
										$("#div1").html(data)
									
								
							})
						}else{
							$("#div1").hide()
						}
				})
			
				
	})
</script>
