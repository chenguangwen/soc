<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>珠海市发展和改革局</title>
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/Chart.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/dashboard.css" rel="stylesheet">
<link href="css/buttons.css" rel="stylesheet">
<script
	src="./Dashboard Template for Bootstrap_files/ie-emulation-modes-warning.js"></script>
</head>

<body>

	<%@include file="top.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<%@include file="left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<h1 class="page-header">资料图形化展示</h1>
				<%@include file="pictureBar.jsp"%>
				<div class="row placeholders">

					<legend>柱状图趋势</legend>
					<canvas id="bar" height="400" width="821"></canvas>
					<script>
						var barChartData = {
							labels : [ "珠海", "省均", "广州", "深圳", "东莞", "佛山",
									"中山", "江门", "惠州", "肇庆" ],
							datasets : [ {
								fillColor : "rgba(151,187,205,0.5)",
								strokeColor : "rgba(151,187,205,1)",
								data : [ 28, 48, 40, 19, 96, 27, 100, 34, 76,
										65 ]
							} ]
						};

						var ctx = document.getElementById("bar").getContext(
								"2d");
						var myNewChart = new Chart(ctx).Bar(barChartData);
						//new Chart(document.getElementById("bar").getContext("2d")).Bar(barChartData);
					</script>

				</div>

			</div>
</body>
</html>