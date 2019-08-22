<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/resources/jquery-easyui-1.7.0/demo/demo.css">
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/resources/jquery-easyui-1.7.0/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
	 $(function ()
     {
         SetCenter();
         window.onresize = function ()
         {
             setTimeout(function () { SetCenter(); }, 100);
         }
         var errormsg = '${errormsg}';
         console.log(errormsg);
         if(errormsg != '')
         {
        	 $.messager.show({
 				title:'错误消息',
 				msg:errormsg,
 				timeout:2000,
 				showType:'slide'
 			});
         }
     });
     function SetCenter()
     {
    	 // 边框宽度为2
         var top = ($(window).height() - $('#logindiv').height() - 2) / 2;
         var left = ($(window).width() - $('#logindiv').width() - 2) / 2;
         console.log(top);
    	 console.log(left);
         if (top < 0) top = 0;
         if (left < 0) left = 0;
         $('#logindiv').panel('move', { left: left, top: top/2 });
     }
	</script>
	<style type="text/css">
	</style>
</head>
<body style="background-image:url(/resources/images/background.png);background-size: cover;">
	<div id="logindiv" class="easyui-panel" title="调度任务管理中心" style="width:100%;max-width:400px;padding:30px 60px;" data-options="style:{position:'absolute'}">
		<form id="ff" method="post" action="${pageContext.request.contextPath}/dologin" data-options="novalidate:true">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="username" style="width:100%" data-options="label:'用户名:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-passwordbox" name="password" style="width:100%" data-options="label:'密码:',required:true">
			</div>
			<div style="text-align:center;padding:5px 0">
				<input type="button" class="easyui-linkbutton" value="登录"  onclick="submitForm()"/>
			</div>
		</form>
	</div>
	<script>
		function submitForm()
		{
			$('#ff').form('submit',{
				onSubmit:function(){
					return $(this).form('enableValidation').form('validate');
				}
			});
		}
	</script>
</body>
</html>