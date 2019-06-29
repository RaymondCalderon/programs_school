#!/usr/bin/python 
import suds

def wsarchivo():
    url = "http://localhost/duarte/server2.php?wsdl"
    client = suds.client.Client(url)
    print(client)
    datos = dict()
    datos['nombre']="Hector"
    datos['email']='test@tes.com'
    datos['telefono']='911'
    datos['anio_nac']=1981
    res=client.service.calculo_edad(datos)
    print(res)

wsarchivo()




