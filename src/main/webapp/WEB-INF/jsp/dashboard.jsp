<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>dashboard</title>
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/demo/demo.css">
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/resources/js/watermark.js"></script>
	<script type="text/javascript">
		$(function(){
			//watermark({watermark_txt:"永银文化"});
		});
		function clickmenu()
		{
			$("#iframe").attr("src","${pageContext.request.contextPath}/job/taskList");
			console.log($(".panel-title").eq(2).html());
		}
		function logout()
		{
			$.messager.confirm('消息框','确定登出?',function(r){
			    if (r){
			    	$("#iframe").attr("src","${pageContext.request.contextPath}/logout");
			    }
			});
		}
	</script>
</head>
<body class="easyui-layout">
	<div align="right" data-options="region:'north',border:false" style="height:30px;background:#E0ECFF;padding:5px">
		<span>
			<img alt="" src="${pageContext.request.contextPath}/resources/jquery-easyui-1.7.0/themes/icons/man.png"/>
			${sessionScope.userInfo.userName}
		</span>
		<a href="javascript:void(0)" onclick="logout()">退出</a>
	</div>
	<div data-options="region:'west',split:true,title:'菜单'" style="width:150px;padding:10px;background-color:#F0F0F0">
		<ul class="easyui-tree">
			<li>
				<span>任务管理</span>
				<ul>
					<li>
						<span><a href="#" onclick="clickmenu()">调度任务</a></span>
					</li>
				</ul>
			</li>
		</ul>
	</div>
	<div id="centerdiv" data-options="region:'center',title:''" style="text-align: right;background-color:#F0F0F0">
		<iframe id="iframe" src="" style="display: block;" width="100%" height="100%"></iframe>
	</div>
</body>
</html>