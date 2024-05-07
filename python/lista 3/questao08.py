soma = 0
contador = 0


for i in range (10):

    idade = int(input("Digite a sua idade: "))

    if idade > 18:
        contador += 1
        

print("Quantidade de pessoas que sâo maiores de idade = ", contador)