<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>Document</title>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="easyui/themes/metro/easyui.css" />
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
	
</head>
<body>
	<h2>主页</h2>
	<table class="easyui-datagrid" title="用户列表" id="userTable"
			data-options="url:'user/list',fitColumns:true,striped:true,rownumbers:true,iconCls:'icon-search'">
			
		<thead>
			<tr>
				<th data-options="field:'ff',checkbox:true"></th>
				<th data-options="field:'id',width:30,sortable:true,order:'desc'">Id</th>
				<th data-options="field:'username',width:100,sortable:true">UserName</th>
				<th data-options="field:'password',width:200">PassWord</th>
				<th data-options="field:'salt',width:100">Salt</th>
				<th data-options="field:'sysRoles',width:100,formatter:roleFromatter"></th>
			</tr> 
		</thead>
	
	</table>
</body>
</html>

