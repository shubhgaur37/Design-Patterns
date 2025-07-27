package StructuralDesignPatterns.Adapter.Good_Code.Devices;

public class AirConditioner {
    public void connectViaBluetooth(){
        System.out.println("Connecting AC to bluetooth ....");
    }

    public void startCooling(){
        System.out.println("Started AC: Cooling ....");
    }

    public void stopCooling(){
        System.out.println("Stopping AC Cooling ....");
    }

    public void disconnectBluetooth(){
        System.out.println("Disconnecting AC from bluetooth ....");
    }
}
