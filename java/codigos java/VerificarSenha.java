import java.util.Scanner;

public class VerificarSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals("1234")) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals("1234"));

        System.out.println("Senha correta. Acesso concedido!");

        scanner.close();
    }
}
