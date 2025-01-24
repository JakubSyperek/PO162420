package comparable.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMovie {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Incepcja", "Christopher Nolan", "Sci-Fi"));
        movies.add(new Movie("The Matrix", "The Wachowskis", "Sci-Fi"));
        movies.add(new Movie("Avatar", "James Cameron", "Akcja"));
        movies.add(new Movie("Ojciec chrzestny", "Francis Ford Coppola", "Gangsterski"));

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
