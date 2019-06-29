<?php include("config/conexion.php");
        $user = $_POST["user"];
         $Query = "SELECT * FROM PREGUNTAS;"; 
         $Questions = mysqli_query($con, $Query);
         $conti =1;
         while ($Row =mysqli_fetch_assoc($Questions)) {
            $Question = $Row["ID"]; 
            $QueryUsuario = "SELECT ID
            FROM RESPUESTAS
            WHERE ID_USUARIO = $user
            AND ID_PREGUNTA = $Question;";
            if ($result = $con->query($QueryUsuario)) {
               if ($result->num_rows>0){
                  echo "<button type='button' onClick='consulta(".$Question.",".$user.")' class='btn btn-success rounded-circle'>$conti</button>";
               }else {
                echo "<button type='button' onClick='consulta(".$Question.",".$user.")' class='btn btn-danger rounded-circle'>$conti</button>";
          }
          $conti++;
            }
         }