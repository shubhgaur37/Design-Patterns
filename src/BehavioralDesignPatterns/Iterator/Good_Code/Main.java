package BehavioralDesignPatterns.Iterator.Good_Code;

public class Main {
    public static void main(){
        // Creating a playlist
        Playlist playlist = new Playlist();

        // Adding songs to playlist
        playlist.addSong("Melody");
        playlist.addSong("FavRap");
        playlist.addSong("Bday");
        playlist.addSong("123FavRock");
        playlist.addSong("Romantic");
        playlist.addSong("SkyfallFav");        

        // get simple playlist
        PlaylistIterator playlistIterator = playlist.getPlaylist("simple");
        // play songs
        while (playlistIterator.hasNext()){
            System.out.println("Playing Song : " + playlistIterator.next());
        }

        System.out.println("##########################");

        // get shuffled playlist
        playlistIterator = playlist.getPlaylist("shuffled");
        // play songs
        while (playlistIterator.hasNext()){
            System.out.println("Playing Song : " + playlistIterator.next());
        }


        System.out.println("##########################");

        // get favourites playlist
        playlistIterator = playlist.getPlaylist("favourites");
        // play songs
        while (playlistIterator.hasNext()){
            System.out.println("Playing Song : " + playlistIterator.next());
        }

    }
}

// Key Benefits of Using iterator Pattern

// 1. Flexibility: We can now add new types of playlist without modifying the playlist class much(repeating logic for different playlist).
//    The iterators handle the iteration logic separately.

// 2. Separation of Concerns: The logic for iterating over a playlist is separated from the playlist itself.
//    This makes the code cleaner and easier to maintain.

// 3. Scalability: Adding new playlist types like (Recently Played or TopRatedPlaylist)
//    Doesn't require any modifications to the existing playlist structure.

// Also Java Collections implement an Iterator interface which is quite similar to the one we implemented and accesses the elements in the same way
// we did.