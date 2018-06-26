from datetime import datetime


class Producto:
    def __init__(self, fecha_caducidad):
        self.hoy = datetime.today()
        self.caducidad = datetime.strptime(fecha_caducidad, '%d/%m/%Y')

    def ChecaCaducidad(self):
        return (self.hoy.year, self.hoy.month, self.hoy.day) > (self.caducidad.year, self.caducidad.month, self.caducidad.day)
