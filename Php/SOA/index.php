<?php

if($_SERVER['REQUEST_METHOD']=="POST")
{
	// $user=$_POST['user'];
	// $pass=$_POST['pass'];
	// echo("usuario: ".$user);
	// echo(" pass: ".$pass);

	$datos=array();
	$user=$_POST['user'];
	$pass=$_POST['pass'];
	$datos=['usuario'=>$user,'password'=>$pass];
	echo(json_encode($datos));

}else{
	header("HTTP/1.1 400 (Bad Request)");
	echo (json_encode($datos));
}
// echo($_SERVER['REQUEST_METHOD']);

// $nombre=$_GET["nombre"];
// echo("<br>");
// echo($nombre);
// $edad=$_GET["edad"];
// echo("<br>");
// echo($edad);

?>