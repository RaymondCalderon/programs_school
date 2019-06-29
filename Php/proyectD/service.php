<?php
//require_once('lib/nusoap.php');
require_once('../proyectD/nusoap-master/src/nusoap.php');

function suma($datos){
    
    $number = 'Ingresa los valores'.$datos['numeros'];
    //$length = count($datos);
    $result=0;
    foreach ($datos as $valor) {
        $result=$result+$valor;
        echo $result;
        
    }
    $msg = 'Hola, el resultado es: '.$result;
    return array ('mensaje' =>$msg);
        
    }

//function resta($datos){
    
        //$number = 'Ingresa los valores'.$datos['numeros'];
        //$length = count($datos);
        //$result=0;
        //foreach ($datos as $valor) {
          //  $result=$result-$valor;
           // echo $result;
        //}
        //$msg = 'Hola, el resultado es: '.$result;  
    //}



$server = new soap_server();
$ns = "http://localhost/proyectD/service.php";
$server->configurewsdl('OperacionesServices',$ns);
$server->wsdl->schematargetnamespace=$ns;

//Ingresar los parametros
$server->wsdl->addComplexType(
    'datos_ingreso_numeros',
    'complexType',
    'struct',
    'all',
    array(
        'numeros' => array('name' => 'numeros','type' => 'xsd:int')
    )
    );
//salida
    $server->wsdl->addComplexType(  
        'datos_numeros_salidad', 
        'complexType', 
        'struct', 
        'all', 
        '',
        array('mensaje'   => array('name' => 'mensaje','type' => 'xsd:string'))
    );
$server->register(  
    'suma', // nombre del metodo o funcion
    array('datos_ingreso_numeros' => 'tns:datos_ingreso_entrada'), // parametros de entrada
    array('return' => 'tns:datos_numeros_salidad'), // parametros de salida
    $ns, // namespace
    $ns.'#suma', // soapaction debe ir asociado al nombre del metodo
    'rpc', // style
    'encoded', // use
    'La siguiente funcion recibe los numeros' // documentation
);
    
    


if (isset($HTTP_RAW_POST_DATA)){
	$input = $HTTP_RAW_POST_DATA;
}
else{$input = implode("\r\n", file('php://input'));}
$server->service($input);

?>