class Trabajador:
    def __init__(self):
        self.nombre = 'null'
        self.puesto ='null'
        self.horas = 0
        self.salario_gerente = 40
        self.salario_supervisor = 30
        self.salario_empleado = 20
        self.iva = .16
        self.isr = .32
        self.subtotal = 0
        self.bono = 0
        self.final = 0

    def datos(self):
        print("Ficha de Empleado")
        self.nombre = str(input("Nombre: "))
        self.puesto= str(input("Puesto (gerente , supervisor o empleado): "))
        self.horas = int(input("Horas por semana: "))

    def calculos(self):
        if self.puesto == 'gerente':
            self.subtotal = (self.salario_gerente * self.horas)
            self.subtotal = self.subtotal - (self.salario_gerente * self.isr)
            self.subtotal = self.subtotal - (self.salario_gerente * self.iva)
            if self.horas >= 40:
                self.bono = (self.salario_gerente * 0.20)
        self.final = self.subtotal + self.bono

        if self.puesto == 'supervisor':
            self.subtotal = self.salario_gerente * self.horas
            self.subtotal = self.subtotal - (self.salario_supervisor * self.isr)
            self.subtotal = self.subtotal - (self.salario_supervisor * self.iva)
            if self.horas >= 40:
                self.bono = (self.salario_supervisor * 0.20)
            self.final = self.subtotal + self.bono

        if self.puesto == 'empleado':
            self.subtotal = self.salario_empleado * self.horas
            self.subtotal = self.subtotal - (self.salario_empleado * self.isr)
            self.subtotal = self.subtotal - (self.salario_empleado * self.iva)
            if self.horas >= 40:
                self.bono = (self.salario_empleado * 0.20)
            self.final = self.subtotal + self.bono

    def imprime(self):
        print("Formato de Cheque Semanal")
        print("Nombre del Empleado: " + self.nombre)
        print("Puesto del Empleado: "+ self.puesto)
        if self.puesto == 'gerente':
            print("Salario por hora: " + str(self.salario_gerente))
        if self.puesto == 'supervisor':
            print("Salario por hora: " + str(self.salario_supervisor))
        if self.puesto == 'empleado':
            print("Salario por hora: " + str(self.salario_empleado))
        print("Subtotal con IVA e ISR aplicado: " + str(self.subtotal))
        if self.horas >= 40:
            print("Bono por Trabajar 40 horas o mas: " + str(self.bono))
        print("Total: " + str(self.final))
