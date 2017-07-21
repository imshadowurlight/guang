<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.min.js"></script>
 		<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
	   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	   	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css" type="text/css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/easyui/themes/icon.css" type="text/css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/demo/demo.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.edatagrid.js"></script>
		
		<script type="text/javascript">
	        $(function(){
	        	$('#dg').edatagrid({
	        		
	        		url: "${pageContext.request.contextPath }/user/list.do",
	                saveUrl: "${pageContext.request.contextPath }/user/saveUser.do",
	                destroyUrl: "${pageContext.request.contextPath }/user/deleteUser.do"
	            });
	        });
	    </script>
		
	</head>
	<body>
		<table id="dg" title="My Users" style="width:100%;height:750px;"
            toolbar="#toolbar" pagination="true" idField="id" rownumbers="true" fitColumns="true" singleSelect="true" data-options="
            	pageSize:20,
            	striped:true
            ">  
	        <thead>  
	            <tr> 
	                <th field="username" width="50" editor="{type:'validatebox',options:{required:false}}">username</th>
	                <th field="birthday" width="50" editor="{type:'validatebox',options:{required:false}}">birthday</th>  	<!-- 加入日期插件 -->
	                <th field="sex" width="50" editor="{type:'validatebox',options:{required:false}}">sex</th>
	                <th field="address" width="50" editor="{type:'validatebox',options:{required:false}}">address</th>
	            </tr>  
	        </thead>  
	    </table>  
	    <div id="toolbar">
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">New</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">Save</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">Cancel</a>
	    </div>
		
		
		
	</body>
</html>
