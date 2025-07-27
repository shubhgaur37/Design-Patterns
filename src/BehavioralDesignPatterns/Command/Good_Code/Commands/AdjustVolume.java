package BehavioralDesignPatterns.Command.Good_Code.Commands;

import BehavioralDesignPatterns.Command.Good_Code.Command;
import BehavioralDesignPatterns.Command.Good_Code.TV;

public class AdjustVolume implements Command {
    private TV tv;
    private int volume;

    public AdjustVolume(TV tv , int volume){
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.adjustVolume(volume);
    }
}
