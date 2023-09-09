<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
   <title>write_view2</title>   
</head>
<body>
     <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="write_notice_qna" method="post">
         <tr>
            <td> 이름 </td>
            <td> <input id="input_nname" type="text" name="nname" size = "50"> </td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_ntitle" type="text" name="ntitle" size = "50"> </td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_ncontent" name="ncontent" rows="10" ></textarea> </td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="qna">목록보기</a></td>
         </tr>
      </form>
        </table>
</body>
</html>