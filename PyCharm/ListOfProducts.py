from Products import Product


listOfProducts = []

option = 'Y'
while option == 'Y':
    newProduct = Product()
    newProduct.setCode(int(input("CODE: ")))
    newProduct.setName(input("NAME: "))
    newProduct.lot = int(input("LOT NUMBER: "))
    newProduct.quantity = int(input("QUANTITY: "))

    listOfProducts.append(newProduct)
    option = input('Another Product? (Y/N) ').upper()

listOfProducts[0] = None
for p in listOfProducts:
    print(p)
