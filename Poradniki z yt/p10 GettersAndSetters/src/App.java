public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("budzioch","niebieskowawy",1500);

        //System.out.println(car.color);//nie dziala
        System.out.println(car.getColor());
        car.setColor("czarnoczarny");
        System.out.println(car.getColor());
        
    }
}
