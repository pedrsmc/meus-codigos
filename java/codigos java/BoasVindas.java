import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        do {
            // Solicita o nome ao usuário.
            System.out.print("Digite seu nome ou 'sair' para encerrar: ");
            nome = scanner.nextLine();

            // Verifica se o usuário digitou a palavra "sair" ou um nome.
            if (!nome.equalsIgnoreCase("sair")) {
                System.out.println("Olá, " + nome + "! Bem-vindo(a)!");
            }
        } while (!nome.equalsIgnoreCase("sair")); // Sai do laço após o usuário digitar "sair".

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
