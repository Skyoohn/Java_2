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
<%
	DeptCpDao dao = new DeptCpDao();

	dao.deleteDept(55);
	dao.deleteDept(66);

	List<DeptDto> dtos = dao.getDepts();
	
	//DeptDto dept = new DeptDto(55,"JAVA","Seoul");
	//dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());
	
	//dept = new DeptDto(66,"JAVA","대구");
	//dao.insertDept(dept.getDeptno(), dept.getDname(), dept.getLoc());
	
	for(DeptDto dto : dtos){
		out.print("부서번호: " + dto.getDeptno()+
			"직종 이름: " + dto.getDname()+
			"지역: " + dto.getLoc()+"<br>");
	}
%>
</body>
</html>