<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
    	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
	</head>
	<body>
		<div style="padding:3px 2px;border-bottom:1px solid #ccc">Ajax Form</div>
		<form id="main_form" action="${pageContext.request.contextPath }/account/addAccount.do" method="post">
			<table>
				<tr>
					<td>name:</td>
					<td><input name="name" type="text"></input></td>
				</tr>
				<tr>
					<td>passwd:</td>
					<td><input name="passwd" type="text"></input></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input name="email" type="text"></input></td>
				</tr>
				<tr>
					<td>phone:</td>
					<td><input name="phone" type="text"></input></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></input></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>
