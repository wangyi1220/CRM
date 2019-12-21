<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - 发件箱</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="<%=basePath %>favicon.ico"> <link href="<%=basePath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=basePath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath %>css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row">
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-content mailbox-content">
                        <div class="file-manager">
                           <a target="_self" class="btn btn-block btn-primary compose-mail" href="../offmessctrl/goadd.do">写信</a>
                            
                            
                            <div class="space-25"></div>
                            <h5>文件夹</h5>
                            <ul class="folder-list m-b-md" style="padding: 0">
                                <li>
                                    <a href="../offmessdetactrl/listpagedeta.do"  target="_self"> <i class="fa fa-envelope-o"></i> 收件箱</a>
                                </li>
                                <li>
                                    <a href="../offmessctrl/listpage.do"  target="_self"> <i class="fa fa-envelope-o"></i> 已发送</a>
                                </li>
                                
                                <li>
                                    <a href="mailbox.html"> <i class="fa fa-trash-o"></i> 垃圾箱</a>
                                </li>
                            </ul>
                           

                          
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-9 animated fadeInRight">
                <div class="mail-box-header">

                    <form target="_self" method="get" action="../offmessctrl/sousuo.do" class="pull-right mail-search">
                        <div class="input-group">
                            <input type="text" class="form-control input-sm" name="search" placeholder="搜索邮件标题">
                            <div class="input-group-btn">
                                <button type="submit" class="btn btn-sm btn-primary">
                                    	搜索
                                </button>   
                            </div>
                        </div>
                    </form>
                    <h2>
                    已发送(${p.total })
                </h2>
                    <div class="mail-tools tooltip-demo m-t-md">
                        <div class="btn-group pull-right">
                         <a  target="_self"  href="../offmessctrl/listpage.do?pageNum=${p.prePage }"  >
                            <button class="btn btn-white btn-sm"><i class="fa fa-arrow-left"></i>
                            </button></a>
                            <a  target="_self" href="../offmessctrl/listpage.do?pageNum=${p.nextPage }"  ><button class="btn btn-white btn-sm"><i class="fa fa-arrow-right"></i>
                            </button>
                             </a>

                        </div>
                        
   <a target="_self" href="../offmessctrl/listpage.do"> <button class="btn btn-white btn-sm" data-toggle="tooltip" data-placement="left" title="邮件列表">
    <i class="fa fa-refresh"></i> 刷新</button></a>
                       

                    </div>
                </div>
                <div class="mail-box">

                    <table class="table table-hover table-mail">
                        <tbody>
                            <tr class="unread">
                                <td class="check-mail">
                                   
                                </td>
                                <td class="mail-ontact">发件人</td>
                                
                                <td class="mail-subject">主题 </td>
                               
                                <td class=""><i class="fa fa-paperclip"></i></td>
                                
                                 <td class="mail-subject">收件人 </td>
                                
                                <td class="text-right mail-date">发送时间</td>
                            </tr>
                             
                             <c:forEach items="${p.list }" var="m">
                            <tr class="read">
                                <td class="check-mail">
                                    
                                </td>
                                
                                <td class="mail-ontact"><a href="mail_detail.html">${m.sender }</a> 
                                </td>
                                
                                <td class="mail-subject"><a target="_self" href="../offmessctrl/details.do?mid=${m.messid }">${m.title }</a>
                                </td>
                                
                                <td class=""><i class="fa fa-paperclip"> </i>
                               
                                </td>
                                
                                <td class="text-right mail-date">
                                 <c:forEach items="${m.offMessdeta}" var="d">
                                 ${d.receiverid}
                                 </c:forEach>
                                 </td>
                                
                                <td class="text-right mail-date"><fmt:formatDate value="${m.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
                                </td>
                                
                            </tr>
                            
                             </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.5"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){$(".i-checks").iCheck({checkboxClass:"icheckbox_square-green",radioClass:"iradio_square-green",})});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>