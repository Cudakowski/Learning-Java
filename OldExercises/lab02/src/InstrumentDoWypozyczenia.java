public class InstrumentDoWypozyczenia extends Instrument implements Wypozyczalny {

    double dziennaStawka;
    boolean dostepny;
    

    InstrumentDoWypozyczenia(String name, double cenaBazowa, int iloscSztuk, String rodzaj, String marka, boolean czyAkustyczny, double dziennaStawka){
        super(name, cenaBazowa, iloscSztuk, rodzaj, marka, czyAkustyczny);
        this.dziennaStawka=dziennaStawka;
        this.dostepny=true;
    }

    @Override
    public boolean czyDostepny() {
        return dostepny;
    }

    @Override
    public double obliczKosztWypozyczenia(int liczbaDni) {
        // Zniżka przy dłuższym okresie wypożyczenia
        if (liczbaDni > 30) {
            return liczbaDni * dziennaStawka * 0.8; // 20% zniżki
        } else if (liczbaDni > 7) {
            return liczbaDni * dziennaStawka * 0.9; // 10% zniżki
        }
        return liczbaDni * dziennaStawka;
    }

    @Override
    public void zwroc() {
        dostepny=true;
        
    }

    @Override
    public void wypozycz() {
        dostepny=false;
        
    }
//Wypożyczono: Instrument: Gitara Elektryczna, Marka: Fender, Rodzaj: Gitara, elektryczny, Cena: 2500,00 zł, Stawka dzienna: 50,00 zł, Niedostępny
//Koszt wypożyczenia na 14 dni: 630.0 zł

    

//Instrument: Gitara Elektryczna, Marka: Fender, Rodzaj: Gitara, elektryczny, Cena: 2500,00 zł, Stawka dzienna: 50,00 zł, Dostępny
    @Override
    public String getInfo() {
        return super.getInfo() + ", Stawka dzienna: "+String.format ("%.2f", dziennaStawka)+" zł, "+ (czyDostepny()?"Dostępny":"Niedostępny");
    }

}
