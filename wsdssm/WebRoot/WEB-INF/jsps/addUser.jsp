<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
		
		
		<div style="padding:3px 2px;border-bottom:1px solid #ccc">Ajax Form</div>
		<form id="ff" action="${pageContext.request.contextPath }/user/addUser.do" method="post">
			<table>
				<tr>
					<td>username:</td>
					<td><input name="username" type="text"></input></td>
				</tr>
				<tr>
					<td>birthday:</td>
					<td><input name="birthday" type="text"></input></td>
				</tr>
				<tr>
					<td>sex:</td>
					<td><input name="sex" type="text"></input></td>
				</tr>
				<tr>
					<td>address:</td>
					<td><input name="address" type="text"></input></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></input></td>
				</tr>
			</table>
		</form>
		
		<script type="text/javascript">
			$(function(){
				$('#ff').form({
					success:function(data){
						$.messager.alert("hello world");
					}
				});
			})
		</script>
		
		
		
		
	</body>
</html>
