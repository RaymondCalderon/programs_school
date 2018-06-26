#Torneo Pokemon
ataque =[]
defensa =[]
casos = 10
n1 = 0
n2 = 0
n3 = 0
n4 = 0
f1 = 0
f2 = 0
ganador = 0
while casos >5:
    casos = int(input("Cuantos Casos de Prueba?(5 o menos):"))
    if casos >5:
        print("No valido")
n=0
while casos !=n:
    x = 0
    for i in range(8):
        x = input("Ataque del Pokemon" + str(i+1) +":")
        ataque.append(int(x))

    for i in range(8):
        x = input("Defensa del Pokemon" + str(i+1) +":")
        defensa.append(int(x))
    #Checar Ataque Ronda 1
    if ataque[0] - ataque[1] > 4:
        n1 = 0
    elif ataque[1]-ataque[0]> 4:
        n1 = 1
    if ataque[2] - ataque[3] > 4:
        n2 = 2
    elif ataque[3]-ataque[2]> 4:
        n2 = 3
    if ataque[4] - ataque[5] > 4:
        n3 = 4
    elif ataque[5]-ataque[4]> 4:
        n3 = 5
    if ataque[6] - ataque[7] > 4:
        n4 = 6
    elif ataque[7]-ataque[6]> 4:
        n4 = 7
    #Checar defensa ronda 1
    if defensa[0] - defensa[1] > 14:
        n1 = 0
    elif defensa[1]-defensa[0]> 14:
        n1 = 1
    if defensa[2] - defensa[3] > 14:
        n2 = 2
    elif defensa[3]-defensa[2]> 14:
        n2 = 3
    if defensa[4] - defensa[5] > 14:
        n3 = 4
    elif defensa[5]-defensa[4]> 14:
        n3 = 5
    if defensa[6] - defensa[7] > 14:
        n4 = 6
    elif defensa[7]-defensa[6]> 14:
        n4 = 7
    #Checar sumas ronda 1
    if (ataque[0]+defensa[0]) - (ataque[1]+defensa[1]) >= 50:
        n1 = 0
    else:
        n1 = 1
    if (ataque[2]+defensa[2]) - (ataque[3]+defensa[3]) >= 50:
        n2 = 2
    else:
        n2 = 3
    if (ataque[4]+defensa[4]) - (ataque[5]+defensa[5]) >= 50:
        n3 = 4
    else:
        n3 = 5
    if (ataque[6]+defensa[6]) - (ataque[7]+defensa[7])>= 50:
        n4 = 6
    else:
        n4 = 7
    #Checar Ataque Ronda 2
    if ataque[n1] - ataque[n2] > 4:
        f1 = n1
    elif ataque[n2]-ataque[n1]> 4:
        f1 = n2
    if ataque[n3] - ataque[n4] > 4:
        f2 = n3
    elif ataque[n4]-ataque[n3]> 4:
        f2 = n4
    #checar Defensa ronda 2
    if defensa[n1] - defensa[n2] > 14:
        f1 = n1
    elif defensa[n2]-defensa[n1]> 14:
        f1 = n2
    if defensa[n3] - defensa[n4] > 14:
        f2 = n3
    elif defensa[n4]-defensa[n3]> 14:
        f2 = n4
    #Checar sumas ronda 2
    if (ataque[n1]+defensa[n1]) - (ataque[n2]+defensa[n2]) >= 50:
        f1 = n1
    else:
        f1 = n2
    if (ataque[n3]+defensa[n3]) - (ataque[n4]+defensa[n4]) >= 50:
        f2 = n3
    else:
        f2 = n4
    #Checar Ataque Ronda Final
    if ataque[f1] - ataque[f2] > 4:
        ganador = f1
    elif ataque[n2]-ataque[n1]> 4:
        ganador = f2
    #checar Defensa Ronda Final
    if defensa[f1] - defensa[f2] > 14:
        ganador = f1
    elif defensa[f2]-defensa[f1]> 14:
        ganador = f2
    #Checar sumas Ronda Final
    if (ataque[f1]+defensa[f1]) - (ataque[f2]+defensa[f2]) >= 50:
        ganador = f1
    else:
        ganador = f2

    print("Ganador Pokemon:" + str(ganador+1))
    n=n+1