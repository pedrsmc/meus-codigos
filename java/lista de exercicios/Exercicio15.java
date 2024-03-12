public class Exercicio15 {

    public static void main(String[] args) {
        int linesNumber = 5;

        for (int i = 1; i <= linesNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
