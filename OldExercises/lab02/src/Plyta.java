public class Plyta extends ProduktMuzyczny{
    int rokWydania;
    String autor;
    String gatunek;

    Plyta(String name, double cenaBazowa, int iloscSztuk,
          String autor, int rokWydania, String gatunek){
        this.name=name;
        this.iloscSztuk=iloscSztuk;
        this.cenaBazowa=cenaBazowa;
        this.autor=autor;
        this.gatunek=gatunek;
        this.rokWydania=rokWydania;
    }

    public double obliczCene() {
        // Nowsze płyty (ostatnie 5 lat) są droższe o 10%
        int aktualnyRok = 2025;
        return (aktualnyRok - rokWydania <= 5) ? cenaBazowa * 1.1 : cenaBazowa;
    }

    @Override
    public String getInfo() {
        return "Płyta: "+name+", Wykonawca: "+autor+", Rok: "+rokWydania+", Gatunek: "+gatunek+", Cena: "+String.format ("%.2f", obliczCene())+" zł";
    }
}
