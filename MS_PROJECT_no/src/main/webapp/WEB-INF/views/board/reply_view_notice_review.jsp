<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form action="reply_notice_review" method="post">
         <input type="hidden" name="nid" value="${reply_view_notice_review.nid}">
         <input type="hidden" name="ngroup" value="${reply_view_notice_review.ngroup}">
         <input type="hidden" name="nstep" value="${reply_view_notice_review.nstep}">
         <input type="hidden" name="nindent" value="${reply_view_notice_review.nindent}">
         <tr>
            <td> 번호 </td>
            <td> ${reply_view_notice_review.nid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${reply_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" name="nname" value="${reply_view_notice_review.nname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" name="ntitle" value="${reply_view_notice_review.ntitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10"  name="ncontent">${reply_view_notice_review.ncontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"><input type="submit" value="답변"> <a href="review" >목록</a></td>
         </tr>
      </form>
   </table>
   
</body>
</html>