<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>调度任务管理</title>
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/demo/demo.css">
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/locale/easyui-lang-zh_CN.js"></script>
	<script>
		function submitForm(){
			var description= $("#description").val();
			var status = $("#status").val();
			$('#dg').datagrid({
				url:'${pageContext.request.contextPath}/job/queryPageData?description=' + description +"&status=" + status,
	            method:'post',
	            singleSelect:true,
	            height:'auto',
	            width:'auto',
	            collapsible:true,
	            rownumbers:true,
	            autoRowHeight:true,
	            autoRowWidth:true,
	            fitColumns:true,
	            pagination:true,
	            loadMsg:'正在加载...',
	            columns: [[
                {field:'description',width:'20%',align:'center',title:'任务描述'},
                {field:'beanClass',width:'30%',align:'center',title:'实现类'},
                {field:'cronExpression',width:'10%',align:'center',title:'任务频率'},
                {field:'lastTime',width:'10%',align:'center',title:'上次执行时间'},
                {field:'nextTime',width:'10%',align:'center',title:'下次执行时间'},
                {field:'jobStatus',width:'5%',align:'center',title:'任务状态',formatter:formatStatus},
                {field:'statusMsg',width:'15%',align:'center',title:'操作',formatter:formatOpt}
               ]]
		   }); 
		}
		function clearForm(){
			$('#ff').form('clear');
		}
		function openAddScheduler(){
			$("#addSchedulerDlg").dialog("open");
			$("#adddescription").textbox('setValue',"");
			$("#addbeanclass").textbox('setValue',"");
			$("#addjobcronExpression").textbox('setValue',"");
		}
		function openEditScheduler(index){
			$('#dg').datagrid('selectRow',index);
			var row = $('#dg').datagrid('getSelected');
			$("#editSchedulerDlg").dialog("open");
			$("#editdescription").textbox('setValue',row.description);
			$("#editbeanclass").textbox('setValue',row.beanClass);
			$("#editjobcronExpression").textbox('setValue',row.cronExpression);
		}
		function addScheduler(){
			var adddescription = $("#adddescription").val();
			var addbeanclass = $("#addbeanclass").val();
			var addjobcronExpression = $("#addjobcronExpression").val();
			if($.isEmptyObject(adddescription)){
				$.messager.alert('提示消息','任务描述不能为空!','warning');
				return false;
			}
			if($.isEmptyObject(addbeanclass)){
				$.messager.alert('提示消息','实现类不能为空!','warning');
				return false;
			}
			if($.isEmptyObject(addjobcronExpression)){
				$.messager.alert('提示消息','任务频率不能为空!','warning');
				return false;
			}
			$.messager.confirm("操作提示", "确定要增加?", function (data) {
			    if (data) {
			    	$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath}/job/addScheduler",
						data: "adddescription="+adddescription+"&addbeanclass="+addbeanclass+"&addjobcronExpression="+addjobcronExpression,
						dataType: "json",
						success : function (data) {
							var code = data.returnCode;
							var msg = data.returnMsg;
							$.messager.alert('提示消息',msg,'warning');
							if(code=="0000")
							{
								$("#addSchedulerDlg").dialog("close");
							}
							$('#dg').datagrid('reload');
						}
					});
			    }
			})
			
		}
		function formatOpt(val,row,index)
		{
			var status =  row.jobStatus;
			if(status == 'PAUSED')
			{
				return '<a href="#" class="easyui-linkbutton" onclick="openEditScheduler('+ index +')">编辑</a>/'+
	             '<a href="#" class="easyui-linkbutton" onclick="resumeScheduler(' + index + ')">恢复</a>/'+
	             '<a href="#" class="easyui-linkbutton" onclick="deleteScheduler(' + index + ')">删除</a>';
			}
			else
			{
				return '<a href="#" class="easyui-linkbutton" onclick="openEditScheduler('+ index +')">编辑</a>/'+
	             '<a href="#" class="easyui-linkbutton" onclick="pauseScheduler(' + index + ')">暂停</a>/'+
	             '<a href="#" class="easyui-linkbutton" onclick="deleteScheduler(' + index + ')">删除</a>';
			}
		}
		
		function editScheduler()
		{
			var editdescription = $("#editdescription").val();
			var editbeanclass = $("#editbeanclass").val();
			var editjobcronExpression = $("#editjobcronExpression").val();
			if($.isEmptyObject(editdescription)){
				$.messager.alert('提示消息','任务名称不能为空!','warning');
				return false;
			}
			if($.isEmptyObject(editbeanclass)){
				$.messager.alert('提示消息','实现类不能为空!','warning');
				return false;
			}
			if($.isEmptyObject(editjobcronExpression)){
				$.messager.alert('提示消息','任务频率不能为空!','warning');
				return false;
			}
			$.messager.confirm("操作提示", "确定要修改?", function (data) {
			    if (data) {
			    	$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath}/job/editScheduler",
						data: "editdescription="+editdescription+"&editbeanclass="+editbeanclass+"&editjobcronExpression="+editjobcronExpression,
						dataType: "json",
						success : function (data) {
							var msg = data.returnMsg;
							$.messager.alert('提示消息',msg,'warning');
							$("#editSchedulerDlg").dialog("close");
							$('#dg').datagrid('reload');
						}
					});
			     }
			});
		}
		function pauseScheduler(index)
		{
			$('#dg').datagrid('selectRow',index);
			var row = $('#dg').datagrid('getSelected');
			var beanClass = row.beanClass;
			$.messager.confirm("操作提示", "确定要暂停?", function (data) {
			    if (data) {
			    	$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath}/job/pauseScheduler",
						data: "beanClass="+beanClass,
						dataType: "json",
						success : function (data) {
							var msg = data.returnMsg;
							$.messager.alert('提示消息',msg,'warning');
							$('#dg').datagrid('reload');
						}
					});
			     }
			});
		}
		function deleteScheduler(index)
		{
			$('#dg').datagrid('selectRow',index);
			var row = $('#dg').datagrid('getSelected');
			var beanClass = row.beanClass;
			$.messager.confirm("操作提示", "确定要删除?", function (data) {
			    if (data) {
			    	$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath}/job/deleteScheduler",
						data: "beanClass="+beanClass,
						dataType: "json",
						success : function (data) {
							var msg = data.returnMsg;
							$.messager.alert('提示消息',msg,'warning');
							$('#dg').datagrid('reload');
						}
					});
			     }
			});
		}
		function resumeScheduler(index)
		{
			$('#dg').datagrid('selectRow',index);
			var row = $('#dg').datagrid('getSelected');
			var beanClass = row.beanClass;
			$.messager.confirm("操作提示", "确定要恢复?", function (data) {
			    if (data) {
			    	$.ajax({
						type: "post",
						url: "${pageContext.request.contextPath}/job/resumeScheduler",
						data: "beanClass="+beanClass,
						dataType: "json",
						success : function (data) {
							var msg = data.returnMsg;
							$.messager.alert('提示消息',msg,'warning');
							$('#dg').datagrid('reload');
						}
					});
			     }
			});
		}
		function formatStatus(val,row,index)
		{
			var status =  row.jobStatus;
			if(status == 'PAUSED' || status=='PAUSED_BLOCKED')
			{
				return '暂停';
			}
			if(status == 'ACQUIRED' || status=='WAITING' || status=='BLOCKED')
			{
				return '启动';
			}
			
		}
	</script>
</head>
<body>
	<div style="margin:10px 0;"></div>
	<form id="ff" method="post">
		<div class="easyui-panel" title="调度任务" style="width:100%;" data-options="iconCls:'icon-filter'"></div>
		<div class="easyui-panel" title="查询条件" style="width:100%;padding:10px 10px;">
			<div style="margin-bottom:3px">
				<input class="easyui-textbox" id="description" name="description" style="width:30%" data-options="label:'任务描述'">
				<select class="easyui-combobox" id="status" name="status" label="任务状态" style="width:10%">
					<option value="" selected="selected">全部</option>
					<option value="0">未启动</option>
					<option value="1">已启动</option>
				</select>
			</div>
			<div align="right">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:5%;">查询</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="openAddScheduler()" style="width:5%;">新增</a>
			</div>
		</div>
		<div><br><br></div>
		<div>
			<table id="dg" title="查询结果" class="easyui-datagrid" style="width:100%"
			data-options="rownumbers:true,singleSelect:true,pagination:true,url:'${pageContext.request.contextPath}/job/queryPageData'">
				<thead>
					<tr>
						<th data-options="field:'description',width:'20%',align:'center'">任务描述</th>
						<th data-options="field:'beanClass',width:'30%',align:'center'">实现类</th>
						<th data-options="field:'cronExpression',width:'10%',align:'center'">任务频率</th>
						<th data-options="field:'lastTime',width:'10%',align:'center'">上次执行时间</th>
						<th data-options="field:'nextTime',width:'10%',align:'center'">下次执行时间</th>
						<th data-options="field:'jobStatus',width:'5%',align:'center',formatter:formatStatus">任务状态</th>
						<th data-options="field:'statusMsg',width:'15%',align:'center',formatter:formatOpt">操作</th>
					</tr>
				</thead>
			</table>
		</div>
	</form>
	<div id="addSchedulerDlg" class="easyui-dialog" title="新增调度任务" style="width:70%;height:400px;padding:10px;"
				data-options="iconCls: 'icon-save',closed:true,modal:true,buttons:'#dlg-buttons'">
        <div id="dlg-buttons">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:addScheduler()">保存</a>
        </div>
        <form id="addSchedulerForm">
        	<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="adddescription" name="adddescription" style="width:30%" data-options="label:'任务描述:' ,required:true">
			</div>
			<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="addbeanclass" name="addbeanclass" style="width:600px;text-overflow:clip;overflow:hidden; " data-options="label:'实现类:' ,required:true">
			</div>
			<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="addjobcronExpression" name="addjobcronExpression" style="width:30%" data-options="label:'任务频率:' ,required:true">
			</div>
        </form>
	</div>
	<div id="editSchedulerDlg" class="easyui-dialog" title="修改调度任务" style="width:70%;height:400px;padding:10px;"
				data-options="iconCls: 'icon-save',closed:true,modal:true,buttons:'#edit-dlg-buttons'">
        <div id="edit-dlg-buttons">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:editScheduler()">保存</a>
        </div>
        	<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="editdescription" name="editdescription" value="" style="width:30%" data-options="label:'任务描述:' ,required:true">
			</div>
			<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="editbeanclass" name="editbeanclass" value="" style="width:600px;text-overflow:clip;overflow:hidden; " data-options="label:'实现类:' ,required:true">
			</div>
			<div style="margin-bottom:3px;margin-left: 3px">
				<input class="easyui-textbox" id="editjobcronExpression" name="editjobcronExpression" value="" style="width:30%" data-options="label:'任务频率:' ,required:true">
			</div>
	</div>
</body>
</html>
