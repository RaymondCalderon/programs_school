<?php

$mysqli = new mysqli("localhost","id3790094_erick","29.Mayo1972","id3790094_web");
//$mysqli = new mysqli("localhost","root","29.Mayo1972","programacionweb");


$correo = $_POST["correo"];
$pass = $_POST["pass"];

$consulta = "SELECT correo, nombre FROM usuarios WHERE correo = '$correo' AND password = '$pass'";

$resultado = $mysqli->query($consulta);

if(mysqli_num_rows($resultado)>0){
    echo"Usuario correcto";
}else{
    echo"Usuario o contraseña incorrecta";
}
?>