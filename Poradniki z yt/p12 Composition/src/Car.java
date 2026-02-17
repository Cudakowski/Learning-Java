public class Car {
    String model;
    Engine engine;
    


    Car(String model,String engineType)
    {
        this.model=model;
        this.engine=new Engine(engineType);
    }

    void start()
    {
        this.engine.start();
        System.out.println("szjasochud "+this.model+" dziaa");
    }
}
