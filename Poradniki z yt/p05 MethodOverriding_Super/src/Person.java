public class Person {
    String name;

    String wiedza;

    Person(String name)
    {
        this.name=name;
        this.wiedza="JAKTO";
    }

    void showName()
    {
        System.out.println(this.name);
    }

    @Override
    public String toString(){
        return name+" Posiadana wiedza: "+wiedza;
    }
}
