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
      <form id="updateForm" action="modify_review_only" method="post">
         <input id="input_rid" type="hidden" name="rid" value="${content_view_review_only.rid}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view_review_only.rid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${content_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input id="input_rname" type="text" name="rname" value="${content_view_review_only.rname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_rtitle" type="text" name="rtitle" value="${content_view_review_only.rtitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_rcontent" rows="10" name="rcontent" >${content_view_review_only.rcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="수정"> 
            &nbsp;&nbsp; <a href="review">목록보기</a> 
            &nbsp;&nbsp; <a href="delete_review_only?rid=${content_view_review_only.rid}">삭제</a> 
            &nbsp;&nbsp; <a href="reply_view_review_only?rid=${content_view_review_only.rid}">답변</a></td>
         </tr>
      </form>
   </table>

</body>
</html>