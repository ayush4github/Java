import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDateTime {
    public static void main(String[] args) {
        LocalDateTime DateTimeNow = LocalDateTime.now();
        System.out.println("Before formatting: "+ DateTimeNow);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = DateTimeNow.format(myFormatter);
        System.out.println("After formatting: "+formattedDateTime);
        }
}
