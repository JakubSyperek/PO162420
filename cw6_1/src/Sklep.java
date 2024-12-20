import java.util.ArrayList;

public class Sklep extends Produkt{
    public ArrayList<Produkt> produkty;

    public Sklep(String nazwa, double cena, int iloscNaMagazynie, ArrayList<Produkt> produkty) {
        super(nazwa, cena, iloscNaMagazynie);
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt produkt){
        //Produkt produktSklep = new Produkt(produkt.nazwa, produkt.cena, produkt.iloscNaMagazynie);
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
}
