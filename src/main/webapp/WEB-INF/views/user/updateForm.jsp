<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<div class="container">
	<form action="/update" method="post" align=center>
	  <div class="form-group" >
	    <input type="text" name="username" value="${sessionScope.principal.username }" class="form-control" required="required"  readonly>
	  </div>
	  <div class="form-group">
	    <input type="password" name="password" class="form-control" placeholder="현재 비밀번호 입력" required="required">
	  </div>
	  <div class="form-group">
	    <input type="password" name="cpassword" class="form-control" placeholder="변경할 비밀번호 입력" required="required">
	  </div>
	  <button type="submit" class="btn btn-primary">변경완료</button>
	</form>
	</div>
	<p>
	<div class="container">
	<form action="/delete" method="post" align=center>
	  <div class="form-group" >
	    <input type="text" name="username" value="${sessionScope.principal.username }" class="form-control" required="required"  readonly>
	  </div>
	  <div class="form-group">
	    <input type="password" name="password" class="form-control" placeholder="비밀번호 입력" required="required">
	  </div>
	  <div class="form-group">
	    <input type="email" name="email" class="form-control" placeholder="이메일 입력" required="required">
	  </div>
	  <button type="submit" class="btn btn-primary" >회원탈퇴</button>
	</form>
	</div>

<%@ include file="../layout/footer.jsp" %>