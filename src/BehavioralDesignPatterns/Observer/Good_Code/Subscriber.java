package BehavioralDesignPatterns.Observer.Good_Code;

// This interface defines the Observer in the Observer pattern.
public interface Subscriber {
    // Responsible for sending update to the subscriber whenever a video is uploaded using the appropriate strategy
    public void update(String video);
}
