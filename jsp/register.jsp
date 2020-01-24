<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録ページ</title>
</head>
<body>
    <h1>登録ページ</h1>
    <form action="./register" method ="post">
        <p>ユーザー名:<input name="name"></p>
        <p>パスワード:<input type="password" name="pass"></p>
        <p>一言コメント:<input name="flavor"></p>
        <button>登録</button>
    </form>
    <p><a href="./">ログインページ</a></p>
</body>
</html>