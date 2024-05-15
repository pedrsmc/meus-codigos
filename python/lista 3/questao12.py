listaNumerosPares = []

for i in range (1,20):

    num = int(input("Digite um número inteiro: "))

    if num % 2 == 0:
        listaNumerosPares.append(num)

print(listaNumerosPares)