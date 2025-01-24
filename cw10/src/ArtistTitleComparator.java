import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        int artistComparison = s1.getArtist().compareToIgnoreCase(s2.getArtist());
        if (artistComparison == 0) {
            return s1.getTitle().compareToIgnoreCase(s2.getTitle());
        }
        return artistComparison;
    }
}