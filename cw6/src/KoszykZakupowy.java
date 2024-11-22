import java.lang.reflect.Array;
import java.util.ArrayList;

class KoszykZakupowy extends Produkt {
    private ArrayList<String> lista = new ArrayList<String>();

    public KoszykZakupowy(String nazwa, double cena, int iloscNaMagazynie, ArrayList<String> lista){
        super(nazwa, cena, iloscNaMagazynie);
        this.lista = lista;
    }

    public void dodajZamowienie(ArrayList<String> lista){
        //lista.add();
    }
}
