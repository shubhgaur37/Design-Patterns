package BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPatterns.Observer.Good_Code.*;

// Handles uploading videos and notifying subscribers
public class YTChannel implements Channel{
    private String video;
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);  
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);  
    }

    @Override
    public void uploadNewVideo(String video) {
        this.video = video;
        this.notifySubscribers();
    }

    @Override
    public void notifySubscribers(){
        // sending notifications to all subscribers with different preferences
        for (Subscriber s: subscribers){
            s.update(this.video);
        }
        System.out.println("##################################");
    }

}
