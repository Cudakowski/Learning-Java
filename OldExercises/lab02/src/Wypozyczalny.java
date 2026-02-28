public interface Wypozyczalny {
    boolean czyDostepny();
    double obliczKosztWypozyczenia(int x);
    void zwroc();
    void wypozycz();
}
