import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, nota3 = 0;

        // Solicita ao usuário que insira as notas das três provas
        try {
            System.out.print("Insira a nota da primeira prova: ");
            nota1 = scanner.nextDouble();

            System.out.print("Insira a nota da segunda prova: ");
            nota2 = scanner.nextDouble();

            System.out.print("Insira a nota da terceira prova: ");
            nota3 = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira apenas valores numéricos.");
            System.exit(1);
        }

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Determina a classificação do aluno com base na média
        String classificacao;

        if (media >= 7) {
            classificacao = "Aprovado";
        } else if (media >= 5 && media < 7) {
            classificacao = "Em recuperação";
        } else {
            classificacao = "Reprovado";
        }

        // Exibe a média das notas e a classificação correspondente
        System.out.printf("Média das notas: %.1f\n", media);
        System.out.println(classificacao);

        scanner.close();
        
    }
}
