<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script src="js/Chart.js"></script>
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

				<h1 class="page-header">资料图形化展示</h1>
				<%@include file="pictureBar.jsp"%>
				<div class="row placeholders">

					<legend>雷达图趋势</legend>
					<canvas id="bar" height="400" width="821"></canvas>
					<script>
						var data = {
							labels : [ "Eating", "Drinking", "Sleeping",
									"Designing", "Coding", "Partying",
									"Running" ],
							datasets : [ {
								fillColor : "rgba(220,220,220,0.5)",
								strokeColor : "rgba(220,220,220,1)",
								pointColor : "rgba(220,220,220,1)",
								pointStrokeColor : "#fff",
								data : [ 65, 59, 90, 81, 56, 55, 40 ]
							}, {
								fillColor : "rgba(151,187,205,0.5)",
								strokeColor : "rgba(151,187,205,1)",
								pointColor : "rgba(151,187,205,1)",
								pointStrokeColor : "#fff",
								data : [ 28, 48, 40, 19, 96, 27, 100 ]
							} ]
						};

						var ctx = document.getElementById("bar").getContext(
								"2d");
						var myNewChart = new Chart(ctx).Radar(data);
						//new Chart(document.getElementById("bar").getContext("2d")).Bar(barChartData);
					</script>

				</div>

			</div>
</body>
</html>