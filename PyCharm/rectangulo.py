from figurasGeometricas import FigurasGeometricas


class Rectangulo(FigurasGeometricas):
    def __init__(self):
        self.__base = 0.0
        self.__altura = 0

    def setBase(self, x):
        self.__base = x

    def setAltura(self, y):
        self.__altura = y

    def perimetro(self):
        return (self.__base * 2) + (self.__altura * 2)

    def area(self):
        return self.__base * self.__altura