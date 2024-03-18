import java.util.ArrayList;
import java.util.Scanner;

public class VerificacaoCliente {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Criando lista.
        ArrayList<String> clientes = new ArrayList<>();

        clientes.add("Pedro");
        clientes.add("Leonardo");
        clientes.add("Julia");
        clientes.add("Maria");
        clientes.add("Fabio");

        //Solicitando ao usuario o nome do cliente
        System.out.print("Digite o nome do cliente para verificar se ele está na lista: ");
        String nome = sc.nextLine();

        //Verificando se o nome esta na lista
        if(clientes.contains(nome)) {
            System.out.println(nome + " está na lista.");
        } else {
            System.out.println(nome + " não está na lista.");
        }
    }
}
