<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - FooTable</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="<%=basePath%>favicon.ico">
<link href="<%=basePath%>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link href="<%=basePath%>css/plugins/footable/footable.core.css"
	rel="stylesheet">

<link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
<link href="<%=basePath%>css/style.min.css?v=4.0.0" rel="stylesheet">
<base target="_blank">

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">

		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">

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
						<input type="text" id="" name="" placeholder="请输入仓库名，或仓库编号">
						<button>搜索</button>

						<table class="footable table table-stripped toggle-arrow-tiny"
							data-page-size="8">
							<thead>
								<tr>
									<th>仓库编号</th>
									<th>仓库名</th>
									<th>备注信息</th>
									<th>公司编号</th>
									<th>最后修改时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>


								<c:forEach items="${p.list }" var="k">
									<tr style="text-align: center;">
										<td>${k.cangkuId }</td>
										<td>${k.cangkuName}</td>
										<td>${k.cangkuNote}</td>
										<td>${k.companyId }</td>
										<td><fmt:formatDate value="${k.cangkuLastModifyTime }"
												pattern="yyyy-MM-dd HH:mm:ss" />
										<td><a
											href="../KCCKControllerCtrl/goupdate.do?cangkuId=${k.cangkuId }">修改</a>
											/ <a
											href="../KCCKControllerCtrl/delete.do?kcck=${k.cangkuId}"
											onclick="return confirm('是否确定删除？')">删除</a></td>
		<!-- zhushi111 -->
										<%-- <td>${k.cangkuLastModifyTime}</td> --%>
										<%--  <td>
                       <a href="GoodsDel?gid=${g.gid }" onclick="return confirm('是否确定删除此商品？')">删除</a>
                       /
                       <a href="GoodsGoUpdate?gid=${g.gid }">修改</a>
                      </td> --%>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5">
										<ul class="pagination pull-right"></ul>
									</td>
								</tr>
							</tfoot>
						</table>

					</div>
				</div>
			</div>
		</div>
</body>

</html>