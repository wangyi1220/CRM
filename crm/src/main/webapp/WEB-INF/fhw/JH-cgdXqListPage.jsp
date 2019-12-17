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
   		<h3 style="display: inline-block;"><a href="GongYingShangctrl/gysToAdd.do" target="_self">添加供应商</a></h3>
        &emsp;
      	<h3 style="display: inline-block;"><a id="deleteSelect"  target="_self">删除选中</a></h3>
       
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true"><input type="checkbox" id="selectAll" >全选</th>
                                    <th>采购单详情编号</th>
                                    <th>采购单编号</th>
                                    <th>产品编号</th>
                                    <th>产品数量</th>
                                    <th>产品价格</th>
                                    <th>是否入库</th>
                                    <th>操作人员</th>
                                    <th>备注信息</th>
                                    <th>公司编号</th>
                                    <th>修改时间</th>
                                    <th>操作</th>
                                    
                                <!-- 	 <th data-hide="all">固定电话</th>
                                	 <th data-hide="all">公司主页</th>
                                    <th data-hide="all">联系地址</th>
                                    <th data-hide="all">操作人员</th>
                                    <th data-hide="all">公司编号</th> -->
                                </tr>
                                </thead>
                                <tbody>
             <c:forEach items="${pcgdxq.list}"  var="pcgdxq">                   
            					 <tr>
                   					 <td><input type="checkbox" name="c1" class="c1" value="${pcgdxq.cgXqId}"></td>
                    
                                 	<td> ${pcgdxq.cgXqId}</td>
									<td>${pcgdxq.cgdId} </td>
				                    <td>${pcgdxq.cpId}</td>
				                    <td>${pcgdxq.cpNumber} </td>
				                    <td>${pcgdxq.khbank} </td>
				                    <td>${pcgdxq.yhzh} </td>
				                    <td>${pcgdxq.remark} </td>
				                    <td>${pcgdxq.isYx} </td>
				                    
				              
				                    
								           
				                    <td>
				                 		    <a href="GongYingShangctrl/gysToUpdate.do?gysId=${pcgdxq.gysId}" target="_self">添加</a>
				                    		<a href="GongYingShangctrl/cgdDelete.do?gysId=${pcgdxq.gysId}" target="_self" >删除</a>
				                    		
				                    </td>
				                    
				                          
				             <%--        <td>${pcgdxq.gdPhone} </td>
				                    <td>${pcgdxq.gszy} </td>
				                    <td>${pcgdxq.lxdz} </td>
				                    <td>${pcgdxq.operator} </td>
				                    <td>${pcgdxq.gsId} </td> --%>
               		 </tr>
			       
            </c:forEach>
          
                	 
         </tbody>
        </table>
        	
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
        		 	<tr>
			             <td style="text-align: center;" colspan="8">
			                <a href="GongYingShangctrl/list.do?pageNum=${pcgdxq.firstPage }" target="_self">首页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pcgdxq.prePage }" target="_self">上一页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pcgdxq.nextPage }" target="_self">下一页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pcgdxq.lastPage }" target="_self">尾页</a>
			                                       当前${pcgdxq.pageNum }/${pcgdxq.pages }页，共${pcgdxq.total }条
			             </td>
			          </tr> 
			 </table>
    </div>
  </body>
</html>




<script type="text/javascript">
	$(document).ready(function(){
	
	

	
	//选中删除
	$("#deleteSelect").click(function(){
	
		 var myArr=new Array();
		 var a=""
		myArr=$("input[name='c1']")
		var i
		for(i=0;i<myArr.length;i++){
			if(myArr[i].checked==true){
				a+="gysId="+myArr[i].value+"&";
			}
		}
	
			location.href="GongYingShangctrl/gysDeleteSelect.do?"+a;
			
	})
			//仿百度提示搜索
		
			/* 	$("#t1").keyup(function(){
				
						if($("#t1").val()!=""){
							var data=$(this).val();
							$.post("GongYingShangctrl/gysSearch.do",{data:data},function(data,status){
								
										$("#div1").show();
										$("#div1").html(data)
									
								
							})
						}else{
							$("#div1").hide()
						}
				}) */
			
				
		//下拉显示
        //$(document).ready(function(){$(".footable").footable();});
   
    	 //全选
			$("#selectAll").click(function(){
				if($(this).prop("checked")){
					$(".c1").prop("checked", true)
					$("#selectAll").prop("checked",true)
				}
				if(!$(this).prop("checked")){
					$(".c1").prop("checked",false)
				}
			})
				
	})
</script>




   <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.5"></script>
    <script src="js/plugins/footable/footable.all.min.js"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
	<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
