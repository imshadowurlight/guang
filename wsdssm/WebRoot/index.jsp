<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
  </head>
  
  <body>
    This is my JSP page. <br>
    
    welcome to my ssm project home ,
    i am your greatest master guang.
    
    <a href="${pageContext.request.contextPath }/user/addUserPage.do">跳转至添加用户页面</a>
    <a href="${pageContext.request.contextPath }/user/userList.do">查看用户列表</a>
    <%-- <a href="${pageContext.request.contextPath }/account/addAccountPage.do">跳转至添加账户页面</a> --%>
    <a href="${pageContext.request.contextPath }/account/accountList.do">查看账户列表</a>
    <a href="${pageContext.request.contextPath }/account/accountList_simple_style.do">查看账户列表_简单_样式</a>
    
    <script type="text/javascript">
    	$(function(){
    		var new_account = JSON.stringify({"name":"test0714","passwd":"test0714","email":"test0714","phone":"test0714"});
    		$.ajax({
    			type:"post",
    			url:"${pageContext.request.contextPath }/account/requestJson.do",
    			contentType:"application/json;charset=utf-8",
    			dataType:"json",
    			data:new_account,
    			success:function(data){
    				var accountList = JSON.stringify(data);
    				console.log(accountList);
    			}
    		});
    	});
    </script>
    
    
  </body>
</html>
