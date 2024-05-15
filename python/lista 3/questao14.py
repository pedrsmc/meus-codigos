zero_a_cem = []
cem_a_duzentos = []
maior_duzentos = []

for i in range (1,20):

    num = int(input("Digite um número inteiro: "))

    if num >= 0 and num <= 100:
        zero_a_cem.append(num)
    elif num > 100 and num <= 200:
        cem_a_duzentos.append(num)
    else:
        maior_duzentos.append(num)

print("0 a 100: ", zero_a_cem)
print("101 a 200: ", cem_a_duzentos)
print("Maior que 200: ", maior_duzentos)