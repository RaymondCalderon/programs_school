<?php
require_once('lib/nusoap.php');

function calculo_edad($datos) {
    $edad_actual = date('Y') - $datos['anio_nac'];
    $msg = 'Hola, ' . $datos['nombre'] . '. Hemos procesado la siguiente informacion ';
    $msg=$msg.$datos['email'];
    $msg=$msg.', telefono'. $datos['telefono'].' y su Edad actual es: ';
    $msg=$msg.$edad_actual . '.'; 
    return array('mensaje' => $msg);
}

$server = new soap_server();
$ns="http://localhost/wsdl/server2.php";
$server->configurewsdl('EdadServices',$ns);
$server->wsdl->schematargetnamespace=$ns;


// Parametros de entrada
$server->wsdl->addComplexType(  
    'datos_persona_entrada', 
    'complexType', 
    'struct', 
    'all', 
    '',
    array(
        'nombre'   => array('name' => 'nombre','type' => 'xsd:string'),
        'email'    => array('name' => 'email','type' => 'xsd:string'),
        'telefono' => array('name' => 'telefono','type' => 'xsd:string'),
        'anio_nac'  => array('name' => 'anio_nac','type' => 'xsd:int')
    )
);
// Parametros de Salida
$server->wsdl->addComplexType(  
    'datos_persona_salidad', 
    'complexType', 
    'struct', 
    'all', 
    '',
    array('mensaje'   => array('name' => 'mensaje','type' => 'xsd:string'))
);

$server->register(  
    'calculo_edad', // nombre del metodo o funcion
    array('datos_persona_entrada' => 'tns:datos_persona_entrada'), // parametros de entrada
    array('return' => 'tns:datos_persona_salidad'), // parametros de salida
    $ns, // namespace
    $ns.'#calculo_edad', // soapaction debe ir asociado al nombre del metodo
    'rpc', // style
    'encoded', // use
    'La siguiente funcion recibe los parametros de la persona y calcula la Edad' // documentation
);

if (isset($HTTP_RAW_POST_DATA)){
	$input = $HTTP_RAW_POST_DATA;
}
else{$input = implode("\r\n", file('php://input'));}
$server->service($input);
exit;
?>