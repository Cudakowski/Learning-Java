public class Circle extends Shape{

    double radious;

    Circle(double radious)
    {
        this.radious=radious;
    }

    @Override
    double area()
    {
        return Math.PI * radious * radious;
    }
}
