from productos import Productos


class ProductosCongelados(Productos):
    def __init__(self):
        self._nLote = "2017"
        self.__paisOrigen = None
        self.__temperaturaIdeal = None
        self._nombre = None
        self.directorio = {}
        self.cantidad = 0

    def setpaisOrigen(self , p):
        self.__paisOrigen = p

    def settemperaturaIdeal(self , q):
        self.__temperaturaIdeal = q

    def imprime(self):
        print("Nombre: %s | Codigo: %s" % (self._nombre, self._codigo))
        print("Numero De Lote:" + str(self._nLote))
        print("Pais de Origen:" + str(self.__paisOrigen))
        print("Temperatura Ideal:%s°C" % self.__temperaturaIdeal)
        print("Fecha de Envasado:" + self._fEnvasado.strftime('%d/%m/%Y'))
        print("Fecha de Caducidad:" + self._fCaducidad.strftime('%d/%m/%Y'))

    def SetNombreYcd(self, nom, codigo, can):
        self._nombre = nom
        self._codigo = codigo
        self.cantidad = can

    def imp_dir(self):
        if len(self.directorio) == 0:
            print('<<El directorio esta vacio>>')
        for code, product in self.directorio.items():
            print(code, product)

    def borrar_dir(self, cd):
            self._codigo = cd
            print('El producto borrado es: ', self.directorio[self._codigo])
            del self.directorio[self._codigo]

    def __str__(self):
        return 'Nombre: %s | Cantidad %s | Codigo: %s' % (self._nombre, self.cantidad, self._codigo)
