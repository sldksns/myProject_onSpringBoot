<!DOCTYPE html>
<html lang="en">
<head>
    <title>Регистрация</title>
</head>
<body>
    <h1>Регистрация</h1>
    <hr>
    <h4>Заполните форму регистрации:</h4>
    <form action="/account/add" method="post">
        Имя: <input type="text" name="name"/><br><br>
        Фамилия: <input type="text" name="lastname"/><br><br>
        Описание: <input type="text" name="description"/><br><br>
        Номер телефона: <input type="text" name="phonenumber"/><br><br>
        Электронная почта: <input type="text" name="email"/><br><br>
        <input type="submit" value="Создать"/>
    </form>
    <hr>
    <a href="/main">На главную</a>
</body>
</html>