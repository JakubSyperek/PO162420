import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produkt p1 = new Produkt("Pomidory", 5.20, 100);
        Produkt p2 = new Produkt("Ziemniaki", 4.50, 0);

        System.out.println(p1.wyswietlInformacje());
        System.out.println(p2.wyswietlInformacje());
        System.out.println();
        p1.dodajDoMagazynu(10);
        System.out.println(p1.wyswietlInformacje());
        p1.usunZMagazynu(25);
        System.out.println(p1.wyswietlInformacje());
        System.out.println();
        p2.usunZMagazynu(5);
        System.out.println(p2.wyswietlInformacje());

        ArrayList<String> listaProduktow = new ArrayList<>();
        Produkt produkt1 = new Produkt("Mleko", 4.50, 10);
        Produkt produkt2 = new Produkt("Chleb", 3.20, 15);


    }
}