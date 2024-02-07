import os

answer = 0

while (answer == 0):
    os.system('cls')

    typedNumber = int(
        input("Enter a number to see your multiplication tables: "))
    print("")

    for number in range(11):
        result = typedNumber * number
        print(typedNumber, ' X ', number, ' = ', result)

    answer = int(
        input("\nType (0) for restart the program, or type (1) to quit: "))

else:
    print("End of loop. Thank you!\n")
