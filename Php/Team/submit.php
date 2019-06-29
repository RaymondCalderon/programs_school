<?php 
include("config/conexion.php");
$Question = $_POST["respuesta"];
$Number = $_POST["number"];
$User = $_POST["user"];
$QueryExist ="SELECT ID_PREGUNTA FROM RESPUESTAS
        WHERE ID_USUARIO = $User AND ID_PREGUNTA = $Number;";
      
 if ($result = $con->query($QueryExist)) {
     
    if ($result->num_rows<=0){
         $Query = "INSERT INTO 
         RESPUESTAS(ID_pregunta, ID_Usuario, Respuesta)
         VALUES($Number, $User, $Question);";
         if (mysqli_query($con, $Query)) {
               echo "New record created successfully";
            } else {
               echo "Error: " . $Query . "" . mysqli_error($con);
            }
        $Query ="SELECT TIPO FROM PREGUNTAS
        WHERE ID = $Number AND CORRECTA = $Question;";
      
 if ($result = $con->query($Query)) {
     
    if ($result->num_rows>0){
        $row = $result->fetch_assoc();
        $tipo = $row["TIPO"];
        if ($tipo==1){
            $Query ="SELECT DESARROLLADOR FROM USUARIOS
            WHERE ID = $User";
            $result = $con->query($Query);
            $row = $result->fetch_assoc();
            $score = $row["DESARROLLADOR"]; 
            $score+=1; 
            $Query = "UPDATE USUARIOS SET Desarrollador=$score where ID = $User";
            $result = $con->query($Query);
        }else if($tipo==2){
            $Query ="SELECT CONSULTOR FROM USUARIOS
            WHERE ID = $User";
            $result = $con->query($Query);
            $row = $result->fetch_assoc();
            $score = $row["CONSULTOR"]; 
            $score++; 
            $Query = "UPDATE USUARIOS SET CONSULTOR=$score where ID = $User";
            $result = $con->query($Query);
       }
    }else {
        echo "s";
    }
 }
}else {
    $Query = "UPDATE
    RESPUESTAS SET RESPUESTA = $Question WHERE ID_USUARIO = $User AND ID_PREGUNTA = $Number;";
    if (mysqli_query($con, $Query)) {
          echo "New record created successfully";
       } else {
          echo "Error: " . $Query . "" . mysqli_error($con);
       }
   $Query ="SELECT TIPO FROM PREGUNTAS
   WHERE ID = $Number AND CORRECTA = $Question;";
 
if ($result = $con->query($Query)) {

if ($result->num_rows>0){
   $row = $result->fetch_assoc();
   $tipo = $row["TIPO"];
   if ($tipo==1){
       $Query ="SELECT DESARROLLADOR FROM USUARIOS
       WHERE ID = $User";
       $result = $con->query($Query);
       $row = $result->fetch_assoc();
       $score = $row["DESARROLLADOR"]; 
       $score+=1; 
       $Query = "UPDATE USUARIOS SET Desarrollador=$score where ID = $User";
       $result = $con->query($Query);
   }else if($tipo==2){
       $Query ="SELECT CONSULTOR FROM USUARIOS
       WHERE ID = $User";
       $result = $con->query($Query);
       $row = $result->fetch_assoc();
       $score = $row["CONSULTOR"]; 
       $score++; 
       $Query = "UPDATE USUARIOS SET CONSULTOR=$score where ID = $User";
       $result = $con->query($Query);
  }
}else {
   echo "s";
}
}

}
 }
?>
