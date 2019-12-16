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
                        
                        <br>
                        <button type="button" class="btn btn-w-m btn-primary">客户：${name}</button>
                         <a href="">
                         <button type="button" class="btn btn-w-m btn-primary">添加联系人</button>
                         </a>
                        <br>

                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">联系人姓名</th>
                                    <th data-hide="all">英文名</th>
                                    <th data-hide="all">职务</th>
                                    <th data-hide="all">部门</th>
                                    <th data-hide="all">手机</th>
                                    <th data-hide="all">办公电话</th>
                                    <th data-hide="all">电子邮箱</th>
                                    <th data-hide="all">地址</th>
                                    <th data-hide="all">备注信息</th>
                                    <th data-hide="all">公司编号</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${q.list}" var="info" >
                                <tr>
                                    <td>${info.contactName}</td>
                                    <td>${info.englishName}</td>
                                    <td>${info.post}</td>
                                    <td>${info.department}</td>
                                    <td><span class="pie">${info.mphone}</span></td>
                                    <td>${info.ophone}</td>
                                    <td>${info.eMail}</td>
                                    <td>${info.address}</td>
                                    <td>${info.remarksInfo}</td>
                                    <td>${info.companyId}</td>
                                    <td><a>编辑</a> <a>删除</a> <a>联系记录</a></td>
                                    
                                </tr>
                                </c:forEach>
                                
                                <tr>
                                    <td style="text-align: center;" colspan="11">
                                    <a target="_self" href="SalekhinfoController/lxlist.do?pageNum=${q.firstPage }">首页</a>
                                    <a target="_self" href="SalekhinfoController/lxlist.do?pageNum=${q.prePage }">上一页</a>
                                    <a target="_self" href="SalekhinfoController/lxlist.do?pageNum=${q.nextPage }">下一页</a>
                                    <a target="_self" href="SalekhinfoController/lxlist.do?pageNum=${q.lastPage }">尾页</a>
                                                                             当前${q.pageNum }/${q.pages }页，共${q.total }条
                                     </td>
                                </tr>

                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="11">
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
