<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.bnuz.yxx.service.DataService, com.bnuz.yxx.domain.Data, com.bnuz.yxx.domain.Index, java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- <link rel="icon" href="http://v3.bootcss.com/favicon.ico">-->

<title>珠海市发展和改革局</title>
<script src="js/jquery-1.11.2.min.js"></script>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.min1.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/dashboard.css" rel="stylesheet">
<link href="css/buttons.css" rel="stylesheet">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="./Dashboard Template for Bootstrap_files/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<%@include file="top.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<%@include file="left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">资料展示</h1>
				<%@include file="pictureBar.jsp"%>
				<div class="row placeholders"></div>
				<div class="row placeholders">
					<div class="container-fluid">
						<div class="row-fluid">
							<div class="span12">
								<table class="table">
									<thead>
										<tr class="danger">
											<th>指标名称</th>
											<th>单位</th>
											<th>权重</th>
											<th>实现值</th>
											<th>完成程度</th>
										</tr>
									</thead>
									<tbody>
										<%
										String[] colors = { "warning", "info", "success", "error" };
										DataService ds = new DataService();
										List<Data> dList = ds.selectTableByYearScheme(2010, 1);
										for(int i = 0; i < 44; i++ ) {
											Data data = dList.get(i);
											Index index = data.getIndex();
									%>
										<tr class="<%=colors[i % 4] %>">
											<td><%=index.getName() %></td>
											<td><%=index.getUnit() %></td>
											<td><%=index.getWeight() %></td>
											<td><%=data.getCompleteValue() %></td>
											<td><%=data.getDegreeOfCompletion() %></td>
										</tr>
									<%} %>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
</body>
</html>