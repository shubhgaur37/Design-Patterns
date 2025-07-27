package CreationalDesignPatterns.Builder;

class Car{
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    // private constructor to ensure only the builder can be used to create the object
    // Builder can access the constructor as its nested within the same class

    private Car(CarBuilder carBuilder){
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.seats = carBuilder.seats;
        this.color = carBuilder.color;
        this.sunroof = carBuilder.sunroof;
        this.navigationSystem = carBuilder.navigationSystem;
    }

    // toString Override for checking output
    @Override
    public String toString(){
        return "Car [engine = " + this.engine + ", wheels = " + this.wheels +  ", seats = " + this.seats +  ", color = " + this.color + 
        ", sunroof = " + this.sunroof +  ", navigationSystem = " + this.navigationSystem + "]";
    }
    // Nested Builder Class
    public static class CarBuilder{

    // The attributes in builder should always be initialised to ensure that whenever we create objects without all params, the remaining ones
    // are automatically initialised with default values
    private String engine = "V8";
    private int wheels = 4;
    private int seats = 2;
    private String color = "Red";
    private boolean sunroof = false;
    private boolean navigationSystem = false;


    // Setters
    public CarBuilder engine(String engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder wheels(int wheels){
        this.wheels = wheels;
        return this;
    }


    public CarBuilder seats(int seats){
        this.seats = seats;
        return this;
    }

    public CarBuilder color(String color){
        this.color = color;
        return this;
    }

    public CarBuilder sunroof(boolean sunroof){
        this.sunroof = sunroof;
        return this;
    }

    public CarBuilder navigationSystem(boolean navigationSystem){
        this.navigationSystem = navigationSystem;
        return this;
    }

    // build method to create a car object
    public Car build(){
        return new Car(this);
    }

    }

}

// Main class to demonstrate usage
public class CarBuilderDemo {
    public static void main(String[] args) {
        // Creating Car Object by instantiate the builder and setting the required parameters and calling build method which returns the Car object.
        // This way we can create a car object with only the parameters we want. 
        
        Car car1 = new Car.CarBuilder().color("yellow").engine("V12").navigationSystem(true).build();

        Car car2 = new Car.CarBuilder().sunroof(true).navigationSystem(true).wheels(8).build();

        //Car 1
        System.out.println(car1);

        //Car 2
        System.out.println(car2);
    }
}
