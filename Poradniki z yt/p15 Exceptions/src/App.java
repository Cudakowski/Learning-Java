import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        // try {

        //     System.out.println(1/0);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("NIE DZIEL PRZEZ ZEROOO");
        // }

        // Scanner scanner = new Scanner(System.in);

        // try {
        //     System.out.print("dyj number: ");
        //     int number = scanner.nextInt();
        //     System.out.println(number);
        // } catch(ArithmeticException e){
        //     System.out.println("NIE DZIEL PRZEZ ZEROOO");
        // } catch(InputMismatchException e){
        //     System.out.println("TO NIE NUMER");
        // } catch(Exception e)
        // { //safety net
        //     System.out.println("COS NIE DZIAA");
        // }
        // finally{
        //     scanner.close();
        //     System.out.println("thsi always executes");
        // }

         

        try(Scanner scanner = new Scanner(System.in);) {
            System.out.print("dyj number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch(ArithmeticException e){
            System.out.println("NIE DZIEL PRZEZ ZEROOO");
        } catch(InputMismatchException e){
            System.out.println("TO NIE NUMER");
        } catch(Exception e)
        { //safety net
            System.out.println("COS NIE DZIAA");
        }
        finally{
            //scanner.close();
            System.out.println("thsi always executes");
        }

        
    }
}
