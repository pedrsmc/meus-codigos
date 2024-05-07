soma = 0
contador = 0


for i in range (10):
    contador += 1

    idade = int(input("Digite a sua idade: "))

    soma += idade

media = soma / contador

print("Média de idade = %.0f" % media)