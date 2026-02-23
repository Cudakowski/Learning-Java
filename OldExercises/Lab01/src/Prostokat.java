public class Prostokat extends Figura{

    static int countP=0;

    Prostokat(double a, double b){
        count++;
        countP++;
        name="Prostokat";
        pole=a*b;
        obwod=2*(a+b);
    }

    static int pobierzLiczbeProstokatow(){return countP;}
}
