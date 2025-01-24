import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Samochod[] samochody = {
                new Samochod("Toyota", 2015, 45000.0),
                new Samochod("BMW", 2012, 55000.0),
                new Samochod("Audi", 2018, 60000.0),
                new Samochod("Ford", 2010, 30000.0),
                new Samochod("Mazda", 2020, 70000.0)
        };

        Arrays.sort(samochody, new RokProdukcjiComparator());

        for (Samochod samochod : samochody) {
            System.out.println(samochod);
        }


        Song[] songs = {
                new Song("Shape of You", "Ed Sheeran", 233),
                new Song("Blinding Lights", "The Weeknd", 233),
                new Song("Someone Like You", "Adele", 228),
                new Song("Perfect", "Ed Sheeran", 228),
                new Song("Rolling in the Deep", "Adele", 233)
        };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for (Song song : songs) {
            System.out.println(song);
        }

    }
}