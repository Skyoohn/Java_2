<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
   <title>write_view</title>   
</head>
<body>
     <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="write_review_only" method="post">
         <tr>
            <td> 이름 </td>
            <td> <input id="input_rname" type="text" name="rname" size = "50"> </td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_rtitle" type="text" name="rtitle" size = "50"> </td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_rcontent" name="rcontent" rows="10" ></textarea> </td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="review">목록보기</a></td>
         </tr>
      </form>
        </table>
</body>
</html>