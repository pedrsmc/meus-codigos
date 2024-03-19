import java.util.ArrayList;
import java.util.Scanner;

public class ExibirPorIndice {

    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int indice;

        clientes.add("Pedro");
        clientes.add("Leonardo");
        clientes.add("Julia");
        clientes.add("Maria");
        clientes.add("Fabio");

        System.out.print("Digite um número para exibir o cliente de acordo com seu índice (1 a 5): ");
        indice = sc.nextInt();

        if (indice > 1 && indice <= 5) {
            System.out.println("O cliente do índice digitado é: " + clientes.get(indice - 1));
        } else {
            System.out.println("Não existe nenhum cliente cadastrado neste índice.");
        }
    }
}
