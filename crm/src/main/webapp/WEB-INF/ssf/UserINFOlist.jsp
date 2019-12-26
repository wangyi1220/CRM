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
                       <form action="SysUsersInfoCtrl/listPage.do" method="post" target="_self">
   		
   			<h2 id="h1" style="font-weight: bolder;">楞头一下</h2>
   			
   			<select class="chosen-select" style="width:200px;" name="empId">
                  <option value="0" hassubinfo="true">按账号搜索</option>
                  <option value="1" hassubinfo="true">按姓名搜索</option>
             </select>
   			
   			<input type="text" style=" width: 200px;height: 30px;font-size: 16pt; " name="empName">
   			
   			<button   type="submit" class="btn btn-primary btn-lg" 
   			 style="width: 100px;height: 30px;
   			border: 1px solid blue;position: absolute;top: 56px;line-height: 10px;margin-left: 25px" >楞头一下</button>
   			
   		</form>	
                        </div>
                        <br>
                         <a href="SysUsersInfoCtrl/goadd.do" target="_self">
                         <button type="button" class="btn btn-w-m btn-primary">添加新员工</button>
                         </a>
                        <br>

                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">员工编号</th>
                                    <th data-hide="all">员工姓名</th>
                                    <th data-hide="all">员工性别</th>
                                    <th data-hide="all">联系电话</th>
                                    <th data-hide="all">职务编号</th>
                                    <th data-hide="all">员工状态</th>
                                    <th data-hide="all">公司编号</th>
                                    <th data-hide="all">详细信息</th>
                                    <th data-hide="all">状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${p.list}" var="info" >
                                <tr>
                                    <td>${info.empId}</td>
                                    <td>${info.empName}</td>
                                    <td>${info.empSex}</td>
                                    <td>${info.phoneNumber}</td>
                                    <td><span class="pie">${info.postId}</span></td>
                                    <td>${info.empState}</td>
                                    <td>${info.companyId}</td>
                                    <td>                                    
                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${info.empName}">
                                                                             查看详情 
                                    </button>
                            <div class="modal inmodal fade" id="${info.empName}" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-sm">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">详细信息</h4>
                                        </div>
                                        <div class="modal-body">
                                           
                                           <span><ul><li>员工姓名：${info.empName} </li></ul></span> 
                                           <span><ul><li>员工性别：${info.empSex}</li></ul></span>
                                           <span><ul><li>员工照片：<img alt="暂无图片" src="upload/${info.empPhoto }" 
						                    width="40px" height="40px"></li></ul></span>
                                           <span><ul><li>身份证号：${info.idNumber}</li></ul></span>
                                           <span><ul><li>家乡地址：${info.jiaxiang}</li></ul></span>
                                           <span><ul><li>现在地址：${info.xianzai}</li></ul></span>
                                           <span><ul><li>员工学历：${info.empEdu}</li></ul></span>
                                           <span><ul><li>政治面貌：${info.zhengzhi}</li></ul></span>
                                           <span><ul><li>毕业学校：${info.graduate}</li></ul></span>
                                           <span><ul><li>联系电话：${info.phoneNumber}</li></ul></span>
                                           <span><ul><li>网上联系方式：${info.onlineContact}</li></ul></span>
                                           <span><ul><li>网上联系详情：${info.onlineDetail}</li></ul></span>
                                           <span><ul><li>审核状态：${info.checkState}</li></ul></span>
                                           <span><ul><li>职务编号：${info.postId}</li></ul></span>
                                           <span><ul><li>员工状态：${info.empState}</li></ul></span>
                                           <span><ul><li>备注：${info.beizhu}</li></ul></span>
                                           <span><ul><li>公司编号：${info.companyId}</li></ul></span>
                                           <span><ul><li>最后修改时间：<fmt:formatDate value="${info.changDate}" pattern="yyyy-MM-dd"/></li></ul></span>
                                           
                                        </div>
                                        <div class="modal-footer">
                                        
                                        </div>
                                    </div>
                                </div>
                            </div>
                                    </td>
                                    <td>${info.checkState}</td>
                                    <td>
                                    <button class="btn btn-outline btn-info  dim" data-toggle="modal" data-target="#${info.empId}"  data-placement="bottom" title="编辑">
                                     <i class="fa fa-paste"></i>
                                    </button>
                                    
                                <div class="modal inmodal fade" id="${info.empId}" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">编辑界面</h4>
                                        </div>
                                        <center>
                                        <form action="SysUsersInfoCtrl/update.do" method="post" target="_self" enctype="multipart/form-data">
                                         <div class="modal-body">
                                              <div>
                                              <input type="hidden" name="empId" value="${info.empId}">
                                              &emsp;&emsp;&emsp;&emsp;<span>员工姓名：<input type="text" name="empName"  value="${info.empName}">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                              <div>
                                              <br>
                                              <div>
                                              <input type="hidden" name="empPhoto" value="${info.empPhoto }">
                                              <span><input type="file" name="upload"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                              <div>
                                              <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>家乡地址：<input type="text" name="jiaxiang"  value="${info.jiaxiang}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<span></span>
                                              </div>
                                              <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>现居地址：<input type="text" name="xianzai"  value="${info.xianzai}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<span></span>
                                              </div>
                                                                                            <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>学&emsp;&emsp;历：<input type="text" name="empEdu"  value="${info.empEdu}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<span></span>
                                              </div>
                                                                                            <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>政治面貌：<input type="text" name="zhengzhi"  value="${info.zhengzhi}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<span></span>
                                              </div>
                                                                                            <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>毕业学校：<input type="text" name="graduate"  value="${info.graduate}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<span></span>
                                              </div>
                                                                                            <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>联系电话：<input type="text" name="phoneNumber" value="${info.phoneNumber}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span></span>
                                              </div>
                                                                                            <div>
                                              &emsp;&emsp;<span>网上联系方式：<input type="text" name="onlineContact"  value="${info.onlineContact}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              
                                              <div>
                                              &emsp;&emsp;<span>网上联系详情：<input type="text" name="onlineDetail"  value="${info.onlineDetail}"></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                              &emsp;&emsp;&emsp;&emsp;<span>员工状态：<select type="text" name="empState"  style="width: 178px;height: 24px;border-radius: 5px;outline: none;}"><option>在职员工</option><option>离职员工</option><option>休假</option></select></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>                                          <div>
                                              &emsp;&emsp;&emsp;&emsp;<span>审核状态：<select type="text" name="checkState"  style="width: 178px;height: 24px;border-radius: 5px;outline: none;}"><option>审核通过</option><option>审核失败</option><option>待审核</option></select></span>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</span>
                                              </div>
                                                                                            <div>
                                             <%--  &emsp;&emsp;&emsp;&emsp;<span>最后修改时间：<input type="text" name="changDate"  value="<fmt:formatDate value="${info.changDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"></span> --%>
                                              </div>
                                        </div>

                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="submit" class="btn btn-primary">保存</button>
                                        </div>
                                        </form>
                                        </center>
                                    </div>
                                </div>
                            </div>

                                    
                                    <a target="_self" href="SysUsersInfoCtrl/delete.do?empId=${info.empId}" onclick="return confirm('是否确定删除？')">删除</a></td>
                                    
                                </tr>
                                </c:forEach>
                                
                                
                                
                                <tr>
                                    <td style="text-align: center;" colspan="10">
                                    <a target="_self" href="SysUsersInfoCtrl/listPage.do?pageNum=${p.firstPage }">首页</a>
                                    <a target="_self" href="SysUsersInfoCtrl/listPage.do?pageNum=${p.prePage }">上一页</a>
                                    <a target="_self" href="SysUsersInfoCtrl/listPage.do?pageNum=${p.nextPage }">下一页</a>
                                    <a target="_self" href="SysUsersInfoCtrl/listPage.do?pageNum=${p.lastPage }">尾页</a>
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
                      <%-- <select name="compID" style="width: 1065.83px;height: 34px;border-radius: 5px;outline: none;">
                      <c:forEach items="${p.list}" var="info" >
                      <option value="${info.companyId}">${info.companyId}</option>
                      </c:forEach>
                      </select>  --%>
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
function checksize(){
var number =document.getElementById("idkk").value;
alert(number);
if(number.length!=18){
    alert("编辑失败！身份证号为十八位，当前位数为：-----"+number.length);
    return false;

}
}

$(document).ready(function(){
   if(${iscg=="yes"}){
   swal({title:"太帅了",text:"添加成功",type:"success"})
   }
});
</script>