package StructuralDesignPatterns.Composite.Ugly_Code;

/* Issues with this code:
The SmartHomeController class creates each device explicitly by calling the constructor of the respective device class.
This approach works but as the hierarchy grows, it becomes:
1. Cumbersome
2. Difficult to scale
3. Prone to errors

The Problem?
Adding new device types or changing the way devices are controlled requires modifying existing code, leading to:
1. Tightly coupled code
2. Difficult Maintenance
3. Error-prone architecture

Problems in Detail:
1. Hardcoding logic: Each level in hierarchy(device, room, floor, house) is managed manually, duplicating logic and making the code harder to maintain.
2. Fragility: Adding new components(eg. A Garage or Garden) or modifying existing ones requires changing the code in multiple places.
3. Tight Coupling: The controller is tightly coupled to specific devices, making the code less reusable and harder to maintain.
4. Scaling Issues: Managing a real-world hierarchy with hundreds of devices or dozens of rooms would make the code unmanageable.
 */

public class SmartHomeController {
    public static void main(String[] args) {
        // Manually managing devices and groups
        AirConditioner airConditioner = new AirConditioner();
        SmartLight smartLight = new SmartLight();
        System.out.println("Turning ON devices in Room 1...");
        airConditioner.turnOn();
        smartLight.turnOn();
        System.out.println("Turning OFF devices in Room 1...");
        airConditioner.turnOff();
        smartLight.turnOff();
        // Manually managing multiple rooms
        System.out.println("Turning ON devices in Floor 1...");
        airConditioner.turnOn();
        smartLight.turnOn();
        airConditioner.turnOn(); // Room 2
        smartLight.turnOn(); // Room 2
        System.out.println("Turning OFF devices in Floor 2...");
        airConditioner.turnOff();
        smartLight.turnOff();
        airConditioner.turnOff(); // Room 3
        smartLight.turnOff(); // Room 3
        System.out.println("Turning ON all devices in the house...");
        airConditioner.turnOn();
        smartLight.turnOn();
        // Add more logic as you scale...
    }
}

/*

Output :
Turning ON devices in Room 1...
Turning on AC
Turning on Smart Light
Turning OFF devices in Room 1...
Turning off AC
Turning Off Smart Light
Turning ON devices in Floor 1...
Turning on AC
Turning on Smart Light
Turning on AC
Turning on Smart Light
Turning OFF devices in Floor 2...
Turning off AC
Turning Off Smart Light
Turning off AC
Turning Off Smart Light
Turning ON all devices in the house...
Turning on AC
Turning on Smart Light
*/