public class Instrument extends ProduktMuzyczny{

    Instrument(String nazwa, double cenaBazowa, int iloscSztuk,
               String rodzaj, String marka, boolean k){

    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public double obliczCene() {
       // Instrumenty akustyczne są droższe o 15%
       return czyAkustyczny ? cenaBazowa * 1.15 : cenaBazowa;
    }
}
