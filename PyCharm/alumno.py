class Alumno:
    def __init__(self):
        self.nombre = "null"
        self.carrrera = "null"
        self.cuatrimestre = "null"
        self.unidades = 0
        self.promedio = 0
        self.calificacion = []
        self.suma = 0

    def datos(self):
        print("Captura de califciones ")
        self.nombre = str(input("Ingrese el Nombre Completo:"))
        self.carrrera = str(input("Ingrese la Carrera en la que cursa:"))
        self.cuatrimestre = str(input("Ingrese el Cuatrimestre en el que cursa:"))
        self.unidades = int(input("Ingrese las Unidades a calificar: "))
        for i in range(self.unidades):
            self.calificacion.append(int(input("Unidad" + str(i+1) +":")))
            self.suma += self.calificacion[i]

    def calculo(self):
        self.promedio = (self.suma/self.unidades)

    def imprime(self):
        print("Nombre:" , self.nombre)
        print("Carrera:", self.carrrera)
        print("Cuatrimestre:", self.cuatrimestre)
        print("Calificaciones")
        for x in range(self.unidades):
            print("Unidad" + str(x+1)+":"+str(self.calificacion[x]))
        print("Promedio final:%.2f" %self.promedio)
