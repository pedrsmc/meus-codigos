import java.util.Scanner;

public class Exercicio09 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite sua quantidade de faltas: ");
        int absence = sc.nextInt();

        System.out.print("Digite sua nota: ");
        float grade = sc.nextFloat();

        if (grade >= 6.0 && absence < 10) {
            System.out.println("\nAluno aprovado!\n");
        } else {
            System.out.println("\nAluno reprovado!\n");
        }

    }
}
