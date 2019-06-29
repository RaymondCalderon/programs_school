function consulta(){
    $.ajax({
    data: $("#formlogin").serialize(), //datos que se envian a traves de ajax
    url: 'login.php', //archivo que recibe la peticion
    type: 'POST', //método de envio
    beforeSend: function () {
            $("#Resultado").html("<h1 style='margin-left:45%;width:50%'>Cargando...</h1><img src='res/loading.gif' style='margin-top:2%; margin-left:25%'></img>");
    },
    success: function (response) { //una vez que el archivo recibe el request lo procesa y lo devuelve
        if (response == "1"){
            window.location.replace("../../index.php");
        }else if(response == "0") {
            alert("Usuario o contraseña incorrectos");
        }else {
            alert("Contraseña o usuario incorrectos");
        }
            
    }
});
}