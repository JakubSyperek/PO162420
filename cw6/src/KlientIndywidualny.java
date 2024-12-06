import java.util.ArrayList;

public final class KlientIndywidualny extends Klient{

    public static final String PESEL = "01283003636";

    public KlientIndywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        super(imie, nazwisko, listaZamowien);
    }


}
