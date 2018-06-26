from persona import Persona


class Profesor(Persona):
    def __init__(self):
        self.clases = None
        self.nivel = None
        self.carrera = None
        self.matricula = None

    def reprobarAlumnos(self):
        print("Reprobado")