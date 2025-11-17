<!DOCTYPE html>
<html lang="en">
<head>
    <title>${account.name} ${account.lastname}</title>
</head>
<body>
    <h1>Информация о пользователе</h1>
    <hr>
    <h2>${account.name} ${account.lastname}</h2>
    <p>Электронная почта: ${account.email}</p>
    <p>Описание: ${account.description}</p>
    <p>Номер телефона: ${account.phonenumber}</p>
    <hr>
    <a href="/main">На главную</a>
</body>
</html>