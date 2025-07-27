package StructuralDesignPatterns.Composite.Good_Code.Concrete_Components;

import StructuralDesignPatterns.Composite.Good_Code.SmartComponent;

public class SmartLight implements SmartComponent {

    @Override
    public void turnOn(){
        System.out.println("Switching on the Smart Light .....");
    }

    @Override
    public void turnOff(){
        System.out.println("Switching off the Smart Light .....");
    }
    
}