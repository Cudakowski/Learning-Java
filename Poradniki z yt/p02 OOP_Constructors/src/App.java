public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car car = new Car();

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.isGaugan);

        System.out.println(car.isGaugan);
        car.gaugan();
        System.out.println(car.isGaugan);
        car.notgaugan();
        System.out.println(car.isGaugan);


    }
}
