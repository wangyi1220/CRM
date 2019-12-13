<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Khinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/footable/footable.core.css" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

  </head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                    <div class="ibox float-e-margins">
                       <form action="SalekhinfoController/list.do" method="post" target="_self">
                            <div class="input-group">
                            <input type="text" placeholder="请输入客户名称" name="userName" class="input form-control">
                            <span class="input-group-btn">
                            <button type="submit" class="btn btn btn-primary"><i class="fa fa-search"></i> 搜索</button>
                            </span>    
                        </div>
                        </form>
                        </div>
                        <br>
                         <a href="">
                         <button type="button" class="btn btn-w-m btn-primary">添加客户</button>
                         </a>
                        <br>

                        
                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">客户编号</th>
                                    <th data-hide="all">客户名称</th>
                                    <th data-hide="all">客户属性</th>
                                    <th data-hide="all">客户类型</th>
                                    <th data-hide="all">移动电话</th>
                                    <th data-hide="all">公司编号</th>
                                    <th data-hide="all">下次联系信息</th>
                                    <th data-hide="all">详细信息</th>
                                    <th data-hide="all">状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${p.list}" var="info" >
                                <tr>
                                    <td>${info.userId}</td>
                                    <td>${info.userName}</td>
                                    <td>${info.userAttribute}</td>
                                    <td>${info.userType}</td>
                                    <td><span class="pie">${info.mphone}</span></td>
                                    <td>${info.companyId}</td>
                                    <td>${info.nextContactTime}</td>
                                    <td><a>查看客户</a></td>
                                    <td>${info.userState}</td>
                                    <td><a>修改</a> <a>联系人</a> <a>反馈</a></td>
                                    
                                </tr>
                                </c:forEach>
                                
                                <tr>
                                    <td style="text-align: center;" colspan="10">
                                    <a target="_self" href="SalekhinfoController/list.do?pageNum=${p.firstPage }">首页</a>
                                    <a target="_self" href="SalekhinfoController/list.do?pageNum=${p.prePage }">上一页</a>
                                    <a target="_self" href="SalekhinfoController/list.do?pageNum=${p.nextPage }">下一页</a>
                                    <a target="_self" href="SalekhinfoController/list.do?pageNum=${p.lastPage }">尾页</a>
                                                                             当前${p.pageNum }/${p.pages }页，共${p.total }条
                                     </td>
                                </tr>

                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="10">
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
