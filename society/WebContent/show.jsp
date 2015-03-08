<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>历年资料</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/Chart.js"></script>
<script src="js/bootstrap.min.js"></script>
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
					<li><a href="http://www.zhdpb.gov.cn/">官网连接</a></li>
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
					<li class="active"><a href="list.jsp">历年资料 <span
							class="sr-only">(current)</span></a></li>
					<li><a href="#">资料查询</a></li>
					<li><a href="#">资料下载</a></li>
					<li><a href="#">联系方式</a></li>
			</div>


			<div class="col-md-10 ">
				<h1 class="page-header">资料展示</h1>

				<div class="row placeholders"></div>

				<div class="row placeholders">

					<div class="container-fluid">
						<div class="row-fluid">
							<div class="span12">
								<table class="table">
									<thead>
										<tr class="info">
											<th>指标名称</th>
											<th>代码</th>
											<th>单位</th>
											<th>权重</th>
											<th>目标值</th>
											<th>2013年实现</th>
											<th>2014年</th>
											<th>2015年</th>
											<th>2016年</th>
											<th>2017年</th>
											<th>年均增长百分比（百分点千分点）</th>
											<th>备注</th>
											<th>程度</th>
										</tr>
									</thead>
									<tbody>
										<tr class="warning">
											<td>一，经济发展</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>1.人均GDP</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>2.第三产业增加值占GDP比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>3.居民消费支出占GDP比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>4.R&D经费支出占GDP比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>5.每万人口发明专利拥有量</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>6.工业劳动生产率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>7.互联网普及率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>8.城镇人口比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>9.农业劳动生产率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>二，民主法制</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>10.基层民主参选率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>11.廉政指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>12.社会安全指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>13.每万人拥有律师数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>三，文化建设</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>14.文化产业增加值占GDP比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>15.人均公共文化财政支出</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>16.有限广播电视入户率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>17.每万人口拥有“三观一站”公共文化设施建筑面积</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>18.城乡居民文化娱乐服务支出占家庭消费支出比重</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>四，人民生活</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>19.城乡居民人均收入指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>20.地区人均基本公共服务支出差异系数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>21.失业率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>22.恩格尔系数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>23.基尼系数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>24.城乡居民收入比</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>25.城乡居民家庭人均住房面积达标率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>26.公共交通服务指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>27.平均预期寿命</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>28.平均受教育年限</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>29.每千人口拥有执业医师数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>30.基本社会保险覆盖率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>31.农村自来水普及率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>32.农村卫生厕所普及率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>五，资源环境</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>33.单位GDP能耗</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>34.单位GDP水耗</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>35.单位GDP建设用地占用</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>36.单位GDP二氧化碳排放量</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>37.环境质量指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="error">
											<td>38.主要污染物排放强度指数</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="warning">
											<td>39.城市生活垃圾无害化处理率</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
										<tr class="info">
											<td>全面建设小康社会程度</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
											<td>Default</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>

				</div>
			</div>
</body>
</html>