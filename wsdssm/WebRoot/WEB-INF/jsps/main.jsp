<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/easyui/themes/icon.css" type="text/css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/demo/demo.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.edatagrid.js"></script>

  </head>
  
  <body>
    <div class="easyui-layout">
    	
    	<!-- 创建顶部面板 -->
    	<div region="north" style="height: 78px;background-color: #ffff">
		    <table width="100%">
		        <tr>
		            <td width="50%"></td>
		            <td valign="bottom" style="font-size: 20px;color:#8B8B8B;font-family: '楷体';" align="right" width="50%"><font size="3">
		            	welcome to wsdssm.
		            </td>
		        </tr>
		    </table>
		</div>
		
		<!-- 创建主体面板 -->
		<div region="center">
		    <div class="easyui-tabs" fit="true" border="false" id="tabs">
		        <div title="首页" data-options="iconCls:'icon-home'">
		            <div align="center" style="padding-top: 100px">
		                <font color="grey" size="10">wsdssm</font>
		            </div>
		        </div>
		    </div>
		</div>
		
		<!-- 创建左侧面板 -->
		<div region="west" style="width: 200px;height:500px;" title="导航菜单" split="true">
		    <div class="easyui-accordion">
		        <div title="书架管理" data-options="iconCls:'icon-shujias'" style="padding:10px">
		            <a href="javascript:openTab(' 书架管理','storeManage.jsp','icon-shujia')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-shujia'" style="width: 150px;">书架管理</a>
		        </div>
		        <div title="书籍管理" data-options="iconCls:'icon-shuji'" style="padding:10px">
		            <a href="javascript:openTab(' 全部书籍','allBooksManage.jsp','icon-shuben')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-shuben'" style="width: 150px;">全部书籍</a>
		        </div>
		        <div title="系统管理" data-options="iconCls:'icon-item'" style="padding:10px;border:none;">
		            <a href="javascript:openTab(' 管理员列表','userManage.jsp','icon-lxr')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-lxr'" style="width: 150px;">管理员列表</a>
		            <a href="javascript:openPasswordModifyDialog()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-modifyPassword'" style="width: 150px;"> 修改密码</a> 
		            <a href="javascript:logout()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-exit'" style="width: 150px;"> 安全退出</a>
		        </div>
		    </div>
		</div>
		
    </div>
  </body>
</html>
