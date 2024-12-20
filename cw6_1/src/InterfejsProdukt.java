public interface InterfejsProdukt {
    void wyswietlInformacje();
    void dodajDoMagazynu(int x);
    void usunZMagazynu(int x);
    String getNazwa();
    void setNazwa(String nazwa);
    double getCena();
    void setCena(double cena);
    int getIloscNaMagazynie();
    void setIloscNaMagazynie(int iloscNaMagazynie);
}
