package StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors;

import StructuralDesignPatterns.Adapter.Good_Code.SmartDeviceAdapter;
import StructuralDesignPatterns.Adapter.Good_Code.Devices.SmartLight;

public class SmartLightAdaptor implements SmartDeviceAdapter {

    private SmartLight smartLight;

    // Constructor
    public SmartLightAdaptor(SmartLight smartLight){
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn(){
        smartLight.connectViaWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff(){
        smartLight.switchOff();
        smartLight.disconnectWiFi();
    }
    
}
    
