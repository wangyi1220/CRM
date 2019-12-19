<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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


<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="css/plugins/footable/footable.core.css" rel="stylesheet">

<link href="css/animate.min.css" rel="stylesheet">
<link href="css/style.min.css?v=4.0.0" rel="stylesheet">
<base target="_blank">
</head>

<body>

	<div class="container">
		<h2 id="h1" style="font-weight: bolder;">搜索</h2>
		<input type="text" id="t1"
			style=" width: 200px;height: 30px;font-size: 16pt; ">

		<button id="b1" type="button" class="btn btn-primary btn-lg"
			style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px">搜索</button>

		<div id="div1"
			style="width: 200px;height: 160px;
   			border: 1px solid red;position:absolute;
   			left: 60px;top:87px;display: none"></div>
		<br> <br>
		<h3 style="display: inline-block;">
			<a href="#" target="_self">添加销售详情表</a>
		</h3>
		&emsp;
		<h3 style="display: inline-block;">
			<a id="deleteSelect" target="_self">删除选中</a>
		</h3>

		<table class="footable table table-stripped toggle-arrow-tiny"
			data-page-size="8">
			<thead>
				<tr>

					<th data-toggle="true"><input type="checkbox" id="selectAll"></th>
					<th>销售单详情编号</th>
					<th>销售单编号</th>
					<th>商品编号</th>
					<th>商品数量</th>
					<th>商品价格</th>
					<th>备注说明</th>
					<th>公司编号</th>
					<th>最后修改时间</th>
					<th>操作</th>
					<!--   <th data-hide="all">日期</th> -->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${s.list}" var="sinfo">
					<tr>
						<td><input type="checkbox" name="c1" class="c1"
							value="${sinfo.sorderInfoId}"></td>

						<td>${sinfo.sorderId}</td>
						<td>${sinfo.goodsId}</td>
						<td>${sinfo.goodsQuantity}</td>
						<td>${sinfo.goodsPrice}</td>
						<td>${sinfo.note}</td>
						<td>${sinfo.companyId}</td>
						<td>${sinfo.lastModifyTime}</td>
						

						<td><a href="sinfoctrl/listPage.do?cgdId=${sinfo.sorderId}"
							target="_self">查看</a> <a
							href="sinfoctrl/sinfoAdd.do?cgdId=${sinfo.sorderId}"
							target="_self">添加</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
		<center>
			<table class="footable table table-stripped toggle-arrow-tiny"
				data-page-size="8">
				<tr>
					<td style="text-align: center;" colspan="8"><a
						href="caiGouDanCtrl/list.do?pageNum=${pCgd.firstPage }"
						target="_self">首页</a> <a
						href="caiGouDanCtrl/list.do?pageNum=${pCgd.prePage }"
						target="_self">上一页</a> <a
						href="caiGouDanCtrl/list.do?pageNum=${pCgd.nextPage }"
						target="_self">下一页</a> <a
						href="caiGouDanCtrl/list.do?pageNum=${pCgd.lastPage }"
						target="_self">尾页</a> 当前${pCgd.pageNum }/${pCgd.pages }页，共${pCgd.total }条
					</td>
				</tr>
			</table>
		</center>

	</div>
</body>

</html>




<script type="text/javascript">
	$(document).ready(function() {


		//全选
		$("#selectAll").click(function() {
			if ($(this).prop("checked")) {
				$(".c1").prop("checked", true)
			} else {
				$(".c1").prop("checked", false)
			}
		})

		//选中删除
		$("#deleteSelect").click(function() {

			var myArr = new Array();
			var a = ""
			myArr = $("input[name='c1']")
			var i
			for (i = 0; i < myArr.length; i++) {
				if (myArr[i].checked == true) {
					a += "gysId=" + myArr[i].value + "&";
				}
			}


			/* a="caiGouDanCtrl/gysDeleteSelect.do?"+a
			$("#deleteSelect").attr("href", a)
			alert($("#deleteSelect").attr("href")) */
			location.href = "caiGouDanCtrl/gysDeleteSelect.do?" + a;

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
