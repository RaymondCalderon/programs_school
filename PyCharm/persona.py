class Persona:
	def __init__(self):#El init es un metodo para inicializar
		self.nombre = "Tristan"
		self.color_cabello = "Azul"
		self.estatura = 1.80#aqui se escribieron los atributos 
	def imprime(self):
		print ("Mi nombre es " + self.nombre)
		print ("Mi Cabello es de color " + self.color_cabello)
		print ("Mi estatura es de " + str(self.estatura))
		#print ("Cual es tu año de nacimiento?") 
		#self.nacimiento = int(input())
		#self.nacimiento=input()
		#import time
		#ahora = time.strftime("%Y")
		#fecha = int(float(ahora))
		#type(ahora)
		#type(fecha)
		#self.edad = str(fecha - self.nacimiento)
		#print ("Tu edad es de: "+ self.edad)
		#print ("edad es: "+ int(float(ahora))- int(float(fecha)) )	
 