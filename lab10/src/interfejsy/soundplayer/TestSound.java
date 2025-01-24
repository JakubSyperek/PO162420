package interfejsy.soundplayer;

public class TestSound {
    public static void main(String[] args) {
        SoundPlayer musicPlayer = new MusicPlayer();
        System.out.println("MusicPlayer:");
        musicPlayer.playSound();
        musicPlayer.stopSound();

        SoundPlayer radio = new Radio();
        System.out.println("\nRadio:");
        radio.playSound();
        radio.stopSound();

        System.out.println("\nDevice Type: " + SoundPlayer.getDeviceType());
    }
}
