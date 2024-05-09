soma = 0
menorIdade = 9999999

for i in range (10):

    idade = int(input("Digite a sua idade: "))

    if idade < menorIdade:
        menorIdade = idade


        

print("Menor idade registrada: ", menorIdade)