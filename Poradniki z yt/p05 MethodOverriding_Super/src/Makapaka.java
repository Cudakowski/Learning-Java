public class Makapaka extends Person{
    int kamienie = 100;

    Makapaka(String name, int kamienie)
    {
        super(name);
        this.kamienie=kamienie;
    }

    @Override
    void showName()
    {
        System.out.println("MAKAPAKA: "+this.name);
    }
}
