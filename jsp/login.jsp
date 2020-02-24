<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ログインしました</h1>
	<p>ユーザ名：<%= request.getAttribute("name") %></p>
	<p>一言コメント：<%= request.getAttribute("flavor") %></p>
</body>
</html>