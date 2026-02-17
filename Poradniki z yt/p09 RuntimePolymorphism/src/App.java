import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        Animal animal; //runtime polymorphism

        System.out.println("chcysz psa czy kota? (1=cat, 2=dog)");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 2:
                animal = new Dog();
                animal.speak();
                break;
            case 1:
                
                animal = new Cat();
                animal.speak();
                break;
        
            default:
                break;
        }


        scanner.close();
    }
}
