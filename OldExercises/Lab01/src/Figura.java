public abstract class Figura {

    double pole;
    double obwod;
    String name;

    static int count=0;

    static int pobierzLiczbeWszystkichFigur(){return count;}

    public String toString(){
        return name + ": Pole = "+pole+", Obwód = "+obwod;
    }
}
