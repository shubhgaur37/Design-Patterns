package BehavioralDesignPatterns.Observer.Good_Code;

import BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations.EmailSubscriber;
import BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations.YTChannel;
import BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations.YoutubeSubscriber;

public class Main {
    public static void main(String[] args) {
        // Creating a channel
        Channel myChannel = new YTChannel();

        // Initialising Subscribers
        Subscriber pushSubscriber1 = new YoutubeSubscriber("Shubh's One Plus");
        Subscriber pushSubscriber2 = new YoutubeSubscriber("Shiksha's Iphone");
        Subscriber emailSubscriber1 = new EmailSubscriber("abc@xyz.com");
        Subscriber emailSubscriber2 = new EmailSubscriber("hello@bye.com");

        // Adding Subscribers to channel
        myChannel.addSubscriber(pushSubscriber1);
        myChannel.addSubscriber(pushSubscriber2);
        myChannel.addSubscriber(emailSubscriber1);
        myChannel.addSubscriber(emailSubscriber2);

        // Uploading a new video
        myChannel.uploadNewVideo("Astrology Nitties and Gritties");

        // Removing email subscriber
        myChannel.removeSubscriber(emailSubscriber1);

        // Uploading a new video
        myChannel.uploadNewVideo("Valorant 1v5 Clutch");

        // Removing Push subscriber
        myChannel.removeSubscriber(pushSubscriber1);

        // Uploading a new video
        myChannel.uploadNewVideo("Basics of Authentic North Indian Cuisines");

    }
}

// Advantages of Using Observer Pattern:

// 1. Decoupling: The Youtube Channel doesn't need to know what each observer or subscriber does.
//    It just notifies(updates) them about the latest video without worrying about the implementation.

// 2. Scalability: Adding new types of subscribers(for different notification strategies) is as simple as defining a new class which implements
//    Subscriber interface.

// 3. Flexibility: Observers can join or leave at anytime without affecting the Youtube Channel.
//    No need to modify the existing code.

// 4. Maintainability: The YoutubeChannel class stays clean and simple, while observers handle their own logic independently.
//    This makes system easier to manage and debug.

