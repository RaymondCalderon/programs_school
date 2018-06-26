<?php
if(isset($_POST["enviar"])){
    $nombre = $_POST["nombre"];
    $correo = $_POST["correo"];
    $password = $_POST["password"];
    $mysqli = new mysqli("localhost","root","Raymond_21","web");
    $consulta = "INSERT INTO usuarios (nombre,correo,password) VALUES('$nombre','$correo','$password')";
    $resultado = $mysqli->query($consulta);

    echo "si entro";
    
}else{
    echo "no entro";
}

?>
