<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list }">
		${vo.mRegister } <br/>
		${vo.mAdminId} <br/>
		${vo.mName } <br/>
		${vo.mCeo } <br/>
		${vo.mBusinessType } <br/>
		${vo.mBusinessCategory } <br/>
		${vo.mAddress } <br/>
		${vo.mTel } <br/>
		${vo.mCellphone } <br/>
		${vo.mEmail } <br/>
		${vo.mAuthority } <br/>
		${vo.mEmployeeNum } <br/>
	</c:forEach>
</body>
</html>