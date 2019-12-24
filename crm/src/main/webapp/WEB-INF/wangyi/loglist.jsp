<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
        
        <form action="SysLogCtrl/selectLog.do" method="post" target="_self">
   		
   			<h2 id="h1" style="font-weight: bolder;">楞头一下</h2>
   			
   			<input type="text" style=" width: 200px;height: 30px;font-size: 16pt; " name="visitDate" placeholder="按日期搜索">
   			
   			<input type="text" style=" width: 200px;height: 30px;font-size: 16pt; " name="userId" placeholder="按用户id搜索">
   			
   			<button   type="submit" class="btn btn-primary btn-lg" 
   			 style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px" >楞头一下</button>
   			<a href="SysLogCtrl/deleteAll.do" target="_self" onclick="return confirm('是否确认清空日志')">
            	<button type="button" class="btn btn-w-m btn-primary" style="margin-left: 200px">清空日志</button>
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
                                    <th>日志序号</th>
                                    <th>用户id</th>
                                    <th>用户登陆ip</th>
                                    <th>用户操作</th>
                                    <th>用户操作时间</th>
                                    <th style="text-align: center;">操作</th>
                                    
                                  <!--   <th data-hide="all">日期</th> -->
                                </tr>
                                </thead>
                                <tbody>
             			<c:forEach items="${l.list}"  var="log">                   
            					 <tr>
                   					 <td><input type="checkbox" name="c1" class="c1" value="${log.logId}"></td>
                    
                                 	<td> ${log.logId}</td>
									<td>${log.userId} </td>
				                    <td>${log.visitIp}</td>
				                    <td>${log.power} </td>
				                    <td><fmt:formatDate value="${log.visitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				                    <td style="text-align: center;">
				                    	<a href="SysLogCtrl/deleteLog.do?logId=${log.logId}" target="_self" onclick="return confirm('是否确认删除')">删除</a>
				                    </td>
				                 
               		 </tr>
			       
            </c:forEach>
            </tbody></table>
          		<center>
          			  <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
	                	  <tr>
				             <td style="text-align: center;" colspan="8">
				                <a href="SysLogCtrl/selectLog.do?pageNum=${l.firstPage }" target="_self">首页</a>
				                <a href="SysLogCtrl/selectLog.do?pageNum=${l.prePage }" target="_self">上一页</a>
				                <a href="SysLogCtrl/selectLog.do?pageNum=${l.nextPage }" target="_self">下一页</a>
				                <a href="SysLogCtrl/selectLog.do?pageNum=${l.lastPage }" target="_self">尾页</a>
				                                       当前${l.pageNum }/${l.pages }页，共${l.total }条
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
			swal({title:"太帅了",text:"删除日志成功",type:"success"})
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
				location.href="SysLogCtrl/deleteLog.do?"+a;
				
		})
				
			
				
	})
</script>