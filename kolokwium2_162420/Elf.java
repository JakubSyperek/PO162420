import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko + ".");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null)
            throw new NullPointerException("Pole imię jest puste");
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek < 0)
            throw new IllegalArgumentException("Pole wiek jest puste");
        this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko == null)
            throw new NullPointerException("Pole stanowisko jest puste");
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return imie + ", " + wiek + ", " + stanowisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elf elf)) return false;
        return getWiek() == elf.getWiek() && Objects.equals(getImie(), elf.getImie()) && Objects.equals(getStanowisko(), elf.getStanowisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getWiek(), getStanowisko());
    }
}
