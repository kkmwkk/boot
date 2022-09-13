<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>My Blog</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<a class="navbar-brand" href="/blog">DEV</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/user/login">로그인</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/user/join">회원가입</a>
				</li>
			</ul>
		</div>
	</nav>
	<br>

	<div class="container">
	
		<div class="card m-2">
			<img class="card-img-top">
			<div class="card-body">
				<h4 class="card-title">제목 적는 부분</h4>
				<p class="card-text">내용 적는 부분</p>
				<a href="#" class="btn btn-primary">상세보기</a>
			</div>
		</div>
		
	</div>

	<div class="jumbotron text-center" style="margin-bottom: 0">
		<p>&#9997; Created by DEV</p>
		<p>&#128140; 010-2278-2357</p>
		<p>&#128168; 용인 기흥구 영덕동</p>
	</div>
</body>
</html>


