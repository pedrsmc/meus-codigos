import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoPersonalizada {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Pedir ao usuário o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        // Criar o array
        int[] array = new int[tamanho];

        // Pedir ao usuário para inserir os elementos do array
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Pedir ao usuário o critério de ordenação
        System.out.println("Escolha o critério de ordenação:");
        System.out.println("1. Ordem crescente");
        System.out.println("2. Ordem decrescente");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Ordenar o array de acordo com o critério escolhido
        switch (opcao) {
            case 1:
                Arrays.sort(array); // Ordenar em ordem crescente
                break;
            case 2:
                Arrays.sort(array); // Ordenar em ordem crescente
                // Inverter o array para ordem decrescente
                for (int i = 0; i < tamanho / 2; i++) {
                    int temp = array[i];
                    array[i] = array[tamanho - 1 - i];
                    array[tamanho - 1 - i] = temp;
                }
                break;
            default:
                System.out.println("Opção inválida. O array não será ordenado.");
        }

        // Exibir o array ordenado
        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
