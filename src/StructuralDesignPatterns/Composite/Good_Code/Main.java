package StructuralDesignPatterns.Composite.Good_Code;

import StructuralDesignPatterns.Composite.Good_Code.Concrete_Components.*;

/* Advantages of Using Composite Design Pattern:
1. Uniformity: Treat individual devices and groups(rooms, floors, etc.) uniformly using the SmartComponent interface.
2. Scalability: Easily add new components(eg. Garage, Garden) without changing the existing code.
3. Decoupling: The controller is decoupled from the specific structure of the hierarchy, making the system more modular.
4. Flexibility: Changes in hierarchy (eg. adding or removing components) is easily handled by the composite structure.
 */
public class Main {
    public static void main(String[] args) {
        // Create individual components
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight = new SmartLight();

        // Create composite components: Rooms
        // Note: Here we cannot define the reference type as SmartComponent because it will prevent us from using the methods for adding and
        // removing Smart components to the composite component object.
        CompositeComponent room1 = new CompositeComponent("Room 1");
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);

        // Adding another room
        CompositeComponent room2 = new CompositeComponent("Room 2");
        room2.addComponent(new AirConditioner());
        room2.addComponent(new SmartLight());

        // Adding a floor containing the rooms
        CompositeComponent floor = new CompositeComponent("Floor");
        floor.addComponent(room1);
        floor.addComponent(room2);

        // Create the house and add floors
        CompositeComponent house = new CompositeComponent("House");
        house.addComponent(floor);

        // Control the entire house
        house.turnOn();
        System.out.println("#####################");
        house.turnOff();
        System.out.println("#####################");
        // Control a single floor
        floor.turnOn();
        System.out.println("#####################");
        floor.turnOff();
        System.out.println("#####################");
        // Control a single room
        room1.turnOn();
        System.out.println("#####################");
        room1.turnOff();

    }
}
