public class Akcesorium extends ProduktMuzyczny{

    boolean czyProfesjonalne;
    String rodzaj;

    Akcesorium(String name, double cenaBazowa, int iloscSztuk,
               String rodzaj, boolean czyProfesjonalne){
        this.name=name;
        this.iloscSztuk=iloscSztuk;
        this.cenaBazowa=cenaBazowa;
        this.rodzaj=rodzaj;
    }
    
    public double obliczCene() {
       // Profesjonalne akcesoria są droższe o 25%
       return czyProfesjonalne ? cenaBazowa * 1.25 : cenaBazowa;
    }

    @Override
    public String getInfo() {
        return "Akcesorium: "+name+", Kategoria: "+rodzaj+", "+(czyProfesjonalne?"profesjonalne":"amatorskie")+", Cena: "+String.format ("%.2f", obliczCene())+" zł";
    }
}
