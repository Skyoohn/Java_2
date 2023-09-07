<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
   <title>write_view</title>   
</head>
<body>
     <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="write" method="post">
         <tr>
            <td> 이름 </td>
            <td> <input id="input_qname" type="text" name="qname" size = "50"> </td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_qtitle" type="text" name="qtitle" size = "50"> </td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_qcontent" name="qcontent" rows="10" ></textarea> </td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list2">목록보기</a></td>
         </tr>
      </form>
        </table>
</body>
</html>