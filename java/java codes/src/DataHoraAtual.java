import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraAtual {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dateTimeformatted = currentDateTime.format(format);

        System.out.println("Data e hora atual: " + dateTimeformatted);
    }
}