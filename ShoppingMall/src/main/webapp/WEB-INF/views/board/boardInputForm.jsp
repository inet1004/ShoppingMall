<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 입력 폼</title>
</head>
<body>
	<div align="center">
		<div><h1>게시글 작성</h1></div>
		<div>
			<form id="frm" name="frm" action="boardWrite.do" method="post">
				<table board="1">
				<tr>
					<th>작성자</th>
					<td><input type="text" id="writer" name="writer"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" id="title" name="title"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea ROWS="7" COLS="50" id="contents" name="contents"></textarea></td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td><input type="date" id="wDate" name="wDate"></td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td><input type="file" id="fileName" name="fileName"></td>
				</tr>
				</table>
				<div>
					<button type="submit">저장하기</button>
					<input type="reset" value="취소하기"> 
					<button type="button" onclick="location.href='boardList.do'">목록가기</button>
				</div>
			</form>
		</div>

</body>
</html>