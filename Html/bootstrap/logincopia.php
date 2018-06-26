<!doctype html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shirink-to-fit=no">
        <title>Hola mundo!</title>
        <link rel="Stylesheet" href="css/bootstrap.css">
        <style>
        body{
            padding-top: 3.5rem;
        }
        .form-group{
            margin-bottom: 0;
            display: inline-block;
            vertical-align: top;
        }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">Mi proyecto</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#menu">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="menu">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                            <a class="nav-link" href="#">Link 1</a>
                    </li> 
                    <li class="nav-item disbaled">
                            <a class="nav-link" href="#">Link 2</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="http://google.com" class="nav-link dropdown-toggle" data-toggle="dropdown">Lista</a>
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Liga 1</a>
                            <a href="#" class="dropdown-item">Liga 2</a>
                            <a href="#" class="dropdown-item">Liga 3</a>
                        </div>
                    </li>
                </ul>
                <form class="navbar-form navbar-right" role="form" action="login.php" method="post">
                    <div class="form-group">
                        <input type="text" name="correo" placeholder="Correo" class="form-control" id="correo">
                    </div>
                    <div class="form-group">
                            <input type="password" name="pass" placeholder="Contraseña" class="form-control" id="pass">
                    </div>
                    <button type="submit" name="ingresar" id="ingresar" class="btn btn-success">Entrar</button>
                </form>
            </div>

        </nav>
        
        <main role="main">
            <div class="jumbotron">
                <div class="container">
                    <h1 class="display-3">hola mundo</h1>
                    <p>Este template es para marketing simple o para un sitio web de informacion. Incluye una seccion
                        grande llamada jumbotron y tres piezas de contenido, usalo como punto de partida para crear
                        despues algo unico.
                    </p>
                    <p><a class="btn btn-primary btn-lg" href="registro.php">Registrarse</a></p>
                </div>   
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <h2>Encabezado</h2>
                        <p>Revision técnica: Se enfoca en la exactitud tecnica del objeto de configuracion que 
                           se modificó
                        </p>
                        <p><a href="#" class="btn btn-secondary">Ver detalles</a></p>
                    </div>
                    <div class="col-md-4">
                            <h2>Encabezado</h2>
                            <p>Revision técnica: Se enfoca en la exactitud tecnica del objeto de configuracion que 
                               se modificó
                            </p>
                            <p><a href="#" class="btn btn-secondary">Ver detalles</a></p>
                        </div>
                        <div class="col-md-4">
                                <h2>Encabezado</h2>
                                <p>Revision técnica: Se enfoca en la exactitud tecnica del objeto de configuracion que 
                                   se modificó
                                </p>
                                <p><a href="#" class="btn btn-secondary">Ver detalles</a></p>
                            </div>
                </div>
            </div>
        </main>
        <footer class="container">
            <p>
                &copy; Mi compañia
            </p>
        </footer>
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

        <script>
            $(document).ready(function(){
                $("#ingresar").on("click",function(evento){
                    evento.preventDefault();
                    
                    var caja_correo = $("#correo").val();
                    var caja_pass = $("#pass").val();

                    $.ajax({
                        type:"POST",
                        url:"logincopiaprocesar.php",
                        data:{
                            correo: caja_correo,
                            pass: caja_pass

                        }
                    }).done(function(datos){
                        alert(datos);
                    }).fail(function(error){
                        console.log(error);
                    });
                });
            });
        </script>
    </body>
</html>
