<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 세부 목록 보기</title>
</head>
<body>
	<div align="center">
		<div><h1>게시글 상세 내역</h1></div>
		<div>
			<table>
				<tr>
					<th width="100">순번</td>
					<td>${vo.boardId }</td><!-- 모델객체에 실은것. 객체변수 -->
				</tr>
				<tr>
					<th>작성자</th>
					<td>${vo.writer }</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${vo.title }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea ROWS="7" COLS="50">${vo.contents }</textarea></td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td>${vo.wDate }</td>
				</tr>
				<tr>
					<th>히트수</th>
					<td>${vo.hit }</td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td>${vo.fileName }</td>
				</tr>
			</table>
		</div>
		<div>
			<br/>
			<button type="button"  onclick="location.href='boardList.do'">목록 가기</button>
		
		</div>		
	</div>
</body>
</html>