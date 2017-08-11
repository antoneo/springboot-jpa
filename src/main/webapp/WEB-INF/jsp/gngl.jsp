<%@ page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>功能管理</title>
		<script src="toolkit/jquery/jquery.min.js"></script>
		<script src="toolkit/bootstrap/js/bootstrap.min.js"></script>
		<script src="toolkit/bootstrap-table/js/bootstrap-table.min.js"></script>
		<script src="app/bTreeGrid/js/bTreeGrid.js"></script>
	</head>
	<body>
		<div id="tb"></div>
		<script type="text/javascript">
		$(function(){
			var data=[{Id: 1, Name: "系统设置", Url: null, ParentId: null, Level: 1, CreateTime: null, Status: 1, SortOrder: 1},
			          {Id: 2, Name: "菜单管理", Url: "/Systems/Menu/Index", ParentId: 1, Level: 2, CreateTime: null, Status: 1},
			          {Id: 3, Name: "订单管理", Url: null, ParentId: null, Level: 1, CreateTime: "2017-05-31 17:05:27"},
			          {Id: 4, Name: "基础数据", Url: null, ParentId: null, Level: 1, CreateTime: "2017-05-31 17:05:55"},
			          {Id: 5, Name: "新增订单", Url: "/order/add", ParentId: 3, Level: 2, CreateTime: "2017-05-31 17:07:03"}];
			$('#tb').bootstrapTable({
             // url: ActionUrl + 'GetMenuList',
             	data:data,
                toolbar: '#toolbar',
                sidePagination: 'client',
                pagination: false,
                treeView: true,
                treeId: "Id",
                treeField: "Name",
                treeRootLevel: 1,
                clickToSelect: true,//collapseIcon: "glyphicon glyphicon-triangle-right",//折叠样式
                //expandIcon: "glyphicon glyphicon-triangle-bottom"//展开样式
            });
		});
		</script>
	</body>
</html>