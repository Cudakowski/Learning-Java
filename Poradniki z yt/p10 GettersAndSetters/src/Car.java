public class Car {
    private final String model; //final oznacza turbo niezamianialne nawet seterem
    private String color;
    private int price;

    Car(String model, String color, int price)
    {
        this.color=color;
        this.model=model;
        this.price=price;
    }

    String getModel()
    {
        return this.model;
    }

    String getColor()
    {
        return this.color;
    }

    int getPrce()
    {
        return this.price;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    void setPrice(int price)
    {
        this.price=price;
    }

    //void setModel(String model)
    //{
    //    this.model=model;
    //}
}
