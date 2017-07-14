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
    	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
		
	</head>
	<body>
		<table>
			<c:forEach items="${accounts }" var="t" varStatus="s">
				<tr>
					<td>${t.name }</td>
					<td>${t.passwd }</td>
					<td>${t.email }</td>
					<td>${t.phone }</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
