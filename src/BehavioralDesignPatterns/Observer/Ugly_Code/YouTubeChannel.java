package BehavioralDesignPatterns.Observer.Ugly_Code;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private List<String> subscribers = new ArrayList<>();
    private String video;

    // Method to add a new subscriber
    public void addSubscriber(String subscriber) {
        subscribers.add(subscriber);
    }

    // Method to upload a new video
    public void uploadNewVideo(String video) {
        this.video = video;
        notifySubscribers(); // Notify all subscribers about the new video
    }

    // Notify all subscribers
    public void notifySubscribers() {
        for (String subscriber : subscribers) {
            System.out.println("Notifying " + subscriber + " about new video: " + video);
            // One underlying issue here is that we are treating each subscriber equally, as every subscriber will have 
            // their own preferences for notifications such as bell icon enabled, some only want web browser notifications.
            // and we have not taken those preferences into account.

            // Why this approach is not ideal?
            // 1. Manual Checking: Each time a new video is uploaded, we manually loop through all subscribers to notify them. 
            // if there are thousands of subscriber then this process becomes cumbersome and inefficient and will continue
            // to get worse as the number of subscribers increases.
            // 2. Not Scalable: We can check for preferences of each subscriber in this loop, but it will make the code more complex, 
            // harder to maintain and will lead to tight-coupling. Moreover, Adding a new notification method will require modifying the 
            // Youtube class, but, notification preference is a property of subscriber, not the YouTubeChannel.
            // 3. Hard to Extend: If we want to add new notification methods (like SMS, etc.), we would have to modify this class again, 
            // which violates the Open/Closed Principle.

            // Add new feature: send an email notification
            sendEmail(subscriber);
        }
    }

    public void sendEmail(String subscriber) {
        System.out.println("Sending email to " + subscriber);
    }
    public String getVideo(){
        return video;
    }
}
