package BehavioralDesignPatterns.Iterator.Good_Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffledIterator implements PlaylistIterator {
    private int index;
    private Playlist playlist;
    private List<String> shuffledSongs;

    public ShuffledIterator(Playlist playlist){
        this.playlist = playlist;
        shuffledSongs = new ArrayList<>(playlist.getSongs()); // creating a new arraylist with all the songs of original playlist
        // shuffling the new playlist
        Collections.shuffle(shuffledSongs);
        this.index = 0;
    }

    // Checks if playlist contains the next song
    @Override
    public boolean hasNext(){
        return index < playlist.getSongs().size();
    }
    @Override
    public String next(){
        return shuffledSongs.get(index++);
    }
}
