import numpy as np

numbers = []
sum = 0
product = 1
subtraction = 0

for i in range(2):
    i += 1
    number = int(input("Digite um número inteiro: "))
    numbers.append(number)

    sum += number
    product *= number

    if (number > subtraction):
        subtraction = number - subtraction
    else:
        subtraction -= number

maxValue = max(numbers)
minValue = min(numbers)
avg = sum / i

print("\nSoma = %d %d" % sum)
print("Produto = %d" % product)
print("Subtração = %d" % subtraction)
print("Média = %.1f" % avg)

if (minValue == maxValue):
    advice = "Os valores são iguais!\n"
    print(advice)
else:
    print("Maior = %d" % maxValue)
    print("Menor = %d\n" % minValue)
