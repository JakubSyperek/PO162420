import java.util.ArrayList;

public class Zamowienie extends KoszykZakupowy {
    public String statusZamowienia;

    public Zamowienie(String nazwa, double cena, int iloscNaMagazynie, ArrayList<String> lista, String statusZamowienia) {
        super(nazwa, cena, iloscNaMagazynie, lista);
        this.statusZamowienia = statusZamowienia;
    }

    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
    }

    public void wyswietlZamowienie() {
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Zawartość koszyka:");
        wyswietlZawartoscKoszyka();
        System.out.println("Całkowita wartość: " + obliczCalkowitaWartosc() + " PLN");
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
}
