import java.util.Scanner;

public class EstacaoDoAno {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro de 1 a 4 para representar a estação do ano: ");
        int numero = scanner.nextInt();

        String estacao;

        switch (numero) {
            case 1:
                estacao = "Primavera";
                break;
            case 2:
                estacao = "Verão";
                break;
            case 3:
                estacao = "Outono";
                break;
            case 4:
                estacao = "Inverno";
                break;
            default:
                estacao = "Número inválido";
        }

        System.out.println("Estação do ano correspondente: " + estacao);
        
        scanner.close();
    }

}
