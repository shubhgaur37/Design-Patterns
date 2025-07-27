package BehavioralDesignPatterns.Iterator.Good_Code;

public class FavouritesIterator implements PlaylistIterator {
    private int index;
    private Playlist playlist;

    public FavouritesIterator(Playlist playlist){
        this.playlist = playlist;

        this.index = 0;
    }

    // Checks if playlist contains the next song
    // Also used to filter out indexes based on favourite songs
    @Override
    public boolean hasNext(){
        // Only return the next song if it is marked as favourite
        while (index < this.playlist.getSongs().size()){
            if (playlist.getSongs().get(index).contains("Fav")) // Mark Favourites with "Fav" in name
                return true;
            // if the song at current index is not a favourite song, increment index
            index++;
        }

        // we will come out of the loop once we reach beyond the end of playlist, therefore no songs left
        return false;

    }
    @Override
    public String next(){
        return playlist.getSongs().get(index++);
    }
}
