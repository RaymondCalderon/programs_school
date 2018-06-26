from figurasGeometricas import FigurasGeometricas


class Triangulo(FigurasGeometricas):
    def __init__(self):
        self._lado = 0.0
        self._altura = 0

    def setLado(self,x):
        pass

    def setAltura(self, y):
        pass

    def perimetro(self):
        return self._lado * 3

    def area(self):
        return (self._lado * self._altura) / 2