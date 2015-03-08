<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   
<base href="<%=basePath%>" > 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<script type="text/javascript" src="/lab05/js/My97DatePicker/WdatePicker.js"></script>
	<form id="info" action="UserController?method=addUser" method="post"
		enctype="multipart/form-data">
		<p>
			Name:<input type="text" name="name" />
		</p>
		<p>
			PassWord:<input type="password" name="password" />
		</p>
		<p>
			Birthday:<input type="text" onClick="WdatePicker()" name="birthday" />
		</p>
		<p>
			role:<select name="select">
					<option value="super" >super</option>
					<option value="admin" >admin</option>
				</select>
		</p>
		<p>
			Image:<input type="file" name="image" multiple="multiple" />
		</p>
		<input type="submit" value="ok" />
	</form>
</body>
</html>