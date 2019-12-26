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
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet">
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <base target="_blank">

  </head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                    <div class="ibox float-e-margins">
                       <form action="SysPostCtrl/listPage.do" method="post" target="_self">
                            <div class="input-group">
                            <input type="text" placeholder="请输入职务名称" name="empName" class="input form-control">
                            <span class="input-group-btn">
                            <button type="submit" class="btn btn btn-primary"><i class="fa fa-search"></i> 搜索</button>
                            </span>    
                        </div>
                        </form>
                        </div>
                        <br>
                         <a href="SysPostCtrl/goadd.do" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">添加职务</button>
                         </a>
                        <br>

                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">职务编号</th>
                                    <th data-hide="all">职务名称</th>
                                    <th data-hide="all">职务编号</th>
                                    <th data-hide="all">备注</th>
                                    <th data-hide="all">公司编号</th>
                                   
                                    
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${p.list}" var="info" >
                                <tr>
                                    <td>${info.postId}</td>
                                    <td>${info.postName}</td>
                                    <td>${info.deptId}</td>
                                    <td>${info.beizhu}</td>
                                    <td><span class="pie">${info.companyId}</span></td>
                                  
                                    <td>
                                    <button class="btn btn-outline btn-info  dim" data-toggle="modal" data-target="#${info.postId}"  data-placement="bottom" title="编辑">
                                     <i class="fa fa-paste"></i>
                                    </button>
                                    
                                <div class="modal inmodal fade" id="${info.postId}" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">编辑界面</h4>
                                        </div>
                                        <form action="SysPostCtrl/update.do" method="post" target="_self" enctype="multipart/form-data">
                                         <div class="modal-body">
                                              <div>
                                              <input type="hidden" name="postId" value="${info.postId}">
                                              &emsp;&emsp;&emsp;&emsp;<span>职务名称：<input type="text" name="postName"  value="${info.postName}"></span>
                                              </div>
                                              <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>职务编号：<input type="text" name="deptId"  value="${info.deptId}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                              <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>备&emsp;&emsp;注：<input type="text" name="beizhu"  value="${info.beizhu}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                              <div>
                                               &emsp;&emsp;&emsp;&emsp;<span>公司编号：<input type="text" name="companyId"  value="${info.companyId}"></span>
                                              </div>
                                              <div>
                                             <div>
                                              &emsp;&emsp;<span>最后修改时间：<input type="text" name="changDate"  value="<fmt:formatDate value="${info.changDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"></span>
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
                            <td>

                                    
                                    <a target="_self" href="SysPostCtrl/delete.do?postId=${info.postId}" onclick="return confirm('是否确定删除？')">删除</a> </td>
                                    
                                </tr>
                                </c:forEach>
                                
                                <tr>
                                    <td style="text-align: center;" colspan="10">
                                    <a target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.firstPage }">首页</a>
                                    <a target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.prePage }">上一页</a>
                                    <a target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.nextPage }">下一页</a>
                                    <a target="_self" href="SysPostCtrl/listPage.do?pageNum=${p.lastPage }">尾页</a>
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
            
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    <script src="<%=basePath%>js/plugins/sweetalert/sweetalert.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
  </body>
</html>
<script>
$(document).ready(function(){
   if(${iscg=="yes"}){
   swal({title:"太帅了",text:"添加成功",type:"success"})
   }
});
</script>