<%@page import="java.util.List"%>
<%@page import="edu.global.dao.DeptDao"%>
<%@page import="edu.global.dto.DeptDto"%>
<%@page import="edu.global.dao.DeptCpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   applicationScope : ${ applicationScope.application_name }<br />
   sessionScope : ${ sessionScope.session_name }<br />
   pageScope : ${ pageScope.page_name }<br />
   requestScope : ${ requestScope.request_name }

</body>
</html>