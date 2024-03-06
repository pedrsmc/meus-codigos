import java.util.Scanner;

public class Exercicio03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o número de jogadores da sua equipe: ");
        int playersNumber = sc.nextInt();

        if (playersNumber >= 7) {
            System.out.println("\nVocê tem a quantidade mínima de jogadores!");
        } else {
            System.out.println("\nVocê não tem a quantidade mínima de jogadores!");
        }
    }
}
