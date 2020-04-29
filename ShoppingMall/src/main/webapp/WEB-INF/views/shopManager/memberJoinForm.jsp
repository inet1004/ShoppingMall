<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h1>회원 가입</h1></div>
		<div>
			<form id="frm" name="frm" action="memberJoinOk.do" method="podt">
				<div>
					<table border="1">
						<tr>
							<th width="200">사업자등록번호</th>
							<td width="150"><input type="text" id="mRegister" name="mRegister" placeholder="501-23-11111"></td>
						</tr>
						<tr>
							<th>사업자ID</th>
							<td><input type="text" id="mAdminId" name="mAdminId" size="20"></td>
						</tr>
						<tr>
							<th>회사명</th>
							<td><input type="text" id="mName" name="mName" size="20"></td>
						</tr>
						<tr>
							<th>대표자명</th>
							<td><input type="text" id="mCeo" name="mCeo"></td>
						</tr>
						<tr>
							<th>업태</th>
							<td><input type="text" id="mBusinessType" name="mBusinessType" size="20"></td>
						</tr>
						<tr>
							<th>종목</th>
							<td><input type="text" id="mBusinessCategory" name="mBusinessCategory" size="20"></td>
						</tr>
						<tr>
							<th>회사주소</th>
							<td><input type="text" id="mAddress" name="mAddress" size="80"></td>
						</tr>
						<tr>
							<th>회사전화번호</th>
							<td><input type="text" id="mTel" name="mTel"></td>
						</tr>
						<tr>
							<th>휴대폰번호</th>
							<td><input type="text" id="mCellphone" name="mCellphone"></td>
						</tr>
						<tr>
							<th>회사이메일</th>
							<td><input type="text" id="mEmail" name="mEmail"></td>
						</tr>
						<tr>
							<th>패스워드</th>
							<td><input type="text" id="mAdminPassword" name="mAdminPassword"></td>
						</tr>
						<tr>
							<th>패스워드 확인</th>
							<td><input type="text" id="password" name="password"></td>
						</tr>
					</table>
				</div>
				<div>
					<br/>
					<input type="submit" value="가입">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="취소">
				</div>
			
			</form>
		</div>
	</div>

</body>
</html>