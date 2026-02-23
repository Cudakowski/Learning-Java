public class Trojkat extends Figura{
    static int countT;

    Trojkat(double a, double b, double c){
        count++;
        countT++;
        name="Trojkat";
        obwod=a+b+c;
        pole=Math.sqrt(obwod*0.5*(obwod*0.5-a)*(obwod*0.5-b)*(obwod*0.5-c));
    }

    static int pobierzLiczbeTrojkatow(){return countT;}
}
