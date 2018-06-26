from invento import Invento


opcion = 'si'
while opcion == 'si':
    numero = int(input("Cuantos numeros Aleatorios?: "))
    bla = Invento()
    bla.numbers(numero)
    operacion = input("Operacion?:(suma,resta,multiplicacion,division)")
    bla.operations(operacion)
    bla.paste()
    opcion = input("Desea intentarlo de Nuevo?(si/no): ")
