<!DOCTYPE html>
<html lang="en">
<head>
    <title>Вход</title>
</head>
<body>
<h1>Регистрация</h1>
<hr>
<h4>Заполните форму входа:</h4>
<form action="/account/log" method="post">
    Имя: <input type="text" name="name"/><br><br>
    Фамилия: <input type="text" name="lastname"/><br><br>
    Номер телефона: <input type="text" name="phonenumber"/><br><br>
    Электронная почта: <input type="text" name="email"/><br><br>
    <input type="submit" value="Войти"/>
</form>
<hr>
<a href="/main">На главную</a>
</body>
</html>