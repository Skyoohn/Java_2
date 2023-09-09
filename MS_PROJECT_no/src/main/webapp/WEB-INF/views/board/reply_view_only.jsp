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
      <form action="reply_only" method="post">
         <input type="hidden" name="qid" value="${reply_view_only.qid}">
         <input type="hidden" name="qgroup" value="${reply_view_only.qgroup}">
         <input type="hidden" name="qstep" value="${reply_view_only.qstep}">
         <input type="hidden" name="qindent" value="${reply_view_only.qindent}">
         <tr>
            <td> 번호 </td>
            <td> ${reply_view_only.qid} </td>
         </tr>
<%--          <tr>
            <td> 히트 </td>
            <td> ${reply_view.bhit} </td>
         </tr> --%>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" name="qname" value="${reply_view_only.qname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" name="qtitle" value="${reply_view_only.qtitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10"  name="qcontent">${reply_view_only.qcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"><input type="submit" value="답변"> <a href="qna" >목록</a></td>
         </tr>
      </form>
   </table>
   
</body>
</html>