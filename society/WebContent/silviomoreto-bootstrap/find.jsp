<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>珠海市发展和统计局</title>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- <link rel="icon" href="http://v3.bootcss.com/favicon.ico">-->

<title>珠海市发展和改革局</title>
<script src="../js/jquery-1.11.2.min.js"></script>
<script src="../js/Chart.js"></script>
<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/bootstrap.min1.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="../css/dashboard.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="./Dashboard Template for Bootstrap_files/ie-emulation-modes-warning.js"></script>

<script type="text/javascript" src="http://www.daimajiayuan.com/download/jquery/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap-select.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap-select.css">

 

    <script type="text/javascript">
        $(window).on('load', function () {

            $('.selectpicker').selectpicker({
                'selectedText': 'cat'
            });

            // $('.selectpicker').selectpicker('hide');
        });
    </script>
</head>
<body>
	<%@include file="../top.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<%@include file="../left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<h1 class="page-header">资料名称</h1>
 
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label for="bs3Select" class="col-lg-2 control-label">Test bootstrap 3 form</label>
                <div class="col-lg-10">
                    <select id="bs3Select" class="selectpicker show-tick form-control" multiple data-live-search="true">
                        <option>cow</option>
                        <option>拉拉</option>
                        <option class="get-class" disabled>ox</option>
                        <optgroup label="test" data-subtext="another test" data-icon="icon-ok">
                            <option>ASD</option>
                            <option selected>Bla</option>
                            <option>Ble</option>
                        </optgroup>
                    </select>
                </div>
              </div>
        <form>
   

			</div>
			</div>
			</div>
  
</body>
</html>