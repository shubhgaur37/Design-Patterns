package CreationalDesignPatterns.Factory;

// 1. Handles object creation in a centralized manner
// 2. Refraining from repeating the logic to create more vehicle types
// 3. More flexible and organized.

interface Vehicle{
    void start();
    void stop();
}
// Concrete classes for different vehicles

class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping"); 
    }
}


class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }

    public void stop(){
        System.out.println("Bike is stopping"); 
    }
}

class Truck implements Vehicle{
    public void start(){
        System.out.println("Truck is starting");
    }

    public void stop(){
        System.out.println("Truck is stopping"); 
    }
}
// Vehicle Factory - Factory to create vehicle

// Also, if we revisit the usecase of passing custom engine to car, this approach is more flexible, efficient
// and maintainable as I can directly pass engine as a param in the factory and it will not break 
// any functionality anywhere in the codebase as object creation is centralised.
class VehicleFactory{
    public static Vehicle getVehicle(String vehicleType){
        if (vehicleType.equals("Car"))
            return new Car();
        else if (vehicleType.equals("Bike"))
            return new Bike();
        else if (vehicleType.equals("Truck"))
            return new Truck();
        else
            throw new IllegalArgumentException("Unknown Vehicle Type");
    }
}

// Advantages
// 1. Centralized Object Creation which makes the code much cleaner and easier to maintain
// 2. Scalability increases because if we need to add a new vehicle type just add it in the factory
// 3. Encapsulation: Client code(Main.java) doesn't need to know how to create vehicles.
// This logic is abstracted in the VehicleFactory and also, it makes the system easier to manage and modify.
public class VehicleFactoryGood {
    public static void main(String[] args) {
        // Creating objects from a centralized location (VehicleFactory)
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        v1.start();
        v1.stop();

        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        v2.start();
        v2.stop();

        Vehicle v3 = VehicleFactory.getVehicle("Truck");
        v3.start();
        v3.stop();
    }

}

