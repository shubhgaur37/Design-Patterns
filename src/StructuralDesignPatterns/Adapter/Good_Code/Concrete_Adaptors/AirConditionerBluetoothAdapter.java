package StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors;

import StructuralDesignPatterns.Adapter.Good_Code.SmartDeviceAdapter;
import StructuralDesignPatterns.Adapter.Good_Code.Devices.AirConditioner;

public class AirConditionerBluetoothAdapter implements SmartDeviceAdapter {
    private AirConditioner airConditioner;

    // Constructor
    public AirConditionerBluetoothAdapter(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn(){
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff(){
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
    
}
