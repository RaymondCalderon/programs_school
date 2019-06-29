<?php 
include("../../config/conexion.php");
$user = $_POST["username"];
$email = $_POST["email"];
$password = $_POST["password"];

$Query = "INSERT INTO 
         USUARIOS(Usuario,Correo, Password, Nivel)
         VALUES('$user', '$email', '$password', 1);";
         if (mysqli_query($con, $Query)) {
               echo "New record created successfully";
            } else {
               echo "Error: " . $Query . "" . mysqli_error($con);
            }
?>