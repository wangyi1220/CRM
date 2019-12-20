<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>库存商品信息</title>
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
					<input type="text" id="t1" placeholder="请输入商品名称，或商品类别，仓库编号" style=" width: 200px;height: 30px;font-size: 16pt; ">
   					&nbsp;
		   			<button  id="b1"  type="button"  class="btn btn-primary btn-lg" 
		   			 style="width: 100px;height: 30px;
		   			border: 1px solid blue;position: absolute;top: 63px;line-height: 10px" >搜索</button>
		   			

						<table class="footable table table-stripped toggle-arrow-tiny"
							data-page-size="8">
							<thead>
								<tr>
									<th>商品编号</th>
									<th>商品名称</th>
									<th>商品类别</th>
									<th>规格说明</th>
									<th>单位</th>
									<th>仓库编号</th>
									<th>库存数量</th>
									<th>成本价</th>
									<th>零售价</th>
									<th>经销价</th>
									<th>备注信息</th>
									<th>公司编号</th>
									<th>最后修改时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
				                   <c:forEach items="${p.list}" var="k">
									<tr style="text-align: center;">
										<td>${k.goodsId }</td>
										<td>${k.goodsName}</td>
										<td>${k.goodsKinds}</td>
										<td>${k.goodsSpecs }</td>
										<td>${k.unit}</td>
										<td>${k.cangkuId}</td>
										<td>${k.kcNum}</td>
										<td>${k.goodsCost}</td>
										<td>${k.goodsPrice}</td>
										<td>${k.goodsSellingPrice}</td>
										<td>${k.note}</td>
										<td>${k.companyId}</td>
										<td><fmt:formatDate value="${k.lastModifyTime}"
												pattern="yyyy-MM-dd HH:mm:ss" />
										</td>
										<td><a href="goupdate.do?gid=${k.goodsId }">修改</a>
											/ <a
											href="delete.do?kcgs=${k.goodsId}"onclick="return confirm('是否确定删除？')">删除</a>
											</td>
											</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<td style="text-align: center;" colspan="12"><a
									target="_self"
										href="listPage.do?pageNum=${p.firstPage }">首页</a>
										<a target="_self" href="listPage.do?pageNum=${p.prePage }">上一页</a>
										<a target="_self" href="listPage.do?pageNum=${p.nextPage }">下一页</a>
										<a target="_self" href="listPage.do?pageNum=${p.lastPage }">尾页</a>
										当前${p.pageNum }/${p.pages }页，共${p.total }条</td>
								</tr>
						 </tfoot>
						</table>

					</div>
				</div>
			</div>
		</div>
</body>

</html>