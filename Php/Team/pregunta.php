<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
 
<?php include("config/conexion.php");
$Question = $_POST["n"];
$user = $_POST["user"];
         $Query = "SELECT * FROM PREGUNTAS WHERE ID = $Question;";
         $Questions = mysqli_query($con, $Query);
         while ($Row =mysqli_fetch_assoc($Questions)) {
         ?>
<div>
    <form id="form" method="POST">
    <input type="hidden" name="user" value="<?php echo $user;?>">
        <input type="hidden" name="number" value="<?php echo $Question;?>">
<nav style="width:100%;background-color:#5c4f9f" class="navbar navbar-expand-lg navbar-light">
   <h3 style="color:white">Pregunta <?php echo $Row["ID"];?></h3><h1 style="color:#5c4f9f">owo Janna</h1>
</nav>
<div style="width:90%;margin-left:5%">
<h5> <?php echo $Row["Ejercicio"];?></h5>
</div>
<div> 
    <div style="width:50%;margin-left:5%">
<div style="margin-top:6%">
<div><input type="radio" checked value="1" name="respuesta">-  Respuesta A:</input></div>
<div style="90%"><h6><?php echo $Row["RespuestaA"];?></h6></div>
</div>
<hr>
<div style="margin-top:6%">
<div><input type="radio" value="2" name="respuesta">-  Respuesta B:</input></div>
<div style="90%"><h6><?php echo $Row["RespuestaB"];?></h6></div>
</div>
<hr>
<div style="margin-top:6%">
<div><input type="radio" value="3" name="respuesta">-  Respuesta C:</input></div>
<div style="90%"><h6><?php echo $Row["RespuestaC"];?></h6></div>
</div>
<hr>
<div style="margin-top:6%">
<div><input type="radio" value="4" name="respuesta">-  Respuesta D:</input></div>
<div style="90%"><h6><?php echo $Row["RespuestaD"];?></h6></div>
</div>
</form>
<hr>
</div>
       
<div style="float:right"><button type="button" onClick="submit2(<?php echo $Question?>,<?php echo $user;?>)" class="btn btn-success rounded">Submit</button></div>

<?php echo "<button type='button' onClick='Terminar(".$Question.",".$user.")' class='btn btn-primary btn-rounded-circle'>Terminar Test</button>";?>
</div>
</div>
         <?php }?>