<?php
session_start();

if(isset($_SESSION["login"])){
    echo"<h1>Pagina de gente importante</h1>";
    echo"<h2>Bienvenid@ $_SESSION[login]</h2>";
}else{
    header("Location: http://127.0.0.1/Bootstrap/login.php");
    die();
}

?>