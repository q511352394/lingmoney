<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common/top.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>企业用户设置</title>
	<jsp:include page="/common/head.jsp"></jsp:include>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/excel_dategrid.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/DatePattern.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/pay/takeHeartPaySellSubmit.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/easyUI/datagrid-groupview.js"></script>
	 <style type="text/css">
        .subtotal { font-weight: bold; }/*合计单元格样式*/
    </style>
</head>
<body>
	<div class="easyui-layout" style="width:700px;" fit="true">
	        <div class="easyui-panel" data-options="region:'north',title:'查询窗口',iconCls:'icon-book'" style="padding:5px;height:80px">
	        	 <div id="tb" style="padding:2px 5px;">
			                       客户名称：<input class="easyui-textbox" style="width:110px" id="searchName">
			        <a href="javascript:searchUsers()" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
			    </div>
	            <form id="searchFrm">
	            	<table>
	            		<tr>
	            			<td>融资人信息：</td>
	            			<td><select class="easyui-combogrid" id="sFincUsers" name="product" style="width:200px" data-options="
							            panelWidth: 480,
							            toolbar:'#tb',
							            idField: 'platUserNo',
							            pagination:true,
							            editable:false,
							            loadMsg:'正在加载,请稍后...',
							            textField: 'name',
							            url: '/rest/sell_submit/listUsers',
							            method: 'post',
							           	onShowPanel:function(){
						            		$(this).combogrid('grid').datagrid('reload');
						            	},
							            columns: [[
							                {field:'platUserNo',title:'用户id',width:30},
							                {field:'name',title:'用户名称',width:50}
							            ]],
							            onChange:function(){
							            	search();
							            },
							            fitColumns: true
							        ">
							    </select></td>
	            			<td><a href="javascript:search()" class="easyui-linkbutton" id="btnAddOK" iconcls="icon-search" >查询</a></td>
	            		</tr>
	            	</table>
	            </form>
	        </div>
	        <div id="tb"  data-options="region:'center'" style="padding:5px;height:auto">       
	           <table  class="easyui-datagrid" title="查询结果(只支持搜索查询)" fit='true' id="adGrid"
		            data-options="singleSelect:false,showFooter:true,toolbar:toolbar,fitColumns:true,pagination:true,iconCls:'icon-view',loadMsg:'请稍后，正在加载数据...',idField:'id',collapsible:true,url:'/rest/sell_submit/listByTakeHeart',method:'post',
		           	groupField:'p_id',view:groupview,
		           	groupFormatter:function(value,rows){
	                    return '随心取';
	                },onLoadSuccess:function(data){
		           		compute(data);
		           	}
		            "> 
		            
		            <thead>
			            <tr>
			               <th data-options="field:'ck',checkbox:true"></th>
			            	<th data-options="field:'id',width:100">id</th>
			            	<th data-options="field:'sell_money',width:100">赎回金额</th>
			            	<th data-options="field:'operate_time',width:100 " formatter="formatTimer" >卖出时间</th>
			            	<th data-options="field:'financ_user',width:100">客户号</th>
			            </tr>
			        </thead>
		    	</table> 
		    	
		    	
	        </div>
		</div>
		<!-- 添加的弹出层 -->
	<!-- 	 <div id="DivAdd" class="easyui-dialog" style="width:380px;height:185px;padding:10px 20px"
			closed="true" resizable="true" modal="true" data-options="title:'上传图片',iconCls: 'icon-add',buttons: '#dlg-buttons'">
			 <form id="ffAdd" method="post" novalidate="novalidate" enctype="multipart/form-data">
			 	<table id="tblAdd" class="view">
			 		<tr>
			 			<th>
                           <label for="name">选择excel文件：</label>
                        </th>
                        <td>
                        	 <input  class="easyui-filebox" name="excelFile" id="excelFile" style="width:200px" data-options="required:true"></input>
                        </td>
			 		</tr>
			 		<tr>
                        <td colspan="2" style="text-align:right; padding-top:10px">
                            <a href="javascript:void(0)" class="easyui-linkbutton" id="btnAddOK" iconcls="icon-ok" onclick="save()">确定</a>
                            <a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-cancel" onclick="javascript:$('#DivAdd').dialog('close')">关闭</a>
                        </td>
                    </tr>
			 	</table>
			 </form>
		</div> -->
		 <form id="ffAdd" method="post"></form>
</body>
</html>