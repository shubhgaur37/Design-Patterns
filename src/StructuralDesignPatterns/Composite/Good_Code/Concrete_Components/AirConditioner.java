package StructuralDesignPatterns.Composite.Good_Code.Concrete_Components;

import StructuralDesignPatterns.Composite.Good_Code.SmartComponent;

public class AirConditioner implements SmartComponent {

    @Override
    public void turnOn(){
        System.out.println("Turning on the AC .....");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off the AC .....");
    }
    
}
