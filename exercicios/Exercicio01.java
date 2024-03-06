import java.util.Scanner;

public class Exercicio01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}
