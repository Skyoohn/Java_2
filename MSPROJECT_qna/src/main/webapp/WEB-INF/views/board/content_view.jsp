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
         <input id="input_qid" type="hidden" name="qid" value="${content_view.qid}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view.qid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${content_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input id="input_qname" type="text" name="qname" value="${content_view.qname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_qtitle" type="text" name="qtitle" value="${content_view.qtitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_qcontent" rows="10" name="qcontent" >${content_view.qcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="수정"> 
            &nbsp;&nbsp; <a href="list2">목록보기</a> 
            &nbsp;&nbsp; <a href="delete?qid=${content_view.qid}">삭제</a> 
            &nbsp;&nbsp; <a href="reply_view?qid=${content_view.qid}">답변</a></td>
         </tr>
      </form>
   </table>

</body>
</html>