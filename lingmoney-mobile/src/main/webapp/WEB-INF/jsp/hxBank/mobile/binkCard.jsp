<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panel panel-default">
	<div class="panel-heading">
		<a data-toggle="collapse" data-parent="#accordion" href="#collapse2">账户激活/绑卡</a>
	</div>
	<div id="collapse2" class="panel-collapse collapse">
		<div class="panel-body">
			<div class="well">
				<span>生成加密数据位置</span>
				<ol class="breadcrumb"><li>mobile项目中</li><li>src/test/java</li><li>com.mrbt/lingmoney.test</li><li>PostTest</li><li>生成请求开立账户加密数据</li></ol>
			</div>
			<form action="/bank/tiedCardPage" method="post" >
				<div class="input-group input-group-sm">
					<span class="input-group-addon">加密数据</span>
					<input type="text" class="form-control" name="params" id="accountOpenInput"/>
				</div>
				<input type="submit" class="btn btn-default btn-sm" value="账户激活/绑卡" />
			</form>
		</div>
	</div>
</div>
