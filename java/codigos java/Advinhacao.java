import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        //Instanciando os objetos nescessários.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int res, numAleatorio;

        // Gerando um número aleatório entre 1 e 100.
        numAleatorio = random.nextInt(100) + 1;

        do {
            // Solicitando ao usuário um número.
            System.out.print("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100: ");
            res = sc.nextInt();

            // Verificando se o número digitado é maior, menor que ou igual ao número gerado.
            if (res > numAleatorio) {
                System.out.println("Palpite muito alto. Tente novamente.\n");
            } else if (res < numAleatorio) {
                System.out.println("Palpite muito baixo. Tente novamente.\n");
            } else {
                System.out.println("Numéro correto, parabéns!\n");
            }
        } while (res != numAleatorio);

        sc.close();
    }
}
