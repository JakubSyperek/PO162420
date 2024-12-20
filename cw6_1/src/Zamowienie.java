import java.util.ArrayList;

public class Zamowienie  {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;


    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
    }

    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
    }

    public void wyswietlZamowienie() {
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Zawartość koszyka:");
        koszykZakupowy.wyswietlZawartoscKoszyka();

    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }
}

