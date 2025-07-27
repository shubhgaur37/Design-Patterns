package StructuralDesignPatterns.Facade.Good_Code.Subsystems;

public class MusicPlayer {

    public void initialiseAudioDrivers(){
        System.out.println("Audio Drivers initialised.");
    }

    public void decodeAudio(){
        System.out.println("Audio Decoded.");
    }

    public void startPlayback(){
        System.out.println("Music Playback started.");
    }
    
}
