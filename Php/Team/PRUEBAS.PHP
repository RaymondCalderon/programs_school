<?php include("config/conexion.php");
         $Query = "SELECT * FROM PREGUNTAS;"; 
         $Questions = mysqli_query($con, $Query);
         while ($Row =mysqli_fetch_assoc($Questions)) {
             print_r($Row);
            $Question = $Row["ID"]; 
            $QueryUsuario = "SELECT ID
            FROM RESPUESTAS
            WHERE ID_USUARIO = '1' 
            AND ID_PREGUNTA = $Question;";
            if ($result = $con->query($QueryUsuario)) {
               if ($result>0){
                  echo "<button type='button' class='btn btn-danger rounded-circle'>$Question</button>";
               }
            }
         }

         ?>