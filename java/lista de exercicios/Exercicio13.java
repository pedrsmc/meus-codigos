import java.util.Scanner;

public class Exercicio13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i, c = 0;

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            if(number % i == 0) {
                c++;
            }
        }

        if(c == 2) {
            System.out.printf("\n%d é um número primo.\n\n", number);
        } else {
            System.out.printf("\n%d não é um número primo.\n\n", number);
        }
    }
}
