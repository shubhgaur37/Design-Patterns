package BehavioralDesignPatterns.Command.Good_Code;

import BehavioralDesignPatterns.Command.Good_Code.Commands.*;

public class Main {
    public static void main(String[] args) {
        // Creating a TV
        TV tv = new TV();

        // Initialising Commands
        Command turnOn = new TurnOn(tv);
        Command turnOff = new TurnOff(tv);
        Command changeChannel = new ChangeChannel(tv, 102);
        Command adjustVolume = new AdjustVolume(tv, 15);


        // Initialising the remote control
        RemoteControl remote = new RemoteControl();

        // Setting the commands
        remote.setOnCommand(turnOn);
        remote.setOffCommand(turnOff);
        remote.setChangeChannelCommand(changeChannel);
        remote.setAdjustVolumeCommand(adjustVolume);

        // Operating the TV using remote

        // turn on
        remote.pressOn();

        // Adjust Volume
        remote.adjustVolume();

        // Change Channel
        remote.changeChannel();

        // turn off
        remote.pressOff();

        System.out.println("############################");

        // Operating the TV using TV Panel(without remote)
        turnOn.execute();
        adjustVolume.execute();
        changeChannel.execute();
        turnOff.execute();
    }  
}


// Advantages of using this pattern

// 1. No modification of existing code: We don't need to modify the Remote Control class everytime we add a new feature. Instead we simply create
//    a new command class.

// 2. Separation of concerns: Each command has its own class, making the code cleaner, modular and easier to maintain.
//    No messy bloated logic in a single class.

// 3. Flexibility: The remote control doesn't need to know the specifics of what commands do internally. It just invokes them making it easy to add
// new commands or remove old ones without affecting the system.


