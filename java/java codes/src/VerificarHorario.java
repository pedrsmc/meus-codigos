import java.time.LocalTime;

public class VerificarHorario {
    public static void main(String[] args) {

        // Obtém o horário atual
        LocalTime currentTime = LocalTime.now();

        // Define o horário de almoço
        LocalTime lunchTime = LocalTime.of(12, 0);

        // Verifica se o horário atual é igual , posterior ou anterior ao horário de almoço
        if (currentTime.equals(lunchTime)) {
            System.out.println("É hora do almoço!");
        } else if (currentTime.isAfter(lunchTime)) {
            System.out.println("O horário de almoço já passou.");
        } else {
            System.out.println("O horário de almoço ainda não chegou.");
        }
    }
}
