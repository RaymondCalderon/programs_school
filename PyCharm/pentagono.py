from figurasGeometricas import FigurasGeometricas


class Pentagono(FigurasGeometricas):
    def __init__(self):
        self.__lado = 0.0
        self.__apoptema = 0

    def setLado(self, x):
        self.__lado = x

    def setApotema(self, y):
        self.__apoptema = y

    def perimetro(self):
        return self.__lado * 5

    def area(self):
        return ((self.__lado * 5) * self.__apoptema) / 2