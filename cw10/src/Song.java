public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}


//Napisz klasę Song z polami title (typu String), artist (typu String) oraz duration
//(typu int). Zaimplementuj dwie klasy implementujące generyczny interfejs Comparator:
//DurationComparator do porównywania obiektów po polu duration (od najkrótszej do
//najdłuższej piosenki) oraz ArtistTitleComparator do porównywania obiektów po polu
//artist (alfabetycznie od A do Z) i w przypadku równości po polu title. Stwórz tablicę
//5 obiektów klasy Song i posortuj ją zgodnie z oboma kryteriami (najpierw po długości
//utworu,a przy równości po artyście i tytule).