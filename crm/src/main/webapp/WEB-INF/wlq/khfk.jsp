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
    
    <title>My JSP 'khfk.jsp' starting page</title>
    
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
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet">
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <base target="_blank">

  </head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                        
                        <br>
                        <button type="button" class="btn btn-w-m btn-primary">客户：${name}</button>
                         <a href="SalekhlxjlController/gofkadd.do?id=${id}" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">添加客户反馈</button>
                         </a>
                         <a href="SalekhinfoController/list.do" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">返回上一级</button>
                         </a>
                        <br>

                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">记录优先级</th>
                                    <th data-hide="all">反馈类型</th>
                                    <th data-hide="all">反馈时间</th>
                                    <th data-hide="all">反馈主题</th>
                                    <th data-hide="all">反馈描述</th>
                                    <th data-hide="all">反馈来源</th>
                                    <th data-hide="all">分析</th>
                                    <th data-hide="all">负责人</th>
                                    <th data-hide="all">状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${q}" var="info" >
                                <tr>
                                    <td>${info.recordPriority}</td>
                                    <td>${info.feedbackType}</td>
                                    <td>${info.feedbackTime}</td>
                                    <td>${info.feedbaclTheme}</td>
                                    <td>${info.feedbackDiscribe}</td>
                                    <td>${info.feedbackSource}</td>
                                    <td>${info.analysis}</td>
                                    <td>${info.personInCharge}</td>                                    
                                    <td>${info.state}</td>
                                    <td>
                                    <a></a>                                    
                                    <a href="SalekhlxjlController/fkdelete.do?id=${info.feedbackRecorId}" target="_self" onclick="return confirm('是否确定删除？')">删除</a> 
                                    
                                    </td>
                                    
                                </tr>
                                </c:forEach>
                                


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



    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.5"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/validate/jquery.validate.min.js"></script>
    <script src="js/plugins/validate/messages_zh.min.js"></script>
    <script src="js/demo/form-validate-demo.min.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>
</html>
