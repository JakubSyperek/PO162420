import java.util.ArrayList;

class KoszykZakupowy {
    private ArrayList<Produkt> lista;

    public KoszykZakupowy(ArrayList<Produkt> lista){
        this.lista = new ArrayList<Produkt>(lista);
    }

    public void dodajProdukt(Produkt produkt){
        if(produkt.getIloscNaMagazynie()>0){
            lista.add(produkt);
            produkt.setIloscNaMagazynie(produkt.getIloscNaMagazynie()-1);
        }
    }

    public void wyswietlZawartoscKoszyka(){
        for(Produkt produkt : lista){
            System.out.println("Produkt: " + produkt.getNazwa() + ", "+  produkt.getCena() + ", " + produkt.getIloscNaMagazynie());
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for(Produkt produkt : lista){
            suma += produkt.getCena();
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

