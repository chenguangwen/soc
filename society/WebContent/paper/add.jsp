<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
	HttpSession session22 = session;
	String aaa  = "";
	String bbb  = "";
	if(session22 == null)
	{
		java.util.Enumeration<String> enum11 =  session22.getAttributeNames();
	}
	else
	{
		String myname = (String)session.getAttribute("myname");
		System.out.println("########################"+myname);
		aaa  = (String)session22.getAttribute("uid");
		//bbb  = session22.getAttribute("uuuuuu").toString();
	}
%>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Paper</title>
</head>
<body>
<%=session22.getAttribute("uid") %>++++++++++++<%=aaa%>+++++++++++++
	<%=bbb%>
	<%=session.toString() %>
	
	
	
	<form id="info" action="PaperController?method=addPaper"
		method="post" enctype="multipart/form-data">
		<p>
			Title:<input type="text" name="title" />
		</p>
		<p>
			Image:<input type="file" name="image" multiple="multiple" />
		</p>
		<input type="submit" value="ok" />
	</form>

</body>
</html>