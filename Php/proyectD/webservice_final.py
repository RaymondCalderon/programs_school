import suds

def wsarchivo():
    url = "http://localhost/apps/proyectD/service.php?wsdl"
    client = suds.client.Client(url)           
    print(client)
    datos = dict()
    # declarar variable para ingresa numeros
    # guardar valor en el arreglo
    print("Ingresa el valor")
    datos['numeros']

    res=client.service.suma(datos)
    
    print(res)
wsarchivo()