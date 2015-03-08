<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>图形</title>
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/Chart.js"></script>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<script src="js/bootstrap.min.js"></script>
<!-- <script src="js/npm.js"></script>-->

<link href="css/dashboard.css" rel="stylesheet">
<link href="css/bootstrap.min1.css" rel="stylesheet">

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">珠海市发展和改革局</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">官网连接</a></li>
					<li><a href="#">帮助</a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">历年资料 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">资料查询</a></li>
					<li><a href="#">资料下载</a></li>
					<li><a href="#">联系方式</a></li>
			</div>


			<div class="col-md-10 ">
				<h1 class="page-header">资料图形化展示</h1>

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