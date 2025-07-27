package StructuralDesignPatterns.Composite.Good_Code.Concrete_Components;

import java.util.ArrayList;
import java.util.List;

import StructuralDesignPatterns.Composite.Good_Code.SmartComponent;

// Composite class for groups of components
public class CompositeComponent implements SmartComponent{
    private String componentName;
    private List<SmartComponent> components;

    // Constructor
    public CompositeComponent(String componentName){
        components = new ArrayList<>();
        this.componentName = componentName;
    }

    // Methods to add and remove components
    public void addComponent(SmartComponent smartComponent){
        components.add(smartComponent);
    }

    public void removeComponent(SmartComponent smartComponent){
        components.remove(smartComponent);
    }

    // Parent Interface Methods: turnOn() and turnOff()
    
    @Override
    public void turnOn(){
        System.out.println("Turning on all the sub-components of the parent component: "+ this.componentName);

        // for loop 
        for(SmartComponent component: components){
            component.turnOn();
        }
    }
    
    @Override
    public void turnOff(){
        System.out.println("Turning off all the sub-components of the parent component: "+ this.componentName);

        // for loop 
        for(SmartComponent component: components){
            component.turnOff();
        }
    }
}
