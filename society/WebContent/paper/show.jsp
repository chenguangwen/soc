<%@page import="com.bnuz.yxx.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="java.util.List, com.bnuz.yxx.domain.Paper"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Paper</title>
</head>
<body>
	<h1>Show Paper</h1>
	
	
	<%=request.getSession().toString() %>
	
	
	<%-- welcome <%=request.getSession().getAttribute("username") %>
	role <%=request.getSession().getAttribute("role") %>
	id <%=request.getSession().getAttribute("uid") %> --%>
	<%if(request.getSession().getAttribute("role").equals("super")){ %>
	<a href="UserController?method=showUser"><input type="button"
		value="show user information" /></a>
		<a href="user/add.jsp"><input type="button" value="add user" /></a>
	<%} %>
	<%-- <jsp:forward page="paper/add.jsp"></jsp:forward> --%>
	<a href="paper/add.jsp"><input type="button" value="add paper" /></a>
	
	<a href="index.jsp"><input type="button" value="logout"
		onclick=<%request.getSession().invalidate();%> /></a>
	<table align="center" width="450" border="1"
		style="background-color: #a0c6e5">
		<tr>
			<td align="center" colspan="3">
				<h2>Paper Information</h2>
			</td>
		</tr>
		<tr align="center">
			<td><b>user</b></td>
			<td><b>title</b></td>
			<td><b>date</b></td>
		</tr>
		<%
			UserService us = new UserService();
			//获得PaperController/showPaper方法传递的paperList
			List<Paper> list = (List<Paper>) request.getAttribute("paperList");
			//遍历list，若为空输出"We can't find the user"
			if (!list.isEmpty()) {
				for (Paper p : list) {
		%>
		<tr align="center">
			<%-- <td><%=us.queryName(p.getUserId()) %></td> --%>
			<td><%=p.getUserId() %></td>
			<td><%=p.getTitle() %></td>
			<td><%=p.getDate() %></td>
		</tr>
		<%
				}
			} else {
		%>
		<tr>
			<td align="center" colspan="3">We can't find paper!!</td>
		</tr>
		<%
			}
		%>
		<tr>
			<td align="center" colspan="3"><%=request.getAttribute("bar")%>
			</td>
		</tr>
	</table>

</body>
</html>