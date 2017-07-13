<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.0.1:8003/ssmImage19"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<!-- 引入JQuery -->
		<!--${pageContext.request.contextPath}-->
    	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
 		<!-- 引入EasyUI -->
 		<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
 		<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
	   	<script type="text/javascript" src="js/easyui/locale/easyui-lang-zh_CN.js"></script>
 		<!-- 引入EasyUI的样式文件-->
	   	<link rel="stylesheet" href="js/easyui/themes/default/easyui.css" type="text/css"/>
 		<!-- 引入EasyUI的图标样式文件-->
		<link rel="stylesheet" href="js/easyui/themes/icon.css" type="text/css"/>
		
		<link rel="stylesheet" type="text/css" href="js/easyui/demo/demo.css">
		
	</head>
	<body>
		<table>
			<c:forEach items="${users }" var="t" varStatus="s">
				<tr>
					<td>${t.username }</td>
					<td>${t.birthday }</td>
					<td>${t.sex }</td>
					<td>${t.address }</td>
				</tr>
			</c:forEach>
		</table>
		
		
	</body>
</html>
