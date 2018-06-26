from alumno2 import Alumno2
from profesor import Profesor
from trabajador2 import Trabajador2


teacher = Profesor()
worker = Trabajador2()
student = Alumno2()
print("--------Inscripcion Alumno-------------")
student.nombre = input("Nombre del Alumno:")
level = input("Nivel:")
student.inscripcion(level)
student.imprime()

