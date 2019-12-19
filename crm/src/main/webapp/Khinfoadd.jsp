<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'khinfoadd.jsp' starting page</title>
    
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
    <center>
    <h1>添加用户</h1>
    </center>
    
         <div class="ibox-content">
             <form class="form-horizontal m-t" id="commentForm" action="SalekhinfoController/add.do" method="post" target="_self">                
                   <div class="form-group">
                        <label class="col-sm-3 control-label">客户名称：</label>
                        <div class="col-sm-8">
                            <input id="userName" name="userName" class="form-control" type="text" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">客户属性：</label>
                        <div class="col-sm-8">
                            <input  name="userAttribute" class="form-control" type="text" aria-required="true" aria-invalid="false" class="valid">
                        </div>
                    </div>
                  
                    <div class="form-group">
                        <label class="col-sm-3 control-label">网站:</label>
                        <div class="col-sm-8">
                            <input id="web" name="web" class="form-control" type="text" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">股票代号：</label>
                        <div class="col-sm-8">
                            <input id="stockCode" name="stockCode" class="form-control" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">上级单位：</label>
                        <div class="col-sm-8">
                            <input id="superiorUnit" name="superiorUnit" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">所有人：</label>
                        <div class="col-sm-8">
                            <input id="owner" name="owner" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">员工数：</label>
                        <div class="col-sm-8">
                            <input id="employeesNumber" name="employeesNumber" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">行业编码：</label>
                        <div class="col-sm-8">
                            <input id="industryId" name="industryId" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">客户类型：</label>
                        <div class="col-sm-8">
                            <input id="userType" name="userType" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">客户状态：</label>
                        <div class="col-sm-8">
                            <input id="userState" name="userState" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">客户来源：</label>
                        <div class="col-sm-8">
                            <input id="userSource" name="userSource" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">固定电话：</label>
                        <div class="col-sm-8">
                            <input id="gdphone" name="gdphone" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">移动电话：</label>
                        <div class="col-sm-8">
                            <input id="mphone" name="mphone" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">客户传真：</label>
                        <div class="col-sm-8">
                            <input id="userFax" name="userFax" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">开户银行：</label>
                        <div class="col-sm-8">
                            <input id="depositBank" name="depositBank" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">银行账户：</label>
                        <div class="col-sm-8">
                            <input id="bankAccount" name="bankAccount" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">下次联系时间：</label>
                        <div class="col-sm-8">
                            <input id="nextContactTime" name="nextContactTime" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">电子邮箱：</label>
                        <div class="col-sm-8">
                            <input id="eMail" name="eMail" class="form-control" type="email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">SIC编码：</label>
                        <div class="col-sm-8">
                            <input id="sicCode" name="sicCode" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">支付方式：</label>
                        <div class="col-sm-8">
                            <input id="payMethod" name="payMethod" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">是否有效：</label>
                        <div class="col-sm-8">
                            <input id="isEffective" name="isEffective" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">详细地址：</label>
                        <div class="col-sm-8">
                            <input id="detailedAddress" name="detailedAddress" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">备注信息：</label>
                        <div class="col-sm-8">
                            <input id="remarksInfo" name="remarksInfo" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">公司编号：</label>
                        <div class="col-sm-8">
                            <input id="companyId" name="companyId" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">最后修改时间：</label>
                        <div class="col-sm-8">
                            <input id="lastModified" name="lastModified" class="form-control">
                        </div>
                    </div>
                                        
                    <div class="form-group">
                        <div class="col-sm-8 col-sm-offset-3">
                            <button class="btn btn-primary" type="submit">提交</button>
                        </div>
                    </div>
             </form>
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

