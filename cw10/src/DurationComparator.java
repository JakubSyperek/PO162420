import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {

        return Integer.compare(s1.getDuration(), s2.getDuration());
    }
}