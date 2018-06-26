from alumno import Alumno


n = int(input("Cuantos alumnos desea Calificar: "))
for a in range(n):
    bla = Alumno()
    bla.datos()
    bla.calculo()
    bla.imprime()
