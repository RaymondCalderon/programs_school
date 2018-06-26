from triangulo import Triangulo

class TrianguloEscaleno(Triangulo):
    def __init__(self):
        self.__lado1 = 0
        self.__lado2 = 0
        self.__base = 0

    def setLado1(self,x):
        self.__lado1 = x

    def setLado2(self,x):
        self.__lado2 = x

    def setBase(self,x):
        self.__base = x

    def setAltura(self, y):
        self._altura = y

    def perimetro(self):
        return (self.__base + self.__lado1 + self.__lado2)

    def area(self):
        return ((self.__base *self._altura)/2)