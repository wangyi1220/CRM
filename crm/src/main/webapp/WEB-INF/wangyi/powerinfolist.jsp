<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>显示所有权限</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="<%=basePath%>favicon.ico"> <link href="<%=basePath%>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
            
            <div class="col-sm-4">
                <div class="ibox float-e-margins no-drop">
                    <div class="ibox-title">
                        <h5>拖动面板</h5>
                        <div class="ibox-tools">
                            <label class="label label-danger">不可拖动</label>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <h2>
                                版本 1.2.1 中的新功能
                            </h2>
                        <p>
                            攻城狮们夜以继日的疯狂加班，毛都快掉光了，解决了下列问题，赶快升级吧！
                            <br>1.新版智慧公交，增加定位、地图、预估到达时间等功能。
                            <br>2.丰富幼儿故事资源，宝宝爱学，妈妈放心。
                        </p>
                    </div>
                </div>
            </div>
            

        </div>
        
    </div>
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/plugins/peity/jquery.peity.min.js"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    <script src="<%=basePath%>js/plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
    <script src="<%=basePath%>js/demo/peity-demo.min.js"></script>
    <script>
        $(document).ready(function(){WinMove()});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    

</body>

</html>
