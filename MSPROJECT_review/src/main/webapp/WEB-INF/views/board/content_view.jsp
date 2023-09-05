<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
   <title>list</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
  <table width="700" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="modify" method="post">
         <input id="input_rid" type="hidden" name="rid" value="${content_view.rid}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view.rid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${content_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input id="input_rname" type="text" name="rname" value="${content_view.rname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_rtitle" type="text" name="rtitle" value="${content_view.rtitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_rcontent" rows="10" name="rcontent" >${content_view.rcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="수정"> 
            &nbsp;&nbsp; <a href="list2">목록보기</a> 
            &nbsp;&nbsp; <a href="delete?rid=${content_view.rid}">삭제</a> 
            &nbsp;&nbsp; <a href="reply_view?rid=${content_view.rid}">답변</a></td>
         </tr>
      </form>
   </table>

</body>
</html>