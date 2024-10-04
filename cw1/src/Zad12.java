import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zad12 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss");

        String formattedDate = now.format(date);
        String formattedTime = now.format(time);
        System.out.println("Dzisiaj jest: " + formattedDate + " godzina " + formattedTime);
    }
}
