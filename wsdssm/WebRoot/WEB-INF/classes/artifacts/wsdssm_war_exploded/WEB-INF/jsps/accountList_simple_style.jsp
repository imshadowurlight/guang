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
	</head>
	<body>
		
		<table id="dg" title="My Accounts" style="width:100%;height:750px;"
            toolbar="#toolbar" pagination="true" idField="id" rownumbers="true" fitColumns="true" singleSelect="true" data-options="
            	pageSize:20,
            	striped:true
            ">  
	        <thead>  
	            <tr>  
	                <th field="website" width="50" editor="{type:'validatebox',options:{required:false}}">website</th>
	                <th field="name" width="50" editor="{type:'validatebox',options:{required:false}}">Name</th>  
	                <th field="passwd" width="50" editor="{type:'validatebox',options:{required:false}}">passwd</th>
	                <th field="phone" width="50" editor="{type:'validatebox',options:{required:false}}">phone</th>
	                <th field="email" width="50" editor="{type:'validatebox',options:{required:false}}">email</th>  
	            </tr>  
	        </thead>  
	    </table>  
	    <div id="toolbar">
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">New</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">Save</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">Cancel</a>
	        <!-- 根据条件查询账号 
	        	event.keyCode==13 表示enter触发事件
	        	enter键的ASCII是13
	        -->
	        <span style="float: right;">	
	        website：<input type="text" id="website_name" size="20" onkeydown="if(event.keyCode==13) doSearch()"/>
	        <a href="javascript:doSearch()" class="easyui-linkbutton" iconCls="icon-search" plain="true">search</a>
	        </span>
	    </div>
	    <script type="text/javascript">
		    function doSearch() {
	    		//调用了 'load' 方法来加载新的数据网格（datagrid）数据
	            $("#dg").datagrid('load', {
	                "website": $("#website_name").val()
	                
	            });
	        }
	    </script>
	    
	    <script type="text/javascript">
	        $(function(){
	        	$('#dg').edatagrid({
	        		//url: "${pageContext.request.contextPath }/account/testDataGrid.do",
	        		url: "${pageContext.request.contextPath }/account/list.do",
	                saveUrl: "${pageContext.request.contextPath }/account/saveAccount.do",
	                updateUrl: "${pageContext.request.contextPath }/account/updateAccount.do",
	                destroyUrl: "${pageContext.request.contextPath }/account/deleteAccount.do"
	            });
	        });
	    </script>
	</body>
</html>
