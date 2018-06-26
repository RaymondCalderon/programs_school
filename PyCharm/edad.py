from datetime import datetime
class Edad:
	def __init__(self):
		hoy = datetime.today()
		self.dia = hoy.day
		self.mes = hoy.month
		self.anio = hoy.year

	def imprime(self,dia,mes,anio):
		dias = self.dia - dia
		if dias<1:
			self.mes = self.mes - 1

		meses = self.mes - mes
		if meses<0:
			self.anio = self.anio - 1

		anios = self.anio - anio
		print("Tu edad es de: "+ str(anios))
