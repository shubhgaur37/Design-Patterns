package CreationalDesignPatterns.AbstractFactory;

interface Vehicle{
    void start();
    void stop();
}
// Concrete classes for different brands

class Toyota implements Vehicle{
    public void start(){
        System.out.println("Toyota Car is starting");
    }
    public void stop(){
        System.out.println("Toyota Car is stopping");
    }
}

class Honda implements Vehicle{
    public void start(){
        System.out.println("Honda Car is starting");
    }
    public void stop(){
        System.out.println("Honda Car is stopping");
    }
}

class Ferrari implements Vehicle{
    public void start(){
        System.out.println("Ferrari Car is starting");
    }
    public void stop(){
        System.out.println("Ferrari Car is stopping");
    }
}

// interface for VehicleFactory
interface VehicleFactory{
    Vehicle createVehicle();
}

// Factory to create Vehicle of different brands
// Also, the methods for creating vehicle can accept some params to control a specific car type/model in each of these brands.

// Toyota Car Family
class ToyotaCarFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Toyota();
    }
}
// Honda Car Family
class HondaCarFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Honda();
    }
}
// Ferrari Car Family
class FerrariCarFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Ferrari();
    }
}

// Advantages
// 1. Easier to extend/Scalable
// Adding new Vehicle brand(family: models of vehicles of a particular brand) is as simple as creating a new factory for it.
// Also no need to touch existing factories or modify client code which adheres to Open/Closed Principle.

// 2. Cleaner and more maintainable code
// No more modifying the large createVehicle method each time a new brand(product) needs to be added.
// The logic is encapsulated in separate factory classes, making the system easier to maintain & extend.

// 3. Consistency
// All objects in a family(brand) are created in a consistent manner.
// Whether its creating Vehicles or furnitures, the Abstract factory ensures that all products belonging to a factory are related and compatible.

// 4. Decoupling
// The client does not need to know the specifics of the objects being used.
// The client relies on the abstract factory, making the system more modular and easier to change.


// In short, Abstract Factory provides an easy way to create families of related objects.

public class CarDealership {
    public static void main(String[] args) {
        VehicleFactory toyotaFactory = new ToyotaCarFactory();
        VehicleFactory hondaFactory = new HondaCarFactory();
        VehicleFactory ferrariFactory = new FerrariCarFactory();

        // Initializing Vehicles
        Vehicle hondaVehicle = hondaFactory.createVehicle();
        Vehicle toyotaVehicle = toyotaFactory.createVehicle();
        Vehicle ferrariVehicle = ferrariFactory.createVehicle();

        // Using vehicle methods
        hondaVehicle.start();
        hondaVehicle.stop();

        toyotaVehicle.start();
        toyotaVehicle.stop();

        ferrariVehicle.start();
        ferrariVehicle.stop();
    }
}
