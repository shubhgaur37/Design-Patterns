package BehavioralDesignPatterns.Observer.Good_Code.Concrete_Implementations;

import BehavioralDesignPatterns.Observer.Good_Code.*;

public class EmailSubscriber implements Subscriber {
    private String email;
    
    public EmailSubscriber(String email){
        this.email = email;
    }
    @Override
    public void update(String video){
        System.out.println("Sending Notification for the latest video : "+ video + " via email to :"+ this.email);
    }
}
