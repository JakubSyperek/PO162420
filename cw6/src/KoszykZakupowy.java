import java.util.ArrayList;

class KoszykZakupowy extends Produkt {
    public ArrayList<Produkt> lista;

    public KoszykZakupowy(String nazwa, double cena, int iloscNaMagazynie, ArrayList<String> lista){
        super(nazwa, cena, iloscNaMagazynie);
        this.lista = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc){
        if(Produkt.iloscNaMagazynie >= ilosc){
            iloscNaMagazynie -= ilosc;
            Produkt produktDoKoszyka = new Produkt(produkt.nazwa, produkt.cena, ilosc);
            lista.add(produktDoKoszyka);
        } else{
            System.out.println("Za mała ilosc produktow na magazynie.");
        }
    }



    public void wyswietlZawartoscKoszyka(){
        for(Produkt produkt : lista){
            System.out.println("Produkt: " + produkt.nazwa + ", "+  produkt.cena + ", " + iloscNaMagazynie);
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for(Produkt produkt : lista){
            suma += produkt.cena * iloscNaMagazynie;
        }
        return suma;
    }

    public ArrayList<Produkt> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produkt> lista) {
        this.lista = lista;
    }
}
