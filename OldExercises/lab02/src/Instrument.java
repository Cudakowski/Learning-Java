public class Instrument extends ProduktMuzyczny{

    boolean czyAkustyczny;
    String marka;
    String rodzaj;

    Instrument(String name, double cenaBazowa, int iloscSztuk,
               String rodzaj, String marka, boolean czyAkustyczny){
        this.name=name;
        this.iloscSztuk=iloscSztuk;
        this.cenaBazowa=cenaBazowa;
        this.marka=marka;
        this.rodzaj=rodzaj;
        this.czyAkustyczny=czyAkustyczny;
    }

    @Override
    public String getInfo() {
        return "Instrument: "+name+", Marka: "+marka+", Rodzaj: "+rodzaj+", "+(czyAkustyczny?"akustyczny":"elektryczny")+", Cena: "+String.format("%.2f", obliczCene())+" zł";
    }
    
    public double obliczCene() {
       // Instrumenty akustyczne są droższe o 15%
       return czyAkustyczny ? cenaBazowa * 1.15 : cenaBazowa;
    }
}
