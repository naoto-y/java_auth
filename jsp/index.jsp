<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Auth</title>
</head>
<body>
    <h1>ログインフォーム</h1>
    <form action="./" method="post">
    	<p>ユーザー名:<input type="text" name="name"></p>
    	<p>パスワード:<input type="password" name="pass"></p>
    	<button type="submit">送信</button>
    </form>
    <p><a href="./register">登録ページ</a></p>
</body>
</html>
