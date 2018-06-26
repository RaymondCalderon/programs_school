from producto import Producto
product = Producto()
print("---------Inventario--------")
precio1 = int(input("Precio de compra?: "))
precio2 = int(input("Precio de venta?: "))
compra = int(input("Cuantos compraste?:"))
product.insert(precio1,precio2,compra)
product.sell()
product.paste()
