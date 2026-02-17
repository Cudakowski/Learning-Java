import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //LocalDate, LocalTime, LocalDateTime, UTC timestamp
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        //CUstom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate date2 = LocalDate.of(2024,12,25);
        System.out.println(date2);

        LocalDateTime dateTime2 = LocalDateTime.of(2024,12,25,12,0,0);
        System.out.println(dateTime2);

        LocalDateTime dateTime3 = LocalDateTime.of(2025,11,1,0,0,0);
        System.out.println(dateTime3);

        if(dateTime2.isBefore(dateTime3))
        {
            System.out.println(dateTime2 + " wczesniej niz " + dateTime3);
        }
        else if(dateTime2.isAfter(dateTime3))
        {
            System.out.println(dateTime2 + " pozniej niz " + dateTime3);
        }
        else if(dateTime2.isEqual(dateTime3))
        {
            System.out.println(dateTime2 + " rowno z " + dateTime3);
        }
    }
}
