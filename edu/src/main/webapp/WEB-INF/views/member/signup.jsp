<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<!-- 서버에서 보내준 정보/데이터 -->
	${title} 
	
	<form action="<c:url value='/member/signup'/>" method="post">
		<div class=form-group>
			<label>아이디</label>
			<input type="text" name="me_id" class="form-control">
		</div>
		<button class="btn btn-outline-dark col-12" type="button">아이디 중복 확인</button>
		<div class=form-group>
			<label>비번</label>
			<input type="password" name="me_pw" class="form-control">
		</div>
		<div class=form-group>
			<label>비번확인</label>
			<input type="password" name="me_pw2" class="form-control">
		</div>
		<div class=form-group>
			<label>이메일</label>
			<input type="text" name="me_email" class="form-control">
		</div>
		
		<button class="btn btn-success col-12">회원가입</button>
	</form>
</body>
</html>