import java.util.Scanner;

public class ConversorDeUnidades {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Metros para Centímetros");
        System.out.println("3. Quilômetros para Milhas");
        System.out.println("4. Litros para Mililitros");
        
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(celsius);
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;
            case 2:
                System.out.print("Digite a distância em metros: ");
                double metros = scanner.nextDouble();
                double centimetros = metrosParaCentimetros(metros);
                System.out.println("A distância em centímetros é: " + centimetros);
                break;
            case 3:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometros = scanner.nextDouble();
                double milhas = quilometrosParaMilhas(quilometros);
                System.out.println("A distância em milhas é: " + milhas);
                break;
            case 4:
                System.out.print("Digite o volume em litros: ");
                double litros = scanner.nextDouble();
                double mililitros = litrosParaMililitros(litros);
                System.out.println("O volume em mililitros é: " + mililitros);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }
    
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }
    
    public static double litrosParaMililitros(double litros) {
        return litros * 1000;
    }
}
