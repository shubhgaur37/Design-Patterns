package StructuralDesignPatterns.Facade.Good_Code.Subsystems;

public class VideoPlayer {
    public void setupRenderingEngine(){
        System.out.println("Rendering engine set up.");
    }

    public void loadVideoFile(){
        System.out.println("Video File Loaded.");
    }

    public void playVideo(){
        System.out.println("Video playback started.");
    }
}
