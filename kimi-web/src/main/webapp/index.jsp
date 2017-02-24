<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hello World!</title>
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="http://cdn.bootcss.com/jquery/3.0.0-alpha1/jquery.min.js"></script>
	<script type="text/javascript">
    $(document).ready(function(){
        $.ajax({
             url:'http://localhost:8088/illegal.html?carNum=’„A920KB',
             dataType:"jsonp",
             jsonpCallback:"callback",
             success:function(data){
            	 alert(data.illegalList[0].address);
             },
             error:function(){
            	 alert("error");
             }
        });
    });
</script>
</head>
	<body>
	
	
	
	
	
	</body>
</html>