from persona import Persona


class Alumno2(Persona):
    def __init__(self):
        self.matricula = None
        self.carrera = None
        self.nivel = None
        self.escuela = None
        self.calificaciones = []

    def inscripcion(self,nivel):
        self.nivel = nivel

    def imprime(self):
        print("Datos alumno:%s" % self.nombre + " ------" + "Nivel %s" % self.nivel)