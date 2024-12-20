import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> listaE;
    private double dlGeo;
    private double szGeo;

    public Fabryka(ArrayList<Elf> listaE, double dlGeo, double szGeo) {
        this.listaE = new ArrayList<Elf>(listaE);
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf){
        listaE.add(elf);
    }

    public void usunPracownika(Elf elf){
        listaE.remove(elf);
    }

    public int najstarszyPracownik(){
        int naj = 0;
        for(Elf elf : listaE){
            if(naj < elf.getWiek()){
                naj = elf.getWiek();
            }
        }
        return naj; 
    }

    public ArrayList<Elf> getListaE() {
        return listaE;
    }

    public void setListaE(ArrayList<Elf> listaE) {
        if(listaE == null){
            throw new NegativeArraySizeException("Brak elfów");
        }
        this.listaE = listaE;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo > 180 || dlGeo < -180)
            throw new IllegalArgumentException("Błędne współrzędne");
        this.dlGeo = dlGeo;
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double szGeo) {
        if(szGeo > 90 || szGeo < -90)
            throw new IllegalArgumentException("Błędne współrzędne");
        this.szGeo = szGeo;
    }

    @Override
    public String toString() {
        return listaE + ", długość = " + dlGeo + ", szerokość = " + szGeo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabryka fabryka)) return false;
        return Double.compare(getDlGeo(), fabryka.getDlGeo()) == 0 && Double.compare(getSzGeo(), fabryka.getSzGeo()) == 0 && Objects.equals(getListaE(), fabryka.getListaE());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListaE(), getDlGeo(), getSzGeo());
    }
}
