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
      <form action="reply_review" method="post">
         <input type="hidden" name="rid" value="${reply_view_review.rid}">
         <input type="hidden" name="rgroup" value="${reply_view_review.rgroup}">
         <input type="hidden" name="rstep" value="${reply_view_review.rstep}">
         <input type="hidden" name="rindent" value="${reply_view_review.rindent}">
         <tr>
            <td> 번호 </td>
            <td> ${reply_view_review.rid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${reply_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" name="rname" value="${reply_view_review.rname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" name="rtitle" value="${reply_view_review.rtitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10"  name="rcontent">${reply_view_review.rcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"><input type="submit" value="답변"> <a href="list" >목록</a></td>
         </tr>
      </form>
   </table>
   
</body>
</html>