public class Kolo extends Figura{

    static int countK=0;

    Kolo(double promien){
        count++;
        countK++;
        name="Kolo";
        obwod=promien*2*Math.PI;
        pole=promien*promien*Math.PI;
    }

    static int pobierzLiczbeKol(){return countK;}
}
