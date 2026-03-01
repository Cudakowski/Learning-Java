public abstract class ProduktMuzyczny implements Sprzedawalny{

    String name;
    int iloscSztuk;
    double cenaBazowa;

    @Override
    public void zmniejszIloscSztuk(int x) {
        iloscSztuk-=x;
    }

    @Override
    public int getIloscSztuk() {
        return iloscSztuk;
    }

    @Override
    abstract public double obliczCene();
}
