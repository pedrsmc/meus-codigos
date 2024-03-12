import java.util.Scanner;

public class Exercicio11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i, sum = 0;

        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
