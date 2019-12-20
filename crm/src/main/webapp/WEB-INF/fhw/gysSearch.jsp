<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 引入JSTL的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript"  src="js/jquery-1.7.2.min.js"></script>

  		<table style="width: 200px;">
   			<c:forEach items="${searchList}"  var="gys">
   				<tr>
   					<td><a href="GongYingShangctrl/list.do?gysName=${gys.gysName}" target="_self">${gys.gysName} </a></td>
   				</tr>
   			</c:forEach>
   		</table>
   	 
   	
<script>
	$(function(){
		$("tr:even").mouseenter(function(){
			$(this).css("background-color","#00ffff")
		})
		$("tr:even").mouseleave(function(){
			$(this).css("background-color","#ffffff")
		})
		$("tr:odd").mouseenter(function(){
			$(this).css("background-color","red")
		})
		$("tr:odd").mouseleave(function(){
			$(this).css("background-color","#ffffff")
		})
	})
</script>