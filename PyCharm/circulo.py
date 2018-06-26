import math
from figurasGeometricas import FigurasGeometricas


class Circulo(FigurasGeometricas):
    def __init__(self):
        self.__radio = 0

    def setRadio(self,valor):
        self.__radio = valor

    def perimetro(self):
        return math.pi * self.__radio * 2

    def area(self):
        return math.pi * math.pow(self.__radio, 2)
