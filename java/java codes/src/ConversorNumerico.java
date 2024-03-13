import java.util.Scanner;

public class ConversorNumerico {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro de 1 a 5: ");
        int numero = scanner.nextInt();

        String numeroPorExtenso;

        switch (numero) {
            case 1:
                numeroPorExtenso = "um";
                break;
            case 2:
                numeroPorExtenso = "dois";
                break;
            case 3:
                numeroPorExtenso = "três";
                break;
            case 4:
                numeroPorExtenso = "quatro";
                break;
            case 5:
                numeroPorExtenso = "cinco";
                break;
            default:
                numeroPorExtenso = "Número inválido";
        }

        System.out.println(numeroPorExtenso);
        
        scanner.close();
    }

}
