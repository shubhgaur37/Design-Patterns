package StructuralDesignPatterns.Facade.Good_Code;

import java.util.Scanner;

// Advantages of using this pattern:
/*
1. Simplified Interface: The facade provides a clean, unified interface to interact with the subsystems, hiding their complexities.
2. Decoupling: The client is decoupled from the subsystem implementations, making the system easier to maintain and extend.
3. Scalability: Adding new subsystems or modifying existing ones only require changes in the facade and not in the client.
4. Flexibility: The facade centralizes the interaction logic, enabling changes to subsystem communication without affecting the client.
 */
public class MultimediaApp {
    public static void main(String[] args) {
        MediaFacade mediaFacade = new MediaFacade();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multimedia App!");
        System.out.println("Choose an action: playMusic, playVideo, viewImage");
        String action = scanner.nextLine();
        mediaFacade.performAction(action);
        scanner.close();
    }
}

/*

Welcome to Multimedia App!
Choose an action: playMusic, playVideo, viewImage
playVideo
Rendering engine set up.
Video file loaded.
Video playback started.

*/