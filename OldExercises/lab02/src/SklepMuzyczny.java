public class SklepMuzyczny {
    ProduktMuzyczny[] tab;
    int count;

    SklepMuzyczny(int x){
        tab = new ProduktMuzyczny[x];
        count = 0;
    }


//Zwrócono: Instrument: Gitara Elektryczna, Marka: Fender, Rodzaj: Gitara, elektryczny, Cena: 2500,00 zł, Stawka dzienna: 50,00 zł, Dostępny
    void zwrocInstrument(InstrumentDoWypozyczenia ins){
        if(!ins.czyDostepny()){
            ins.zwroc();
            System.out.println("Zwrócono: "+ins.getInfo());
        }
        else{
            System.out.println("Błąd: Instrument nie jest niedostępny do wypożyczenia");
        }
    }

    void dodajProdukt(ProduktMuzyczny prod){
        tab[count]=prod;
        count++;
    }


//Sprzedano: Instrument: Gitara Klasyczna, Marka: Yamaha, Rodzaj: Gitara, akustyczny, Cena: 1380,00 zł
    void sprzedajProdukt(int id, int ilosc){
        System.out.println("Sprzedano: "+tab[id].getInfo());
        tab[id].zmniejszIloscSztuk(ilosc);
    }

    void wyswietlWszystkieProdukty(){
        for( int i=0;i<count;i++){
            System.out.println(tab[i].getInfo());
        }
    }

//Wypożyczono: Instrument: Gitara Elektryczna, Marka: Fender, Rodzaj: Gitara, elektryczny, Cena: 2500,00 zł, Stawka dzienna: 50,00 zł, Niedostępny
//Koszt wypożyczenia na 14 dni: 630.0 zł
    void wypozyczInstrument(InstrumentDoWypozyczenia ins, int x){
        if(ins.czyDostepny()){
            ins.wypozycz();
            System.out.println("Wypożyczono: "+ins.getInfo());
            System.out.println("Koszt wypożyczenia na "+x+" dni: "+ins.obliczKosztWypozyczenia(x)+" zł");
        }
        else{
            System.out.println("Błąd: Instrument nie jest dostępny do wypożyczenia");
        }
        
    }
}
