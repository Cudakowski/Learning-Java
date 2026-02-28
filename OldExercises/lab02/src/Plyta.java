public class Plyta extends ProduktMuzyczny{
    int rokWydania;

    Plyta(String tytul, double cenaBazowa, int iloscSztuk,
          String autor, int rokWydania, String gatunek){

    }

    public double obliczCene() {
        // Nowsze płyty (ostatnie 5 lat) są droższe o 10%
        int aktualnyRok = 2025;
        return (aktualnyRok - rokWydania <= 5) ? cenaBazowa * 1.1 : cenaBazowa;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}
