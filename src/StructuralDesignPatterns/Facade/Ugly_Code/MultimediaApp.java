package StructuralDesignPatterns.Facade.Ugly_Code;

import java.util.Scanner;

/*Problems with this code:

While this code works, it exposes the complexity of each subsystem.
The MultimediaApp class is tightly coupled to the specific implementations of MusicPlayer, VideoPlayer, ImageViewer.

Why is this a problem?
Tight coupling means that any changes to these classes will directly impact Multimedia App class, making the code:
1. less flexible
2. harder to maintain
3. more complex

Also, adding new media types or changing existing implementations would require significant modifications, leading to :
1. higher risk of bugs
2. increased system complexity

The Scalability issue: Code Reusability & Adaptability
This approach does not promote:
1. Code Reusability
2. Scalability
Everytime a new media type is introduced, Multimedia App class must be updated to accomodate it.

This results in repetitive, error-prone and hard-to-extend code.

Issues discussed in a bit more detail below:
1. Poor Maintainability: Any change in the subsystem behaviour(eg. Videoplayer switching rendering engines) necessitates updates across the client.
   This makes maintenance difficult and error-prone.
2. Lack of scalability: As more subsystems are added, the client becomes bloated with conditional logic.
   This leads to complexity making it harder to manage and scale.
 */
public class MultimediaApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an action: playMusic, playVideo, viewImage");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("playMusic")) {
                MusicPlayer musicPlayer = new MusicPlayer();
                musicPlayer.initializeAudioDrivers();
                musicPlayer.decodeAudio();
                musicPlayer.startPlayback();
            } else if (action.equalsIgnoreCase("playVideo")) {
                VideoPlayer videoPlayer = new VideoPlayer();
                videoPlayer.setupRenderingEngine();
                videoPlayer.loadVideoFile();
                videoPlayer.playVideo();
            } else if (action.equalsIgnoreCase("viewImage")) {
                ImageViewer imageViewer = new ImageViewer();
                imageViewer.loadImageFile();
                imageViewer.applyScaling();
                imageViewer.displayImage();
            } else {
                System.out.println("Invalid action!");
            }
            scanner.close();
        }
}

/*

output :
Choose an action: playMusic, playVideo, viewImage
playMusic
Initializing audio drivers...
Decoding audio file...
Starting audio playback...

*/