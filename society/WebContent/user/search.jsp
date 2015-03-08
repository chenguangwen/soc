<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Find User</title>
</head>
<body>
	<form name="info" action="UserController?method=findUser" method="post">
		Name:<input type="text" name="name" /><br />
		Birthday:<input type="text" onClick="WdatePicker()" name="birthday"/><br />
		<input type="submit"  value="ok" />
	</form>

</body>
</html>