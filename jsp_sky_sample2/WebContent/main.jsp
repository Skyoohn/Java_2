<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>메인페이지 입니다.</h1>
<%
request.setAttribute("id", "1234");
%>
<jsp:forward page="sub.jsp">
	<jsp:param value="abcdefg" name="id"/>
	<jsp:param value="1234" name="pw"/>
</jsp:forward>
</body>
</html>