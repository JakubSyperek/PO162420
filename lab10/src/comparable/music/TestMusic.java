package comparable.music;

import java.util.Arrays;

public class TestMusic {
    public static void main(String[] args) {
        Music[] musicArray = {
                new Music("Shape of You", "Ed Sheeran", 2017),
                new Music("Bohemian Rhapsody", "Queen", 1975),
                new Music("Blinding Lights", "The Weeknd", 2020),
                new Music("Rolling in the Deep", "Adele", 2010)
        };

        System.out.println("Przed sortowaniem:");
        for (Music m : musicArray) {
            System.out.println(m);
        }

        Arrays.sort(musicArray);
        System.out.println();
        System.out.println("Po sortowaniu (malejąco według roku wydania):");
        for (Music m : musicArray) {
            System.out.println(m);
        }
    }
}
