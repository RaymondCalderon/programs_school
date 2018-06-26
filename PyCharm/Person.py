# Se importa la clase datetime para trabajar con ella las operaciones de
# con los AA, MM y DD
from datetime import datetime


class Person:
    def __init__(self):
        self.today = datetime.today() # Se crea un objeto que guarda la fecha actual

    def age(self, day, month, year):
        print(self.today.strftime('%d/%m/%Y'))
        # Crea un objeto de tipo datetime con los datos recibidos como parametros
        birthdate = datetime.strptime('%s/%s/%s' % (day, month, year), '%d/%m/%Y')
        print(birthdate.strftime('%d/%m/%Y'))
        # Calcula la diferencia entre AA, tomando en cuenta los meses y los dias de las fechas
        diference = self.today.year - birthdate.year - (
            (self.today.month, self.today.day) < (birthdate.month, birthdate.day))
        print('Your person have %d years' % diference)
