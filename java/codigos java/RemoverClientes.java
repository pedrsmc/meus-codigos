import java.util.ArrayList;
import java.util.Scanner;

public class RemoverClientes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<>();

        clientes.add("Pedro");
        clientes.add("Leonardo");
        clientes.add("Julia");
        clientes.add("Maria");
        clientes.add("Fabio");

        System.out.println(clientes.toString());

        System.out.print("Voce dejesa excluir todos os clientes?(s/n): ");
        char res = sc.next().charAt(0);

        if (res == 's') {
            clientes.clear();
            System.out.println("Exclusão feita com sucesso!");
        }

        System.out.println(clientes.toString());
    }
}