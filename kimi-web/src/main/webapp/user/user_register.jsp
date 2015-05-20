<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">


<title>用户注册</title>

	<!-- 新 Bootstrap 核心 CSS 文件 -->
	 <link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<!-- 

	<s:property value="userdo.name"/></br>
	<s:property value="userdo.userName"/></br>
	<s:property value="userdo.cars"/></br>
	<s:property value="userdo.gmtCreate"/></br>

 -->
 <body>







<div class="container">
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column">
			<form role="form">
				<div class="form-group">
					 <label for="username">用户名</label><input type="email" class="form-control" id="exampleInputEmail1" />
				</div>
				<div class="form-group">
					 <label for="name">姓名</label><input type="password" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="form-group">
					 <label for="sex">性别</label><input type="password" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="form-group">
					 <label for="mobileNum">手机号码</label><input type="password" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="form-group">
					 <label for="carNum">车牌号</label><input type="password" class="form-control" id="exampleInputPassword1" />
				</div>
				<div class="checkbox">
					 <label><input type="checkbox" /> Check me out</label>
				</div> <button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>






 <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
 <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>