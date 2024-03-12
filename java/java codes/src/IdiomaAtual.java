import java.util.Locale;

public class IdiomaAtual {
    public static void main(String[] args) {
        Locale language = Locale.getDefault();

        System.out.println("O idioma atual do computador é: " + language.getDisplayName());
    }
}
