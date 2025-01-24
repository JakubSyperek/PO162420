package comparable.music;

public class Music implements Comparable<Music> {
    private String title;
    private String artist;
    private int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Music other) {
        return Integer.compare(other.releaseYear, this.releaseYear);
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

//Napisz klasę Music, która zawiera pola: title (typu String), artist (typu String)
//i releaseYear (typu int). Zaimplementuj interfejs Comparable w taki sposób, aby
//obiekty klasy Music były sortowane malejąco według roku wydania. Stwórz tablicę 4
//obiektów klasy Music i posortuj ją według sprecyzowanego kryterium.