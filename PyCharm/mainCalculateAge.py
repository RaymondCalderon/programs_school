from Person import Person

myPerson = Person()  # Se crea el objeto de tipo Person
# Se solicitan los datos de la fecha de nacimiento al usuario
myDay = input("DD de nacimiento: ")
myMonth = input("MM de nacimiento: ")
myYear = input("AA de nacimiento: ")
# Se manda a llamar al metodo para calcular la edad, enviando como parametros
# el DD, el MM y el AA de nacimiento
myPerson.age(myDay, myMonth, myYear)
