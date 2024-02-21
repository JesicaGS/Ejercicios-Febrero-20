#Escribe un programa que muestre el triangulo de Pascal hasta N filas. #
def binomio (a, b):
    if b == 0 or b == a:
        return 1
    else:
        return binomio (a - 1, b - 1) + binomio (a - 1, b)

numero = int(input("Escribe el número de filas a mostrar: "))

for i in range (numero):
    for j in range (i + 1):
        potencia = binomio (i, j)
        print (potencia, end=" ")
    print(" ")
