import random
import string
from datetime import datetime


class Productos:
    def __init__(self):
        self._fCaducidad = None
        self._nLote = "2017"
        self._fEnvasado = None
        self._codigo = None
        self._nombre = None
        self.directorio = None
        self.cantidad = None

    def setfCaducidad(self,date):
        self._fCaducidad = datetime.strptime((date), '%d/%m/%Y')

    def calcularCaducidad(self):
        hoy = datetime.now()
        diferencia = hoy - self._fCaducidad
        if diferencia.days < 0:
            print("Aun no Caduca")
        elif diferencia.days == 0:
            print("Ha caducado Hoy")
        else:
            print("Caducado por %s dias" %diferencia.days)

    def setnLote(self):
        for i in range(4):
            bla = [random.choice(string.ascii_uppercase)]
            self._nLote = self._nLote + random.choice(bla)

    def setfEnvasado(self,date):
        self._fEnvasado = datetime.strptime((date), '%d/%m/%Y')

    def imprime(self):
        pass

    def imp_dir(self):
        pass

    def SetNombreYcd(self, nom, codigo, can):
        pass

    def borrar_dir(self, cd):
        pass

    def __str__(self):
        pass