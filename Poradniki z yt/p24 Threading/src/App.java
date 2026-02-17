import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Option 1. Extend the Tread class (simpler)
        //Option 2. Implement the RUnnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread  thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();


        System.out.println("You have 5 seconds to enter name");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        



        scanner.close();
    }
}
