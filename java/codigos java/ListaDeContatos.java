import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeContatos {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();
        
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    String numero = scanner.nextLine();
                    
                    nomes.add(nome);
                    numeros.add(numero);
                    
                    System.out.println("Contato cadastrado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("Lista de contatos:");
                        
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". Nome: " + nomes.get(i) + " - Número: " + numeros.get(i));
                        }
                    }
                    break;

                case 3:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado para excluir.");
                    } else {
                        System.out.println("Lista de contatos:");
                        
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". Nome: " + nomes.get(i) + " - Número: " + numeros.get(i));
                        }

                        System.out.print("Digite o número do contato que deseja excluir: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 1 && indice <= nomes.size()) {
                            nomes.remove(indice - 1);
                            numeros.remove(indice - 1);

                            System.out.println("Contato removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
