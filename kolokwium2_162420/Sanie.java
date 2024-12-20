import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> listaR;

    public Sanie(ArrayList<Renifer> listaR) {
        this.listaR = new ArrayList<Renifer>(listaR);
    }

    public void dodajRenifera(Renifer renifer){
        listaR.add(renifer);
    }

    public void usunRenifera(Renifer renifer){
        listaR.add(renifer);
    }

    public int najwolniejszyRenifer(){
        return 0;
    }

    public ArrayList<Renifer> getListaR() {
        return listaR;
    }

    public void setListaR(ArrayList<Renifer> listaR) {
        if(listaR == null){
            throw new NegativeArraySizeException("Brak reniferów");
        }
        this.listaR = listaR;
    }

    @Override
    public String toString() {
        return "Lista reniferów: " + '\'' + listaR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sanie sanie)) return false;
        return Objects.equals(getListaR(), sanie.getListaR());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getListaR());
    }
}
