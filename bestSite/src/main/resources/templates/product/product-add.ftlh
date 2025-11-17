<!DOCTYPE html>
<html lang="en">
<head>
    <title>Добавление товара</title>
</head>
<body>
<h1>Добавление товара</h1>
<hr>
<h4>Заполните форму добавления товара:</h4>
<form action="/product/add" method="post">
    Название: <input type="text" name="name"/><br><br>
    Цена: <input type="double" name="price"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Владелец: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить"/>
</form>
<hr>
<a href="/main">На главную</a>
</body>
</html>