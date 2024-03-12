import java.util.Scanner;

public class Exercicio02 {
        static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Digite o valor total da viagem: ");
        double tripValue = sc.nextDouble();
     
        System.out.println("Digite o valor da sua conta bancária: ");
        double bankValue = sc.nextDouble();

        if (bankValue < tripValue) {
            System.out.println("\nVocê não tem fundos suficientes!");
        } else {
            System.out.println("\nVocê tem fundos suficientes!");
        }
    }
}
