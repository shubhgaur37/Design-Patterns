package BehavioralDesignPatterns.Iterator.Good_Code;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;
    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
    }

    public List<String> getSongs(){
        return this.songs;
    }

    // Use iterator to play songs
    public PlaylistIterator getPlaylist(String playlistName){
        switch(playlistName){
            case "simple": 
            return new SimpleIterator(this);
            case "shuffled":
            return new ShuffledIterator(this);
            case "favourites":
            return new FavouritesIterator(this);
            default:
            return null;
        }
    }
}
