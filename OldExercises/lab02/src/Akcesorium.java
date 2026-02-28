public class Akcesorium extends ProduktMuzyczny{

    Akcesorium(String name, double cenaBazowa, int iloscSztuk,
               String rodzaj, boolean k){

    }
    
    public double obliczCene() {
       // Profesjonalne akcesoria są droższe o 25%
       return czyProfesjonalne ? cenaBazowa * 1.25 : cenaBazowa;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}
