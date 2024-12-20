import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera(){
        predkosc += 5;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null)
            throw new NullPointerException("Pole imię jest puste");
        this.imie = imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc < 0)
            throw new IllegalArgumentException("Pole predkosc jest puste");
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return imie + '\'' + "Prędkość: " + predkosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renifer renifer)) return false;
        return getPredkosc() == renifer.getPredkosc() && Objects.equals(getImie(), renifer.getImie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getPredkosc());
    }
}
