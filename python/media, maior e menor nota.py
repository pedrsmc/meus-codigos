import numpy as np

grades = []

for i in range(3):
    n = float(input("Digite o valor %d° nota: " % (i + 1)))
    grades.append(n)

print("\nMédia = %.1f" % np.average(grades))

maxGrade = max(grades)
minGrade = min(grades)

for i in range(3):
    if (grades[i] == maxGrade):
        print("Maior nota = %.1f" % grades[i])
    if (grades[i] == minGrade):
        print("Menor nota = %.1f\n" % grades[i])
