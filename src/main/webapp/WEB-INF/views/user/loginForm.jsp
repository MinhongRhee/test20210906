<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<form action="/login" method="post">
	  <div class="form-group">
	    <input type="text" name="username" class="form-control" placeholder="Enter username">
	  </div>
	  <div class="form-group">
	    <input type="password" name="password" class="form-control" placeholder="Enter password">
	  </div>
	  <button type="submit" class="btn btn-primary">로그인</button>
	</form>
</div>
</body>
</html>