import random 
import string
class Random:
	def __init__(self):
		self.lista = 'null'

	def crearCadena(self,cantidad):
		n=0
		vector = ""
		while cantidad>n:
			lista = [random.choice(string.ascii_lowercase),random.choice(string.ascii_uppercase), random.choice(string.digits), random.choice(string.punctuation)]
			vector = vector + (random.choice(lista))
			n= n+1
		#n=0
		#while cantidad>n:
		print (vector)
			#n = n+1
