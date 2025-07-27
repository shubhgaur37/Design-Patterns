package BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations;

import BehavioralDesignPatterns.Observer.Good_Code.*;

// Youtube App Push Notification Subscriber
public class YoutubeSubscriber implements Subscriber {
    private String deviceID;

    public YoutubeSubscriber(String deviceId){
        this.deviceID = deviceId;
    }

    public void update(String video){
        System.out.println("Sending Notification for the latest video : "+ video + " via push notification to deviceID: "+ this.deviceID);
    }

}
