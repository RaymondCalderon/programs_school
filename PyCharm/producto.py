import random
class Producto:
    def __init__(self):
        self.fabricante = "Raymond"
        self.codigo = 0
        self.precioc = 0
        self.preciov = 0
        self.cantidad = 20
        self.ganancia = 0

    def insert(self,a,b,c):
        self.codigo = (random.randrange(999,9999999))
        self.precioc = a
        self.preciov = b
        self.cantidad = self.cantidad + c
    def sell(self):
        self.ganancia = (((self.preciov - self.precioc)/self.precioc)*100)

    def paste(self):
        print("Fabricante:" + str(self.fabricante) + "     Codigo:" + str(self.codigo))
        print("Precio de compra: " + str(self.precioc))
        print("Tenemos " + str(self.cantidad) + " de nuestro Producto")
        if (self.ganancia/100)>0:
            print("Ganancia del %d" %self.ganancia + "%" + " por producto")
        else:
            print("Ganancia del 0% por producto")
            print("Mejor venda otra cosa XD")