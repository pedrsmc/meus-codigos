import java.util.ArrayList;
import java.util.Scanner;

public class ContarArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pedro");
        clientes.add("Leonardo");
        clientes.add("Julia");
        clientes.add("Maria");
        clientes.add("Fabio");

        System.out.println(clientes.toString());

        System.out.println("Quantidade de clientes cadastrados: " + clientes.size());
    }
}
