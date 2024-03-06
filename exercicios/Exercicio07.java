import java.util.Scanner;

public class Exercicio07 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();   

        if(number > 0) {
            System.out.println("Este número é positivo.\n");
        } else if (number == 0) {
            System.out.println("Você digitou o número zero.\n");
        } else {
            System.out.println("Este número é negativo.\n");
        }
    }
}
