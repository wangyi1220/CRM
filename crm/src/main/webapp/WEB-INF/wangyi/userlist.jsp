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
    
    <title>My JSP 'JH-gysAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="shortcut icon" href="<%=basePath%>favicon.ico"> <link href="<%=basePath%>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

  </head>
  
  <body>
   		    
  <div class="container">
        
        <form action="SysUsersCtrl/userList.do" method="post" target="_self">
   		
   			<h2 id="h1" style="font-weight: bolder;">楞头一下</h2>
   			
   			<select class="chosen-select" style="width:200px;" name="usersId">
                  <option value="0" hassubinfo="true">按账号搜索</option>
                  <option value="1" hassubinfo="true">按姓名搜索</option>
             </select>
   			
   			<input type="text" style=" width: 200px;height: 30px;font-size: 16pt; " name="usersName">
   			
   			<button   type="submit" class="btn btn-primary btn-lg" 
   			 style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px;margin-left: 25px" >楞头一下</button>
   			<a id="printExcel"  target="_self">
	           	<button   type="button" class="btn btn-primary btn-lg" 
   			 	style="width: 100px;height: 30px;
   				border: 1px solid blue;position: absolute;top: 56px;line-height: 10px;margin-left: 150px" >导出excel</button>
	        </a>
   		</form>	
   			<div id="div1" style="width: 200px;height: 160px;
   			border: 1px solid red;position:absolute;
   			left: 60px;top:87px;display: none"></div>
   		  <br>  <br> 
   		
      	<h3 style="display: inline-block;"><a id="deleteSelect"  target="_self">删除选中</a></h3>
       
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true"><input type="checkbox" id="selectAll" ></th>
                                    <th>用户序号</th>
                                    <th>用户账号</th>
                                    <th>用户姓名</th>
                                    <th>用户状态</th>
                                    
                                    <th style="text-align: center;">操作</th>
                                    
                                  <!--   <th data-hide="all">日期</th> -->
                                </tr>
                                </thead>
                                <tbody>
             			<c:forEach items="${u.list}"  var="user">                   
            					 <tr>
                   					 <td><input type="checkbox" name="c1" class="c1" value="${user.usersId}"></td>
                    
                                 	<td> ${user.usersId}</td>
									<td>${user.usersName} </td>
				                    <td>${user.sysUserinfo.empName}</td>
				                    <td>${user.usersState=='0' ? '可用':'禁用'} </td>
				                    
				                    <td style="text-align: center;">
				                    	
				                    	<a href="SysUsersCtrl/deleteUser.do?usersId=${user.usersId}"  target="_self" onclick="return confirm('是否确认删除？')">删除</a>
				                    </td>
				                 
               		 </tr>
			       
            </c:forEach>
            </tbody></table>
          		<center>
          			  <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
	                	  <tr>
				             <td style="text-align: center;" colspan="8">
				                <a href="SysUsersCtrl/userList.do?pageNum=${u.firstPage }" target="_self">首页</a>
				                <a href="SysUsersCtrl/userList.do?pageNum=${u.prePage }" target="_self">上一页</a>
				                <a href="SysUsersCtrl/userList.do?pageNum=${u.nextPage }" target="_self">下一页</a>
				                <a href="SysUsersCtrl/userList.do?pageNum=${u.lastPage }" target="_self">尾页</a>
				                                       当前${u.pageNum }/${u.pages }页，共${u.total }条
				             </td>
				          </tr> 
			          </table>
         		</center>
        
    </div>
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    <script src="<%=basePath%>js/plugins/sweetalert/sweetalert.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
  </body> 
 
</html>




<script type="text/javascript">
	$(document).ready(function(){
		
		if(${isdel=='yes'}){
			swal({title:"太帅了",text:"删除用户成功",type:"success"})
		}

	 //全选
		$("#selectAll").click(function(){
			if($(this).prop("checked")){
				$(".c1").prop("checked", true)
			}else{
				$(".c1").prop("checked",false)
			}
		})
	
		//选中删除
		$("#deleteSelect").click(function(){
		
			 var myArr=new Array();
			 var a=""
			myArr=$("input[name='c1']")
			var i
			for(i=0;i<myArr.length;i++){
				if(myArr[i].checked==true){
					a+="delid="+myArr[i].value+"&";
				}
			}
				
				//alert(a)
				/* a="caiGouDanCtrl/gysDeleteSelect.do?"+a
				$("#deleteSelect").attr("href", a)
				alert($("#deleteSelect").attr("href")) */
				location.href="SysUsersCtrl/deleteUser.do?"+a;
				
		});
		
		//打印excel
		$("#printExcel").click(function(){
		
			 var myArr=new Array();
			 var a=""
			myArr=$("input[name='c1']")
			var i
			for(i=0;i<myArr.length;i++){
					a+="print="+myArr[i].value+"&";
			}
				
				//alert(a)
				/* a="caiGouDanCtrl/gysDeleteSelect.do?"+a
				$("#deleteSelect").attr("href", a)
				alert($("#deleteSelect").attr("href")) */
				location.href="SysUsersCtrl/printExcel.do?"+a;
				
		})
				
			
				
	})
</script>