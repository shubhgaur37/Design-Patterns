package BehavioralDesignPatterns.Iterator.Good_Code;

public class SimpleIterator implements PlaylistIterator {
    private int index;
    private Playlist playlist;

    SimpleIterator(Playlist playlist){
        this.playlist = playlist;
        this.index = 0;
    }
    // Checks if playlist contains the next song
    @Override
    public boolean hasNext(){
        return index < playlist.getSongs().size();
    }
    @Override
    public String next(){
        return playlist.getSongs().get(index++);
    }
}
