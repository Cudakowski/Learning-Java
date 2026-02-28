public class InstrumentDoWypozyczenia extends Instrument implements Wypozyczalny {

    InstrumentDoWypozyczenia(String name, double cenaBazowa, int iloscSztuk, String rodzaj, String marka, boolean k, double l){
        Instrument()
    }

    @Override
    public boolean czyDostepny() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double obliczKosztWypozyczenia(int x) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void zwroc() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void wypozycz() {
        // TODO Auto-generated method stub
        
    }

    
    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo();
    }

}
