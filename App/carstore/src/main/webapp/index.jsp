<html>
<head>
    <title>Home</title>
</head>

<body>

<h2>Create Car</h2>

<form action="/create-car" method="post">

    <div>
        <h4>Nome</h4>
        <input type="text" name="car-name" id="car-name" value="${param.name}"> </br>

        <h4>Cor</h4>
        <input type="text" name="color" id="color" value="${param.color}">

        <input type="hidden" id="id" name="id" value="${param.id}">
    </div>

    <div>
            <label for="image">Choose file</label>
            <input type="file" name="image" id="image">
    </div>

    <button type="Save">Register</button>

</form>

</body>
</html>