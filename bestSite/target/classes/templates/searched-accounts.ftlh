<!DOCTYPE html>
<html lang="en">
<head>
    <title>Главная страница</title>
</head>
<body>
<h1>Найденные аккаунты:</h1>
<hr>
<#list accounts as account>
    <div>
        <p>${account.name} ${account.lastname} <a href="account/#{account.ID}">Подробнее...</a></p>
    </div>
    <hr>
</#list>
</body>
</html>