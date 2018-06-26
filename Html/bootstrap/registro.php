<!doctype html>
<html>
<head>

</head>

<body>
    <form action="procesarRegistro.php" method="post">
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre">
        </div>

        <div>
            <label for="correo">Correo:</label>
            <input type="email" name="correo">
        </div>

        <div>
            <label for="password">Contraseña:</label>
            <input type="password" name="password">
        </div>

        <div>
            <input type="submit" name="enviar" value="registrarte">
        </div>
    </form>
</body>

</html>