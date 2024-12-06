import java.util.ArrayList;

public final class KlientFirmowy extends Klient{
    public static final String NIP = "123468261";
    public static final String REGON = "10121231238";

    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        super(imie, nazwisko, listaZamowien);
    }


}
