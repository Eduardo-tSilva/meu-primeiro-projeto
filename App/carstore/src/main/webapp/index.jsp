<html>
<head>
    <title>Home</title>
</head>

<body>

<h2>Create Car</h2>

<form action="/create-car" method="post">

    <h4>Nome</h4>
    <input type="text" name="car-name" id="car-name" value="${param.name}"> </br>

    <h4>Cor</h4>
    <input type="text" name="color" id="color" value="${param.color}">

    <input type="hidden" id="id" name="id" value="${param.id}">

    <button type="Save">Register</button>

</form>

</body>
</html>