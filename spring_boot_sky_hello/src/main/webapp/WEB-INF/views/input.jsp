<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/grade" method="GET">
		국어:<input type="text" name="kor">
		영어:<input type="text" name="eng">
		수학:<input type="text" name="math">
		<input type="submit" name="전송">
	</form>
</body>
</html>