from triangulo import Triangulo

class TrianguloIsoseles(Triangulo):
    def __init__(self):
        self.__lados = 0
        self.__base = 0

    def setLados(self,x):
        self.__lados = x

    def setBase(self,y):
        self.__base = y

    def setAltura(self, z):
        self._altura = z

    def perimetro(self):
        return ((self.__lados * 2) + self.__base)

    def area(self):
        return ((self.__base *self._altura)/2)
