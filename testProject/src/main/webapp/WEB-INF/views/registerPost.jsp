<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name=(String)request.getAttribute("name");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Refresh" content="10;url=list">
<title>회원등록결과</title>
<script>
	window.onload=function(){
		setTimeout(function(){
			window.location.href='list;'
		},5000);
	};
</script>
</head>
<body>
<p><%=name %>님 등록성공입니다!</p>
<a href='list'>리스트바로가기</a>
</body>
</html>