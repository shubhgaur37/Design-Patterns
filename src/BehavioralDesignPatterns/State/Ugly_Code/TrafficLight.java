package BehavioralDesignPatterns.State.Ugly_Code;

public class TrafficLight {
    private String color;
    public TrafficLight() {
        this.color = "RED";
    }
    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
            System.out.println("Change to GREEN. Cars go!");
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
            System.out.println("Change to YELLOW. Slow down!");
        } else if (color.equals("YELLOW")) {
            color = "RED";
            System.out.println("Change to RED. Stop!");
        } else if (color.equals("BLINKING")) {
            color = "MAINTENANCE";
            System.out.println("Switching to MAINTENANCE mode...");
        } else if (color.equals("MAINTENANCE")) {
            color = "RED";
            System.out.println("Maintenance done, back to RED!");
        }
        // Potentially more states and conditions...
    }
    public String getColor() {
        return color;
    }
}

// Issues with this approach:
// 1. Tightly Coupled: The Traffic light class is tightly coupled with all possible states.
// 2. Scalability issues: Adding new states means modifying the next() method, making it bloated and hard to maintain. 
// 3. Maintenance Nightmare: Every new state increases the complexity, making the code hard to read and debug.
// 4. Violates Open/Closed Principle: The class isn't closed for modification - every change requires altering existing code.


