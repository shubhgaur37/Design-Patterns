package BehavioralDesignPatterns.Observer.Good_Code;

public interface Channel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void uploadNewVideo(String video);
    void notifySubscribers();
}
