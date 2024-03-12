import java.util.Scanner;

public class LoginSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // usuario e senha corretos
        String correctUsername = "login";
        String correctPassword = "senha123";

        // Perguntando ao usuário o login e a senha
        System.out.print("Login: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Senha: ");
        String inputPassword = scanner.nextLine();

        // checando se o usuario e a senha estao corretos
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.printf("Login feito com sucesso! Bem vindo, %s!\n", correctUsername);
        } else {
            System.out.println("Usuario ou senha incorretos, por favor tente novamente.");
        }

        scanner.close();
    }
}
