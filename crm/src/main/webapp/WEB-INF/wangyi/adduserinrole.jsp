<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>角色列表</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="<%=basePath%>favicon.ico"> <link href="<%=basePath%>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">

            <div class="row">
                <div class="col-sm-12">
                	
                    	<a href="../SysRoleCtrl/roleList.do" target="_self">
                         	<button type="button" class="btn btn-w-m btn-primary">返回</button>
                         </a>
					
                        <div class="ibox-content">
						  <form action="../SysRoleCtrl/addUserForRole.do" target="_self">
                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>
                                	<th >选择</th>
                                	<th >员工名</th>
									<th >账号</th>
                                    <th >密码</th>
                                    <th >创建时间</th>
                                    
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${uis.list}" var="ui" >
                                  
	                                <tr>
	                                	<td><input type="checkbox" value="${ui.usersId}" name="uIds" class="c1" ></td>
	                                	<td>${ui.sysUserinfo.empName}</td>
	                                    <td>${ui.usersName}</td>
	                                    <td>${ui.usersPassword}</td>
	                                    <td>${ui.changeDate}</td>
	                                </tr> 
                                </c:forEach>
                                
                                <tr>
                                    <td style="text-align: center;" colspan="10">
                                    <a target="_self" href="../SysRoleCtrl/selectUsers.do?pageNum=${uis.firstPage }">首页</a>
                                    <a target="_self" href="../SysRoleCtrl/selectUsers.do?pageNum=${uis.prePage }">上一页</a>
                                    <a target="_self" href="../SysRoleCtrl/selectUsers.do?pageNum=${uis.nextPage }">下一页</a>
                                    <a target="_self" href="../SysRoleCtrl/selectUsers.do?pageNum=${uis.lastPage }">尾页</a>
                                                                             当前${uis.pageNum }/${uis.pages }页，共${uis.total }条
                                     </td>
                                </tr>
                                <tr>
                                    <td style="text-align: center;" colspan="10">
                                    	<input type="checkbox" id="c2">全选&emsp;
                                    	<button>提交</button>
                                     </td>
                                </tr>
                                </tbody>
                                <input type="hidden" value="${rId}" name="rId">
                            </table>
						  </form>
                        </div>
                    </div>
                </div>
            </div>
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    <script src="<%=basePath%>js/plugins/sweetalert/sweetalert.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){
        	$("#c2").click(function(){
        		
                if (this.checked) {
                //所有的复选框都选中
                    $('.c1').prop('checked', true);
                }
                else {
                //复选框都不选中
                    $('.c1').prop('checked', false);
                }

        	})
        	
     });
    	
        	
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>