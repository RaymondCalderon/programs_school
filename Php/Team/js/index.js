function consulta(n, user){
        $.ajax({
        data: {n:n, user:user}, //datos que se envian a traves de ajax
        url: 'pregunta.php', //archivo que recibe la peticion
        type: 'POST', //método de envio
        beforeSend: function () {
                $("#Resultado").html("<h1 style='margin-left:45%;width:50%'>Cargando...</h1><img src='res/loading.gif' style='margin-top:2%; margin-left:25%'></img>");
        },
        success: function (response) { //una vez que el archivo recibe el request lo procesa y lo devuelve
                if (response.includes("Error1")) {
                        $("#Resultado").html(Error1);
                } else if (response.includes("Error2")) {
                        $("#Resultado").html(Error2);
                }
                 else {
                         if (n>28){
                        consulta(1, user);
                         }else {
                        $("#Resultado").html(response);
                         }
                }
        }
});
}

function submit2(n, user){
   
        n++;
        $.ajax({
                data: $("#form").serialize(), //datos que se envian a traves de ajax
                url: 'submit.php', //archivo que recibe la peticion
                type: 'post', //método de envio
                beforeSend: function () {
                        $("#Resultado").html("<h1 style='margin-left:45%;width:50%'>Cargando...</h1><img src='res/loading.gif' style='margin-top:2%; margin-left:25%'></img>");
                },
                success: function (response) { //una vez que el archivo recibe el request lo procesa y lo devuelve
                        if (response.includes("Error1")) {
                                $("#Resultado").html(Error1);
                        } else if (response.includes("Error2")) {
                                $("#Resultado").html(Error2);
                        } else {
                                consulta(n, user);
                                preguntas(n, user);
                        }
                }
        });
}
function preguntas(n, user){
        $.ajax({
        data: {n:n, user:user}, //datos que se envian a traves de ajax
        url: 'preguntas.php', //archivo que recibe la peticion
        type: 'POST', //método de envio
        beforeSend: function () {
                $("#preguntas").html("<h1 style='margin-left:45%;width:50%'>Cargando...</h1><img src='res/loading.gif' style='margin-top:2%; margin-left:25%'></img>");
        },
        success: function (response) { //una vez que el archivo recibe el request lo procesa y lo devuelve
                if (response.includes("Error1")) {
                        $("#preguntas").html(Error1);
                } else if (response.includes("Error2")) {
                        $("#preguntas").html(Error2);
                } else {
                        $("#preguntas").html(response);
                }
        }
});
}

function Terminar(n, user){
        $.ajax({
        data: {n:n, user:user}, //datos que se envian a traves de ajax
        url: 'terminar.php', //archivo que recibe la peticion
        type: 'POST', //método de envio
        beforeSend: function () {
                $("#Resultado").html("<h1 style='margin-left:45%;width:50%'>Cargando...</h1><img src='res/loading.gif' style='margin-top:2%; margin-left:25%'></img>");
        },
        success: function (response) { //una vez que el archivo recibe el request lo procesa y lo devuelve
              if (response == 0) {
                alert("Te faltan preguntas por contestar bb");
                consulta(n, user);
                preguntas(n, user);
           }else {
                $("#Resultado").html(response);
           }
        }
});
}