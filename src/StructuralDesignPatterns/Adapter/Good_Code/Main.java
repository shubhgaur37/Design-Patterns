package StructuralDesignPatterns.Adapter.Good_Code;

import StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors.AirConditionerBluetoothAdapter;
import StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors.CoffeeMachineAdaptor;
import StructuralDesignPatterns.Adapter.Good_Code.Concrete_Adaptors.SmartLightAdaptor;
import StructuralDesignPatterns.Adapter.Good_Code.Devices.*;

public class Main {
    public static void main(String[] args) {
        // Initialise Devices
        AirConditioner airConditioner = new AirConditioner();
        SmartLight smartLight = new SmartLight();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // Initialise Adaptors
        SmartDeviceAdapter airConditionerBluetoothAdapter = new AirConditionerBluetoothAdapter(airConditioner);
        SmartDeviceAdapter smartLightAdaptor = new SmartLightAdaptor(smartLight);
        SmartDeviceAdapter coffeeMachineAdaptor = new CoffeeMachineAdaptor(coffeeMachine);


        // Control devices through unified interfaces

        // Turn on the devices
        airConditionerBluetoothAdapter.turnOn();
        System.out.println("#####################################");
        smartLightAdaptor.turnOn();
        System.out.println("#####################################");
        coffeeMachineAdaptor.turnOn();
        System.out.println("#####################################");

        System.out.println("#####################################");

        // Turn off the devices
        airConditionerBluetoothAdapter.turnOff();
        System.out.println("#####################################");
        smartLightAdaptor.turnOff();
        System.out.println("#####################################");
        coffeeMachineAdaptor.turnOff();
        System.out.println("#####################################");
    }
}

// Advantages of Using this implementation:

/*
1. Seamless Integration: This pattern enables SmartDeviceAdaptor to interact with devices using different protocols(Bluetooth, WiFi, Zigbee, etc.)
   without worrying about their implementation details.
2. Scalability: Adding a new device type(Eg. A smart speaker or Security Camera) only requires creating a new adaptor. The SmartHomeAdaptor doesn't
   need any changes.
3. Decoupling: The controller(Adaptor) is decoupled from the specific implementation of the devices, making the system more modular and maintainable.
4. Flexibility: If a device's protocol changes(eg. Smart light switches from Wifi to cloudAPI), only the adaptor needs to be updated.
   The rest of the system remains unaffected.
*/