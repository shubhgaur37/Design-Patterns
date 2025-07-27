package StructuralDesignPatterns.Adapter.Good_Code.Devices;

public class SmartLight {

    public void connectViaWiFi(){
        System.out.println("Connecting Smartlight to WiFi ....");
    }

    public void switchOn(){
        System.out.println("Smart Light Switched On ....");
    }

    public void switchOff(){
        System.out.println("Smart Light Switched Off ....");
    }

    public void disconnectWiFi(){
        System.out.println("Disconnecting Smartlight from WiFi ....");
    }
}

    
