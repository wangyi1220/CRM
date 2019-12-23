<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title>H+ 后台主题UI框架 - 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
    <link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/style.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/login.min.css" rel="stylesheet">
    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("#cId").blur(function(e) {
  			var pk=$(this).val();
  			$.ajax({
  				type: "post",
  				url: "LoginCtrl/checkcId.do",
  				data: "pk="+pk,
  				dataType:"json",
  				success:function(d){
  					console.log(d);
  					if(d.msgContent=="公司代码不存在"){
  						$("#sp").html(d.msgContent);
  						$("#sub").prop('disabled', true);
  					}else{
  						$("#sp").html("");
  						$("#sub").prop('disabled', false);
  					}
  					
  				},
  				error: function(e){
  					console.log(e);
  					alert("检测用户名失败");
  				}
  			});
  		});
  	});
  </script>

</head>

<body class="signin">
    <div class="signinpanel">
        <div class="row">
            <div class="col-sm-7">
                <div class="signin-info">
                    <div class="logopanel m-b">
                        <h1>[ crm ]</h1>
                    </div>
                    <div class="m-b"></div>
                    <h4>欢迎使用 <strong>客户关系管理系统</strong></h4>
                    
                </div>
            </div>
            <div class="col-sm-5">
                
                    <h4 class="no-margins">登录：</h4>
                    <p class="m-t-md">登录到客户关系管理系统</p>
                    <input type="text" class="form-control uname" placeholder="公司代码"
                    	 style="width: 230px;margin-bottom: -50px;margin-left:32px " id="cId"/>
                   	
                 <form method="post" action="LoginCtrl/login.do">
                 <br>
                 	<p id="sp" style="color: red"></p>
                    <input type="text" class="form-control uname" placeholder="用户名" style="margin-top: 40px" name="usersName"/>
                    <input type="password" class="form-control pword m-b" placeholder="密码" name="usersPassword"/>
                    <input type="text" class="form-control pword" placeholder="验证码" style="width: 100px"/>
                    <img alt="" src="${basePath }validatecode.jsp" id="img" 
						width="56px" height="20px" onclick="lala(this)" style="margin-left: 120px;margin-top: -27px">
                    <button class="btn btn-success btn-block" type="submit" id="sub">登录</button>
                </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2015 All Rights Reserved. H+
            </div>
        </div>
    </div>
    
</body>

</html>
