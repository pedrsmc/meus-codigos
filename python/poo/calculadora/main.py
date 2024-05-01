import os
from calculadora import Calculadora

res = 's'

os.system('cls')

while True:
    if (res == 's'):
        operation = input(
            "Digite o símbolo da operação você deseja realizar: ")

        calculadora = Calculadora()
        
        match operation:
            case '+':
                print("\nResultado = %d" % calculadora.sum())
            case '-':
                print("\nResultado = %d" % calculadora.subtraction())
            case 'x':
                print("\nResultado = %d" % calculadora.multiply())
            case _:
                print("Digite um símbolo válido!")

        while True:
            res = input("\nDeseja reiniciar o programa? (s/n): ")

            if (res == 'n'):
                print("Saindo...")
                break
            elif (res == 's'):
                os.system('cls')
                break
            else:
                print("Responda apenas utilizando a letra 's' ou 'n'!\n")
                break
    else:
        break
