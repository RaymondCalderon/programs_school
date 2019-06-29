<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<?php 
include("config/conexion.php");
$Usuario = $_POST["user"];
$QueryPreguntas = "SELECT * FROM PREGUNTAS";
$QueryDesarrollo = "SELECT DESARROLLADOR FROM USUARIOS WHERE ID = $Usuario";
$QueryConsultor = "SELECT CONSULTOR FROM USUARIOS WHERE ID<= $Usuario";
$QueryRespuestas = "SELECT * FROM RESPUESTAS WHERE ID_USUARIO = $Usuario;";
            if ($result = $con->query($QueryPreguntas)) {
               if ($result->num_rows>0){
                if ($result1 = $con->query($QueryRespuestas)) {
                    if ($result1->num_rows>=$result->num_rows){
                        $result = $con->query($QueryConsultor);
                        $row = $result->fetch_assoc();
                        $score = $row["CONSULTOR"]; 
                        $result = $con->query($QueryDesarrollo);
                        $row = $result->fetch_assoc();
                        $score2 = $row["DESARROLLADOR"]; 
                        echo "$Usuario";
                        ?>
                        <div>
<nav style="width:100%;background-color:#5c4f9f" class="navbar navbar-expand-lg navbar-light">
   <h3 style="color:white">Resultados</h3><h1 style="color:#5c4f9f"></h1>
</nav>

    <canvas id="radar"></canvas>
                        <?php
                    }else {
                        echo 0;
                        
                    }
}
               }
            }
 
?>

    <!-- this page js -->
  
    <script>
        $(document).ready(function(){
var valor=2;
var radar = document.getElementById("radar");

     var radar = new Chart(radar, {
            type: 'radar',
            data:{
                labels: ["Desarrollador", "Consultor", "Diseñador", "Tester", "Movil", "Analista"],
                datasets: [{
                    label: 'Perfil encontrado',
                    data: [<?php echo $score2?>,<?php echo $score?>, 3,4,2,4],
                    backgroundColor:
                    [
                        "#5c4f9f"
            
                    ]
                }]
            }
        });  
    });
    </script>