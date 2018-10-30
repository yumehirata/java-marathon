<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userInfo/input">
名前：<input type="text" name="name">
年齢：<input type="text" name="age">
住所：<input type="text" name="address">
<input type="submit" value="送信">
</form>
</body>
</html>