import java.util.ArrayList;
import java.util.Objects;

public class FantasyBook extends Book{
    private String fantasySubgenre;

    public FantasyBook(String title, String author, String fantasySubgenre) {
        super(title, author);
        this.fantasySubgenre = fantasySubgenre;
    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return "FantasyBook{" +
                "fantasySubgenre='" + fantasySubgenre + '\''  +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", reviews=" + getReviews() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FantasyBook that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getFantasySubgenre(), that.getFantasySubgenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFantasySubgenre());
    }
}

//Utwórz klasę Book z polami title, author oraz reviews (jako tablica z elementami typu
//double). Dodaj metody pozwalające na dodawanie i usuwanie recenzji. Utwórz klasę
//FantasyBook, która dziedziczy po klasie Book. Klasa FantasyBook powinna mieć dodatkowe
//pole fantasySubgenre. Dodaj konstruktory, metody gettery i settery, metodę
//toString(), equals() oraz hashCode() dla każdej z klas. Napisz program testujący
//zdefiniowane klasy i metody.