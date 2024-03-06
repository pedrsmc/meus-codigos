import java.util.Scanner;

public class Exercicio06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int highestNumber = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número inteiro: ");
            int number = sc.nextInt();

            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        System.out.printf("\nO maior número é: %d\n", highestNumber);
    }
}
