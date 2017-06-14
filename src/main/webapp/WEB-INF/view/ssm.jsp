<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ssm框架</title>
</head>
<body>
<h3>ssm框架</h3>
<br>
<h4>参数测试：${data }</h4>
<br>
<form action="testForm" method="post" enctype="multipart/form-data">
	<input type="file" name="file"><br><br>
	<input type="submit" value="提交">
</form>
</body>
</html>