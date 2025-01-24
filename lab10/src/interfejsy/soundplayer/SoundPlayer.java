package interfejsy.soundplayer;

public interface SoundPlayer {
    void playSound();

    default void stopSound() {
        System.out.println("Sound Stopped");
    }

    static String getDeviceType() {
        return "Sound Device";
    }
}

//Stwórz interfejs SoundPlayer z:
//• Metodą abstrakcyjną playSound().
//• Metodą domyślną stopSound() wyświetlającą informację “Sound Stopped”.
//• Metodą statyczną getDeviceType() zwracającą String “Sound Device”.
//Stwórz klasy MusicPlayer i Radio, które implementują SoundPlayer. playSound() w
//MusicPlayer powinno wyświetlać “Playing Music”, a w Radio - “Playing Radio”. Stwórz
//klasę testującą SoundTester. Utwórz obiekty MusicPlayer i Radio, wywołaj dla nich
//playSound() i stopSound(), oraz statycznie SoundPlayer.getDeviceType().