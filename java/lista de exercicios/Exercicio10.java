import java.util.Scanner;

public class Exercicio10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0, number;

        do {
            System.out.print("Digite um número inteiro: ");
            number = sc.nextInt();

            sum += number;
        } while (number != 0);

        System.out.printf("\nSoma = %d\n\n", sum);
    }
}
