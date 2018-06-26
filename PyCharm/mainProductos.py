from productosFrescos import ProductosFrescos
from productosRefrigerados import ProductosRefrigerados
from productosCongelados import ProductosCongelados


n = 0
dif = 0
can = 0
Fresh = ProductosFrescos()
Frozen = ProductosCongelados()
Cooled = ProductosRefrigerados()
option = 0
while option != 4:
    if n < 0:
        n = 0
    op = 0
    print("----------------Menu Inicial----------------")
    print("1. Capturar Productos")
    print("2. Mostrar Catalogo")
    print("3. Eliminar Productos")
    print("4. Salir del Programa")
    option = int(input("Seleccione la opcion:"))
    if option ==1:
        opcion = 0
        while opcion !=4:
            print("----------------Bodega de los Productos Estandar----------------")
            print('Cantidad de Productos:', n)
            print("1. Producto Fresco")
            print("2. Producto Refrigerado")
            print("3. Producto Congelado")
            print("4. Dejar de Registrar Productos")
            opcion = int(input("Ingrese la Opcion:"))
            if opcion == 1:
                print("----------------Producto Fresco----------------")
                nom = input('Introduzca el Nombre del producto: ')
                codigo = int(input('Codigo del producto: '))
                can = int(input('Cantidad de Productos: '))
                Fresh.SetNombreYcd(nom, codigo, can)
                Fresh.setnLote()
                Country = input("Introduzca el Pais de Origen:")
                Fresh.setpaisOrigen(Country)
                print("Introduzca la Fecha de Envasado del Producto")
                Date = input("Fecha de Envasado(DD/MM/YYYY): ")
                Fresh.setfEnvasado(Date)
                print("Introduzca la Fecha de Caducidad del Producto")
                Date = input("Fecha de Caducidad(DD/MM/YYYY): ")
                Fresh.setfCaducidad(Date)
                Fresh.imprime()
                Fresh.calcularCaducidad()
                n += can
                for x in range(0, can):
                    Fresh.directorio[codigo] = Fresh
                print("----------------------------------------------------")
            elif opcion == 2:
                print("----------------Producto Refrigerado----------------")
                nom = input('Introduzca el Nombre del producto: ')
                codigo = int(input('Codigo del producto: '))
                can = int(input('Cantidad de Productos: '))
                Cooled.SetNombreYcd(nom, codigo, can)
                Cooled.setnLote()
                Company = input("Introduzca el Nombre de la Empresa Supervisora:")
                Cooled.setempresaSupervisora(Company)
                Temperature = int(input("Introduzca la Temperatura Ideal(C°):"))
                Cooled.settemperaturaIdeal(Temperature)
                print("Introduzca la Fecha de Envasado del Producto")
                Date = input("Fecha de Envasado(DD/MM/YYYY): ")
                Cooled.setfEnvasado(Date)
                print("Introduzca la Fecha de Caducidad del Producto")
                Date = input("Fecha de Caducidad(DD/MM/YYYY): ")
                Cooled.setfCaducidad(Date)
                Cooled.imprime()
                Cooled.calcularCaducidad()
                n += can
                for x in range(0, can):
                    Cooled.directorio[codigo] = Cooled
                print("----------------------------------------------------")
            elif opcion == 3:
                print("----------------Producto Congelado----------------")
                nom = input('Introduzca el Nombre del producto: ')
                codigo = int(input('Codigo del producto: '))
                can = int(input('Cantidad de Productos: '))
                Frozen.SetNombreYcd(nom, codigo, can)
                Frozen.setnLote()
                Country = input("Introduzca el Pais de Origen:")
                Frozen.setpaisOrigen(Country)
                Temperature = int(input("Introduzca la Temperatura Ideal(C°):"))
                Frozen.settemperaturaIdeal(Temperature)
                print("Introduzca la Fecha de Envasado del Producto")
                Date = input("Fecha de Envasado(DD/MM/YYYY): ")
                Frozen.setfEnvasado(Date)
                print("Introduzca la Fecha de Caducidad del Producto")
                Date = input("Fecha de Caducidad(DD/MM/YYYY): ")
                Frozen.setfCaducidad(Date)
                Frozen.imprime()
                Frozen.calcularCaducidad()
                n += can
                for x in range(0, can):
                    Frozen.directorio[codigo] = Frozen
                print("----------------------------------------------------")
            elif opcion == 4:
                pass
            else:
                print("Opcion No Valida")
    elif option == 2:
        print("-------------CATALOGO-------------")
        print('------------FRESCO-------------')
        Fresh.imp_dir()
        print('------------REFRIGERADO--------')
        Cooled.imp_dir()
        print('------------CONGELADO----------')
        Frozen.imp_dir()
        print('CANTIDAD TOTAL')
        print('>>>', n, '<<<')

    elif option == 3:
        print("--------ELIMINAR----------------")
        print("1. Eliminar Fresco")
        print("2. Eliminar Refrigerado")
        print("3. Eliminar Congelado")
        print('4. Salir')
        op2 = int(input('Seleccione el tipo de Producto: '))
        if op2 == 1:
            if len(Fresh.directorio) == 0:
                Fresh.imp_dir()
            else:
                cd = int(input('Introduzca el codigo del producto a borrar: '))
                can = int(input('Cantidad de producto a borrar: '))
                if can >= Fresh.cantidad:
                    dif = 0
                    n -= Fresh.cantidad
                else:
                    dif = Fresh.cantidad - can
                    n -= can
                if dif <= 0:
                    dif = 0
                    Fresh.borrar_dir(cd)
                else:
                    Fresh.cantidad = dif
                    Fresh.imp_dir()
        elif op2 == 2:
            if len(Cooled.directorio) == 0:
                Cooled.imp_dir()
            else:
                cd = int(input('Introduzca el codigo del producto a borrar: '))
                can = int(input('Cantidad de producto a borrar: '))
                if can >= Cooled.cantidad:
                    dif = 0
                    n -= Cooled.cantidad
                else:
                    dif = Cooled.cantidad - can
                    n -= can
                dif = Cooled.cantidad - can
                if dif <= 0:
                    dif = 0
                    Cooled.borrar_dir(cd)
                else:
                    Cooled.cantidad = dif
                    Cooled.imp_dir()
        elif op2 == 3:
            if len(Frozen.directorio) == 0:
                Frozen.imp_dir()
            else:
                cd = int(input('Introduzca el codigo del producto a borrar: '))
                can = int(input('Cantidad de producto a borrar: '))
                if can >= Frozen.cantidad:
                    dif = 0
                    n -= Frozen.cantidad
                else:
                    dif = Frozen.cantidad - can
                    n -= can
                if dif <= 0:
                    dif = 0
                    Frozen.borrar_dir(cd)
                else:
                    Frozen.cantidad = dif
                    Frozen.imp_dir()
        elif op2 == 4:
            pass
    elif option == 4:
        pass
    else:
        print("Opcion no Valida")