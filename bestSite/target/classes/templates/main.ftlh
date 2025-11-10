<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Главная страница</title>
    </head>
    <body>
        <h1>Главная страница</h1>
        <hr>
        <h4>Список зарегистрированных пользователей:</h4>
        <#list accounts as account>
            <div>
                <p>1) ${account.name} ${account.lastname} | </p>
            </div>
        </#list>
        <hr>
        <p>Стать крутым: <a href="/reg">Зарегистрироваться</a></p>
    </body>
</html>