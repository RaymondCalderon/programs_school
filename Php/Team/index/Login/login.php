<?php 
include("../../config/conexion.php");
$user = $_POST["username"];
$password = $_POST["password"];
session_start();
$QueryUsuario = "SELECT ID
FROM USUARIOS
WHERE Correo = '$user'
AND Password = '$password';";
if ($result = $con->query($QueryUsuario)) {
   if ($result->num_rows>0){
    $row = $result->fetch_assoc();
            $score = $row["ID"]; 
    $_SESSION["ID"] = $score;
    echo "1";
}else {
    $QueryUsuario = "SELECT ID
FROM USUARIOS
WHERE Usuario = '$user'
AND Password = '$password';";
if ($result = $con->query($QueryUsuario)) {
   if ($result->num_rows>0){
    $row = $result->fetch_assoc();
    $score = $row["ID"]; 
$_SESSION["ID"] = $score;
echo "1";
}else {
    echo "0";
}}
}}