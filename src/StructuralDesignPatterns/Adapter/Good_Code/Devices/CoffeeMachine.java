package StructuralDesignPatterns.Adapter.Good_Code.Devices;

public class CoffeeMachine {

    public void initializeZigbeeConnection(){
        System.out.println("Connecting to Zigbee Connection ....");
    }

    public void startBrewing(){
        System.out.println("Started Brewing Coffee ....");
    }

    public void stopBrewing(){
        System.out.println("Stopped Brewing Coffee ....");
    }

    public void terminateZigbeeConnection(){
        System.out.println("Disconnecting from Zigbee Connection ....");
    }
}
