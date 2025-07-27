package BehavioralDesignPatterns.Command.Ugly_Code;

public class RemoteControl {
    private TV tv;
    public RemoteControl(TV tv) {
        this.tv = tv;
    }
    public void pressOnButton() {
        tv.turnOn();
    }
    public void pressOffButton() {
        tv.turnOff();
    }
    public void pressChannelButton(int channel) {
        tv.changeChannel(channel);
    }
    public void pressVolumeButton(int volume) {
        tv.adjustVolume(volume);
    }
    // New methods are added each time we need more actions
    public void pressOnChangeVolumeAndChannelButton(int volume, int channel) {
        tv.turnOn();
        tv.changeChannel(channel);
        tv.adjustVolume(volume);
    }
}

// Problems with this implementation:

// 1. Code Duplication: As we add more functionalities like(turning on the TV then changinc the channel and then adjusting volume), we need to keep
//    modifying the RemoteControl class which will lead to more code duplication and eventually potential for more bugs.

// 2. Hard to Extend: If we want to add more devices(like a smart speaker or AC unit), we'd again have to modify the remote making the system
//    difficult to scale.

// Also, the above issues will lead to violating the Open/Closed principle.