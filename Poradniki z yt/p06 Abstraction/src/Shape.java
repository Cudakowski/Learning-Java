public abstract class Shape { //cant be instantiated
    abstract double area(); //abstract, musi byc potem implementacja

    void display(){ //concrete, juz jest implementacja i dalej jest inheritance zwykłe
        System.out.println("To je ten tego");
    }
}
