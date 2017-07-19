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
	</head>
	<body>
		<!-- 测试datagrid接收数据 -->
		<table id="dg" title="My Accounts" class="easyui-datagrid" style="width:550px;height:250px"  
	            url="${pageContext.request.contextPath }/account/testDataGrid.do" toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="true">  
	        <thead>  
	            <tr>  
	                <th field="website" width="50">website</th>
	                <th field="name" width="50">Name</th>  
	                <th field="passwd" width="50">passwd</th>
	                <th field="phone" width="50">phone</th>
	                <th field="email" width="50">email</th>  
	            </tr>  
	        </thead>  
	    </table>  
	    <div id="toolbar">  
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newAccount()">New Account</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editAccount()">Edit Account</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyAccount()">Remove Account</a>
	    </div>  
		
		<!-- 添加账户弹窗 -->
		<div id="dlg" class="easyui-dialog" style="width:400px" closed="true" buttons="#dlg-buttons">
	        <form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
	            <div style="margin-bottom:20px;font-size:14px;border-bottom:1px solid #ccc">Account Information</div>
	            <div style="margin-bottom:10px">
	                <input name="website" class="easyui-textbox" required="true" label="website:" style="width:100%">
	            </div>
	            <div style="margin-bottom:10px">
	                <input name="name" class="easyui-textbox" required="true" label="name:" style="width:100%">
	            </div>
	            <div style="margin-bottom:10px">
	                <input name="passwd" class="easyui-textbox" required="true" label="passwd:" style="width:100%">
	            </div>
	            <div style="margin-bottom:10px">
	                <input name="phone" class="easyui-textbox" required="true" label="Phone:" style="width:100%">
	            </div>
	            <div style="margin-bottom:10px">
	                <input name="email" class="easyui-textbox" required="true" label="Email:" style="width:100%">
	            </div>
	        </form>
	    </div>
	    <div id="dlg-buttons">
	        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveAccount()" style="width:90px">Save</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
	    </div>
	    
	    
		
		
		<script type="text/javascript">
			var url;
			
			//弹出添加账户窗体
			function newAccount(){
		        $('#dlg').dialog('open').dialog('center').dialog('setTitle','New Account');
		        $('#fm').form('clear');
		        url = "${pageContext.request.contextPath }/account/saveAccount.do";
		    }
			
			function editAccount(){
	            var row = $('#dg').datagrid('getSelected');
	            if (row){
	                $('#dlg').dialog('open').dialog('center').dialog('setTitle','Edit User');
	                $('#fm').form('load',row);
	                url = "${pageContext.request.contextPath }/account/updateAccount.do?id="+row.id;
	                console.log(row.id);
	            }
	        }
			
			//添加账户
			function saveAccount(){
		        $('#fm').form('submit',{
		            url:url,
		            success: function(result){
		                var result = eval('('+result+')');
		                if (result.errorMsg){
		                    $.messager.show({
		                        title: 'Error',
		                        msg: result.errorMsg
		                    });
		                } else {
		                    $('#dlg').dialog('close');        
		                    $('#dg').datagrid('reload');    
		                }
		            }
		        });
		    }
			
			//删除账户
			function destroyAccount(){
	            var row = $('#dg').datagrid('getSelected');
	            if (row){
	                $.messager.confirm('Confirm','Are you sure you want to destroy this account?',function(r){
	                    if (r){
	                        $.post("${pageContext.request.contextPath }/account/deleteAccount.do?id="+row.id,{id:row.id},function(result){
	                            if (result.success){
	                                $('#dg').datagrid('reload');    // reload the user data
	                            } else {
	                                $.messager.show({    // show error message
	                                    title: 'Error',
	                                    msg: result.errorMsg
	                                });
	                            }
	                        },'json');
	                    }
	                });
	            }
	        }
		</script>
	</body>
</html>
