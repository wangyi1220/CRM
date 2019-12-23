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
    

    <title>查看所有权限</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="<%=basePath%>favicon.ico"> <link href="<%=basePath%>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=basePath%>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    
    <link href="<%=basePath%>css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/chosen/chosen.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/colorpicker/css/bootstrap-colorpicker.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/cropper/cropper.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/switchery/switchery.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/jasny/jasny-bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/nouslider/jquery.nouislider.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/datapicker/datepicker3.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/ionRangeSlider/ion.rangeSlider.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/ionRangeSlider/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">
    <link href="<%=basePath%>css/plugins/clockpicker/clockpicker.css" rel="stylesheet">
    
    <link href="<%=basePath%>css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        
        <div class="row">
        	
          <form action="../SysRoleCtrl/updatePower.do" target="_self" id="form1">
          <a href="../SysRoleCtrl/roleList.do" target="_self">
            	<button type="button" class="btn btn-w-m btn-primary">返回</button>
            </a>
            <button type="submit" class="btn btn-w-m btn-primary" id="b1">确认添加</button>
            <br>    <br>
          <c:forEach items="${p }" var="pc">
          <c:if test="${not empty pc.sysPowerinfoes[0].powerName && pc.sysPowerinfoes[0].powerName!=''}">
            <div class="col-sm-2">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                         <c:set var="allsum" value="${pc.sysPowerinfoes.size()}"></c:set>
                         <c:set var="allcount" value="0"></c:set>
                         <c:forEach items="${pc.sysPowerinfoes}" var="pi">
                            <c:if test="${pi.isHasPower=='1'}">
                               <c:set var="allcount" value="${allcount+1 }"></c:set>
                            </c:if>
                         </c:forEach>
                       
                         <input type="checkbox" id="${pc.columnsName }" onclick="checkall(this,'${pc.columnsName }')"
                                  ${allsum==allcount ? "checked":"" } >
                         <label for="checkbox2">
                             ${pc.columnsName }
                         </label>
                     
                        <div class="ibox-tools">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="typography.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="typography.html#">选项1</a>
                                </li>
                                <li><a href="typography.html#">选项2</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <ul class="unstyled">
                          <c:forEach items="${pc.sysPowerinfoes}" var="pi">
                            	<li   style="margin-left: -20px;">
                            		<input id="checkbox2" type="checkbox" ${pi.isHasPower=='1' ? "checked":"" } 
                            		class="${pc.columnsName }" value="${pi.powerId }" name="pIds" onclick="checkall1(this,'${pc.columnsName }')">
                            		${pi.powerName }
                            	</li>
                            
                          </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
            </c:if>
          </c:forEach>
          	<input type="hidden" value="${rId }" name="rId">
          </form>
            
         </div>  
    </div>
    <script src="<%=basePath%>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=basePath%>js/content.min.js?v=1.0.0"></script>
    
    <script src="<%=basePath%>js/plugins/chosen/chosen.jquery.js"></script>
    <script src="<%=basePath%>js/plugins/jsKnob/jquery.knob.js"></script>
    <script src="<%=basePath%>js/plugins/jasny/jasny-bootstrap.min.js"></script>
    <script src="<%=basePath%>js/plugins/datapicker/bootstrap-datepicker.js"></script>
    <script src="<%=basePath%>js/plugins/prettyfile/bootstrap-prettyfile.js"></script>
    <script src="<%=basePath%>js/plugins/nouslider/jquery.nouislider.min.js"></script>
    <script src="<%=basePath%>js/plugins/switchery/switchery.js"></script>
    <script src="<%=basePath%>js/plugins/ionRangeSlider/ion.rangeSlider.min.js"></script>
    <script src="<%=basePath%>js/plugins/iCheck/icheck.min.js"></script>
    <script src="<%=basePath%>js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%=basePath%>js/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script src="<%=basePath%>js/plugins/clockpicker/clockpicker.js"></script>
    <script src="<%=basePath%>js/plugins/cropper/cropper.min.js"></script>
    <script src="<%=basePath%>js/demo/form-advanced-demo.min.js"></script>
    <script>
      
        $(document).ready(function(){
        
        	
        	
        	for(var i=0;i<${p.size()};i++){
        		$('#${p[""+i+""].columnsName}').click(function(){
        		
	                if (this.checked) {
	                //所有的复选框都选中
	                    $('.${p[""+i+""].columnsName}').prop('checked', true);
	                }
	                else {
	                //复选框都不选中
	                    $('.${p[""+i+""].columnsName}').prop('checked', false);
	                }

        		})
        	}
     	});
     	
     	
     	function checkall(obj,clsname){
     	    
     	     if (obj.checked) {
               //所有的复选框都选中
                   $("."+clsname).prop('checked', true);
               }
               else {
               //复选框都不选中
                   $("."+clsname).prop('checked', false);
               }
     	    
     	}
     	
     	
     	function checkall1(obj,clsname){
     	     var alllength=$("."+clsname).length;
     	     var allobj=$("."+clsname);
     	     var ischecked=0;
     	     for(var i=0;i<alllength;i++){
     	       if(allobj.get(i).checked){
     	          ischecked=ischecked+1;
     	       }
     	     }
     	     //alert(alllength+"===="+ischecked);
     	     if (alllength==ischecked) {
               //所有的复选框都选中
                   $("#"+clsname).prop('checked', true);
               }
               else {
               //复选框都不选中
                   $("#"+clsname).prop('checked', false);
               }
     	    
     	}
     </script>
    <script type="<%=basePath%>text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>
