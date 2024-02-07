import os


def calculateImc():
    weight = float(input("Digite seu peso: "))
    height = float(input("Digite a sua altura: "))

    print("\nIMC = %.2f" % (weight / height ** 2))


answer = 1

while (answer == 1):
    answer = int(input(
        "\nOlá, deseja realizar o calculo de IMC?\n(Digite '1' para 'Sim' e '0' para 'Não': "))

    if (answer == 1):
        print("")
        calculateImc()
    elif (answer == 0):
        print("\nFechando...\n")
    else:
        print("\nDigite uma resposta válida.\n")
