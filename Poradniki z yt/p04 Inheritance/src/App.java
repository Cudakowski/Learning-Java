public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.eat();
        dog.eat();

        cat.speak();
        dog.speak();

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
    }
}
