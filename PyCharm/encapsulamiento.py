import datetime
class Persona:
    def __init__(self):
        self.name = ''
        self.__age = 0
        self.birthdate = datetime.today()

    def getAge(self):
        self.__calculateAge()
        return self.__age

    def __calculate(self):

