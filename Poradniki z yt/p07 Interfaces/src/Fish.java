public class Fish implements Predator,Prey{

    @Override
    public void flee() {
        System.out.println("rypa ucika");
    }

    @Override
    public void hunt() {
        System.out.println("rypa akatuje!");
    }
}
