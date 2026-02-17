public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Rower rower = new Rower();
        Boat boat = new Boat();

        Vehicle[] vehicels = {car, rower, boat}; //polymorphism

        for(Vehicle v : vehicels)
        {
            v.go();
        }
    }
}
