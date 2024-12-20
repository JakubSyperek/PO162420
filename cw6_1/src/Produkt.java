public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie; // nie może być statyczna

    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }


    public String wyswietlInformacje() {
        return nazwa + ", cena: " + cena + ", " + iloscNaMagazynie + " na magazynie";
    } //powinno być voidem (System.out.println())


    public void dodajDoMagazynu(int x){
        iloscNaMagazynie += x;
    } //powinno być voidem

    public void usunZMagazynu(int x){
        if(iloscNaMagazynie >= x){
            iloscNaMagazynie -= x;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    } //nie powinno być statyczne

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
}
