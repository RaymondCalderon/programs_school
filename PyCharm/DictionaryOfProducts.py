from Products import Product


def print_dict():
    if len(dictionaryOfProducts) == 0:
        print("Empty dictionary")
    else:
        for key, p in dictionaryOfProducts.items():
            print(key, p)

dictionaryOfProducts = {}
option = 'Y'
while option == 'Y':
    newProduct = Product()
    code = int(input("CODE: "))
    newProduct.setCode(code)
    newProduct.setName(input("NAME: "))
    newProduct.lot = int(input("LOT NUMBER: "))
    newProduct.quantity = int(input("QUANTITY: "))

    dictionaryOfProducts[code] = newProduct
    option = input('Another Product? (Y/N) ').upper()

print_dict()

wantToDelete = input('Want to delete a product? (Y/N) ').upper()
if wantToDelete:
    code = int(input('Code of product to delete: '))
    del dictionaryOfProducts[code]
    print_dict()
