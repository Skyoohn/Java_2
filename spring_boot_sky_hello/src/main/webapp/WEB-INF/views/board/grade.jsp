<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${gradeVO.getTotal()}<br>
	${gradeVO.getAvg()}<br>
	${gradeVO.getGrade()}<br>
	<hr>
	${gradeVO.Total()}<br>
	${gradeVO.avg()}<br>
	${gradeVO.grade()}<br>
		<hr>
	${gradeVO.kor()}<br>
	${gradeVO.getEng()}<br>
	${gradeVO.math()}<br>
</body>
</html>