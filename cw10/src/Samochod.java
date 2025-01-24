public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", cena=" + cena +
                '}';
    }
}

//Napisz klasę Samochod z polami marka (String), rokProdukcji (int) i cena (double).
//Napisz klasę implementującą interfejs Comparator, która porównuje samochody na podstawie
//roku produkcji. Stwórz tablicę 5 samochodów i posortuj ją według roku produkcji.