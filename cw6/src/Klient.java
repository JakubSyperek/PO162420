import java.util.ArrayList;

public class Klient extends Osoba{

    public ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        super(imie, nazwisko);
        this.listaZamowien = listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }


    public void wyswietlHistorieZamowien() {
        System.out.println("Historia zamówień klienta: " + imie + " " + nazwisko);
        for (int i = 0; i < listaZamowien.size(); i++) {
            Zamowienie zamowienie = listaZamowien.get(i);
            System.out.println("Zamówienie " + (i + 1) + ":");
            zamowienie.wyswietlZamowienie();
            System.out.println();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.obliczCalkowitaWartosc();
        }
        return suma;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }
}
