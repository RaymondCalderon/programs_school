from persona import Persona


class Trabajador2(Persona):
    def __init__(self):
        self.puesto = None
        self.sueldo = None
        self.horas = None
        self.impuestos = None

    def calcularSueldo(self):
        print("Calcular sueldo")

    def calcularImpuestos(self):
        print("Calcular impuestos")

    def calcularBonos(self):
        print("Calcular Bonos")