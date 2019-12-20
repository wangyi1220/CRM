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
	 <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
    
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/footable/footable.core.css" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">
  </head>
  
  <body>
   		    
  <div class="container">
        
        
   		
   			<h2 id="h1" style="font-weight: bolder;">楞头一下</h2>
   			<input type="text" id="t1" style=" width: 200px;height: 30px;font-size: 16pt; ">
   			
   			<button  id="b1"  type="button" class="btn btn-primary btn-lg" 
   			 style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px" >楞头一下</button>
   			
   			<div id="div1" style="width: 200px;height: 160px;
   			border: 1px solid red;position:absolute;
   			left: 60px;top:87px;display: none"></div>
   		  <br>  <br> 
   		
      	<h3 style="display: inline-block;"><a id="deleteSelect"  target="_self">删除选中</a></h3>
       
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true"><input type="checkbox" id="selectAll" ></th>
                                    <th>采购编号</th>
                                    <th>采购主题</th>
                                    <th>采购日期</th>
                                    <th>供应商编号</th>
                                    <th>货款金额</th>
                                    <th>付款情况</th>
                                    <th>采购进展</th>
                                    <th>交货时间</th>
                                    <th>交货地点</th>
                                    <th>交货方式</th>
                                    <th>操作人员</th>
                                    <th>备注信息</th>
                                    <th>操作</th>
                                  <!--   <th data-hide="all">日期</th> -->
                                </tr>
                                </thead>
                                <tbody>
             <c:forEach items="${pCgd.list}"  var="cgd">                   
            					 <tr>
                   					 <td><input type="checkbox" name="c1" class="c1" value="${cgd.cgdId}"></td>
                    
                                 	<td> ${cgd.cgdId}</td>
									<td>${cgd.cgTheme} </td>
				                    <td>${cgd.cgTime}</td>
				                    <td>${cgd.gysId} </td>
				                    <td>${cgd.hkMoney} </td>
				                    <td>${cgd.fkqk} </td>
				                    <td>${cgd.cgJz} </td>
				                    <td>${cgd.jhtime} </td>
				                    <td>${cgd.jhplace} </td>
				                    <td>${cgd.jhway} </td>
				                    <td>${cgd.operator} </td>
				                    <td>${cgd.remark} </td>
								           
				                    <td>
				                    	<a href="cgdXqCtrl/cgdxqList.do?cgdId=${cgd.cgdId}" target="_self" >查看</a>
				                    	<!-- 如果已经付款，那么操作显示已付款,不可再进行任何操作 -->
				                    	<c:choose>
				                    		<c:when test="${cgd.cgJz=='已入库'}"></c:when>
				                    		<c:otherwise>
				                    			<a href="caiGouDanCtrl/cgdDelete.do?cgdId=${cgd.cgdId}" target="_self" >删除</a>
				                    		</c:otherwise>
				                    	</c:choose>
				                    	
				                    	<c:choose>
				                    		<c:when test="${cgd.fkqk=='已付款'}"></c:when>
				                    		<c:otherwise>
				                    			<a href="caiGouDanCtrl/cgdFuKuan.do?cgdId=${cgd.cgdId}" target="_self" >付款</a>
				                    		</c:otherwise>
				                    	</c:choose>
				                    		<%-- <c:when test="${cgd.cgJz=='已入库'&&cgd.fkqk=='未付款'}">
				                    			<a href="caiGouDanCtrl/cgdFuKuan.do?cgdId=${cgd.cgdId}" target="_self" >付款</a>
				                    		</c:when>
				                    			<a href="caiGouDanCtrl/cgdDelete.do?cgdId=${cgd.cgdId}" target="_self" >删除</a> --%>
				                    </td>
               		 </tr>
			       
            </c:forEach>
            </tbody></table>
          		<center>
          			  <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
	                	  <tr>
				             <td style="text-align: center;" colspan="8">
				                <a href="caiGouDanCtrl/cgdList.do?pageNum=${pCgd.firstPage }" target="_self">首页</a>
				                <a href="caiGouDanCtrl/cgdList.do?pageNum=${pCgd.prePage }" target="_self">上一页</a>
				                <a href="caiGouDanCtrl/cgdList.do?pageNum=${pCgd.nextPage }" target="_self">下一页</a>
				                <a href="caiGouDanCtrl/cgdList.do?pageNum=${pCgd.lastPage }" target="_self">尾页</a>
				                                       当前${pCgd.pageNum }/${pCgd.pages }页，共${pCgd.total }条
				             </td>
				          </tr> 
			          </table>
         		</center>
        
    </div>
  </body> 
 
</html>




<script type="text/javascript">
	$(document).ready(function(){
	

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
				a+="cgdId="+myArr[i].value+"&";
			}
		}
			
			alert(a)
			/* a="caiGouDanCtrl/gysDeleteSelect.do?"+a
			$("#deleteSelect").attr("href", a)
			alert($("#deleteSelect").attr("href")) */
			location.href="caiGouDanCtrl/cgdDeleteSelect.do?"+a;
			
	})
			//仿百度提示搜索
		
			/* 	$("#t1").keyup(function(){
				
						if($("#t1").val()!=""){
							var data=$(this).val();
							$.post("caiGouDanCtrl/gysSearch.do",{data:data},function(data,status){
								
										$("#div1").show();
										$("#div1").html(data)
									
								
							})
						}else{
							$("#div1").hide()
						}
				}) */
			
				
	})
</script>
