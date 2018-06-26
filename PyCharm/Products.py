class Product:
    def __init__(self):
        self.__code = 0
        self.__name = ''
        self.quantity = 0
        self.lot = 0

    def setCode(self, value):
        self.__code = value

    def setName(self, value):
        self.__name = value

    def __str__(self):
        return 'Code: %s | Name: %s' % (self.__code, self.__name)
