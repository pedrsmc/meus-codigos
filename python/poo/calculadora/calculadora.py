class Calculadora:
    quantity = 0
    numbers = []

    def __init__(self):
        self.quantity = int(
            input("Digite a quantidade de números que deseja calcular: "))

        for i in range(self.quantity):
            self.numbers.append(int(input("Digite o %dº número: " % (i + 1))))

    def sum(self):
        totalSum = 0
        totalSum = sum(self.numbers)

        return totalSum
    
    def subtraction(self):
        result = 0

        for i in range(self.quantity):
            if (result > self.numbers[i]):
                result = result - self.numbers[i]
            else:
                result = self.numbers[i] - result

        return result
    
    def multiply(self):
        result = 1

        for i in range(self.quantity):
            result *= self.numbers[i]

        return result