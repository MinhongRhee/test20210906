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
	<form action="/signup" method="post">
	  <div class="form-group">
	    <input type="text" name="username" class="form-control" placeholder="Enter username" required="required">
	  </div>
	  <div class="form-group">
	    <input type="password" name="password" class="form-control" placeholder="Enter password" required="required">
	  </div>
	  <div class="form-group">
	    <input type="email" name="email" class="form-control" placeholder="Enter email address" required="required">
	  </div>
	  <button type="submit" class="btn btn-primary">회원가입</button>
	</form>
</div>
</body>
</html>