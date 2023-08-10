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

<%-- <hr>
${dept.deptno}<br>
${dept.loc}<br>
${dept.dname}<br>
//아래랑 위는 동일
<hr>
${dept.getDeptno()}<br>
${dept.getloc()}<br>
${dept.getdname()}<br>
<hr>
<jsp:getProperty name = "dept" property="dname">
<jsp:getProperty name = "dept" property="loc">
<jsp:getProperty name = "dept" property="dname">

//액션태그
<jsp:useBean id = "dept" class ="edu.global.dto.DeptDto"/>
<jsp:setProperty property="dept" name="deptno" value="88"/>
<jsp:setProperty property="dept" name="loc" value="대구"/>
<jsp:setProperty property="dept" name="dname" value="세일즈"/> --%>

<%-- <H1>${10}</H1></br>
<H1>${99.99}</H1></br>
<H1>${"abc"}</H1></br>
<H1>${true}</H1></br>

<hr>
<H1>${1+2}</H1></br>
<H1>${1-2}</H1></br>
<H1>${1/2}</H1></br>
<H1>${1<2}</H1></br>
${ (1>2) ? 1 : 2 }</br>
${ (1>2) || (1<2) }</br> --%>

<%=10 %></br>

</body>
</html>