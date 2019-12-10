<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
                        <div class="ibox-title">
                            <h5>FooTable行切换，排序，分页演示</h5>

                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="fa fa-wrench"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-user">
                                    <li><a href="#">选项 01</a>
                                    </li>
                                    <li><a href="#">选项 02</a>
                                    </li>
                                </ul>
                                <a class="close-link">
                                    <i class="fa fa-times"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                                <thead>
                                <tr>

                                    <th data-toggle="true">产品</th>
                                    <th>名字</th>
                                    <th>电话</th>
                                    <th data-hide="all">公司</th>
                                    <th data-hide="all">参数</th>
                                    <th data-hide="all">采购数量</th>
                                    <th data-hide="all">日期</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>2015韩国童装韩版牛仔童短裤</td>
                                    <td>袁岳</td>
                                    <td>0800 051213</td>
                                    <td>深圳市有大福实业有限公司</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>300米速进口日本原丝耐磨</td>
                                    <td>付守永</td>
                                    <td>0500 780909</td>
                                    <td>广州重兑诺贸易有限公司</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>单肩包品牌外贸女包批发</td>
                                    <td>张有为</td>
                                    <td>0800 1111</td>
                                    <td>广州纳依斯商贸发展有限公司</td>
                                    <td><span class="pie">3,1</span></td>
                                    <td>750</td>
                                    <td>2015.08.22</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>2015新款辣妈孙俪周迅同款</td>
                                    <td>李全福 </td>
                                    <td>(016977) 0648</td>
                                    <td>营口港荟网络科技股份有限公司</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>300米速进口日本原丝耐磨</td>
                                    <td>付守永</td>
                                    <td>0500 780909</td>
                                    <td>广州重兑诺贸易有限公司</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>正品印度红油
                                    </td>
                                    <td>袁岳</td>
                                    <td>0800 051213</td>
                                    <td>深圳市有大福实业有限公司</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>2015新款辣妈孙俪周迅同款</td>
                                    <td>李全福 </td>
                                    <td>(016977) 0648</td>
                                    <td>营口港荟网络科技股份有限公司</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>美国原装进口电子烟油
                                    </td>
                                    <td>袁岳</td>
                                    <td>0800 051213</td>
                                    <td>深圳市有大福实业有限公司</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>300米速进口日本原丝耐磨</td>
                                    <td>付守永</td>
                                    <td>0500 780909</td>
                                    <td>广州重兑诺贸易有限公司</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>单肩包品牌外贸女包批发</td>
                                    <td>张有为</td>
                                    <td>0800 1111</td>
                                    <td>广州纳依斯商贸发展有限公司</td>
                                    <td><span class="pie">3,1</span></td>
                                    <td>750</td>
                                    <td>2015.08.22</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>2015新款辣妈孙俪周迅同款</td>
                                    <td>李全福 </td>
                                    <td>(016977) 0648</td>
                                    <td>营口港荟网络科技股份有限公司</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>300米速进口日本原丝耐磨</td>
                                    <td>付守永</td>
                                    <td>0500 780909</td>
                                    <td>广州重兑诺贸易有限公司</td>
                                    <td><span class="pie">6,9</span></td>
                                    <td>400</td>
                                    <td>2015.10.14</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>正品印度红油
                                    </td>
                                    <td>袁岳</td>
                                    <td>0800 051213</td>
                                    <td>深圳市有大福实业有限公司</td>
                                    <td><span class="pie">0.52/1.561</span></td>
                                    <td>200</td>
                                    <td>2015.09.10</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
                                <tr>
                                    <td>2015新款辣妈孙俪周迅同款</td>
                                    <td>李全福 </td>
                                    <td>(016977) 0648</td>
                                    <td>营口港荟网络科技股份有限公司</td>
                                    <td><span class="pie">4,9</span></td>
                                    <td>180</td>
                                    <td>2015.11.19</td>
                                    <td><a href="#"><i class="fa fa-check text-navy"></i> 通过</a></td>
                                </tr>
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
