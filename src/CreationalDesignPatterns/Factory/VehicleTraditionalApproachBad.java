package CreationalDesignPatterns.Factory;

interface Vehicle{
    void start();
    void stop();
}

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

public class VehicleTraditionalApproachBad {
    public static void main(String[] args) {

        // Creating objects myself manually
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();

        Vehicle v3 = new Truck();
        v3.start();
        v3.stop();

    }
}

// Suppose this codebase is common to all devs and some other dev in their own branch does the same thing. This causes code duplication
// Now, if in the future the object creation logic changes, say instead of creating an engine with the object
// we want to pass it explicitly, then pinpointing every place where engine needs to be passed as a parameter
// and updating them would be a cumbersome task


// In summary, Explicit object creation is a maintenance nightmare in case more vehicle types 
// need to be added in the future or object creation logic changes


// Also, adding new functionalities and behaviours will require updation of creation code everywhere which
// may lead to potential bugs.
