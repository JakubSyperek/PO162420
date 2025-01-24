package comparable.movie;

public class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.title.length(), other.title.length());
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', director='" + director + "', genre='" + genre + "'}";
    }
}

//Napisz klasę Movie, która zawiera pola: title (typu String), director (typu String)
//i genre (typu String). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty
//klasy Movie były sortowane według jednego kryterium: rosnąco według długości tytułu.
//Stwórz listę tablicową 4 obiektów klasy Movie i posortuj ją według sprecyzowanego kryterium.