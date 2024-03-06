import java.util.Scanner;

public class Exercicio04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        
        if (age <= 10) {
            System.out.println("Você é considerado uma criança.\n");
        } else if (age >= 11 && age <= 17 ) {
            System.out.println("Você é considerado um adolescente.\n");
        } else {
            System.out.println("Você é considerado um adulto.\n");
        }
    }
}
