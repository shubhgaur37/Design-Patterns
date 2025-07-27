package BehavioralDesignPatterns.Command.Good_Code;

// Invoker Class
public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command changeChannelCommand;
    private Command adjustVolumeCommand;

    // Command Setters for remote
    public void setOnCommand(Command onCommand){
        this.onCommand = onCommand;
    }
    public void setOffCommand(Command offCommand){
        this.offCommand = offCommand;
    }
    public void setChangeChannelCommand(Command changeChannelCommand){
        this.changeChannelCommand = changeChannelCommand;
    }
    public void setAdjustVolumeCommand(Command adjustVolumeCommand){
        this.adjustVolumeCommand = adjustVolumeCommand;
    }

    // Press to execute commands

    public void pressOn(){
        onCommand.execute();
    }

    public void pressOff(){
        offCommand.execute();
    }

    public void changeChannel(){
        changeChannelCommand.execute();
    }

    public void adjustVolume(){
        adjustVolumeCommand.execute();
    }
}
