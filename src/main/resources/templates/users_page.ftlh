<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
        </tr>
        <#list users as user>
            <tr>
                <th>${user.id}</th>
                <th>${user.firstname}</th>
                <th>${user.lastname}</th>
                <th>${user.email}</th>
            </tr>
        </#list>
    </table>

    <table>
        <tr>
            <th>ID</th>
            <th>Category</th>
            <th>Price</th>
            <th>Size</th>
        </tr>
        <#list products as product>
            <tr>
                <th>${product.idproduct}</th>
                <th>${product.category}</th>
                <th>${product.price}</th>
                <th>${product.size}</th>
            </tr>
        </#list>
    </table>

    <table>
        <tr>
            <th>ID</th>
            <th>Orderstate</th>
            <th>Deliverydate</th>
            <th>Price</th>
        </tr>
        <#list orders as order>
            <tr>
                <th>${order.idorder}</th>
                <th>${order.orderstate}</th>
                <th>${order.deliverydate}</th>
                <th>${order.price}</th>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>