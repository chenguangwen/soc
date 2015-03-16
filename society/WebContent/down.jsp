<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>珠海市发展和改革局</title>
<!-- <script type="text/javascript"
	src="http://www.daimajiayuan.com/download/jquery/jquery-1.10.2.min.js"></script> -->
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/Chart.js"></script>
<!-- <script
	src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script> -->
<script src="js/bootstrap.min.js"></script>
<script
	src="./Dashboard Template for Bootstrap_files/ie-emulation-modes-warning.js"></script>
<script type="text/javascript" src="js/bootstrap-select.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap-select.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/dashboard.css" rel="stylesheet">
<link href="css/buttons.css" rel="stylesheet">
<!-- 3.0 -->
<!-- <link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet"> -->
</head>

<body>

	<%@include file="top.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<%@include file="left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<h1 class="page-header">资料查询：</h1>

				<div class="container">
					<form class="form-horizontal col-md-10" role="form">
						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">查询年份：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>2010</option>
									<option>2011</option>
									<option>2012</option>
									<option>2013</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">经济发展：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>人均GDP</option>
									<option>第三产业增加值占GDP比重</option>
									<option>居民消费支出占GDP比重</option>
									<option>R&D经费支出占GDP比重</option>
									<option>每万人口发明专利拥有量</option>
									<option>工业劳动生产率</option>
									<option>互联网普及率</option>
									<option>城镇人口比重</option>
									<option>农业劳动生产率</option>

								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">民主法制：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>基层民主参选率</option>
									<option>廉政指数</option>
									<option>社会安全指数</option>
									<option>每万人拥有律师数</option>

								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">文化建设：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>文化产业增加值占GDP比重</option>
									<option>人均公共文化财政支出</option>
									<option>有线广播电视入户率</option>
									<option>每万人口拥有"三馆一站"公共文化设施建筑面积</option>
									<option>城乡居民文化娱乐服务支出占家庭消费支出比重</option>

								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">人民生活：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>城乡居民人均收入(2010不变价)</option>
									<option>地区人均基本公共服务支出差异系数</option>
									<option>失业率</option>
									<option>恩格尔系数</option>
									<option>基尼系数</option>
									<option>城乡居民收入比</option>
									<option>城乡居民家庭住房面积达标率</option>
									<option>公共交通服务指数</option>
									<option>平均预期寿命</option>
									<option>平均受教育年限</option>
									<option>每千人口拥有执业医师数</option>
									<option>基本社会保险覆盖率</option>
									<option>农村自来水普及率</option>
									<option>农村卫生厕所普及率</option>

								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="bs3Select" class="col-md-2 control-label">资源环境：</label>
							<div class="col-md-10">
								<select id="bs3Select"
									class="selectpicker show-tick form-control" multiple
									data-live-search="true">
									<option>单位GDP能耗(2010年不变价)</option>
									<option>单位GDP水耗(2010年不变价)</option>
									<option>单位GDP建设用地占用面积(2010年不变价)</option>
									<option>单位GDP二氧化碳排放量(2010年不变价)</option>
									<option>环境质量指数</option>
									<option>主要污染物排饭强度指数</option>
									<option>城市生活垃圾无害化处理率</option>

								</select>
							</div>
						</div>
						<a href="#"
							class="button button-block button-rounded button-caution button-large col-md-12">下载</a>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- <script type="text/javascript">
		$(window).on('load', function() {

			$('.selectpicker').selectpicker({
				'selectedText' : 'cat'
			});

			// $('.selectpicker').selectpicker('hide');
		});
	</script> -->
</body>
</html>
