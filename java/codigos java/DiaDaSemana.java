import java.util.Scanner;

public class DiaDaSemana {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro de 1 a 7 para representar o dia da semana: ");
        int numero = scanner.nextInt();

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Número inválido";
        }
        
        System.out.println("Dia da semana correspondente: " + diaSemana);
        
        scanner.close();
    }

}
