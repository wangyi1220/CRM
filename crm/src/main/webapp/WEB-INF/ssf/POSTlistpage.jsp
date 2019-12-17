<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userslist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="css/plugins/footable/footable.core.css" rel="stylesheet">

<link href="css/animate.min.css" rel="stylesheet">
<link href="css/style.min.css?v=4.0.0" rel="stylesheet">
<base target="_blank">

</head>


<body>
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">

		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>用户信息管理</h5>

						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="fa fa-wrench"></i>
							</a>
							<ul class="dropdown-menu dropdown-user">
								<li><a href="#">选项 01</a></li>
								<li><a href="#">选项 02</a></li>
							</ul>
							<a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">

						<table class="footable table table-stripped toggle-arrow-tiny"
							data-page-size="8">

							<tr>

								<th data-toggle="true">职务编号</th>
								<th>职务名称</th>
								<th>部门编号</th>
								<th data-hide="all">备注</th>
								<th data-hide="all">公司编号</th>
								<th data-hide="all">最后修改日期</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${p.list }" var="post">
								<tr>

									<td>${post.postId }</td>
									<td>${post.postName }</td>
									<td>${post.deptId }</td>
									<td>${post.beizhu }</td>
									<td>${post.companyId}</td>
									<td>${post.changDate}</td>
									<td><a href="SysPostCtrl/goupdate.do?PostId=${post.postId}">修改</a>/<a href="SysPostCtrl/delete.do?PostId=${post.postId}" onclick="return confirm('是否确定删除？')">删除</a></td>


								</tr>
							</c:forEach>
							<tr>
								<td style="text-align: center;" colspan="6"><a
									target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.firstPage }">首页</a> <a
									target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.prePage }">上一页</a> <a
									target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.nextPage }">下一页</a> <a
									target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.lastPage }">尾页</a>
									当前${p.pageNum }/${p.pages }页，共${p.total }条</td>
							</tr>


						</table>

					</div>
				</div>
			</div>
		</div>

		<script src="js/jquery.min.js?v=2.1.4"></script>
		<script src="js/bootstrap.min.js?v=3.3.5"></script>
		<script src="js/content.min.js?v=1.0.0"></script>
		<script>
			$(document).ready(function() {
				$(".footable").footable();$(".footable2").footable()
			});
		</script>
		<script type="text/javascript"
			src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>
</html>
