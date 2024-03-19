import java.util.Scanner;

public class JuntarDoisArrays {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Pedir ao usuário o tamanho do primeiro array
        System.out.print("Digite o tamanho do primeiro array: ");
        int tamanho1 = scanner.nextInt();

        // Criar o primeiro array
        int[] array1 = new int[tamanho1];
        // Pedir ao usuário para inserir os elementos do primeiro array
        System.out.println("Digite os elementos do primeiro array:");
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Pedir ao usuário o tamanho do segundo array
        System.out.print("Digite o tamanho do segundo array: ");
        int tamanho2 = scanner.nextInt();

        // Criar o segundo array
        int[] array2 = new int[tamanho2];

        // Pedir ao usuário para inserir os elementos do segundo array
        System.out.println("Digite os elementos do segundo array:");
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Criar o array resultante com o tamanho da soma dos tamanhos dos arrays
        int[] novoArray = new int[tamanho1 + tamanho2];

        // Copiar os elementos do primeiro array para o array resultante
        for (int i = 0; i < tamanho1; i++) {
            novoArray[i] = array1[i];
        }

        // Copiar os elementos do segundo array para o array resultante
        for (int i = 0; i < tamanho2; i++) {
            novoArray[tamanho1 + i] = array2[i];
        }

        // Exibir o array resultante
        System.out.println("Array resultante da fusão:");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
