<%@page import="edu.global.ex.Circle"%>
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
   <h1>student.jsp 입니다. </h1>
   <jsp:useBean id="circle" class="edu.global.ex.Circle" />
   
   
   <hr>
   
   <!-- Student student2 = new Student() -->
   <jsp:useBean id="student2" class="edu.global.ex.Student" />
   <!--    student2.setName("홍길순") -->
   <jsp:setProperty name="student2" property="name" value="홍길순"/>
   <jsp:setProperty name="student2" property="age" value="9"/>
   <jsp:setProperty name="student2" property="grade" value="5"/>
   <!-- student2.getName() -->
   이름:<jsp:getProperty name="student2" property="name" />
   나이:<jsp:getProperty name="student2" property="age" />
   학년:<jsp:getProperty name="student2" property="grade" />
   <hr>
   <%
      Circle circle = new Circle(5);
   %>
   반지름:<%=circle.showPerimeter() %><br>
</body>
</html>