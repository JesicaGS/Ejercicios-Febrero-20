# Escribe un programa en python que diga si un número es perfecto #
numero = int(input("Introduce un número: "))

def numero_perfecto(numero):
    divisores = 0
    for i in range(1, numero):
        if numero % i == 0:
            divisores += i
    return divisores == numero

if numero_perfecto(numero):
    print(f"El número {numero} es perfecto")
else: 
    print(f"El número {numero} no es perfecto")
