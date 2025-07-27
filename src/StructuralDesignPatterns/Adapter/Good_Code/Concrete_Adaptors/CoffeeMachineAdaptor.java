package StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors;

import StructuralDesignPatterns.Adapter.Good_Code.SmartDeviceAdapter;
import StructuralDesignPatterns.Adapter.Good_Code.Devices.CoffeeMachine;

public class CoffeeMachineAdaptor implements SmartDeviceAdapter {

    private CoffeeMachine coffeeMachine;

    // Constructor
    public CoffeeMachineAdaptor(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn(){
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff(){
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
    
}
