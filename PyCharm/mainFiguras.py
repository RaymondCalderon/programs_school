from cuadrado import Cuadrado
from circulo import Circulo
from rectangulo import Rectangulo
from pentagono import Pentagono
from trianguloEquilatero import TrianguloEquilatero
from trianguloIsoseles import TrianguloIsoseles
from trianguloEscaleno import TrianguloEscaleno


Square = Cuadrado()
print("--------Cuadrado------------")
lado = float(input("Cuanto vale el lado?"))
Square.setLado(lado)
print("El lado vale %.2f" % Square.getLado())
print("Area: %.2f " % Square.area())
print("Perimetro: %.2f" % Square.perimetro())
print("----------------------------------------------------")
Circle = Circulo()
print("--------Circulo------------")
radio = float(input("Valor del Radio?"))
Circle.setRadio(radio)
print("Area: %.2f " % Circle.area())
print("Perimetro: %.2f" % Circle.perimetro())
print("----------------------------------------------------")
Rectangle = Rectangulo()
print("--------Rectangulo------------")
base = float(input("Valor de la Base?"))
Rectangle.setBase(base)
altura = float(input("Valor de la Altura?"))
Rectangle.setAltura(altura)
print("Area: %.2f " % Rectangle.area())
print("Perimetro: %.2f" % Rectangle.perimetro())
print("----------------------------------------------------")
Pentagon = Pentagono()
print("--------Pentagono------------")
lado = float(input("Valor del Lado?"))
Pentagon.setLado(lado)
apotema = float(input("Valor de la Apotema?"))
Pentagon.setApotema(apotema)
print("Area: %.2f " % Pentagon.area())
print("Perimetro: %.2f" % Pentagon.perimetro())
print("----------------------------------------------------")
Triangle1 = TrianguloEquilatero()
print("--------Triangulo Equilatero------------")
lado = float(input("Valor del Lado?"))
Triangle1.setLado(lado)
altura = float(input("Valor de la Altura?"))
Triangle1.setAltura(altura)
print("Area: %.2f " % Triangle1.area())
print("Perimetro: %.2f" % Triangle1.perimetro())
print("----------------------------------------------------")
Triangle2 = TrianguloIsoseles()
print("--------Triagulo Isoseles------------")
lados = float(input("Valor de los Lados Iguales?"))
Triangle2.setLado(lados)
altura = float(input("Valor de la Altura?"))
Triangle2.setAltura(altura)
base = float(input("Valor de la Base?"))
Triangle2.setBase(base)
print("Area: %.2f " % Triangle2.area())
print("Perimetro: %.2f" % Triangle2.perimetro())
print("----------------------------------------------------")
Triangle3 = TrianguloEscaleno()
print("--------Triagulo Escaleno------------")
lado1 = float(input("Valor del Lado 1?"))
Triangle3.setLado1(lado1)
lado2 = float(input("Valor del Lado 2?"))
Triangle3.setLado2(lado2)
base = float(input("Valor de la Base?"))
Triangle3.setBase(base)
altura = float(input("Valor de la Altura?"))
Triangle2.setAltura(altura)
print("Area: %.2f " % Triangle3.area())
print("Perimetro: %.2f" % Triangle3.perimetro())
print("----------------------------------------------------")
