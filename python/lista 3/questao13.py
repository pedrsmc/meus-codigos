listaNumeros = []

for i in range (1,20):

    num = int(input("Digite um número inteiro: "))

    if num >= 0 and num <= 100:
        listaNumeros.append(num)

print(listaNumeros)