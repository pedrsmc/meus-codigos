import java.util.Scanner;

public class Exercicio08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean canDrive = false;

        System.out.print("Você possui carteira de motorista? (s/n): ");
        char res = sc.next().charAt(0);

        System.out.print("Digite a sua idade: ");
        int age = sc.nextInt();

        if (age >= 18 || res == 's') {
            canDrive = true;
        }

        System.out.println("\nPode dirigir = " + canDrive + "\n");
    }
}
