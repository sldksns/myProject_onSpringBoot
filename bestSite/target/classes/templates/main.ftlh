<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Главная страница</title>
    </head>
    <body>
        <h1>Главная страница</h1>
        <form action="/search" method="post">
            Поиск: <input type="text" name="name">
            <input type="submit" value="Найти">
        </form>
        <hr>
        <h4>Список товаров:</h4>
        <#list product as product>
            <div>
                <hr>
                <p>Название: ${product.name}</p>
                <p>Цена: ${product.price}</p>
                <a href="/product/${product.ID}">Подробнее...</a>
                <hr>
            </div>
        </#list>
        <hr>
        <p>Стать крутым: <a href="/account/reg">Зарегистрироваться</a></p>
        <p>Если уже крутой: <a href="/account/login">Войти</a></p>
        <p>Добавить товар: <a href="/product/add">Добавить</a></p>
    </body>
</html>