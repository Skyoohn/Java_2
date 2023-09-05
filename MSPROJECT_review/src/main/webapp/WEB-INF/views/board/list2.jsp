<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- C태그 쓰기 위해 넣은 taglib므로 반드시 확인 --> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 공지 -->
   <table width="500" border="1">
      <tr>
         <td>공지번호</td>
         <td>이름</td>
         <td>제목</td>
         <td>날짜</td>
      </tr>
        <!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
        <!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
      <c:forEach var="board2" items="${boardList2}">
         <tr>
            <td>${board2.nid}</td>
            <td>${board2.nname}</td>
            <td>
               <c:forEach begin="1" end="${board2.nindent}">[Re]</c:forEach>
               <a href="content_view2?nid=${board2.nid}">${board2.ntitle}</a>
                    <!--bindent : 가로 (댓글이 보이는 순서 때문에 들어간 것)-->
            </td>
            <td>${board2.ndate}</td>
         
         </tr>
      </c:forEach>
           
      <tr>
         <td colspan="5"> <a href="write_view2">글 작성</a></td>
      </tr>
   </table>
   
   
   
   
   <table width="500" border="1">
      <tr>
         <td>번호</td>
         <td>이름</td>
         <td>제목</td>
         <td>날짜</td>
<!--          <td>히트</td> -->
      </tr>
   
        <!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
        <!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
      <c:forEach var="board" items="${boardList}">
         <tr>
            <td>${board.rid}</td>
            <td>${board.rname}</td>
            <td>
               <c:forEach begin="1" end="${board.rindent}">[Re]</c:forEach>
               <a href="content_view?rid=${board.rid}">${board.rtitle}</a>
                    <!--bindent : 가로 (댓글이 보이는 순서 때문에 들어간 것)-->
            </td>
            <td>${board.rdate}</td>
<%--             <td>${board.bhit}</td>   --%>          
         </tr>
      </c:forEach>
      
      <tr>
         <td colspan="5"> <a href="write_view">글 작성</a></td>
      </tr>
   </table>
   
­   <c:if test="${pageMaker.prev}">
      <a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>
   </c:if>
   
   <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
      <a href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
   </c:forEach>
   
   <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
            <a href="list2${pageMaker.makeQuery(pageMaker.endPage +1) }"> » </a>
   </c:if> 
   <br>
   
</body>
</html>