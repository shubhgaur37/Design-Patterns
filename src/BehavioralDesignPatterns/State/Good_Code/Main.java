package BehavioralDesignPatterns.State.Good_Code;

import BehavioralDesignPatterns.State.Good_Code.Concrete_States.BlinkingState;

public class Main {
    public static void main(String[] args) {
        // setting the context for traffic lights, initialised to Red By Default
        TrafficLightContext trafficLightContext = new TrafficLightContext();

        // while loops to verify state change behaviour
        int counter = 12;

        while (counter > 0){
            trafficLightContext.next();
            counter --;
            if (counter == 6)
                trafficLightContext.setState(new BlinkingState());
        }

    }
}

// Advantages of Using State Design Pattern:

// 1. Cleaner Code: Eliminates complex if-else or switch statements by encapsulating state-specific behaviours.
// 2. Enhanced Maintainability: Adding new states or modifying existing ones is easy.
// 3. Promotes the Single Responsibility Principle: Each state class handles its own behaviour, making code easier to understand.
// 4. Improved Scalability: Easily extend the system with new states without making the existing classes complex.
// 5. Encapsulation of State-Specific Logic: Each state class only contains its relevant logic, promoting better organization.
