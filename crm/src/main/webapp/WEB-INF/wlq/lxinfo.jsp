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
	<link rel="shortcut icon" href="favicon.ico"> 
	<link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet">
    <base target="_blank">

  </head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                        
                        <br>
                        <button type="button" class="btn btn-w-m btn-primary">客户：${name}</button>
                         <a href="SalekhinfoController/golxadd.do?id=${id}" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">添加联系人</button>
                         </a>
                         <a href="SalekhinfoController/list.do" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">返回上一级</button>
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

                                <c:forEach items="${q}" var="info" >
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
                                    <td>                                    
                                    <button class="btn btn-outline btn-info  dim" data-toggle="modal" data-target="#${info.contactId}"  data-placement="bottom" title="编辑">
                                     <i class="fa fa-paste"></i>
                                    </button>
                                    
                           <div class="modal inmodal fade" id="${info.contactId}" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">编辑界面</h4>
                                        </div>
                                        <form action="SalekhinfoController/lxupdate.do" method="post" target="_self">
                                       
                                        <div class="modal-body">
                                        
                                            <div>
                                            <div class="col-sm-8">
                                            <input type="hidden" name="contactId" value="${info.contactId}">
                                                                                              联系人姓名：<input id="contactName" name="contactName" type="text" class="form-control" value="${info.contactName}">
                                            </div>
                                        </div>
                                        <div>
                                            <div class="col-sm-8">
                                                                                              英文名：<input id="englishName" name="englishName" class="form-control" type="text" value="${info.englishName}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              职务：<input id="post" name="post" class="form-control" type="text" value="${info.post}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              部门：<input id="department" name="department" class="form-control" type="text" value="${info.department}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              手机：<input id="mphone" name="mphone" class="form-control" type="text" value="${info.mphone}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              办公电话：<input id="ophone" name="ophone" class="form-control" type="text" value="${info.ophone}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              电子邮箱：<input id="eMail" name="eMail" class="form-control" type="text" value="${info.eMail}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                             地址：<input id="address" name="address" class="form-control" type="text" value="${info.address}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              备注信息：<input id="remarksInfo" name="remarksInfo" class="form-control" type="text" value="${info.remarksInfo}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                                                                              公司编号：<input id="companyId" name="companyId" class="form-control" type="text" value="${info.companyId}">
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <div class="col-sm-8">
                                             <input type="hidden" name="userId" value="${info.userId}">
                                            </div>
                                        </div> 
                                        
                                  
                                        </div>
                                       

                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="submit" class="btn btn-primary">保存</button>
                                        </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                                    
 
                                   <a href="SalekhinfoController/lxdelete.do?cid=${info.contactId}" target="_self" onclick="return confirm('是否确定删除？')">删除</a> 
                                   <a href="SalekhlxjlController/lxjlcx.do?cid=${info.contactId}&cname=${info.contactName}" target="_self">联系记录</a>
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
            
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    <script src="<%=basePath%>js/plugins/sweetalert/sweetalert.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
  </body>
</html>
