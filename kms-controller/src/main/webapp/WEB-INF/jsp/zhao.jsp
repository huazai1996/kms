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
	<script type="text/javascript">
		$(function(){
			$("#zhaoTable").datagrid({
				pagination:true,
				toolbar:"#tb",
				idField:"id"
			})
			$("#cc").combobox({
				panelHeight:"auto"
			})
		})
		function roleFromatter(value,row,index){
			if(value.length==0){
				return "-";
			}
			return value.teaName;
		}
		
		function feiFromatter(value,row,index){
			if(value==1){
				return "是";
			}
			if(value==2){
				return "否";
			}
		}
		function genFromatter(value,row,index){
			if(value==1){
				return "男";
			}
			if(value==0){
				return "女";
			}
		}
		
		
		function setCondition(){
			var postData = {
					name : $("#name").val(),
					id:$("#id").val(),
					refund:$("#cc").val(),
					phone : $("#cao").val()
				};
			/* console.log(postData);
			var ids = $("#roles").combobox("getValues");
			for(var i =0;i<ids.length;i++){
				postData["sysRoles["+i+"].id"] = ids[i];	
			}*/
			console.log(postData); 
			
			$("#zhaoTable").datagrid("reload",postData)
		}
	</script>
</head>
<body>

	<h2>招生信息</h2>
	<form id="userForms">
	<div class="easyui-panel" title="<h3>设置查询条件</h3>" style="padding: 20px 20px">
		幼儿编号 : <input type="text" name="" id="id"/>
		幼儿姓名 : <input type="text" name="" id="name"/>
		定班老师 : <input type="text" name="" id="teaId"/>
		联系电话 : <input type="text" name="" id="cao"/><br/>
		备注说明 : <input type="text" name="" id=""/>
		是否退费 : 
		<select id="cc" class="easyui-combobox" name="dept"  style="width:100px;">
		   	<option value="-1">请选择</option>
		    <option value="1">是</option>
		    <option value="2">否</option>
		</select>
		<a id="btn" href="javascript:void(0)" onclick="setCondition();" class="easyui-linkbutton" data-options="iconCls:'icon-search'">Search</a>
		<a id="btn" href="javascript:void(0)" onclick="resetCondition()" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">Reset</a>
	</div>
	</form>
	<table class="easyui-datagrid" title="用户列表" id="zhaoTable"
			data-options="url:'rec/list',fitColumns:true,striped:true,rownumbers:true,iconCls:'icon-search'">	
		<thead>
			<tr>
				<th data-options="field:'ff',checkbox:true"></th>
				<th data-options="field:'id',width:60,sortable:true,order:'desc'">招生编号</th>
				<th data-options="field:'name',width:100,sortable:true">姓名</th>
				<th data-options="field:'birthday',width:200">出生日期</th>
				<th data-options="field:'gender',width:100,formatter:genFromatter">性别</th>
				<th data-options="field:'estimateparkdate',width:100">预计入园时间</th>
				<th data-options="field:'phone',width:100">联系电话</th>
				<th data-options="field:'refund',width:100,formatter:feiFromatter">是否退费</th>
				<th data-options="field:'teacher',width:100,formatter:roleFromatter">入班教师</th>
			</tr> 
		</thead>
	
	</table>
</body>
</html>

