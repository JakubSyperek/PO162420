public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }


    public String wyswietlInformacje() {
        return nazwa + ", cena: " + cena + ", " + iloscNaMagazynie + " na magazynie";
    }


    public int dodajDoMagazynu(int x){
        return iloscNaMagazynie += x;
    }

    public int usunZMagazynu(int x){
        if(iloscNaMagazynie >= x){
            return iloscNaMagazynie -= x;
        }
        return 0;
    }


}
