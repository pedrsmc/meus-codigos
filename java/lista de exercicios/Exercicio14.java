import java.util.Scanner;

public class Exercicio14 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int number = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("O fatorial de %d é: %d\n", number, factorial);
    }
}
