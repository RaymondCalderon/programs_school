from figurasGeometricas import FigurasGeometricas
class Cuadrado(FigurasGeometricas):
    def __init__(self):
        self.__lado = 0
#Se asigna un valor al atributo protegido
    def setLado(self,value):
        self.__lado = value

    def getLado(self):
        return self.__lado

    def perimetro(self):
        return self.__lado * 4

    def area(self):
        return self.__lado * self.__lado