public class Produkt {
    public String nazwa;
    public double cena;
    public static int iloscNaMagazynie;

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

    public static int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public static void setIloscNaMagazynie(int iloscNaMagazynie) {
        Produkt.iloscNaMagazynie = iloscNaMagazynie;
    }
}
