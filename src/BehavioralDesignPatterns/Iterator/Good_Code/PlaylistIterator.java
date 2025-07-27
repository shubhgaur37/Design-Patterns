package BehavioralDesignPatterns.Iterator.Good_Code;

// Iterator : Responsible for playing songs according to the design
public interface PlaylistIterator {    
    boolean hasNext();
    String next();
}
