public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 =new Dog();
        Dog dog2 =new Dog(){
            @Override
            void speak() {
                System.out.println("mraumrau");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
