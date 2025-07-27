package StructuralDesignPatterns.Facade.Good_Code;

import StructuralDesignPatterns.Facade.Good_Code.Subsystems.*;
import StructuralDesignPatterns.Facade.Ugly_Code.ImageViewer;

public class MediaFacade {
    private MusicPlayer musicPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MediaFacade(){
        this.musicPlayer = new MusicPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }
    // Here also we are using a conditional logic. 
    // But we can make use of other design patterns(which is completely fine) to make it cleaner. Afterall, LLD is all about cleverly coming up with
    // ways to make the code more maintainable, reusable and scalable.

    public void performAction(String action){
        switch(action){
            case "playMusic" : musicPlayer.initialiseAudioDrivers();
                               musicPlayer.decodeAudio();
                               musicPlayer.startPlayback();
                               break;
            case "playVideo" : videoPlayer.setupRenderingEngine();
                               videoPlayer.loadVideoFile();
                               videoPlayer.playVideo();
                               break;
            case "viewImage" : imageViewer.loadImageFile();
                               imageViewer.applyScaling();
                               imageViewer.displayImage();
                               break;
            default:           System.out.println("Invalid Action");
        }
    }
}
