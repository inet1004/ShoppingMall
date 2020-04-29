<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function trSelect(key) {
		document.frm.bid.value=key;
		document.frm.submit();
	}
</script>

</head>
<body>
	<div id="wrapp" align="center">
		<div>
			<h1>게시글 목록</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<td width="50">글번호</td>
					<td width="100">작성자</td>
					<td width="200">제목</td>
					<td width="100">작성일자</td>
					<td width="50">조회수</td>
					<td width="150">첨부파일</td>
				</tr>
				<c:forEach var="vo" items="${board }">
				<tr  bgcolor="#ffffff" onMouseOver=this.style.backgroundColor="#cccccc" onmouseout=this.style.backgroundColor="#ffffff"
					 onclick="trSelect(${vo.boardId })">
					<td>${vo.boardId }</td>
					<td>${vo.writer }</td>
					<td>${vo.title }</td>
					<td>${vo.wDate }</td>
					<td>${vo.hit }</td>
					<td>${vo.fileName }</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		
		<div>
			<br/>
			<button type="button" onclick="location.href='boardInputForm.do'">글쓰기</button>
		</div>
		
		<div>
			<form id = "frm" name="frm" action="boardgetList.do" method="post">
				<input type="hidden" id="bid" name="bid">
			</form>
		</div>
		
	</div>
</body>
</html>