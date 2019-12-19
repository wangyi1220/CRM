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
   			
   			<button  id="b1"  type="button"  class="btn btn-primary btn-lg" 
   			 style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px" >楞头一下</button>
   			
   			<div id="div1" style="width: 200px;height: 160px;
   			border: 3px solid #d4d4d4 ;position:absolute;
   			left: 60px;top:87px;display: none;margin-left: 28px;margin-top: -2px"></div>
   		  <br>  <br> 
   		<h3 style="display: inline-block;"><a href="GongYingShangctrl/gysToAdd.do" target="_self">添加供应商</a></h3>
        &emsp;
      	<h3 style="display: inline-block;"><a id="deleteSelect"  target="_self">删除选中</a></h3>
       
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true"><input type="checkbox" id="selectAll" >全选</th>
                                    <th>供应商编号</th>
                                    <th>供应商名称</th>
                                    <th>联系人</th>
                                    <th>联系电话</th>
                                    <th>开户银行</th>
                                    <th>银行卡号</th>
                                    <th>备注信息</th>
                                    <th>状态</th>
                                    <th>操作${likeList.size()}</th>
                                </tr>
                                </thead>
                                <tbody>
                                
             <c:forEach items="${pgys.list}"  var="gys">                   
            					 <tr>
                   					 <td><input type="checkbox" name="c1" class="c1" value="${gys.gysId}"></td>
                    
                                 	<td> ${gys.gysId}</td>
									<td>${gys.gysName} </td>
				                    <td>${gys.lxr}</td>
				                    <td>${gys.ydPhone} </td>
				                    <td>${gys.khbank} </td>
				                    <td>${gys.yhzh} </td>
				                    <td>${gys.remark} </td>
				                    <td>${gys.isYx} </td>
				                    
				              
				                    
								           
				                    <td>
				                    		 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${gys.gysId}">
                                                                             	查看详情 
                                    		</button>
				                    		<a href="GongYingShangctrl/gysDelete.do?gysId=${gys.gysId}" target="_self" >删除</a>
				                    		<a href="GongYingShangctrl/gysToUpdate.do?gysId=${gys.gysId}" target="_self">修改</a>
				                    </td>
				                    
               		 </tr>
			       
			       
			       	<!-- 弹窗---查看详情 -->
    <div class="modal inmodal fade" id="${gys.gysId}" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-sm">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">详细信息</h4>
                                        </div>
                                        <div class="modal-body">
                                           
                                           <span><ul><li>供应商编号：${gys.gysId} </li></ul></span> 
                                           <span><ul><li>供应商名称：${gys.gysName}</li></ul></span>
                                           <span><ul><li>供应商简称：${gys.gysJc}</li></ul></span>
                                           <span><ul><li>联系人：${gys.lxr}</li></ul></span>
                                           <span><ul><li>固定电话：${gys.gdPhone}</li></ul></span>
                                           <span><ul><li>移动电话：${gys.ydPhone}</li></ul></span>
                                           <span><ul><li>联系传真：${gys.lxcz}</li></ul></span>
                                           <span><ul><li>联系地址：${gys.lxdz}</li></ul></span>
                                           <span><ul><li>联系邮编：${gys.lxyb}</li></ul></span>
                                           <span><ul><li>邮箱：${gys.mail}</li></ul></span>
                                           <span><ul><li>公司编号：${gys.gsId}</li></ul></span>
                                           <span><ul><li>公司主页：${gys.gszy}</li></ul></span>
                                           <span><ul><li>开户银行：${gys.khbank}</li></ul></span>
                                           <span><ul><li>银行卡号：${gys.yhzh}</li></ul></span>
                                           <span><ul><li>操作人员：${gys.operator}</li></ul></span>
                                           <span><ul><li>备注信息：${gys.remark}</li></ul></span>
                                           <span><ul><li>最后修改时间：${gys.ltime}</li></ul></span>
                                         </div>
                                        <div class="modal-footer">
                                        
                                        </div>
                                    </div>
                                </div>
                            </div>
    
			       
			       
            </c:forEach>
          
                	 
         </tbody>
        </table>
        	
             <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
        		 	<tr>
			             <td style="text-align: center;" colspan="8">
			                <a href="GongYingShangctrl/list.do?pageNum=${pgys.firstPage }" target="_self">首页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pgys.prePage }" target="_self">上一页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pgys.nextPage }" target="_self">下一页</a>
			                <a href="GongYingShangctrl/list.do?pageNum=${pgys.lastPage }" target="_self">尾页</a>
			                                       当前${pgys.pageNum }/${pgys.pages }页，共${pgys.total }条
			             </td>
			          </tr> 
			 </table>
    </div>
    
   </body>
</html>




<script type="text/javascript">
	$(document).ready(function(){
	
	$("#b1").click(function() {
		var gysName=$("#t1").val()
		alert(gysName)
		alert("GongYingShangctrl/list.do?gysName="+gysName)
		location.href="GongYingShangctrl/list.do?gysName="+gysName;
	})	

	
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
		
				$("#t1").keyup(function(){
				
						if($("#t1").val()!=""){
							var data=$(this).val();
							$.post("GongYingShangctrl/gysSearch.do",{data:data},function(d,status){
										console.log(d);
										$("#div1").show()
										$("#div1").html(d)
							})
						}else{
							$("#div1").hide()
						}
						
				}) 
				
			
				
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
