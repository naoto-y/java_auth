<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録しました</title>
</head>
<body>
    <h1>登録完了</h1>
    <p>ユーザーID:<%= request.getAttribute("userId") %></p>
    <p><a href="./">ログインページ</a></p>
</body>
</html>