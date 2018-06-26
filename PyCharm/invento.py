import random
class Invento:
    def __init__(self):
        self.number = 0
        self.bug = []
        self.operation = "null"
        self.result = 0

    def numbers(self,c):
        self.number = c
        i=0
        for i in range(self.number):
            self.bug.insert(i,random.randrange(1,100))
            i+=1

    def operations(self,x):
        self.operation = x
        if self.operation == 'suma':
            self.result = self.bug[0]
            for a in range(1,self.number):
                self.result = self.result + self.bug[a]
        elif self.operation == 'resta':
            self.result = self.bug[0]
            for a in range(1,self.number):
                self.result = self.result - self.bug[a]
        elif self.operation == 'multiplicacion':
            self.result = self.bug[0]
            for a in range(1,self.number):
                self.result = self.result * self.bug[a]
        elif self.operation == 'division':
            self.result = self.bug[0]
            for a in range(1,self.number):
                self.result = self.result / self.bug[a]

    def paste(self):
        print("Valores:" + str(self.bug))
        print("Operacion:" + str(self.operation))
        print("Resultado:" + str(self.result))

