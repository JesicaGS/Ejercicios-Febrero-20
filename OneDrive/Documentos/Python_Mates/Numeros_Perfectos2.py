# Escribe un programa que imprima todos los números perfectos hasta N #
numero = int(input("Escribe el valor: "))

def numero_perfecto(numero):
    total_perfectos = []
    divisores = 0
    for i in range (total_perfectos):
        for j in range(1, numero):
            if numero % j == 0:
                divisores += j
    return total_perfectos

print (f"Los valores hasta {numero} son: ", numero_perfecto)