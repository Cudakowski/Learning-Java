public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("bobek","trybek");
        System.out.println(car.model);
        System.out.println(car.engine.type);

        car.start(); //róznica między agregacją a kompozycją jest taka, 
                     // że przy compozycji kiedy usuniemy jedną klasę druga też zostajwe usunięta, a przy agregacji nie
    }
}
