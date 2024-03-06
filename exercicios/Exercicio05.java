import java.util.Scanner;

public class Exercicio05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite sua nota do exame: ");
        double grade = sc.nextDouble();

        if (grade >= 7.0) {
            System.out.println("Você está aprovado!\n");
        } else if (grade >= 5.0 && grade < 7.0) {
            System.out.println("Você está na recuperação.\n");
        } else {
            System.out.println("Você está reprovado.\n");
        }
    }
}
