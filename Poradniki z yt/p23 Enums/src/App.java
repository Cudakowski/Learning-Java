import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj dzien tygodnia po angielsku: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            System.out.println(day);

            System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIFAY -> System.out.println("dzien roboczy");
                case SATURDAY,
                    SUNDAY -> System.out.println("dzien nie roboczy");  
            }
        } catch (IllegalArgumentException e) {
            System.out.println("podaj valid dzien");
        }


        

        scanner.close();
    }
}
