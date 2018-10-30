<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td>名前：<c:out value="${user.name}"/></td></tr>
<tr><td>年齢：<c:out value="${user.age}"/></td></tr>
<tr><td>住所：<c:out value="${user.address}"/></td></tr>
</table>
</body>
</html>