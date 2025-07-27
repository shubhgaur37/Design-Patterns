package BehavioralDesignPatterns.Iterator.Ugly_Code;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    public Playlist() {
        songs = new ArrayList<>();
    }
    public void addSong(String song) {
        songs.add(song);
    }
    public void playPlaylist(boolean shuffle) {
        if (shuffle) {
            // Shuffle the songs and then play
            System.out.println("Shuffling playlist...");
            // Shuffle logic here...
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println("Playing song: " + songs.get(i));
            }
        }
    }
}

// Problems with this approach:
// 1. Hard to Maintain: As we add more features(eg. shuffle, filter), the code becomes cluttered due to multiple if else statements
// 2. Tightly Coupled: Any change in iteration logic requires modifying the playPlaylist() method.
// 3. Not Scalable: Adding more features means rewriting existing logic.

